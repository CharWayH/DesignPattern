package com.charwayh.adpater.interfaceadapter;

/**
 * @author charwayH
 */
public class Client {
    public static void main(String[] args) {
         AbsAdapter absAdapter= new AbsAdapter(){
            @Override
            public void operation1() {
                System.out.println("使用了operation1的方法");
            }
        };
         absAdapter.operation1();
    }
}
