package Tema7.Bloque3;

import jdk.dynalink.StandardOperation;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Funciones {

    // GENERAR FICHERO

    public static void createFile(){

        File fileTxt = new File("ranking.txt");
        File fileDat = new File("ranking.dat");

        try {

            if (fileTxt.createNewFile()){

                System.out.println(" ");
                System.out.println("Se ha creado el fichero TXT necesario para el programa.");

            } else {

                System.out.println(" ");
                System.out.println("Se ha localizado el fichero TXT.");

            }

            if (fileDat.createNewFile()){

                System.out.println("Se ha creado el fichero DAT necesario para el programa.");

            } else {

                System.out.println("Se ha localizado el fichero DAT.");

            }

        } catch (IOException ioe) {

            ioe.printStackTrace();

        }

    }

    // IMPORTAR FICHERO DAT A ARRAY LIST (DESERIALIZATION)

    public static ArrayList<Videojuego> importDatToArrayList() {

        ArrayList<Videojuego> deserializedList = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("ranking.dat")))) {

            deserializedList = (ArrayList<Videojuego>) ois.readObject();

        } catch (Exception e) {

            System.out.println("No se ha podido deserializar el fichero. (Aún no había sido creado)");

        }

        return deserializedList;

    }

    // MENÚ

    public static void menu(){

        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("--- Ranking de Videojuegos ---");
        System.out.println(" ");
        System.out.println("1. Añadir videojuego");
        System.out.println("2. Mostrar ranking");
        System.out.println("3. Guardar ranking");
        System.out.println("4. Cargar ranking");
        System.out.println("5. Eliminar videojuego");
        System.out.println("6. Exportar a texto");
        System.out.println("7. Salir");
        System.out.println(" ");

    }

    // ELECCIÓN DEL MENÚ

    public static int menuChoice(Scanner read){

        int menuChoice = 0;

        try {

            menuChoice = read.nextInt();

        } catch (Exception e){

            System.out.println(" ");
            System.out.println("Introduce un entero.");
            read.nextLine();

        } finally {

            if (menuChoice < 0 || menuChoice > 7){

                System.out.println(" ");
                System.out.println("Selecciona una opción válida.");
                menuChoice = 0;

            }

        }

        return menuChoice;

    }

    // AÑADIR VIDEOJUEGO FÍSICO

    public static void addPhysical(Scanner read, ArrayList<Videojuego> gameList) throws IOException {

        System.out.println(" ");

        Videojuego game = null;

        try {

            System.out.print("Título: ");
            String title = read.nextLine();

            System.out.print("Plataforma: ");
            String platform = read.nextLine();

            System.out.print("Nota: ");
            int rating = read.nextInt();
            read.nextLine();

            System.out.print("Tienda (Física): ");
            String store = read.nextLine();

            System.out.print("Estado (Nuevo/Usado): ");
            String status = read.nextLine();

            game = new VideojuegoFisico(title, platform, rating, store, status);

        } catch (Exception e) {

            System.out.println(" ");
            System.out.println("Algo ha fallado en el proceso de introducción de datos. Inténtalo de nuevo.");
            read.nextLine();

        } finally {

            if (game != null){

                // GUARDAR JUEGO EN LA COLECCIÓN

                gameList.add(game);

                // AÑADIR JUEGO AL TXT

                Files.write(Paths.get("ranking.txt"), "".getBytes());

                for (Videojuego games : gameList) {

                    String gameInfo = "\n" + games;

                    Files.write(Paths.get("ranking.txt"), gameInfo.getBytes(), StandardOpenOption.APPEND);

                }

                // VOLCAR COLECCIÓN AL DAT

                try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("ranking.dat")))) {

                    for (Videojuego games : gameList) {

                        oos.writeObject(gameList);
                        oos.writeObject("\n");

                    }

                }

            }

        }

    }

    // AÑADIR VIDEOJUEGO DIGITAL

    public static void addDigital(Scanner read, ArrayList<Videojuego> gameList) throws IOException {

        System.out.println(" ");

        Videojuego game = null;

        try {

            System.out.print("Título: ");
            String title = read.nextLine();

            System.out.print("Plataforma: ");
            String platform = read.nextLine();

            System.out.print("Nota: ");
            int rating = read.nextInt();
            read.nextLine();

            System.out.print("Tienda (Online): ");
            String store = read.nextLine();

            System.out.print("Tamaño (en GB): ");
            double size = read.nextDouble();
            read.nextLine();

            game = new VideojuegoDigital(title, platform, rating, store, size);

        } catch (Exception e) {

            System.out.println(" ");
            System.out.println("Algo ha fallado en el proceso de introducción de datos. Inténtalo de nuevo.");
            read.nextLine();

        } finally {

            if (game != null){

                // GUARDAR JUEGO EN LA COLECCIÓN

                gameList.add(game);

                // AÑADIR JUEGO AL TXT

                Files.write(Paths.get("ranking.txt"), "".getBytes());

                for (Videojuego games : gameList) {

                    String gameInfo = "\n" + games;

                    Files.write(Paths.get("ranking.txt"), gameInfo.getBytes(), StandardOpenOption.APPEND);

                }

                // VOLCAR COLECCIÓN AL DAT

                try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("ranking.dat")))) {

                    oos.writeObject(gameList);

                }

            }

        }

    }

    // AÑADIR VIDEOJUEGO

    public static void addVideogame(Scanner read, ArrayList<Videojuego> gameList) throws IOException {

        int menuChoice = 0;

        while (menuChoice == 0){

            System.out.println(" ");
            System.out.println("¿Qué tipo de videojuego quieres introducir?");
            System.out.println("1. Físico | 2. Digital");

            try {

                menuChoice = read.nextInt();

            } catch (Exception e){

                System.out.println(" ");
                System.out.println("Introduce una opción válida.");
                read.nextLine();

            } finally {

                if (menuChoice < 1 || menuChoice > 2){

                    menuChoice = 0;

                }

                read.nextLine();

            }

            switch (menuChoice) {

                case 0 -> menuChoice = 0;

                case 1 -> Funciones.addPhysical(read, gameList);

                case 2 -> Funciones.addDigital(read, gameList);

            }

        }

    }

    // MOSTRAR RANKING

    public static void showRanking(ArrayList<Videojuego> gameList){

        System.out.println(" ");

        if (gameList.isEmpty()){

            System.out.println("El ranking está vacío o no se ha importado.");

        } else {

            int counter = 1;

            for (Videojuego game : gameList){

                System.out.println("■ " + counter + ". " + game);
                counter++;

            }

        }

    }

    // GUARDAR RANKING

    public static void saveRanking(ArrayList<Videojuego> gameList) throws IOException {

        // AÑADIR JUEGO AL TXT

        Files.write(Paths.get("ranking.txt"), "".getBytes());

        for (Videojuego games : gameList) {

            String gameInfo = "\n" + games;

            Files.write(Paths.get("ranking.txt"), gameInfo.getBytes(), StandardOpenOption.APPEND);

        }

        // VOLCAR COLECCIÓN AL DAT

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("ranking.dat")))) {

            oos.writeObject(gameList);

        }

        System.out.println(" ");
        System.out.println("Se ha guardado el ranking con éxito en los ficheros correspondientes.");

    }

    // CARGAR RANKING

    public static ArrayList<Videojuego> loadRanking(ArrayList<Videojuego> gameList) {

        gameList = Funciones.importDatToArrayList();

        System.out.println(" ");
        System.out.println("Se ha cargado el ranking (archivo .dat) en el programa (colección).");

        return gameList;

    }

}
