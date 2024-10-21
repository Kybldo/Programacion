package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio10 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un primer número real:");
        double num = read.nextDouble();

        System.out.println("Introduce un segundo número real:");
        double num2 = read.nextDouble();

        double suma = num + num2;
        double producto = num * num2;
        double resta = num - num2;
        double div = num / num2;
        double resto = num % num2;

        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        System.out.println("Resta: " + resta);
        System.out.println("División: " + div);
        System.out.println("Resto: " + resto);
    }
}