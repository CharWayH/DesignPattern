package com.charwayh.singleton;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.singleton
 * @date:2023/5/21
 * 懒汉式(线程安全,同步代码块)
 * 缺点:实际上还是线程不安全的
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        // 测试
        SingleTon05 instance1 = SingleTon05.getInstance();
        SingleTon05 instance2 = SingleTon05.getInstance();
        System.out.println(instance1 == instance2);
    }
}

/**
 * 懒汉式(线程安全,同步代码块)
 * 实际无法形成线程安全！！！
 */
class SingleTon05 {
    /**
     * 1.构造器私有化 (外部不能new)
     */
    private SingleTon05() {
    }

    /**
     * 2.本类内部创建实例对象
     */
    private static SingleTon05 instance;

    /**
     * 3.对外提供一个公有静态方法，刚使用到该方法时，才去实例化对象
     * 加入了同步代码块
     * 实际无法形成线程安全！！！
     */
    public static SingleTon05 getInstance() {
        if (instance == null) {
            synchronized (SingleTon05.class) {
                return new SingleTon05();
            }
        }
        return instance;
    }
}
