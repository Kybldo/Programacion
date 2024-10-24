package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio13 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se pide y se lee la hora, los minutos, y los segundos, respectivamente.
        //Hay condicionales que impiden que se introduzca un valor incorrecto, y pide que se vuelva a introducir.
        System.out.println("Introduce la hora:");
        int hora = read.nextInt();

        while (hora < 0 || hora > 24){
            System.out.println("Introduce una hora válida:");
            hora = read.nextInt();
        }

        System.out.println("Introduce los minutos:");
        int minutos = read.nextInt();

        while (minutos < 0 || minutos > 60){
            System.out.println("Introduce una cantidad de minutos válida:");
            minutos = read.nextInt();
        }

        System.out.println("Introduce los segundos:");
        int segundos = read.nextInt();

        while (segundos < 0 || segundos > 60){
            System.out.println("Introduce una cantidad de segundos válida:");
            segundos = read.nextInt();
        }

        //Se suma un segundo.
        segundos++;

        //Se determinan los condicionales de los cambios de horas, minutos y segundos.
        if (segundos == 60){
            segundos = 0;
            minutos++;
        } if (minutos == 60){
            minutos = 0;
            hora++;
        } if (hora == 24){
            hora = 0;
        }

        //Se muestra el resultado.
        //El if permite que, de ser todos los números "0", se pueda mostrar un resultado de "00:00:00" - esto daba problemas al usar enteros.

        if (hora == 0 && minutos == 0 && segundos == 0){
            System.out.println(hora + "0:" + minutos + "0:" + segundos + "0");
        } else System.out.println(hora + ":" + minutos + ":" + segundos);

        read.close();
    }
}
