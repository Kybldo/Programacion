package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio20 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se piden los dos números enteros.
        System.out.println("Introduce el primer número entero (A):");
        int numA = read.nextInt();

        System.out.println("Introduce el segundo número entero (B):");
        int numB = read.nextInt();

        //Se determina si B es mayor que A.
        //Posteriormente, un bucle determina si debe imprimir el número o no, dependiendo de si es par o impar.
        if (numB > numA){
            for (int i = numB; i > numA; i = i - 1){
                if (i % 2 != 0){
                    System.out.println(i);
                }
            }
        }
        read.close();
    }
}
