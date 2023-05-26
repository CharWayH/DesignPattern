package com.charwayh.singleton.type7;

/**
 * @author charwayH
 * 静态内部类完成单例模式
 * 这种方法采用了类装载的机制来保证初始化实例时只有一个线程
 * 静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从
 * 而完成Singleton的实例化
 * 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的
 * 优点:懒加载且线程安全
 * 结论:推荐使用
 *
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton07 instance1 = Singleton07.getInstance();
        Singleton07 instance2 = Singleton07.getInstance();
        // true
        System.out.println(instance1 == instance2);
        System.out.println("intance1.hashCode=" + instance1.hashCode());
        System.out.println("intance2.hashCode=" + instance2.hashCode());
    }
}


class Singleton07 {
    private Singleton07(){}

    /**
     * 静态内部类，该类中有静态属性Singleton
     */
    private static class SingletonInstance{
        private static final Singleton07 INSTANCE = new Singleton07();
    }


    public static Singleton07 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}