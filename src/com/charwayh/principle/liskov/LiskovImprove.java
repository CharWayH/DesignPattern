package com.charwayh.principle.liskov;

/**
 * @author charwayH
 * 里式替换原则
 */
public class LiskovImprove {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.func1(8, 1));
        System.out.println(a.func1(1, 8));
        System.out.println("======================");
        B b = new B();
        System.out.println(b.func1(8, 1));
        System.out.println(b.func1(1, 8));
        System.out.println("======================");
        System.out.println(b.func3(8, 1));
        System.out.println(b.func3(1, 8));
    }
}

/**
 * 创建一个更加基础的基类
 */
class Base {

}

class A extends Base {
    public int func1(int a, int b) {
        return a - b;
    }
}

/**
 * 新增了新功能，两数字相加，然后+1
 */
class B extends Base {
    // 组合
    private A a;

    public int func3(int a, int b) {
        // 用a的引用调用a中的方法
        return this.a.func1(a, b);
    }

    // 这里重写了A类的方法，可能是无意识的
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 1;
    }


}