package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio23 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se declaran los int para futuros cálculos.
        int count = 0;
        int num = 0;
        int media = 0;

        //Se pide un entero. Si el entero es positivo, se realiza el cálculo. De ser negativo, se termina el programa, y se enseña el resultado calculado.
        while (num >= 0){
            System.out.println("Introduce una serie de números enteros (se parará al introducir un negativo):");
            num = read.nextInt();

            if (num >= 0){
                count++;

                media = (media + num) / count;
            }
        }

        //Se muestra el resultado.
        System.out.println("La media de los números introducidos es: " + media);

        read.close();
    }
}
