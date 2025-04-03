package Tema7.Bloque2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
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
        System.out.println("5. Mostrar el precio medio un Funko");
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

            read.nextLine();

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

    // GUARDAR FUNKOS A LA COLECCIÓN

    public static void saveFunkosToCSV(ArrayList<Funko> funkoListImported){

        try {

            Files.write(Paths.get("funkos.csv"), new byte[0], StandardOpenOption.TRUNCATE_EXISTING);

            for (Funko funko : funkoListImported) {

                String funkoToCopy = "\n" + funko.getCode() + "," + funko.getName() + "," + funko.getModel() + "," + funko.getPrice() + "," + funko.getReleaseDate();

                Files.write(Paths.get("funkos.csv"), funkoToCopy.getBytes(), StandardOpenOption.APPEND);

            }

        } catch (Exception e){

            e.printStackTrace();

        }

    }

    // AÑADIR FUNKO

    public static void addFunko(Scanner read, ArrayList<Funko> funkoListImported){

        System.out.println("_______________________________________________________________________");
        System.out.println("Introduce los datos del Funko a introducir en la lista:");
        System.out.println(" ");

        String code = "";
        String name = "";
        String model = "";
        double price = 0;
        String releaseDate = "";

        System.out.print("Código: ");

        try {

            code = read.nextLine();

        } catch (Exception e) {

            System.out.println(" ");
            System.out.println("Introduce un código válido.");

        }

        System.out.print("Nombre: ");

        try {

            name = read.nextLine();

        } catch (Exception e) {

            System.out.println(" ");
            System.out.println("Introduce un nombre válido.");

        }

        System.out.print("Modelo: ");

        try {

            model = read.nextLine();

        } catch (Exception e) {

            System.out.println(" ");
            System.out.println("Introduce un modelo válido.");

        }

        System.out.print("Precio: ");

        try {

            price = read.nextDouble();

        } catch (Exception e) {

            System.out.println(" ");
            System.out.println("Introduce un precio válido.");

        } finally {

            read.nextLine();

        }

        System.out.print("Fecha de Lanzamiento (Formato AAAA-MM-DD): ");

        try {

            releaseDate = read.nextLine();

        } catch (Exception e) {

            System.out.println(" ");
            System.out.println("Introduce un precio válido.");

        }

        String lineToWrite = "\n" + code + "," + name + "," + model + "," + price + "," + releaseDate;

        Funko funko = new Funko(code, name, model, price, releaseDate);

        funkoListImported.add(funko);

        try {

            Files.write(Paths.get("funkos.csv"), lineToWrite.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.WRITE);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

        System.out.println(" ");

    }

    // ELIMINAR FUNKO

    public static void deleteFunko(Scanner read, ArrayList<Funko> funkoListImported){

        System.out.println("_______________________________________________________________________");
        System.out.println("Introduce el nombre del Funko que quieres eliminar de la lista:");
        System.out.println(" ");

        String name = "";

        try {

            name = read.nextLine();

        } catch (Exception e){

            System.out.println("Introduce un nombre válido.");

        }

        int counter = 0;
        int funkoToRemove = -1;

        for (int i = 0; i < funkoListImported.size(); i++){

            if (Objects.equals(funkoListImported.get(i).getName().toLowerCase(), name.toLowerCase())){

                funkoToRemove = counter;

            }

            counter++;

        }

        if (funkoToRemove != -1){

            funkoListImported.remove(funkoToRemove);
            System.out.println(" ");
            System.out.println("Se ha eliminado el Funko de nombre " + name + ".");

        } else {

            System.out.println(" ");
            System.out.println("No se ha encontrado ningún Funko con el nombre " + name + ".");

        }

        saveFunkosToCSV(funkoListImported);

    }

    // MOSTRAR TODOS LOS FUNKOS

    public static void showFunkoList(ArrayList<Funko> funkoListImported){

        System.out.println("_______________________________________________________________________");

        for (int i = 0; i < funkoListImported.size(); i++){

            System.out.println(funkoListImported.get(i));

        }

        System.out.println(" ");

    }

    // MOSTRAR EL FUNKO MÁS CARO

    public static void showMostExpensiveFunko(ArrayList<Funko> funkoListImported){

        System.out.println("_______________________________________________________________________");

        String name = "";
        double funkoPrice = 0;

        for (int i = 0; i < funkoListImported.size(); i++){

            Funko funko = funkoListImported.get(i);

            if (funkoPrice < funko.getPrice()) {

                name = funko.getName();
                funkoPrice = funko.getPrice();

            }

        }

        System.out.println(" ");

        System.out.println("El Funko más caro es " + name + ", y su precio es de " + funkoPrice + "€");

        System.out.println(" ");

    }

    // MOSTRAR MEDIA DE PRECIO DE LOS FUNKOS

    public static void showAverageFunkoPrice(ArrayList<Funko> funkoListImported){

        System.out.println("_______________________________________________________________________");

        int counter = 0;
        double funkoPrice = 0;

        for (int i = 0; i < funkoListImported.size(); i++){

            funkoPrice += funkoListImported.get(i).getPrice();
            counter++;

        }

        double averagePrice = (funkoPrice / counter);

        System.out.println(" ");

        System.out.println("El precio medio de un Funko es de " + averagePrice + "€");

        System.out.println(" ");

    }

    // MOSTRAR FUNKOS POR MODELO

    public static void showFunkosPerModel(ArrayList<Funko> funkoListImported){

        System.out.println("_______________________________________________________________________");

        HashMap<String, ArrayList<Funko>> modelList = new HashMap<>();
        String model;

        for (int i = 0; i < funkoListImported.size(); i++){

            model = funkoListImported.get(i).getModel();

            ArrayList<Funko> newList = new ArrayList<>();

            modelList.put(model, newList);

        }

        for (String key : modelList.keySet()){

            for (Funko funko : funkoListImported) {

                if (Objects.equals(funko.getModel(), key)) {

                    modelList.get(key).add(funko);

                }

            }

        }

        for (String key : modelList.keySet()) {

            System.out.println(" ");
            System.out.println(key);

            for (int i = 0; i < modelList.get(key).size(); i++){

                System.out.println(modelList.get(key).get(i));

            }

            System.out.println(" ");

        }

        System.out.println(" ");

    }

    // MOSTRAR LOS FUNKOS LANZADOS EN 2023

    public static void showFunkosFrom2023(ArrayList<Funko> funkoListImported){

        System.out.println("_______________________________________________________________________");

        for (int i = 0; i < funkoListImported.size(); i++){

            String date = funkoListImported.get(i).getReleaseDate();

            String[] dateString = date.split("-");

            int year = Integer.parseInt(dateString[0]);

            if (year == 2023){

                System.out.println(funkoListImported.get(i));

            }

        }

        System.out.println(" ");

    }

}
