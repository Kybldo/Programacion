package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio22 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        int count = 0;

        //Se lee el entero.
        System.out.println("Introduce un número entero:");
        int num = read.nextInt();

        for (int i = num; i > 0; i = i / 10){
            count++;
        }

        //Se muestra el resultado.
        System.out.println("El número " + num + " tiene " + count + " carácteres.");
    }
}
