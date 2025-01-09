package Tema3;

public class MyMath {

    //Ejercicio 1

    //Calcula el perímetro de un cuadrado
    public static double squarePerimeter(double num){
        return num + num + num + num;
    }

    //Calcula el área de un cuadrado
    public static double squareArea(double num){
        return num * num;
    }

    //Calcula el perímetro de un rectángulo
    public static double rectanglePerimeter(double num1, double num2){
        return (num1 * 2) + (num2 * 2);
    }

    //Calcula el área de un rectángulo
    public static double rectangleArea(double num1, double num2){
        return num1 * num2;
    }

    //Calcula el perímetro de un círculo
    public static double circlePerimeter(double num){
        return 2 * 3.14 * num;
    }

    //Calcula el área de un círculo
    public static double circleArea(double num){
        return 3.14 * (num * num);
    }

    //Ejercicio 2

    //Dice si un número es primo
    public static boolean primo(int num){

        boolean noPrimo = false;

        for (int i = 2; i < num; i++){
            int calc = num % i;

            if (calc == 0){
                noPrimo = true;
            }
        }

        return noPrimo;

    }

    //Dice si un número no es primo
    public static boolean noPrimo(int num){

        return primo(num);

    }

    //Ejercicio 3

    //Determina el número de dígitos de un entero
    public static int numDigits(int num){

        int count = 0;

        for (int i = num; i > 0; i = i / 10){
            count++;
        }

        return count;

    }

    //Ejercicio 4

    //Cuenta y devuelve el número de dígitos pares de un entero
    public static int numEven(int num){

        int count = 0;

        while (num > 0){

            int lastNum = num % 10;

            if (lastNum % 2 == 0){
                count++;
            }

            num /= 10;

        }

        return count;

    }

    //Ejercicio 5

    //Cuenta y devuelve el número de dígitos impares de un entero
    public static int numOdd(int num){

        int count = 0;

        while (num > 0){

            int lastNum = num % 10;

            if (lastNum % 2 != 0){
                count++;
            }

            num /= 10;

        }

        return count;

    }

    //Ejercicio 6

    //Calcula el factorial de un número
    public static int factorial(int num){

        int fact = 1;

        for (int i = num; i > 0; i = i - 1){
            fact = fact * i;
        }

        return fact;

    }

    //Ejercicio 7

    //Calcula el factorial de forma recursiva (la función se llama a sí misma para volver a multiplicarse)
    public static int factorialRecursive(int num){

        if (num == 0){

            return 1;

        } else return num * factorialRecursive(num - 1);

    }

    //Ejercicio 8

    //Calcula el número de soluciones que tendrá una ecuación de segundo grado
    public static int equation(double num1, double num2, double num3){

        double discriminante = (num2 * 2) - (4 * num1 * num3);

        if (discriminante == 0){

            return 1;

        } else if (discriminante > 0) {

            return 2;

        } else return 0;

    }

    //Ejercicio 9

    //Suma los dígitos de un entero
    public static int integerSum(int num){

        int sum = 0;

        while (num > 0){

            int lastNum = num % 10;

            sum += lastNum;

            num /= 10;

        }

        return sum;

    }

}

