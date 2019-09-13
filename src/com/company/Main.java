package com.company;

interface Shape {
    public String draw();
};

class Circle implements Shape {

    public String draw() {
        return "Hello, I'm a circle";
    }
}

class Rectangle implements Shape {

    public String draw() {
        return "Hello, I'm a rectangle";
    }
}

class Square implements Shape {

    public String draw() {
        return "Hello, I'm square";
    }
}

class ShowShapes {

    private Shape shape;

    public ShowShapes(Shape shape) {
        this.shape = shape;
    };

    public void process() {
        System.out.println(this.shape.draw());
    }
}

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        System.out.println(circle.draw());
        System.out.println(rectangle.draw());
        System.out.println(square.draw());

        ShowShapes show = new ShowShapes(new Circle());
        show.process();


    }
}
