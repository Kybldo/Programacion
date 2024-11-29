package Tema3;

import java.util.Scanner;

public class ConejilloDeIndias {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        while (num1 == 0 || num1 < 0){

            System.out.println("Introduce un primer entero (positivo):");

            num1 = read.nextInt();

            if (num1 == 0 || num1 < 0) System.out.println("Introduce un entero positivo.");

        }

        while (num2 == 0 || num2 < 0){

            System.out.println("Introduce un segundo entero (positivo):");

            num2 = read.nextInt();

            if (num2 == 0 || num2 < 0) System.out.println("Introduce un entero positivo.");

        }

        boolean result = amigos(num1, num2);

        if (result) {

            System.out.println("Los números son amigos.");

        } else System.out.println("Los números no son amigos.");

    }

    public static boolean amigos(int num1, int num2){

        int sum1 = 0;
        int sum2 = 0;

        for (int i = (num1 - 1); i >= 1; i--){

            if (num1 % i == 0){

                sum1 += i;

            }
        }

        for (int i = (num2 - 1); i >= 1; i--){

            if (num2 % i == 0){

                sum2 += i;

            }
        }

        return (sum1 == num2 && sum2 == num1);

    }

}
