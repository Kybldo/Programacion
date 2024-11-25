package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio7 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num = 0;

        //Pide números primos de forma indefinida, llamando a la función y mostrando si es primo o no en el proceso; deja de pedir al introducir un negativo
        while (num >= 0){

            System.out.println(" ");
            System.out.println("Introduce números para ver si son primos (para salir, introduce un negativo):");

            num = read.nextInt();

            //Excepción para que no tome 1 como número primo
            if (num == 1){

                System.out.println("No primo");

            } else if (num > 0) primo(num);

        }

        read.close();

    }

    //Determina si el número es primo
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
