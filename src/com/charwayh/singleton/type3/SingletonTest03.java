package com.charwayh.singleton.type3;

/**
 * @author charwayH
 * 懒汉式(线程不安全)不能使用
 * 优点:起到懒加载的作用，但是只能在单线程下使用
 * 缺点:如果在多线程下，一个线程进入了if(instance == null)判断语句块，还未来得及执行下去，另一个线程也进入这个判断语句，这时会创建多个
 * 实例。所以在多线程环境下不可以使用这种方式
 * 结论:在实际开发中不要使用这种方式
 *
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        System.out.println("线程不安全的懒汉式");
        Singleton03 instance1 = Singleton03.getInstance();
        Singleton03 instance2 = Singleton03.getInstance();
        // true
        System.out.println(instance1 == instance2);
        System.out.println("intance1.hashCode=" + instance1.hashCode());
        System.out.println("intance2.hashCode=" + instance2.hashCode());
    }
}


class Singleton03{
    private Singleton03(){}
    private static Singleton03 instance;

    // 提供一个静态的公有方法，当使用到该方法时，才去创建instance
    public static Singleton03 getInstance(){
        if(instance == null){
            instance = new Singleton03();
        }
        return instance;
    }

}