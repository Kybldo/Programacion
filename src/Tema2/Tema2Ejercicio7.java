package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio7 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Declaramos un tercer int para los cálculos.
        int num3 = 0;

        //Se piden y se leen dos números.
        System.out.println("Introduce el primer número:");
        int num1 = read.nextInt();

        System.out.println("Introduce el segundo y último número:");
        int num2 = read.nextInt();

       //Se determina el más grande, y se le resta el más pequeño.
        if (num1 > num2){
            num3 = num1 - num2;
        } else num3 = num2 - num1;

        //Mostramos el resultado.
        System.out.println("El resultado es: " + num3);

        read.close();
    }

}
