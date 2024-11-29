package Tema3;

import static Tema3.MyMath.*;

public class Tema3Ejercicio11 {

    public static void main(String[] args) {

        int result;
        double resultDouble;
        boolean resultBool;

        int num = 20;
        int num2 = 25;
        int num3 = 5;

        int numPrimo = 3;

        double numDouble = 20;
        double numDouble2 = 25;
        double numDouble3 = 30;

        //Ejercicio 1

        resultDouble = squarePerimeter(numDouble);

        System.out.println("El perímetro del cuadrado es " + resultDouble);

        resultDouble = squareArea(numDouble);

        System.out.println("El área del cuadrado es " + resultDouble);

        resultDouble = rectanglePerimeter(numDouble, numDouble2);

        System.out.println("El perímetro del rectángulo es " + resultDouble);

        resultDouble = rectangleArea(numDouble, numDouble2);

        System.out.println("El área del rectángulo es " + resultDouble);

        resultDouble = circlePerimeter(numDouble);

        System.out.println("El perímetro del círculo es " + resultDouble);

        resultDouble = circleArea(numDouble);

        System.out.println("El área del círculo es " + resultDouble);

        //Ejercicio 2

        resultBool = primo(numPrimo);

        if (!resultBool) System.out.println("El numero " + numPrimo + " es primo.");

        resultBool = noPrimo(num);

        if (resultBool) System.out.println("El número " + num + " no es primo.");

        //Ejercicio 3

        result = numDigits(num);

        System.out.println("El número " + num + " tiene " + result + " dígito/s.");

        //Ejercicio 4

        result = numEven(num);

        System.out.println("El número " + num + " tiene " + result + " dígito/s par/es.");

        //Ejercicio 5

        result = numOdd(num2);

        System.out.println("El número " + num2 + " tiene " + result + " dígito/s impar/es.");

        //Ejercicio 6

        result = factorial(num3);

        System.out.println("El factorial de " + num3 + " es " + result);

        //Ejercicio 7

        result = factorialRecursive(num3);

        System.out.println("El factorial de " + num3 + " es " + result);

        //Ejercicio 8

        result = equation(numDouble, numDouble2, numDouble3);

        if (result == 0){

            System.out.println("La ecuación tiene una solución.");

        } else if (result > 0) {

            System.out.println("La ecuación tiene dos soluciones.");

        } else System.out.println("La ecuación no tiene soluciones.");

        //Ejercicio 9

        result = integerSum(num2);

        System.out.println("La suma de los dígitos de " + num2 + " es " + result);

    }
}
