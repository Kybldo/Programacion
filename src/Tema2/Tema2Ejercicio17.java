package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio17 {

    public static void main(String[] args){

        Scanner read = new Scanner(System.in);

        //Se pide el tipo de conversor que se quiere utilizar.
        System.out.println("Introduce '0' para calcular la superficie y el perímetro de un cuadrado," +
                " '1' para calcular la superficie y el perímetro de un rectángulo," +
                "o '2' para calcular la superficie de un triángulo.");
        int tipo = read.nextInt();

        switch (tipo){
            case 0 -> {

                //Se ejecuta la rama del cuadrado.
                //Se pide el lado.
                System.out.println("Introduce el lado de un cuadrado:");
                int ladoC = read.nextInt();

                //Se calculan superficie y perímetro.
                int areaC = ladoC * ladoC;

                int periC = ladoC + ladoC + ladoC + ladoC;

                //Se muestra el resultado.
                System.out.println("La superficie es " + areaC + ", y el perímetro es " + periC);
            }
            case 1 -> {

                //Se ejecuta la rama del rectángulo.
                //Se piden los dos lados.
                System.out.println("Introduce el primer lado de un rectángulo:");
                int ladoR1 = read.nextInt();

                System.out.println("Introduce el segundo lado de un rectángulo:");
                int ladoR2 = read.nextInt();

                //Se calculan superficie y perímetro.
                int areaR = ladoR1 * ladoR2;

                int periR = ladoR1 + ladoR1 + ladoR2 + ladoR2;

                //Se muestra el resultado.
                System.out.println("La superficie es " + areaR + ", y el perímetro es " + periR);
            }
            case 2 -> {

                //Se ejecuta la rama del triángulo.
                //Se piden la base y la altura.
                System.out.println("Introduce la base de un triángulo:");
                int baseT = read.nextInt();

                System.out.println("Introduce la altura de un triángulo:");
                int alturaT = read.nextInt();

                //Se calcula la superficie.
                int areaT = (baseT * alturaT) / 2;

                //Se muestra el resultado.
                System.out.println("La superficie es " + areaT);
            }
            default -> System.out.println("Se ha producido un error. Introduce un número válido.");
        }

        read.close();
    }

}
