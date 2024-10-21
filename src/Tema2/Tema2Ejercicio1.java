package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se pide y se lee el lado.
        System.out.println("Introduce el lado de un cuadrado:");
        int lado = read.nextInt();

        //Se realizan los cálculos.
        int area = lado * lado;

        int peri = lado * 4;

        //Se escribe el resultado.
        System.out.println("El área es: " + area + "; el perímetro es: " + peri);

        read.close();
    }
}
