package com.company;

public class Square implements Shape{

    protected double lado;

    public Square(double sideLength) {
        this.lado = sideLength;
    }

    public void setlado(double lado) {
        this.lado = lado;
    }

    public double getlado() {
        return lado;
    }

    public double getArea() {
        return lado * lado;
    }

    public double getPerimeter() {
        return lado * 4;
    }

}
