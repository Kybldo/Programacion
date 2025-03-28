package Tema7.Bloque2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class FunkosMain {

    public static void main(String[] args) {

        // IMPORTAR CSV

        ArrayList<Funko> funkoListImported = FunkosFunciones.importCSV();

        // MENÚ

        Scanner read = new Scanner(System.in);

        int menuChoice = 0;


        while (menuChoice == 0){

            FunkosFunciones.menu();
            menuChoice = FunkosFunciones.selection(read);

            switch (menuChoice){

                case 1 -> {

                    System.out.println("_______________________________________________________________________");
                    System.out.println("Introduce los datos del Funko a introducir en la lista:");
                    System.out.println(" ");

                    System.out.print("Código: ");
                    String code = read.nextLine();

                    System.out.print("Nombre: ");
                    String name = read.nextLine();

                    System.out.print("Modelo: ");
                    String model = read.nextLine();

                    System.out.print("Precio: ");
                    double price = read.nextDouble();

                    System.out.print("Fecha de Lanzamiento (Formato AAAA-MM-DD): ");
                    String releaseDate = read.nextLine();

                    menuChoice = 0;

                }

                case 2 -> {

                    System.out.println("_______________________________________________________________________");
                    System.out.println("b");
                    menuChoice = 0;

                }

                case 3 -> {

                    System.out.println("_______________________________________________________________________");
                    System.out.println("c");
                    menuChoice = 0;

                }

                case 4 -> {

                    System.out.println("_______________________________________________________________________");
                    System.out.println("d");
                    menuChoice = 0;

                }

                case 5 -> {

                    System.out.println("_______________________________________________________________________");
                    System.out.println("e");
                    menuChoice = 0;

                }

                case 6 -> {

                    System.out.println("_______________________________________________________________________");
                    System.out.println("f");
                    menuChoice = 0;

                }

                case 7 -> {

                    System.out.println("_______________________________________________________________________");
                    System.out.println("g");
                    menuChoice = 0;

                }

                case 8 -> {

                    System.out.println("Has salido del programa.");

                }

            }

        }

    }

}
