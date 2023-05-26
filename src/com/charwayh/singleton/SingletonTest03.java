package com.charwayh.singleton;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.singleton
 * @date:2023/5/21
 * 懒汉式(线程不安全)
 * 优点:能起到懒加载的效果
 * 缺点:线程不安全,可能会产生多个实例
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        // 测试
        SingleTon03 instance1 = SingleTon03.getInstance();
        SingleTon03 instance2 = SingleTon03.getInstance();
        System.out.println(instance1 == instance2);
    }
}

/**
 * 懒汉式(线程不安全)
 */

class SingleTon03 {
    /**
     * 1.构造器私有化 (外部不能new)
     */
    private SingleTon03() {
    }
    /**
     * 2.本类内部创建实例对象
     */
    private static SingleTon03 instance;
    /**
     * 3.对外提供一个公有静态方法，刚使用到该方法时，才去实例化对象
     */
    public static SingleTon03 getInstance() {
        if (instance == null) {
            return new SingleTon03();
        }
        return instance;
    }
}


