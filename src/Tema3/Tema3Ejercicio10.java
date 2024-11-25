package Tema3;

import java.util.Scanner;

import static Tema3.Tema3Ejercicio1.numberSign;
import static Tema3.Tema3Ejercicio2.isAdult;
import static Tema3.Tema3Ejercicio3.*;
import static Tema3.Tema3Ejercicio4.*;
import static Tema3.Tema3Ejercicio5.table;
import static Tema3.Tema3Ejercicio6.tables;
import static Tema3.Tema3Ejercicio7.primo;
import static Tema3.Tema3Ejercicio8.dateValid;
import static Tema3.Tema3Ejercicio9.triangle;

public class Tema3Ejercicio10 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Variable para la selección del menú
        int selection = 0;

        //Se pregunta en qué programa entrar; se pide un entero, y se entra en el switch
        while (selection == 0 || selection > 9){

            System.out.println("Introduce el programa a elegir:");
            System.out.println(" ");

            System.out.println("1. Mostrar el signo de un número.");
            System.out.println("2. Indicar si eres mayor de edad.");
            System.out.println("3. Calcular área y perímetro.");
            System.out.println("4. Convertir euros a dólares (y viceversa).");
            System.out.println("5. Mostrar tabla de multiplicar.");
            System.out.println("6. Mostrar tablas de multiplicar (del 1 al 10).");
            System.out.println("7. Comprobar números primos.");
            System.out.println("8. Comprobar fechas.");
            System.out.println("9. Dibujar triángulos.");
            System.out.println(" ");

            selection = read.nextInt();

            if (selection == 0 || selection > 9){

                System.out.println("Introduce un número de programa válido.");
                System.out.println(" ");
            }
        }

        switch (selection){

            //Mostrar el signo de un número
            case 1 -> {

                System.out.println("Introduce un número:");

                int numUser = read.nextInt();

                int result = numberSign(numUser);

                if (result == 0){

                    System.out.println("El número es cero.");

                } else if (result < 0) {

                    System.out.println("El número es negativo.");

                } else System.out.println("El número es positivo.");
            }

            //Indicar si eres mayor de edad
            case 2 -> {

                System.out.println("Introduce una edad:");

                int age = read.nextInt();

                if (isAdult(age)){

                    System.out.println("Es mayor de edad.");

                } else System.out.println("No es mayor de edad.");
            }

            //Calcular área y perímetro
            case 3 -> {

                System.out.println("Introduce un radio:");

                int radius = read.nextInt();

                while (validRadius(radius)){

                    System.out.println("Introduce un radio válido.");
                    radius = read.nextInt();

                }

                System.out.println("Perímetro: " + calculateCirclePerimeter(radius));

                System.out.println("Superficie: " + calculateCircleArea(radius));

            }

            //Convertir euros a dólares (y viceversa)
            case 4 -> {

                showMenu();

                int select = read.nextInt();

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
            }

            //Mostrar tabla de multiplicar
            case 5 -> {

                int num = 0;

                while (num == 0 || num > 10){

                    System.out.println("Introduce un número del 1 al 10 para ver su tabla de multiplicar:");

                    num = read.nextInt();

                    if (num == 0 || num > 10) System.out.println("Introduce un número válido.");
                    System.out.println(" ");
                }

                table(num);

            }

            //Mostrar tablas de multiplicar (del 1 al 10)
            case 6 -> tables();

            //Comprobar números primos
            case 7 -> {

                int num = 0;

                while (num >= 0) {

                    System.out.println(" ");
                    System.out.println("Introduce números para ver si son primos (para salir, introduce un negativo):");

                    num = read.nextInt();

                    if (num == 1) {

                        System.out.println("No primo");

                    } else if (num > 0) primo(num);
                }
            }

            //Comprobar fechas
            case 8 -> {

                int month = 0;
                int day = 0;
                int year;

                System.out.println("Introduce un año:");

                year = read.nextInt();

                while (month == 0 || month > 12){

                    System.out.println(" ");
                    System.out.println("Introduce un mes:");

                    month = read.nextInt();

                    System.out.println(" ");
                    if (month == 0 || month > 12) System.out.println("Introduce un mes válido.");

                }

                while (day == 0 || day > 31){

                    System.out.println("Introduce un día:");

                    day = read.nextInt();

                    System.out.println(" ");
                    if (day == 0 || day > 31) System.out.println("Introduce un día válido.");

                }

                System.out.println(day + " del " + month + " de " + year);
                System.out.println(" ");

                boolean result = dateValid(month, day, year);

                if (result){

                    System.out.println("La fecha es válida.");

                } else System.out.println("La fecha no es válida.");
            }

            //Dibujar triángulos
            case 9 -> {

                read. nextLine();

                char character;
                int num;

                System.out.println("Introduce el carácter de tu triángulo:");
                character = read.nextLine().charAt(0);

                System.out.println(" ");
                System.out.println("Introduce el número de líneas de tu triángulo:");
                num = read.nextInt();

                triangle(character, num);

            }
        }

        read.close();
    }
}
