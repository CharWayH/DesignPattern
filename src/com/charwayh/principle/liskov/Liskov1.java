package com.charwayh.principle.liskov;

/**
 * @author charwayH
 * 里式替换原则
 *
 */
public class Liskov1 {
    public static void main(String[] args) {
        A_ a = new A_();
        System.out.println(a.func1(8, 1));
        System.out.println(a.func1(1, 8));
        B_ b = new B_();
        System.out.println(b.func2(8, 1));
        System.out.println(b.func2(1, 8));
    }
}


class A_{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

/**
 * 新增了新功能，两数字相加，然后+1
 */
class B_ extends A_ {
        // 这里重写了A类的方法，可能是无意识的
        @Override
        public int func1(int num1, int num2){
            return num1 + num2;
        }

        public int func2(int num1,int num2){
            return func1(num1, num2)+1;
        }
}