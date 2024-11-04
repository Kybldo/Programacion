package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio28 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        Random random = new Random();

        //Se inicializa el int para el contador del bucle.
        int count = 0;

        //Se genera el número de lotería.
        int numLoteria = random.nextInt(99999);

        while (count < 4){
            //Se lee el número de lotería por parte del usuario.
            System.out.println("Introduce un número de lotería:");
            int numUsuario = read.nextInt();

            //Se determina si el número es o no el ganador.
            if (numUsuario == numLoteria){
                System.out.println("¡Has ganado la lotería!");
                count = 5;
            } else System.out.println("No has ganado la lotería.");

            count++;
        }
        read.close();
    }
}
