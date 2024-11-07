package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Random random = new Random();

        //Se genera el número secreto.
        int secret = random.nextInt(1,100);

        //Se le pide el número al usuario.
        System.out.println("Adivina un número del 1 al 100:");
        int num = read.nextInt();

        //De no haber acertado, se determina si es mayor o menor.
        while (num != secret){

            if (num > secret){
                System.out.println("El número es menor.");
            } else System.out.println("El número es mayor.");

            System.out.println("Prueba con otro número:");
            num = read.nextInt();
        }

        //Al acertar, se muestra el resultado.
        System.out.println("¡Lo has adivinado!");
        read.close();
    }

}
