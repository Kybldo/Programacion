package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio8 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se pide la cantidad en euros.
        System.out.println("Introduce una cantidad en euros:");
        int num = read.nextInt();

        //Se pasa de euros a dólares.
        double dollar = num * 1.08;

        //Mostramos el resultado.
        System.out.println("La cantidad equivale a " + dollar + " dólares.");

        read.close();
    }

}
