package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        char character;
        int num;

        System.out.println("Introduce el carácter de tu triángulo:");
        character = read.nextLine().charAt(0);

        System.out.println(" ");
        System.out.println("Introduce el número de líneas de tu triángulo:");
        num = read.nextInt();

        triangle(character, num);

        read.close();

    }

    public static void triangle(char character, int num){

        num *= 2;

        for (int i = 1; i <= num; i = i + 2){

            String triangleString = String.valueOf(character);

            System.out.println(triangleString.repeat(i));

        }

        System.out.print("\n");

    }

}
