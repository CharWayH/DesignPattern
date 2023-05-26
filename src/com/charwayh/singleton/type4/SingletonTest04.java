package com.charwayh.singleton.type4;

/**
 * @author charwayH
 * 懒汉式(线程安全)不推荐使用
 * 优点:起到懒加载的作用，并且能在多线程下运行
 * 缺点:效率太低了，每个线程想要去获取类的实例时效率太低。实际上这个方法执行一次实例化代码就够了。
 * 结论:在实际开发中，不推荐使用这种方式
 *
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        System.out.println("线程安全的懒汉式");
        Singleton04 instance1 = Singleton04.getInstance();
        Singleton04 instance2 = Singleton04.getInstance();
        // true
        System.out.println(instance1 == instance2);
        System.out.println("intance1.hashCode=" + instance1.hashCode());
        System.out.println("intance2.hashCode=" + instance2.hashCode());
    }
}


class Singleton04 {
    private Singleton04(){}
    private static Singleton04 instance;

    // 提供一个静态的公有方法，当使用到该方法时，才去创建instance，加入了同步代码块，解决线程不安全问题
    public static synchronized Singleton04 getInstance(){
        if(instance == null){
            instance = new Singleton04();
        }
        return instance;
    }

}