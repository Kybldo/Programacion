package Tema3;

import java.util.Random;
import java.util.Scanner;

public class Tema3Ejercicio12 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        boolean caught = false;

        int[] flyArray = new int[15];

        Random roll = new Random();

        int flyNumber = roll.nextInt(0, 14);

        flyArray[flyNumber] = 1;

        System.out.println("¡Atrapa a la mosca!");
        System.out.println(" ");

        while (!caught){

            System.out.println("Introduce un número del 1 al 15:");

            System.out.println(" ");

            int userInput = read.nextInt();

            userInput--;

            if (userInput == flyNumber){

                caught = true;

            } else {

                if (userInput + 1 == flyNumber || userInput - 1 == flyNumber){

                    flyArray[flyNumber] = 0;

                    flyNumber = roll.nextInt(0, 14);

                    flyArray[flyNumber] = 1;

                    System.out.println("¡La mosca estaba en una posición adyacente! Se ha movido.");
                    System.out.println(" ");

                } else {

                    System.out.println("No has atrapado a la mosca. Vuelve a intentarlo.");
                    System.out.println(" ");
                }

            }

        }

        System.out.println("¡Has atrapado a la mosca!");

        read.close();

    }

}
