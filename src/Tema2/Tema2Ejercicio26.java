package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio26 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        int calc = 0;
        boolean noPrimo = false;

        //Se lee el entero.
        System.out.println("Introduce un número entero:");
        int num = read.nextInt();

        for (int i = num; i >= 0; i--){
            calc = num % i;

            if (calc == 0){
                noPrimo = true;
            }
        }

        if (noPrimo){
            System.out.println("No primo");
        } else System.out.println("Primo");

        read.close();
    }

}
