package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio4 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Declaramos un cuarto int para los cálculos.
        int num4 = 0;

        //Se piden y se leen tres números.
        System.out.println("Introduce el primer número:");
        int num1 = read.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = read.nextInt();

        System.out.println("Introduce el tercer y último número:");
        int num3 = read.nextInt();

        //Se determina el más alto.
        if (num1 > num2 && num1 > num3){
            num4 = num1;
        } else if (num2 > num1 && num2 > num3) {
            num4 = num2;
        } else num4 = num3;

        //Mostramos el número más alto.
        System.out.println("El número más alto es: " + num4);

        read.close();
    }
}
