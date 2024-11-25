package Tema3;

import java.util.Scanner;

import static Tema3.Tema3Ejercicio1.numberSign;

public class Tema3Ejercicio2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Se pide una edad
        System.out.println("Introduce una edad:");

        int age = read.nextInt();

        //Se utiliza la función para determinar si es mayor o menor de edad
        if (isAdult(age)){

            System.out.println("Es mayor de edad.");

        } else System.out.println("No es mayor de edad.");

        //Se pide un número, comprobando si es positivo, negativo o cero (llamando a la función del ejercicio anterior)
        System.out.println(" ");
        System.out.println("Introduce un número:");

        int num2 = read.nextInt();

        int result = numberSign(num2);

        if (result == 0){

            System.out.println("El número es cero.");

        } else if (result < 0) {

            System.out.println("El número es negativo.");

        } else System.out.println("El número es positivo.");

        read.close();

    }

    //Determina si el booleano de la edad es verdadero o falso (mayor o menor de edad)
    public static boolean isAdult(int numFunc){

        return numFunc > 17;

    }
}
