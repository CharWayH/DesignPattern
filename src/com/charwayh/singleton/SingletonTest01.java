package com.charwayh.singleton;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.singleton
 * @date:2023/5/21
 *
 * 优点:简单，在类加载时就进行了实例化，避免了线程同步的问题
 * 缺点:类加载就完成实例化，无法进行懒加载。如果从创建到结束都没有用到该实例，会造成资源浪费
 * 可用，但是可能造成内存资源浪费
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        // 1.测试
        SingleTon01 instance1 = SingleTon01.getInstance();
        SingleTon01 instance2 = SingleTon01.getInstance();
        System.out.println(instance1==instance2);
    }
}


/**
 * 饿汉式，静态变量
 */

class SingleTon01 {
    /**
     * 1.构造器私有化 (外部不能new)
     */
    private SingleTon01() {
    }

    // 2.本类内部创建实例对象
    private final static SingleTon01 instance = new SingleTon01();

    /**
     * 3.对外提供一个公有静态方法，返回实例对象
     */
    public static SingleTon01 getInstance(){
        return instance;
    }
}


