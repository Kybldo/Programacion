package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio17 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se pide el tipo de conversor que se quiere utilizar.
        System.out.println("Introduce 'D' para calcular Dólares a Euros, o 'E' para calcular Euros a Dólares:");
        int tipo = read.nextInt();

        switch (tipo){
            case 0 -> {
                //Se pide la cantidad en euros.
                System.out.println("Introduce una cantidad en euros:");
                int num = read.nextInt();

                //Se pasa de euros a dólares.
                double dollar = num * 1.08;

                //Mostramos el resultado.
                System.out.println("La cantidad equivale a " + dollar + " dólares.");
            }
            case 1 -> {
                //Se pide la cantidad en dólares.
                System.out.println("Introduce una cantidad en dólares:");
                int num = read.nextInt();

                //Se pasa de dólares a euros.
                double euro = num * 0.93;

                //Mostramos el resultado.
                System.out.println("La cantidad equivale a " + euro + " euros.");
            }
            case 2 -> {
                //Se pide la cantidad en dólares.
                System.out.println("Introduce una cantidad en dólares:");
                int num = read.nextInt();

                //Se pasa de dólares a euros.
                double euro = num * 0.93;

                //Mostramos el resultado.
                System.out.println("La cantidad equivale a " + euro + " euros.");
            }

        }

        read.close();
    }

}
