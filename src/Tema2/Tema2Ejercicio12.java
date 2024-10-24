package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio12 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se declara un cuarto int para los cálculos.
        int numTemp = 0;

        //Se piden y se leen tres números.
        System.out.println("Introduce el primer número:");
        int num1 = read.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = read.nextInt();

        System.out.println("Introduce el tercer y último número:");
        int num3 = read.nextInt();

        //Se ordenan los números.
        if (num1 < num2){
            numTemp = num1;
            num1 = num2;
            num2 = numTemp;
        }

        if (num1 < num3){
            numTemp = num1;
            num1 = num3;
            num3 = numTemp;
        }

        if (num2 < num3) {
            numTemp = num2;
            num2 = num3;
            num3 = numTemp;
        }

        //Se muestran los números ordenados.
        System.out.println(num1 + " " + num2 + " " + num3);

        read.close();
    }

}
