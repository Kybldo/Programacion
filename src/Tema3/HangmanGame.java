package Tema3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        boolean solved = false;
        boolean solve = false;
        int errors = 0;
        int choiceGuess = 0;
        String finalGuess;

        char choice;

        boolean isItThere = false;

        System.out.println("Jugador 1, introduce una palabra:");
        String word = read.nextLine();

        char[] wordArray = word.toCharArray();

        char[] emptyWord = new char[wordArray.length];

        Arrays.fill(emptyWord, '_');

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Jugador 2, adivina la palabra:");
        System.out.println(" ");

        while (!solved && errors < 6){

            printHangman(errors);
            System.out.println(emptyWord);

            System.out.println("Errores: " + errors + "/6");
            System.out.println(" ");
            System.out.println("Introduce una letra:");

            choice = read.nextLine().charAt(0);

            for (int i = 0; i < wordArray.length; i++){

                if (choice == word.charAt(i)){

                    isItThere = true;

                    emptyWord[i] = wordArray[i];

                }
            }

            if (isItThere) {

                System.out.println(" ");
                System.out.println("La letra está en la palabra.");
                System.out.println(emptyWord);

            } else {

                System.out.println(" ");
                System.out.println("La letra no está en la palabra.");
                System.out.println(emptyWord);
                errors++;

            }

            isItThere = false;

            System.out.println(" ");
            System.out.println("¿Quieres intentar resolver?");
            System.out.println("1. Sí | 2. No");
            System.out.println(" ");

            while (choiceGuess <= 0 || choiceGuess > 2){

                choiceGuess = read.nextInt();
                read.nextLine();

                if (choiceGuess <= 0 || choiceGuess > 2) System.out.println("Introduce una opción válida.");

            }

            switch (choiceGuess) {

                case 1 -> solve = true;

                case 2 -> System.out.println(" ");

            }

            choiceGuess = 0;

            if (solve) {

                System.out.println(" ");
                System.out.println("Introduce la palabra:");

                finalGuess = read.nextLine();

                if (Objects.equals(finalGuess, word)){

                    System.out.println(" ");
                    System.out.println("¡La has adivinado!");
                    solved = true;

                } else {

                    System.out.println(" ");
                    System.out.println("No la has adivinado.");
                    errors = 6;

                }
            }

            if (errors == 6){

                System.out.println("Se te ha muerto el muñeco");
                printHangman(errors);


            }
        }

        read.close();

    }

    public static void printHangman(int errors){

        if (errors == 0){

            System.out.println(" ");

        } else if (errors == 1) {

            printHead();

        } else if (errors == 2) {

            printHead();
            printLeftArm();

        } else if (errors == 3) {

            printHead();
            printLeftArm();
            printTorso();

        } else if (errors == 4) {

            printHead();
            printLeftArm();
            printTorso();
            printRightArm();

        } else if (errors == 5) {

            printHead();
            printLeftArm();
            printTorso();
            printRightArm();
            printLeftLeg();

        } else if (errors == 6) {

            printHead();
            printLeftArm();
            printTorso();
            printRightArm();
            printLeftLeg();
            printRightLeg();

        }

        System.out.println(" ");

    }

    public static void printHead(){
        System.out.println("  o  ");
    }

    public static void printLeftArm(){
        System.out.print(" /");
    }

    public static void printTorso(){
        System.out.print("|");
    }

    public static void printRightArm(){
        System.out.println("\\");
    }

    public static void printLeftLeg(){
        System.out.print(" / ");
    }

    public static void printRightLeg(){
        System.out.print("\\");
    }
}
