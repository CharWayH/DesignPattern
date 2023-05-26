package com.charwayh.singleton.type6;

/**
 * @author charwayH
 * 懒汉式(双重检查 Double Check) 推荐使用
 * 优点:起到懒加载的作用，线程安全且效率高
 * 缺点:这种方法并不能起到线程同步的作用，跟第三种方法遇到的情形一样，如果进入到if代码块，还没有及时往下，另一个线程进来了，便会产生多个
 * 实例
 * 结论:在实际开发中，不能使用该方法。该方法本意是要对第四种方法进行改进，但是实际上的反而造成了线程不安全的问题
 *
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查，线程安全的懒汉式");
        Singleton06 instance1 = Singleton06.getInstance();
        Singleton06 instance2 = Singleton06.getInstance();
        // true
        System.out.println(instance1 == instance2);
        System.out.println("intance1.hashCode=" + instance1.hashCode());
        System.out.println("intance2.hashCode=" + instance2.hashCode());
    }
}


class Singleton06 {
    private Singleton06(){}
    // 使用volatile一旦变量有改变立刻刷到内存中
    private static volatile Singleton06 instance;
    // 懒加载创建instance，使用双重检查，线程安全且效率高
    public static Singleton06 getInstance(){
        if(instance == null){
            // 想对第四种方法进行优化，但是效果实际上是一样的
            synchronized(Singleton06.class){
                if(instance == null) {
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }
}