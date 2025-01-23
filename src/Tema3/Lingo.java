package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class Lingo {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String word = "FUMAR";

        int attempts = 0;
        boolean win = false;
        String guess = "";

        char[] wordArray = word.toCharArray();

        char[] emptyWord = new char[wordArray.length];

        char[] guessArray;

        Arrays.fill(emptyWord, '-');

        while (!win && attempts < 5){

            System.out.println(" ");
            System.out.print("Hint: ");
            System.out.print(emptyWord);

            System.out.println(" ");
            System.out.println("Intentos: " + attempts + "/5");
            System.out.println(" ");

            while (guess.length() < 5){

                System.out.println("Introduce una palabra:");

                guess = read.nextLine();
                
                if (guess.length() < 5){

                    System.out.println(" ");
                    System.out.println("La palabra tiene que ser de 5 letras.");
                    System.out.println(" ");
                    
                }
            }

            guess = guess.toUpperCase();

            guessArray = guess.toCharArray();

            for (int i = 0; i < wordArray.length; i++){

                if (guessArray[i] == wordArray[i]){

                    emptyWord[i] = wordArray[i];
                    
                } else {

                    for (int j = 0; j < wordArray.length; j++) {

                        if (guessArray[i] == wordArray[j]){

                            emptyWord[i] = '*';

                        }
                    }
                }
            }

            attempts++;

            if (guess.equals(word)){

                win = true;

                System.out.println(" ");
                System.out.println(emptyWord);

                System.out.println(" ");
                System.out.println("¡La has adivinado!");

            } else if (attempts == 5) {

                System.out.println(" ");
                System.out.println("¡No la has adivinado!");

            }
        }

        read.close();

    }
}
