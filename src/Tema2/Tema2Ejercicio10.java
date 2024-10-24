package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio10 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se piden y se leen tres números.
        System.out.println("Introduce el primer número:");
        int num1 = read.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = read.nextInt();

        System.out.println("Introduce el tercer y último número:");
        int num3 = read.nextInt();

        //Se determina el orden de los números y se muestra el resultado.
        if (num1 < num2 && num2 < num3){
            System.out.println("Los números están ordenados de menor a mayor.");
        } else System.out.println("Los números no están ordenados de menor a mayor.");

        read.close();
    }
}
