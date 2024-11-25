package Tema3;

import java.util.Scanner;

import static Tema3.Tema3Ejercicio1.numberSign;

public class Tema3Ejercicio2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce una edad:");

        int age = read.nextInt();

        if (isAdult(age)){

            System.out.println("Es mayor de edad.");

        } else System.out.println("No es mayor de edad.");


        System.out.println(" ");
        System.out.println("Introduce un número:");

        int num2 = read.nextInt();

        System.out.println(numberSign(num2));

        read.close();

    }

    public static boolean isAdult(int numFunc){

        return numFunc > 17;

    }

}
