package com.charwayh.singleton.type8;

/**
 * @author charwayH
 * 枚举的方式完成单例模式
 * 借助JDK1.5中添加的枚举来实现单例模式。不仅避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * 优点:懒加载且线程安全
 * 结论:推荐使用
 *
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        System.out.println("用枚举的方式实现单例模式");
        Singleton08 instance1 = Singleton08.INSTANCE;
        Singleton08 instance2 = Singleton08.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode=" + instance1.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}


enum Singleton08 {
   INSTANCE;

   public void sayOK(){
       System.out.println("ok~");
   }
}