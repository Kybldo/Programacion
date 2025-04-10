package Tema7.Bloque3;

import Tema7.Bloque3.Excepciones.JuegoNoEncontradoException;
import Tema7.Bloque3.Excepciones.NotaInvalidaException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.InputMismatchException;
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

        } catch (IOException e) {

            System.out.println(" ");
            System.out.println("Se ha producido un error durante la creación de los ficheros.");

        }

    }

    // IMPORTAR FICHERO DAT A ARRAY LIST (DESERIALIZATION)

    public static ArrayList<Videojuego> importDatToArrayList() {

        ArrayList<Videojuego> deserializedList = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("ranking.dat")))) {

            deserializedList = (ArrayList<Videojuego>) ois.readObject();

        } catch (Exception e) {

            System.out.println("No se ha podido deserializar el fichero. (Está vacío o todavía no ha sido creado)");

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

    public static void addPhysical(Scanner read, ArrayList<Videojuego> gameList) {

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

            if (rating < 1 || rating > 10){

                throw new NotaInvalidaException("La nota a introducir debe estar entre el 1 y el 10." );

            }

            System.out.print("Tienda (Física): ");
            String store = read.nextLine();

            System.out.print("Estado (Nuevo/Usado): ");
            String status = read.nextLine();

            game = new VideojuegoFisico(title, platform, rating, store, status);

        } catch (NotaInvalidaException e) {

            System.out.println(" ");
            System.out.println(e.getMessage());
            System.out.println("Pulsa Enter para continuar.");
            read.nextLine();

        } catch (InputMismatchException e){

            System.out.println(" ");
            System.out.println("El tipo de dato introducido no es correcto.");
            read.nextLine();

        } finally {

            if (game != null){

                // GUARDAR JUEGO EN LA COLECCIÓN

                gameList.add(game);

            }

        }

    }

    // AÑADIR VIDEOJUEGO DIGITAL

    public static void addDigital(Scanner read, ArrayList<Videojuego> gameList) {

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

            if (rating < 1 || rating > 10){

                throw new NotaInvalidaException("La nota a introducir debe estar entre el 1 y el 10.");

            }

            System.out.print("Tienda (Online): ");
            String store = read.nextLine();

            System.out.print("Tamaño (en GB): ");
            double size = read.nextDouble();
            read.nextLine();

            game = new VideojuegoDigital(title, platform, rating, store, size);

        } catch (NotaInvalidaException e) {

            System.out.println(" ");
            System.out.println(e.getMessage());
            System.out.println("Pulsa Enter para continuar.");
            read.nextLine();

        } catch (InputMismatchException e){

            System.out.println(" ");
            System.out.println("El tipo de dato introducido no es correcto.");
            read.nextLine();

        } finally {

            if (game != null){

                // GUARDAR JUEGO EN LA COLECCIÓN

                gameList.add(game);

            }

        }

    }

    // AÑADIR VIDEOJUEGO

    public static void addVideogame(Scanner read, ArrayList<Videojuego> gameList) {

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

        // VOLCAR COLECCIÓN AL DAT

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("ranking.dat")))) {

            oos.writeObject(gameList);

        }

        System.out.println(" ");
        System.out.println("Se ha guardado el ranking con éxito en el fichero correspondiente (ranking.dat).");

    }

    // CARGAR RANKING

    public static ArrayList<Videojuego> loadRanking(ArrayList<Videojuego> gameList) {

        boolean warning = false;

        if (!gameList.isEmpty()) warning = true;

        gameList = Funciones.importDatToArrayList();

        System.out.println(" ");
        System.out.println("Se ha cargado el ranking (ranking.dat) en el programa (colección).");

        if (warning){

            System.out.println("Importar el archivo ha sobreescrito los videojuegos que habías añadido a la lista.");

        }

        return gameList;

    }

    // ELIMINAR VIDEOJUEGO DEL RANKING

    public static void deleteFromRanking(ArrayList<Videojuego> gameList, Scanner read){

        read.nextLine();

        System.out.println(" ");

        if (gameList.isEmpty()){

            System.out.println("El ranking está vacío o no se ha importado.");

        } else {

            System.out.println("Introduce el título del juego a eliminar:");

            String userName = "";
            int counter = 0;
            int gameToDelete = 0;
            boolean canDelete = false;

            try {

                userName = read.nextLine();

            } catch (Exception e){

                System.out.println("El nombre que has introducido no es correcto.");

            }

            try {

                for (Videojuego game : gameList){

                    if (userName.equalsIgnoreCase(game.getTitle())){

                        gameToDelete = counter;
                        canDelete = true;

                    }

                    counter++;

                }

                if (canDelete){

                    gameList.remove(gameToDelete);

                    System.out.println(" ");
                    System.out.println("Se ha eliminado el videojuego " + "\"" +  userName + "\"" + " del ranking.");

                } else throw new JuegoNoEncontradoException("El videojuego que has introducido no existe en el ranking.");

            } catch (JuegoNoEncontradoException e) {

                System.out.println(" ");
                System.out.println(e.getMessage());

            }

        }

    }

    // EXPORTAR COLECCIÓN DE JUEGOS A TXT

    public static void exportToText(ArrayList<Videojuego> gameList) throws IOException {

        // AÑADIR JUEGO AL TXT

        try {

            Files.write(Paths.get("ranking.txt"), "".getBytes());

            for (Videojuego games : gameList) {

                String gameInfo = "\n" + games;

                Files.write(Paths.get("ranking.txt"), gameInfo.getBytes(), StandardOpenOption.APPEND);

            }

            System.out.println(" ");
            System.out.println("El ranking ha sido exportado a un fichero de texto (ranking.txt).");

        } catch (FileNotFoundException e){

            System.out.println(" ");
            System.out.println("El archivo no ha sido encontrado.");

        }

    }

}