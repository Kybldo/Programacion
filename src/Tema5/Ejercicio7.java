package Tema5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[] numberList = new int[5];

        int num = 0;

        int counter = 0;

        while (counter != 5){

            System.out.println(" ");
            System.out.println(Arrays.toString(numberList));

            System.out.println(" ");
            System.out.println("Introduce un entero:");

            try {

                num = read.nextInt();

            } catch (InputMismatchException ex){

                System.out.println(" ");
                System.out.println("El valor introducido no es correcto. Se ha establecido 0 en su lugar.");
                num = 0;
                read.next();

            } finally {

                numberList[counter] = num;
                counter++;

            }
        }

        System.out.println(" ");
        System.out.println("Has rellenado el array:");
        System.out.println(Arrays.toString(numberList));

    }
}