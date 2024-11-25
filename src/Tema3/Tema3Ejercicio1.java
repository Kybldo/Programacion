package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Se pide el número
        System.out.println("Introduce un número:");

        //Se declaran las variables (usuario + guardar valor de la función)
        int numUser = read.nextInt();

        int result = numberSign(numUser);

        //Se compara el resultado de la función, se muestra el resultado
        if (result == 0){

            System.out.println("El número es cero.");

        } else if (result < 0) {

            System.out.println("El número es negativo.");

        } else System.out.println("El número es positivo.");

        read.close();

    }

    //Toma un número, devuelve -1, 0 o 1 en consecuencia
    public static int numberSign(int numFunc){

        if (numFunc == 0){

            return 0;

        } else if (numFunc >= 1) {

            return 1;

        } else return -1;

    }
}
