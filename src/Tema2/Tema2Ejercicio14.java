package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio14 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se declara el int tarifa para sus cálculos correspondientes.
        int tarifa;

        //Se pide y se leen el número de personas y días, respectivamente.
        System.out.println("Introduce el número de personas:");
        int personas = read.nextInt();

        System.out.println("Introduce el número de días:");
        int dias = read.nextInt();

        //Se le resta 1 a los días para determinar las noches.
        dias--;

        //Se calcula la tarifa base.
        tarifa = dias * 15;

        //Se comprueban los condicionales para determinar si se puede hacer el descuento.
        if (personas >= 5 && dias >= 7){
            tarifa = (int) (tarifa * 0.75);
        }

        //Se muestra el resultado.
        System.out.println("El coste del camping será: " + tarifa + "€");

        read.close();
    }

}
