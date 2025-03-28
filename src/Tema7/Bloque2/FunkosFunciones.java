package Tema7.Bloque2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class FunkosFunciones {

    // MENÚ

    public static void menu(){
        System.out.println("_______________________________________________________________________");
        System.out.println(" ");
        System.out.println("Selecciona una opción: ");
        System.out.println(" ");
        System.out.println("1. Añadir Funko a la colección");
        System.out.println("2. Borrar Funko de la colección");
        System.out.println("3. Mostrar todos los Funkos");
        System.out.println("4. Mostrar el Funko más caro");
        System.out.println("5. Mostrar el precio medio de los Funkos");
        System.out.println("6. Mostrar Funkos agrupados por modelo");
        System.out.println("7. Mostrar Funkos de 2023");
        System.out.println("8. Salir");
        System.out.println(" ");

    }

    // SELECCIÓN MENÚ

    public static int selection(Scanner read){

        int menuChoice = 0;

        try {

            menuChoice = read.nextInt();

        } catch (Exception e){

            System.out.println("Debes introducir un entero.");
            read.nextLine();

        } finally {

            if (menuChoice < 0 || menuChoice > 8){

                System.out.println("Debes introducir una opción válida.");
                menuChoice = 0;
            }

        }

        return menuChoice;

    }

    // IMPORTAR CSV

    public static ArrayList<Funko> importCSV(){

        ArrayList<Funko> funkoListImported = new ArrayList<>();

        try (Stream<String> csvContent = Files.lines(Paths.get("funkos.csv"))){

            List<List<String>> funkoList = csvContent.map(l -> Arrays.asList(l.split(","))).toList();

            for (int i = 1; i < funkoList.size(); i++){

                double funkoPrice = Double.parseDouble(funkoList.get(i).get(3));

                Funko funko = new Funko(funkoList.get(i).get(0), funkoList.get(i).get(1), funkoList.get(i).get(2), funkoPrice, funkoList.get(i).get(4));

                funkoListImported.add(funko);

            }

            return funkoListImported;

        } catch (IOException e){

            e.printStackTrace();

            return funkoListImported;

        }

    }

}
