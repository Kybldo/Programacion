package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Variables
        char character;
        int num;

        //Pide un carácter de la pirámide
        System.out.println("Introduce el carácter de tu triángulo:");
        character = read.nextLine().charAt(0);

        //Pide el número de líneas de la pirámide
        System.out.println(" ");
        System.out.println("Introduce el número de líneas de tu triángulo:");
        num = read.nextInt();

        //Se muestra la pirámide
        triangle(character, num);

        read.close();

    }

    //Me pararía a explicar esto en un comentario, pero, honestamente, ha llevado tanta prueba y error que creo que no soy capaz
    public static void triangle(char character, int num){

        num *= 2;

        for (int i = 1; i <= num; i = i + 2){

            String triangleString = String.valueOf(character);

            String triangleStringBlank = " ";

            System.out.print(triangleStringBlank.repeat(num - i / 2));

            System.out.println(triangleString.repeat(i));

        }

        System.out.print("\n");

    }
}
