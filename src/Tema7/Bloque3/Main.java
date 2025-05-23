package Tema7.Bloque3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Funciones.createFile();
        ArrayList<Videojuego> gameList = new ArrayList<>();

        Scanner read = new Scanner(System.in);
        int menuChoice = 0;

        while (menuChoice == 0){

            Funciones.menu();
            menuChoice = Funciones.menuChoice(read);

            switch (menuChoice){

                case 1 -> {

                    Funciones.addVideogame(read, gameList);
                    menuChoice = 0;

                }

                case 2 -> {

                    Funciones.showRanking(gameList);
                    menuChoice = 0;

                }

                case 3 -> {

                    Funciones.saveRanking(gameList);
                    menuChoice = 0;

                }

                case 4 -> {

                    gameList = Funciones.loadRanking(gameList);
                    menuChoice = 0;

                }

                case 5 -> {

                    Funciones.deleteFromRanking(gameList, read);
                    menuChoice = 0;

                }

                case 6 -> {

                    Funciones.exportToText(gameList);
                    menuChoice = 0;

                }

                case 7 -> {

                    Funciones.orderRanking(gameList);
                    menuChoice = 0;

                }

                case 8 -> System.out.println("Has salido del programa.");

            }

        }

        read.close();

    }

}
