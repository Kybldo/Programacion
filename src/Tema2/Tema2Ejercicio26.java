package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio26 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        int calc;
        boolean noPrimo = false;

        //Se lee el entero.
        System.out.println("Introduce un número entero:");
        int num = read.nextInt();

        //Se comprueba si el número es o no primo.
        for (int i = 2; i < num; i++){
            calc = num % i;

            if (calc == 0){
                noPrimo = true;
            }
        }

        //Se muestra el resultado.
        if (noPrimo){
            System.out.println("No primo");
        } else System.out.println("Primo");

        read.close();
    }

}
