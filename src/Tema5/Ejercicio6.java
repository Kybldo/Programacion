package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        int num1 = askForNum();

        int num2 = askForNum();

        int num3 = divide(num1, num2);

        System.out.println(" ");
        System.out.println("Resultado: " + num3);

    }

    public static int askForNum(){

        Scanner read = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Introduce un número entero:");

        int num = 0;

        try{

            num = read.nextInt();

        } catch (InputMismatchException ex){

            System.out.println("Valor introducido incorrecto.");

        } finally {

            System.out.println("Valor introducido: " + num);

        }

        return num;

    }

    public static int divide(int num1, int num2){

        int num = 0;

        try{

            num = num1 / num2;

        } catch (ArithmeticException ex){

            System.out.println("Error. Se ha intentado dividir entre 0.");

        }

        return num;

    }
}