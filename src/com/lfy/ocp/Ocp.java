package com.lfy.ocp;

public class Ocp {
    public static void main(String[] args) {
        /*Graphic graphic = new Graphic();
        graphic.draw(new Circle());
        graphic.draw(new RectAngle());
        graphic.draw(new Other());*/
        Graphic graphic = new Graphic();
        graphic.drewShape(new Circle());
        graphic.drewShape(new RectAngle());
        graphic.drewShape(new Other());
    }
}

//改进 使用抽象方法来遵循 OCP 原则
//当我们增加一个类的时候
//该类并不需要进行修改, 修改的代码很少
class Graphic {
    public void drewShape(Shape shape){
        shape.draw();
    }
}
abstract class Shape {
    int m_type;
    public abstract void draw();
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
class RectAngle extends Shape{
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class Other extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}

//这种方式违背了 OCP 原则, 因为当进行新增一个类的时候, 需要改动的地方太多. 比如增加一个 Other 类继承 Shape 类.
/*
class Graphic {
    public void draw(Shape shape){
        if(shape.m_type == 1){
            System.out.println("绘制圆形.");
        }else if(shape.m_type == 2){
            System.out.println("绘制矩形.");
        }//这里也需要改动
        else if(shape.m_type == 3){
            System.out.println("绘制其他图形");
        }
    }
}

class Shape {
   int m_type;
}
//添加一个新的 Other 类, 这里需要改动
class Other extends Shape {
    Other(){
        super.m_type = 3;
    }
}

class Circle extends Shape {
    Circle(){
        super.m_type = 1;
    }
}

class RectAngle extends Shape {
    RectAngle(){
        super.m_type = 2;
    }
}*/
