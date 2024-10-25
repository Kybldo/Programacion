package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio18 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se declara num para posteriores cálculos.
        int num = 0;

        //Se pide el número a calcular.
        //Dentro del condicional, hay una comprobación que devuelve un error si es negativo, y vuelve a pedir el número.
        while (num == 0 || num < 0){
            System.out.println("Introduce un número para calcular su raíz cuadrada:");
            num = read.nextInt();

            if (num < 0){
                System.out.println("Error. Por favor, introduce un número positivo.");
            }
        }

        //Se calcula la raíz cuadrada.
        double sqRoot = Math.sqrt(num);

        //Se muestra el resultado.
        System.out.println("La raíz cuadrada de " + num + " es " + sqRoot);

        read.close();
    }

}
