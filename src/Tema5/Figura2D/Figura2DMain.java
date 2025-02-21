package Tema5.Figura2D;

public class Figura2DMain {

    public static void main(String[] args) {

        Figura2D cuadrado = new Cuadrado(10);
        Figura2D rectangulo = new Rectangulo(5, 6);
        Figura2D triangulo = new Triangulo(4, 6, 8, 5);
        Figura2D circulo = new Circulo(3);

        System.out.println("Atributos Cuadrado:");
        System.out.println(((Cuadrado) cuadrado));

        System.out.println(" ");

        System.out.println("Área cuadrado:");
        System.out.println(((Cuadrado) cuadrado).area());

        System.out.println("Perímetro cuadrado:");
        System.out.println(((Cuadrado) cuadrado).perimeter());

        System.out.println("____________________________________");

        System.out.println("Atributos Rectángulo:");
        System.out.println(((Rectangulo) rectangulo));

        System.out.println(" ");

        System.out.println("Área rectángulo:");
        System.out.println(((Rectangulo) rectangulo).area());

        System.out.println("Perímetro rectángulo:");
        System.out.println(((Rectangulo) rectangulo).perimeter());

        System.out.println("____________________________________");

        System.out.println("Atributos Triángulo:");
        System.out.println(((Triangulo) triangulo));

        System.out.println(" ");

        System.out.println("Área triángulo:");
        System.out.println(((Triangulo) triangulo).area());

        System.out.println("Perímetro triángulo:");
        System.out.println(((Triangulo) triangulo).perimeter());

        System.out.println("____________________________________");

        System.out.println("Atributos Círculo:");
        System.out.println(((Circulo) circulo));

        System.out.println(" ");

        System.out.println("Área círculo:");
        System.out.println(((Circulo) circulo).area());

        System.out.println("Perímetro círculo:");
        System.out.println(((Circulo) circulo).perimeter());

    }

}
