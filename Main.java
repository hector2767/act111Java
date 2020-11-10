package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int figura;
        int seleccion;
        int medida;

    Scanner sc = new Scanner(System.in);

        System.out.println("Que figura desea");
        System.out.println("1) Circulo \n2) Cuadrado \n3)Triangulo");
        figura  = sc.nextInt();
        switch (figura){

        case 1:
            System.out.println("Que desea obtener?");
            System.out.println("1)Area \n2)Perimetro");
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1:
                    System.out.println("Medida de la figura");
                    medida = sc.nextInt();
                    Circle circle = new Circle(medida);
                    System.out.println("Area del circulo: " + circle.getArea());
                    break;
                case 2:
                    System.out.println("Medida de la figura");
                    medida = sc.nextInt();
                    Circle circle2 = new Circle(medida);
                    System.out.println("Perimetro del circulo: " + circle2.getPerimeter());
                    break;
                default:
                    System.out.println("Respuesta invalida");
                    System.out.println("Favor de reiniciar el programa");
            }
            break;
        case 2:
            System.out.println("Que desea obtener?");
            System.out.println("1)Area \n2)Perimetro");
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1:
                    System.out.println("Medida de la figura");
                    medida = sc.nextInt();
                    Square square = new Square(medida);
                    System.out.println("Area del cuadrado: " + square.getArea());
                    break;
                case 2:
                    System.out.println("Medida de la figura");
                    medida = sc.nextInt();
                    Square square2 = new Square(medida);
                    System.out.println("Area del cuadrado: " + square2.getPerimeter());
                    break;
                default:
                    System.out.println("Respuesta invalida");
                    System.out.println("Favor de reiniciar el programa");
            }
        break;

        case 3:
            System.out.println("Que desea obtener?");
            System.out.println("1)Area \n2)Perimetro");
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1:
                    System.out.println("Medida de la figura");
                    medida = sc.nextInt();
                    Triangle triangle = new Triangle(medida);
                    System.out.println("Area del triangulo: " + triangle.getArea());
                    break;
                case 2:
                    System.out.println("Medida de la figura");
                    medida = sc.nextInt();
                    Triangle triangle2 = new Triangle(medida);
                    System.out.println("Area del triangulo: " + triangle2.getPerimeter());
                    break;
                default:
                    System.out.println("Respuesta invalida");
                    System.out.println("Favor de reiniciar el programa");
            }
        break;
            default:
                System.out.println("Respuesta invalida");
                System.out.println("Favor de reiniciar el programa");
    }
}
}

