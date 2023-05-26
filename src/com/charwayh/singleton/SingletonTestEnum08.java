package com.charwayh.singleton;

/**
 * @author: create by CharwayH
 * @description: com.charwayh.singleton
 * @date:2023/5/22
 * 枚举类实现单例(推荐使用)
 * 能够避免多线程问题，还可以防止反序列化重新创建对象
 */
public class SingletonTestEnum08 {
    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;
        System.out.println(instance == instance2);
        instance.method();
    }

    /**
     * 使用枚举类也可以实现单例，推荐使用
     */
    enum SingletonEnum {
        INSTANCE;
        public void method() {
            System.out.println("It's OK!");
        }
    }
}
