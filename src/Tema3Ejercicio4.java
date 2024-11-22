import java.util.Scanner;

public class Tema3Ejercicio4 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        showMenu();

        int select = read.nextInt();

        switch (select){

            case 1 -> {

                System.out.println("Introduce una cantidad en euros:");
                double euro = read.nextInt();

                System.out.println(" ");
                System.out.println(euro + "€ equivale a " + euro2dollar(euro) + "$");

            }

            case 2 -> {

                System.out.println("Introduce una cantidad en dólares:");
                double dollar = read.nextInt();

                System.out.println(" ");
                System.out.println(dollar + "$ equivale a " + dollar2euro(dollar) + "€");

            }

            default -> System.out.println("Introduce un programa válido.");

        }

    }

    public static void showMenu(){

        System.out.println("Elige un programa:");
        System.out.println("1. Pasar de euros a dólares | 2. Pasar de dólares a euros");

    }

    public static double euro2dollar(double euro){

        return euro * 1.04;

    }

    public static double dollar2euro(double dollar){

        return dollar * 0.96;

    }

}
