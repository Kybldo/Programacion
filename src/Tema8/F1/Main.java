package Tema8.F1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int menuChoice = 0;
        ArrayList<Piloto> driverList = new ArrayList<>();
        PilotsCRUD.importDrivers(driverList);

        while (menuChoice == 0){

            PilotsCRUD.menu();
            menuChoice = PilotsCRUD.menuSelection(read);

            switch (menuChoice) {

                case 1 -> {

                    PilotsCRUD.createPilot(read, driverList);
                    menuChoice = 0;

                }

                case 2 -> {

                    PilotsCRUD.readPilot(read, driverList);
                    menuChoice = 0;

                }

                case 3 -> {

                    PilotsCRUD.readPilots(driverList);
                    menuChoice = 0;

                }

                case 4 -> {

                    PilotsCRUD.updatePilot(read, driverList);
                    menuChoice = 0;

                }

                case 5 -> {

                    PilotsCRUD.deletePilot(read, driverList);
                    menuChoice = 0;

                }

                case 6 -> {

                    PilotsCRUD.showPilotClassification();
                    menuChoice = 0;

                }

                case 7 -> {

                    PilotsCRUD.showBuildersClassification();
                    menuChoice = 0;

                }

                case 8 -> {

                    System.out.println(" ");
                    System.out.println("Has salido del programa.");

                }
            }
        }

        read.close();

    }
}