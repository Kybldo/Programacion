package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio11 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se piden y se leen tres números.
        System.out.println("Introduce el primer número:");
        int num1 = read.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = read.nextInt();

        System.out.println("Introduce el tercer y último número:");
        int num3 = read.nextInt();

        //Se determina si los números son consecutivos y se muestra el resultado.
        if (num1 + 1 == num2 && num2 + 1 == num3){
            System.out.println("Los números son consecutivos.");
        } else System.out.println("Los números no son consecutivos.");

        read.close();
    }
}
