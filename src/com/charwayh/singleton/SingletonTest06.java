package com.charwayh.singleton;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.singleton
 * @date:2023/5/21
 * 懒汉式 双重检查(推荐使用)
 * Double-Check概念是多线程开发中经常用的，进行了实例两次是否为空的确认，可以保证线程安全
 * 线程安全，延迟加载，效率高
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        // 测试
        SingleTon06 instance1 = SingleTon06.getInstance();
        SingleTon06 instance2 = SingleTon06.getInstance();
        System.out.println(instance1 == instance2);
    }
}

/**
 * 懒汉式(双重检查)
 */
class SingleTon06 {
    /**
     * 1.构造器私有化 (外部不能new)
     */
    private SingleTon06() {
    }

    /**
     * 2.本类内部创建实例对象
     * 加入volatile使变量instance在内存中可见，防止指令重排序
     */
    private static volatile SingleTon06 instance;

    /**
     * 3.对外提供一个公有静态方法，刚使用到该方法时，才去实例化对象
     * 加入了同步代码块(双重检查)
     */
    public static SingleTon06 getInstance() {
        if (instance == null) {
            synchronized (SingleTon06.class) {
                if(instance == null) {
                    return new SingleTon06();
                }
            }
        }
        return instance;
    }
}
