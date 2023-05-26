package com.charwayh.singleton.type1;

/**
 * @author charwayH
 * 饿汉式 可以使用
 * 优点:比较简单，就是在类装载的时候就完成实例化。避免了线程同步
 * 缺点:在类装载的时候就完成了实例化，没有达到懒加载的效果。如果从始至终没有使用过这个实例，则会造成内存浪费
 * 结论:这种单例模式可用，但可能造成内存浪费
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();
        // true
        System.out.println(instance1 == instance2);
        System.out.println("intance1.hashCode=" + instance1.hashCode());
        System.out.println("intance2.hashCode=" + instance2.hashCode());
    }
}


// 饿汉式(静态变量)
class Singleton01{
    // 1.构造器私有化，外部不能new
    private Singleton01(){}

    // 2.在本类内部创建对象实例
    private final static Singleton01 instance = new Singleton01();

    // 3.提供公有的静态方法，返回实例对象
    public static Singleton01 getInstance(){
        return instance;
    }

}