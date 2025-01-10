package Tema3;

import java.util.Random;
import java.util.Scanner;

public class Tema3Ejercicio16 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        boolean caught = false;

        int[][] flyArray = new int[4][4];

        Random roll = new Random();

        int flyNumber1 = roll.nextInt(flyArray.length);
        int flyNumber2 = roll.nextInt(flyArray.length);

        flyArray[flyNumber1][flyNumber2] = 1;

        while (!caught){

            System.out.println("Introduce un primer número (1 - 4)");

            System.out.println(" ");

            int userInput1 = read.nextInt();

            System.out.println(" ");

            userInput1--;

            System.out.println("Introduce un segundo número (1 - 4)");

            System.out.println(" ");

            int userInput2 = read.nextInt();

            userInput2--;

            if (userInput1 == flyNumber1 && userInput2 == flyNumber2){

                caught = true;

            } else {

                if (userInput1 + 1 == flyNumber1 || userInput1 - 1 == flyNumber1 || userInput2 + 1 == flyNumber2 || userInput2 - 1 == flyNumber2){

                    flyArray[flyNumber1][flyNumber2] = 0;

                    flyNumber1 = roll.nextInt(flyArray.length);
                    flyNumber2 = roll.nextInt(flyArray.length);

                    flyArray[flyNumber1][flyNumber2] = 1;

                    System.out.println("¡La mosca estaba en una posición adyacente! Se ha movido.");
                    System.out.println(" ");

                } else {

                    System.out.println(" ");
                    System.out.println("No has atrapado a la mosca. Vuelve a intentarlo.");
                    System.out.println(" ");
                }

            }

        }

        System.out.println(" ");
        System.out.println("¡Has atrapado a la mosca!");

        read.close();

    }

}
