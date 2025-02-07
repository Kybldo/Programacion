package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        boolean program = true;

        int positive;
        int negative;

        while (program){

            System.out.println(" ");
            System.out.println("Introduce un entero positivo:");

            try{

                positive = read.nextInt();
                imprimePositivo(positive);

            } catch (InputMismatchException ex) {

                System.out.println("El valor introducido no es un entero.");
                read.next();

            } catch (Exception ex) {

                System.out.println("El número no es positivo.");

            }


            System.out.println(" ");
            System.out.println("Introduce un entero negativo:");

            try{

                negative = read.nextInt();
                imprimeNegativo(negative);

            } catch (InputMismatchException ex) {

                System.out.println("El valor introducido no es un entero.");
                read.next();

            } catch (Exception ex) {

                System.out.println("El número no es negativo.");

            }

            System.out.println(" ");
            System.out.println("¿Volver a introducir números?");
            System.out.println("1. Sí | 2. No");

            int choice = read.nextInt();

            switch (choice){

                case 1 -> System.out.print("");

                case 2 -> program = false;

            }
        }

        System.out.println("Has salido del programa.");

        read.close();

    }

    public static void imprimePositivo(int p) throws Exception{


        if (p < 0){

            throw new Exception("El número no es positivo.");

        }

        System.out.println(" ");
        System.out.print("Valor positivo: ");
        System.out.println(p);

    }

    public static void imprimeNegativo(int n) throws Exception{

        if (n >= 0){

            throw new Exception("El número no es negativo.");

        }

        System.out.println(" ");
        System.out.print("Valor negativo: ");
        System.out.println(n);

    }

}
