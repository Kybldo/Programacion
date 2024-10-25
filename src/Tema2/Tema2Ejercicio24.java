package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio24 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se declaran los int para futuros cálculos.
        int nota = 0;
        int suspensos = 0;
        int aprobados = 0;

        //Se piden notas, determinando y sumando si son positivas o negativas. Para salir del programa, se tiene que escribir un negativo.
        while (nota >= 0) {
            System.out.println("Introduce la serie de notas a contar. Para salir del programa, introduce una nota negativa:");
            nota = read.nextInt();

            if (nota < 5 && nota >= 0) {
                suspensos++;
            } else if (nota >= 5) {
                aprobados++;
            }
        }

        //Se muestran los resultados.
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos suspendidos: " + suspensos);

        read.close();
    }
}
