package com.charwayh.principle.Segregation;

/**
 * @author charwayH
 * 按隔离原则应当这样处理：将接口Interface1拆分为独立的几个接口，类A和类C与他们需要的接口建立依赖关系，这也就是采用接口隔离原则
 * 将接口Interface1拆分为独立的几个接口，类A和C分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则
 * 接口Interface1中出现的方法，根据实际情况拆分为三个接口
 */
public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }
}

interface Interface1{
    void operation1();
}

interface Interface2{
    void operation2();
    void operation3();
}

interface Interface3{
    void operation4();
    void operation5();
}

class B implements Interface1,Interface2{
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
}

class D implements Interface1,Interface3{
    @Override
    public void operation1() {
        System.out.println("类D实现方法operation1");
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

class A {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface2 i){
        i.operation2();
    }
    public void depend3(Interface2 i){
        i.operation3();
    }
}

class C {
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface3 i){
        i.operation4();
    }
    public void depend5(Interface3 i){
        i.operation5();
    }
}