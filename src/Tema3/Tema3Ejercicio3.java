package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Se pide un radio
        System.out.println("Introduce un radio:");

        int radius = read.nextInt();

        while (validRadius(radius)){

            System.out.println("Introduce un radio válido.");
            radius = read.nextInt();

        }

        //Se llaman a las funciones, se calculan y se muestran perímetro y área
        System.out.println("Perímetro: " + calculateCirclePerimeter(radius));

        System.out.println("Superficie: " + calculateCircleArea(radius));

        read.close();

    }

    //Determina si el radio es válido
    public static boolean validRadius(int radius){

        return radius <= 0;

    }

    //Calcula el perímetro
    public static double calculateCirclePerimeter(int radius){

        return 2 * 3.14 * radius;

    }

    //Calcula el área
    public static double calculateCircleArea(int radius){

        return (3.14 * (radius * radius));

    }
}
