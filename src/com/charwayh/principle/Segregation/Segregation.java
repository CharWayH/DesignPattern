package com.charwayh.principle.Segregation;

/**
 * @author charwayH
 * 类A通过接口Interface1依赖类B，类C通过接口Interface1依赖D，如果接口Interface1对于类A和类C来说不是最小接口
 * 那么类B和类D必须去实现他们不需要的方法
 *
 */
public class Segregation {
    public static void main(String[] args) {
        A_ a = new A_();
        a.depend1(new B_());
        a.depend2(new B_());
        a.depend3(new B_());

        C_ c = new C_();
        c.depend1(new D_());
        c.depend4(new D_());
        c.depend5(new D_());
    }
}

interface Interface1_ {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B_ implements Interface1_{

    @Override
    public void operation1() {
        System.out.println("类B实现方法operation1");
    }

    @Override
    public void operation2() {
        System.out.println("类B实现方法operation2");
    }

    @Override
    public void operation3() {
        System.out.println("类B实现方法operation3");
    }

    @Override
    public void operation4() {
        System.out.println("类B实现方法operation4");
    }

    @Override
    public void operation5() {
        System.out.println("类B实现方法operation5");
    }
}

class D_ implements Interface1_{

    @Override
    public void operation1() {
        System.out.println("类D实现方法operation1");
    }

    @Override
    public void operation2() {
        System.out.println("类D实现方法operation2");
    }

    @Override
    public void operation3() {
        System.out.println("类D实现方法operation3");
    }

    @Override
    public void operation4() {
        System.out.println("类D实现方法operation4");
    }

    @Override
    public void operation5() {
        System.out.println("类D实现方法operation5");
    }
}

class A_{
    public void depend1(Interface1_ i){
        i.operation1();
    }
    public void depend2(Interface1_ i){
        i.operation2();
    }
    public void depend3(Interface1_ i){
        i.operation3();
    }
}

class C_{
    public void depend1(Interface1_ i){
        i.operation1();
    }
    public void depend4(Interface1_ i){
        i.operation4();
    }
    public void depend5(Interface1_ i){
        i.operation5();
    }
}
