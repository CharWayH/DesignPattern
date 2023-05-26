package com.charwayh.principle.ocp;

/**
 * @author charwayH
 * 思路: 把创建Shape类做成抽象类，并提供了一个抽象方法draw，让子类去实现即可，这样我们有新的图形种类时，只需要让新的图形继承Shape，并实现
 * draw方法接口，使用方的代码无需修改→满足开闭原则
 */
public class OcpImprove {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        // 新增图形
        graphicEditor.drawShape(new Triangle());
    }

}

class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }
}

abstract class Shape{
    public abstract void draw();
}

class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

// 新增方法
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}