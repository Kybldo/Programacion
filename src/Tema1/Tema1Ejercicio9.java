package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un primer número entero:");
        int num = read.nextInt();

        System.out.println("Introduce un segundo número entero:");
        int num2 = read.nextInt();

        int suma = num + num2;
        int producto = num * num2;
        int resta = num - num2;
        int div = num / num2;
        int resto = num % num2;

        System.out.println("Suma: " + suma);
        System.out.println("Producto: " + producto);
        System.out.println("Resta: " + resta);
        System.out.println("División: " + div);
        System.out.println("Resto: " + resto);
    }
}
