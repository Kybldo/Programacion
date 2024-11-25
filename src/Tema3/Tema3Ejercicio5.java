package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio5 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num = 0;

        //Se pide un número del 1 al 10; de ser 0 o mayor que 10, se vuelve a pedir
        while (num == 0 || num > 10){

            System.out.println("Introduce un número del 1 al 10 para ver su tabla de multiplicar:");

            num = read.nextInt();

            if (num == 0 || num > 10) System.out.println("Introduce un número válido.");
            System.out.println(" ");
        }

        //Se llama a la función y se muestra la tabla en base al número correspondiente
        table(num);

        read.close();
    }

    //Utiliza un for para calcular e imprimir las multiplicaciones del número introducido, del 1 al 10
    public static void table(int num){

        for (int i = 1; i <= 10; i++){

            System.out.println(num + " * " + i + " = " + (num * i));

        }
    }
}
