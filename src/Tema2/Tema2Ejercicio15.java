package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio15 {

    public static void main(String[] args){

        //Se declara el int "días" para su posterior cálculo.
        int dias = 0;

        //Se declara el booleano "bisiesto" para futuras comprobaciones.
        boolean bisiesto = false;

        Scanner read = new Scanner(System.in);

        //Se pide y se leen el número del mes y el año, respectivamente.
        //Hay condicionales que impiden que se introduzca un valor incorrecto, y pide que se vuelva a introducir.
        System.out.println("Introduce el número del mes:");
        int mes = read.nextInt();

        while (mes < 0 || mes > 12){
            System.out.println("Introduce un mes válido:");
            mes = read.nextInt();
        }

        System.out.println("Introduce el número del año:");
        int ano = read.nextInt();


        //Se determina si el año es bisiesto.
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            bisiesto = true;
        }

        //Se determina el número de días del mes dependiendo de si el año es bisiesto o no.
        if (bisiesto){
            if (mes == 2){
                dias = 29;
            }
        } else if (mes == 2) {
            dias = 28;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dias = 31;
        } else dias = 30;

        //Se muestran los resultados.
        System.out.println("El mes tendrá " + dias + " días.");

        read.close();
    }

}
