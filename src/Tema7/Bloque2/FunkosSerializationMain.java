package Tema7.Bloque2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FunkosSerializationMain {

    public static void main(String[] args) throws IOException {

        // IMPORTAR CSV

        ArrayList<Funko> funkoListImported = FunkosFunciones.importCSV();

        // SERIALIZAR FUNKOS

        FunkosFunciones.serializeFunkoList(funkoListImported);

        // MENÚ

        Scanner read = new Scanner(System.in);

        int menuChoice = 0;


        while (menuChoice == 0){

            FunkosFunciones.menu();
            menuChoice = FunkosFunciones.selection(read);

            switch (menuChoice){

                case 1 -> {

                    FunkosFunciones.addFunkoSerialization(read, funkoListImported);
                    menuChoice = 0;

                }

                case 2 -> {

                    FunkosFunciones.deleteFunkoSerialization(read, funkoListImported);
                    menuChoice = 0;

                }

                case 3 -> {

                    FunkosFunciones.showFunkoList(funkoListImported);
                    menuChoice = 0;

                }

                case 4 -> {

                    FunkosFunciones.showMostExpensiveFunko(funkoListImported);
                    menuChoice = 0;

                }

                case 5 -> {

                    FunkosFunciones.showAverageFunkoPrice(funkoListImported);
                    menuChoice = 0;

                }

                case 6 -> {

                    FunkosFunciones.showFunkosPerModel(funkoListImported);
                    menuChoice = 0;

                }

                case 7 -> {

                    FunkosFunciones.showFunkosFrom2023(funkoListImported);
                    menuChoice = 0;

                }

                case 8 -> {

                    System.out.println("Has salido del programa.");

                }

            }

        }

    }

}
