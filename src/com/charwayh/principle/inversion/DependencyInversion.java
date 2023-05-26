package com.charwayh.principle.inversion;

/**
 * @author charwayH
 * 面向接口编程
 */
public class DependencyInversion {
    public static void main(String[] args) {
        // 客户端无需改变
        Person_ person = new Person_();
        person.receive(new Email_());
        person.receive(new Weixin_());
    }
}

interface IReceiver{
    String getInfo();
}

class Email_ implements IReceiver{
    @Override
    public String getInfo(){
        return "电子邮件信息: Hello world";
    }
}

class Weixin_ implements IReceiver{
    @Override
    public String getInfo(){
        return "微信消息: Hello world";
    }
}

class Person_{
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
