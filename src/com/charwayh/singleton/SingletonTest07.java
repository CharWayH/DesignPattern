package com.charwayh.singleton;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.singleton
 * @date:2023/5/21
 * 静态内部类单例模式 (单例)
 * 因为SingletonInstance07是静态内部类，不会主动加载。所以SingletonTest07也不会马上被实例化(懒加载)
 * 当调用getInstance时会装载SingletonInstance07。因为JVM装载类时是线程安全的。所以不会有线程问题
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        // 测试
        SingleTon07 instance1 = SingleTon07.getInstance();
        SingleTon07 instance2 = SingleTon07.getInstance();
        System.out.println(instance1 == instance2);
    }
}

/**
 * 静态内部类单例模式
 */
class SingleTon07 {
    /**
     * 1.构造器私有化 (外部不能new)
     */
    private SingleTon07() {
    }

    /**
     * 2.静态内部类，该类中有个静态的INSTANCE属性
     */
    private static class SingletonInstance07{
        private static final SingleTon07 INSTANCE = new SingleTon07();
    }

    /**
     * 3.对外提供一个公有静态方法，直接返回实例
     */
    public static SingleTon07 getInstance() {
        return SingletonInstance07.INSTANCE;
    }
}
