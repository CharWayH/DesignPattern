package com.charwayh.singleton.type5;

/**
 * @author charwayH
 * 懒汉式(线程不安全，同步代码块)不能使用
 * 优点:起到懒加载的作用，但不能在多线程下运行
 * 缺点:这种方法并不能起到线程同步的作用，跟第三种方法遇到的情形一样，如果进入到if代码块，还没有及时往下，另一个线程进来了，便会产生多个
 * 实例
 * 结论:在实际开发中，不能使用该方法。该方法本意是要对第四种方法进行改进，但是实际上的反而造成了线程不安全的问题
 *
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        System.out.println("同步线程代码块，造成线程安全的懒汉式");
        Singleton05 instance1 = Singleton05.getInstance();
        Singleton05 instance2 = Singleton05.getInstance();
        // true
        System.out.println(instance1 == instance2);
        System.out.println("intance1.hashCode=" + instance1.hashCode());
        System.out.println("intance2.hashCode=" + instance2.hashCode());
    }
}


class Singleton05 {
    private Singleton05(){}
    private static Singleton05 instance;
    // 提供一个静态的公有方法，当使用到该方法时，才去创建instance，加入了同步代码块，解决线程不安全问题
    public static  Singleton05 getInstance(){
        if(instance == null){
            // 想对第四种方法进行优化，但是效果实际上是一样的
            synchronized(Singleton05.class){
                instance = new Singleton05();
            }
        }
        return instance;
    }

}