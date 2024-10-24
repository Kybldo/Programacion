package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se piden y se leen tres números.
        System.out.println("Introduce el primer número:");
        int num1 = read.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = read.nextInt();

        System.out.println("Introduce el tercer y último número:");
        int num3 = read.nextInt();

        //Se calcula la media (sin decimales).
        int media = (num1 + num2 + num3) / 3;

        //Se calcula la media (con decimales).
        double mediaD = (double) (num1 + num2 + num3) / 3;

        //Mostramos las medias.
        System.out.println("La media sin decimales es: " + media);
        System.out.println("La media con decimales es: " + mediaD);

        read.close();
    }
}
