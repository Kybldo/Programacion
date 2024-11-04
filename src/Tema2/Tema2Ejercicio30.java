package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Se inicializa la variable para cálculos.
        int calc = 0;

        //Se lee el primer número.
        System.out.println("Introduce un primer número:");
        int num1 = read.nextInt();

        //Se pide el tipo de operación a realizar.
        System.out.println("Introduce el tipo de operación a realizar (+, -, *, /, %):");
        char operation = read.next().charAt(0);

        //Dependiendo del signo elegido, se pide el segundo número y se calcula.
        switch (operation){
            case '+' -> {
                System.out.println("Introduce un segundo número:");
                int num2 = read.nextInt();

                calc = num1 + num2;
            }
            case '-' -> {
                System.out.println("Introduce un segundo número:");
                int num2 = read.nextInt();

                calc = num1 - num2;
            }
            case '*' -> {
                System.out.println("Introduce un segundo número:");
                int num2 = read.nextInt();

                calc = num1 * num2;
            }
            case '/' -> {
                System.out.println("Introduce un segundo número:");
                int num2 = read.nextInt();

                calc = num1 / num2;
            }
            case '%' -> {
                System.out.println("Introduce un segundo número:");
                int num2 = read.nextInt();

                calc = num1 % num2;
            }
        }

        //Se muestra el resultado.
        System.out.println("El resultado es " + calc);
        read.close();
    }
}
