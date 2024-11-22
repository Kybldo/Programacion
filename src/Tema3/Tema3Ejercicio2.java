package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una edad:");

        int age = read.nextInt();

        if (isAdult(age)){

            System.out.println("Es mayor de edad.");

        } else System.out.println("No es mayor de edad.");

    }

    public static boolean isAdult(int numFunc){

        return numFunc > 17;

    }

}
