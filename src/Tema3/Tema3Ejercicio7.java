package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio7 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num = 0;

        while (num >= 0){

            System.out.println(" ");
            System.out.println("Introduce números para ver si son primos (para salir, introduce un negativo):");

            num = read.nextInt();

            if (num > 1) primo(num);

        }

        read.close();

    }

    public static void primo(int num){

        boolean noPrimo = false;

        for (int i = 2; i < num; i++){
            int calc = num % i;

            if (calc == 0){
                noPrimo = true;
            }
        }

        if (noPrimo){
            System.out.println("No primo");
        } else System.out.println("Primo");

    }

}
