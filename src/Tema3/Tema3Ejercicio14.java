package Tema3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Tema3Ejercicio14 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String[] pairs = {"AA", "AA", "BB", "BB", "CC", "CC", "DD", "DD", "EE", "EE", "FF", "FF", "GG", "GG", "HH", "HH", "II", "II", "JJ", "JJ"};

        scramble(pairs);

        String[] board = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

        int found = 0;

        System.out.println("¡Encuentra las parejas!");

        while (found < 10) {

            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println(" ");
            System.out.println("Introduce dos números para revelar qué esconden:");
            System.out.println(" ");
            System.out.println(Arrays.toString(board));
            System.out.println(" ");

            int selection1 = 0;

            while (selection1 == 0 || selection1 > 20){

                System.out.println("Primer número:");

                selection1  = read.nextInt();

                if (selection1 == 0 || selection1 > 20){

                    System.out.println("Introduce un número válido.");
                    System.out.println(" ");

                }

            }

            selection1--;

            int selection2 = 0;

            while (selection2 == 0 || selection2 > 20){

                System.out.println("Segundo número:");

                selection2  = read.nextInt();

                if (selection2 == 0 || selection2 > 20){

                    System.out.println("Introduce un número válido.");
                    System.out.println(" ");

                }

            }

            selection2--;

            System.out.println(" ");

            check(pairs, board, selection1, selection2);

            System.out.println("Resultado: " + Arrays.toString(board));

            if (check(pairs, board, selection1, selection2)) {

                found++;

                System.out.println(" ");
                System.out.println("¡Has encontrado una pareja!");
                System.out.println(" ");

                uncheck(pairs, board, selection1, selection2);

            }

        }

        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("¡Enhorabuena! Has encontrado todas las parejas.");
        System.out.println("-----------------------------------------------");

    }

    public static void scramble(String[] pairs) {

        Random roll = new Random();

        int num;
        String temp;

        for (int i = 0; i < pairs.length; i++) {

            num = roll.nextInt(0, pairs.length);

            temp = pairs[i];

            pairs[i] = pairs[num];

            pairs[num] = temp;

        }

    }

    public static boolean check(String[] pairs, String[] board, int num1, int num2) {

        boolean pair = false;

        String tempPairs1 = pairs[num1]; //a
        String tempPairs2 = pairs[num2]; //b

        pairs[num1] = board[num1]; //a = 1
        board[num1] = tempPairs1; //1 = a

        pairs[num2] = board[num2]; //b = 2
        board[num2] = tempPairs2; //2 = b

        if (Objects.equals(pairs[num1], pairs[num2])) {

            pair = true;

        }

        return pair;

    }

    public static void uncheck(String[] pairs, String[] board, int num1, int num2) {

        String tempPairs1 = pairs[num1]; //a
        String tempPairs2 = pairs[num2]; //b

        pairs[num1] = board[num1]; //a = 1
        board[num1] = tempPairs1; //1 = a

        pairs[num2] = board[num2]; //b = 2
        board[num2] = tempPairs2; //2 = b

    }

}