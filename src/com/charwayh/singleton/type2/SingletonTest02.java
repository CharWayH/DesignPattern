package com.charwayh.singleton.type2;

/**
 * @author charwayH
 * 饿汉式 可以使用
 * 优点:和第一种方法类似，只不过将类实例化过程放在静态代码块中，也是在类装载的时候就完成实例化。避免了线程同步
 * 缺点:在类装载的时候就完成了实例化，没有达到懒加载的效果。如果从始至终没有使用过这个实例，则会造成内存浪费
 * 结论:这种单例模式可用，但可能造成内存浪费
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton02 instance1 = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();
        // true
        System.out.println(instance1 == instance2);
        System.out.println("intance1.hashCode=" + instance1.hashCode());
        System.out.println("intance2.hashCode=" + instance2.hashCode());
    }
}


/**
 *    饿汉式(静态代码块)
 */
class Singleton02 {
    // 1.构造器私有化，外部不能new
    private Singleton02(){}

    // 2.在本类内部创建对象实例
    private static Singleton02 instance;

    // 在静态代码块中创建单例对象
    static {
        instance = new Singleton02();
    }

    // 3.提供公有的静态方法，返回实例对象
    public static Singleton02 getInstance(){
        return instance;
    }

}