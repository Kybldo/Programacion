package Tema5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Random roll = new Random();

        int listSize = roll.nextInt(100);

        int[] numberList = new int[listSize];

        for (int i = 0; i < listSize; i++) {

            int randomNum = roll.nextInt(1, 11);

            numberList[i] = randomNum;

        }

        int userNum = 0;

        while (userNum >= 0) {

            System.out.println(" ");
            System.out.println("El array tiene " + listSize + " elementos.");
            System.out.println("Introduce una posición del array para ver el número que está en ese elemento.");
            System.out.println("Introduce un número negativo para salir.");

            userNum = 0;

            try {

                userNum = read.nextInt();

                if (userNum == 0) {

                    userNum = 0;

                } else if (userNum < 0) {

                    System.out.println("Has salido del programa.");

                } else {

                    userNum--;
                    System.out.println(numberList[userNum]);

                }


            } catch (InputMismatchException ex) {

                System.out.println(" ");
                System.out.println("El valor introducido no es correcto. Se mostrará la posición 1 en su lugar.");
                userNum = 0;
                read.next();

            } catch (ArrayIndexOutOfBoundsException ex) {

                System.out.println(" ");
                System.out.println("La posición a la que quieres acceder se sale del límite del array. Se mostrará la posición 1 en su lugar.");
                userNum = 0;

            }


        }
    }

}
