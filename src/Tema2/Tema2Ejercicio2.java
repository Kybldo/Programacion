package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {

    public static void  main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se piden y se leen la base y la altura, respectivamente.
        System.out.println("Introduce la base de un rectángulo:");
        int base = read.nextInt();

        System.out.println("Introduce la altura de un rectángulo:");
        int altura = read.nextInt();

        //Se calculan superficie y perímetro, respectivamente.
        int superficie = base * altura;

        int perimetro = (base * 2) + (altura * 2);

        //Mostramos resultados.
        System.out.println("La superficie es: " + superficie + "; el perímetro es: " + perimetro);

        read.close();
    }
}
