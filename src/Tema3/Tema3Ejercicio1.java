package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un número:");

        int numUser = read.nextInt();

        System.out.println(numberSign(numUser));

        read.close();

    }

    public static int numberSign(int numFunc){

        if (numFunc == 0){

            return 0;

        } else if (numFunc >= 1) {

            return 1;

        } else return -1;

    }

}
