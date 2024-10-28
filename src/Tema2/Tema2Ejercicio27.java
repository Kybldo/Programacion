package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio27 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        int calc = 0;
        int count = 0;
        boolean noPrimo = false;

        int num = 0;

        while (count <= 20){

            num++;

            noPrimo = false;

            calc = num % 2;

            if (calc == 0){
                noPrimo = true;
            } else if (!noPrimo) {
                System.out.println(num);
                count++;
            }
        }
    }
}
