package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio25 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        int fact = 1;

        //Se lee el entero.
        System.out.println("Introduce un número entero:");
        int num = read.nextInt();

        //Resta 1 al número, y se multiplica a si mismo cada vez. Hace esto hasta llegar a 0.
        for (int i = num; i > 0; i = i - 1){
            fact = fact * i;
        }

        //Se muestra el resultado.
        System.out.println(fact);

        read.close();
    }

}
