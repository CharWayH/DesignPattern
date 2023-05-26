package com.charwayh.principle.ocp;

/**
 * @author charwayH
 * 开闭原则
 * 优点是比较好理解，简单易于操作
 * 缺点是违反了设计模式的ocp原则，即对扩展开放(提供方)，对修改关闭(使用方)，即当我们给类新增功能时，尽量不修改代码，或者尽可能少的修改代码
 * 比如我们要新增一个图形(三角形)，我们需要做如下修改，修改的地方也比较多
 */
public class Ocp1 {
    public static void main(String[] args) {
        // 使用看看存在的问题
        GraphicEditor_ graphicEditor = new GraphicEditor_();
        graphicEditor.drawShape(new Rectangle_());
        graphicEditor.drawShape(new Circle_());
        // 新增代码
        graphicEditor.drawShape(new Triangle_());

    }

}

/**
 * 这是一个用于绘图的类(使用方)
 */
class GraphicEditor_{
    /**
     * 接收Shape_对象，然后根据type来绘制不同的图形
      */
    public void drawShape(Shape_ s){
        if(s.m_type == 1) {
            drawRectagle(s);
        }
        else if(s.m_type == 2) {
            drawCircle(s);
        }
        // 新增代码
        else if(s.m_type == 3) {
            drawTriangle(s);
        }
    }
    public void drawRectagle(Shape_ r){
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape_ r){
        System.out.println("绘制圆形");
    }
    // 新增代码
    public void drawTriangle(Shape_ r){
        System.out.println("绘制三角形");
    }
}

class Shape_{
    int m_type;
}

class Rectangle_ extends Shape_{
    Rectangle_(){
        super.m_type = 1;
    }
}

class Circle_ extends Shape_{
    Circle_(){
        super.m_type = 2;
    }
}

class Triangle_ extends Shape_{
    Triangle_(){
        super.m_type = 3;
    }
}