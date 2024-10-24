package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Se pide la cantidad en dólares.
        System.out.println("Introduce una cantidad en dólares:");
        int num = read.nextInt();

        //Se pasa de dólares a euros.
        double euro = num * 0.93;

        //Mostramos el resultado.
        System.out.println("La cantidad equivale a " + euro + " euros.");

        read.close();
    }
}
