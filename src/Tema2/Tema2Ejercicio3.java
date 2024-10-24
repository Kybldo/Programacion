package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio3 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se piden y se leen la base y la altura, respectivamente.
        System.out.println("Introduce la base de un triángulo:");
        int base = read.nextInt();

        System.out.println("Introduce la altura de un triángulo:");
        int altura = read.nextInt();

        //Se calcula la superficie.
        int superficie = (base * altura) / 2;

        //Mostramos resultados.
        System.out.println("La superficie es: " + superficie);

        read.close();
    }

}
