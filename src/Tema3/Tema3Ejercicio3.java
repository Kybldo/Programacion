package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un radio:");

        int radius = read.nextInt();

        while (validRadius(radius)){

            System.out.println("Introduce un radio válido.");
            radius = read.nextInt();

        }

        System.out.println("Perímetro: " + calculateCirclePerimeter(radius));

        System.out.println("Superficie: " + calculateCircleArea(radius));

    }

    public static boolean validRadius(int radius){

        return radius <= 0;

    }

    public static double calculateCirclePerimeter(int radius){

        return 2 * 3.14 * radius;

    }

    public static double calculateCircleArea(int radius){

        return (3.14 * (radius * radius));

    }

}
