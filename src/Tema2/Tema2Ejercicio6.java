package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio6 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se pide y se lee el número.
        System.out.println("Introduce un número:");

        int num = read.nextInt();

        //Se determina y se enseña si el número es cero, positivo, o negativo.
        if (num == 0){
        System.out.println("El número es cero.");
        } else if (num >= 1) {
            System.out.println("El número es positivo.");
        } else System.out.println("El número es negativo.");

        read.close();
    }
}
