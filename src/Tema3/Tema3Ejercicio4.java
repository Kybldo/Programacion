package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio4 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Muestra el menú
        showMenu();

        int select = read.nextInt();

        //En base a la elección, entra en uno de los dos programas
        switch (select){

            case 1 -> {

                System.out.println("Introduce una cantidad en euros:");
                double euro = read.nextInt();

                System.out.println(" ");
                System.out.println(euro + "€ equivale a " + euro2dollar(euro) + "$");

            }

            case 2 -> {

                System.out.println("Introduce una cantidad en dólares:");
                double dollar = read.nextInt();

                System.out.println(" ");
                System.out.println(dollar + "$ equivale a " + dollar2euro(dollar) + "€");

            }

            default -> System.out.println("Introduce un programa válido.");

        }

        read.close();

    }

    //Función del menú
    public static void showMenu(){

        System.out.println("Elige un programa:");
        System.out.println("1. Pasar de euros a dólares | 2. Pasar de dólares a euros");

    }

    //Pasa euros a dólares
    public static double euro2dollar(double euro){

        return euro * 1.04;

    }

    //Pasa dólares a euros
    public static double dollar2euro(double dollar){

        return dollar * 0.96;

    }
}
