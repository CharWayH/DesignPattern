package com.charwayh.singleton;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.singleton
 * @date:2023/5/21
 * 懒汉式(线程不安全)
 * 优点:解决了线程安全问题
 * 缺点:getInstance的执行概率较高，导致效率低。而实例化代码实际只需要执行一次
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        // 测试
        SingleTon04 instance1 = SingleTon04.getInstance();
        SingleTon04 instance2 = SingleTon04.getInstance();
        System.out.println(instance1 == instance2);
    }
}

/**
 * 懒汉式(线程安全)
 */

class SingleTon04 {
    /**
     * 1.构造器私有化 (外部不能new)
     */
    private SingleTon04() {
    }
    /**
     * 2.本类内部创建实例对象
     */
    private static SingleTon04 instance;
    /**
     * 3.对外提供一个公有静态方法，刚使用到该方法时，才去实例化对象
     * 加入了synchronized关键字，解决线程安全的问题
     */
    public static synchronized SingleTon04 getInstance() {
        if (instance == null) {
            return new SingleTon04();
        }
        return instance;
    }
}
