package Tema2;

import java.util.Scanner;

public class Tema2EjercicioProgramacionEstructurada {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int p1_statsTotal = 0;
        int p1_health = 0;
        int p1_attack = 0;
        int p1_defense = 0;
        int p1_speed = 0;
        int p1_statsLeft = 500;

        //Primer jugador.
        System.out.println("Introduce los atributos del primer jugador.");
        System.out.println("Ten en cuenta que el total no podrá superar 500.");

        while (p1_statsTotal == 0 || p1_statsTotal > 500 || p1_statsLeft <= 0) {

            while (p1_health <= 0 || p1_health > 200) {
                System.out.println("Puntos de vida:");
                p1_health = read.nextInt();

                if (p1_health <= 0 || p1_health > 200){
                    System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
                }
            }

            p1_statsTotal = p1_health;
            System.out.println("Total de atributos: " + p1_statsTotal);
            System.out.println("Te quedan " + (p1_statsLeft - p1_statsTotal) + " por asignar.");

            while (p1_attack <= 0 || p1_attack > 200) {
                System.out.println("Ataque:");
                p1_attack = read.nextInt();

                if (p1_attack <= 0 || p1_attack > 200){
                    System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
                }
            }

            p1_statsTotal += p1_attack;
            System.out.println("Total de atributos: " + p1_statsTotal);
            System.out.println("Te quedan " + (p1_statsLeft - p1_statsTotal) + " por asignar.");

            while (p1_defense <= 0 || p1_defense > 200) {
                System.out.println("Defensa:");
                p1_defense = read.nextInt();

                if (p1_defense <= 0 || p1_defense > 200){
                    System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
                }
            }

            p1_statsTotal += p1_defense;
            System.out.println("Total de atributos: " + p1_statsTotal);
            System.out.println("Te quedan " + (p1_statsLeft - p1_statsTotal) + " por asignar.");

            while (p1_speed <= 0 || p1_speed > 200) {
                System.out.println("Velocidad:");
                p1_speed = read.nextInt();

                if (p1_speed <= 0 || p1_speed > 200){
                    System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
                }
            }

            p1_statsTotal += p1_speed;

            System.out.println("El total de atributos del primer jugador es: " + p1_statsTotal);

            if (p1_statsTotal > 500){
                System.out.println("La suma total de los atributos no puede superar 500.");
            }
        }
    }

}
