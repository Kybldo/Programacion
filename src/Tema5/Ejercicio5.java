package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

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
    }
}