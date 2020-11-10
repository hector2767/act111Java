package com.company;

public class Triangle implements Shape {
    public double lado;   // cm
    public double altura; // cm

    public Triangle(double lado) {
        this.lado = lado;
        this.altura = calcularAltura();
    }

    public void setlado(double lado) {
        this.lado = lado;
        this.altura = calcularAltura();
    }

    public double getlado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return (lado * altura) / 2.0;
    }

    public double getPerimeter() {
        return lado * 3.0;
    }

    private double calcularAltura() {
        return (Math.sqrt(3.0) * this.lado) / 2.0;
    }
}
