package com.charwayh.principle.inversion;

/**
 * @author charwayH
 * 方法1分析
 * 1.简单易想到
 * 2.如果我们获取的对象是微信，短信等，则新增类。同时Person类也要新增方法
 * 3.解决思路:引用一个抽象接口IReceiver，表示接收者，这样的Person类与接口IReceiver产生依赖
 * 因为微信，Email等属于接收的范围，他们各自实现IERceiver接口。这样我们就符合依赖倒转原则
 */
public class DependencyInversionImprove {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息: Hello world";
    }
}

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
