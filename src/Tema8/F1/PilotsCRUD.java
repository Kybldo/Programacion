package Tema8.F1;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class PilotsCRUD {

    // MENU

    public static void menu(){

        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("1. Crear y añadir Piloto a la base de datos");
        System.out.println("2. Buscar Piloto en la base de datos (por entero)");
        System.out.println("3. Devolver listado de todos los Pilotos de la base de datos");
        System.out.println("4. Seleccionar y actualizar un Piloto en la base de datos");
        System.out.println("5. Seleccionar y eliminar un Piloto de la base de datos");
        System.out.println("6. Mostrar la clasificación mundial de Pilotos, por puntos");
        System.out.println("7. Mostrar clasificación mundial de Equipos, por puntos");
        System.out.println("8. Salir");
        System.out.println(" ");
        System.out.print("Selección: ");

    }

    // SELECCIÓN DEL MENU

    public static int menuSelection(Scanner read){

        int menuChoice = 0;
        boolean flag = false;

        try {

            menuChoice = read.nextInt();

        } catch (Exception e){

            System.out.println(" ");
            System.out.println("Introduce un entero.");
            read.next();

            flag = true;

        } finally {

            if (!flag){

                if (menuChoice < 1 || menuChoice > 8) {

                    System.out.println(" ");
                    System.out.println("Introduce una opción válida.");
                    menuChoice = 0;

                }

            }

        }

        return menuChoice;

    }

    // CARGAR CREDENCIALES DE LA BASE DE DATOS

    public static String[] loadDatabaseProperties() {

        Properties properties = new Properties();
        String[] credentials = new String[3];

        try (InputStream input = Files.newInputStream(Path.of("C:\\Users\\ericm\\Desktop\\db.properties2.txt"))) {

            properties.load(input);

            String URL = properties.getProperty("db.url");
            String USER = properties.getProperty("db.user");
            String PASSWORD = properties.getProperty("db.password");

            credentials[0] = URL;
            credentials[1] = USER;
            credentials[2] = PASSWORD;

        } catch (IOException ex) {

            System.err.println("Error al cargar el archivo de propiedades: " + ex.getMessage());

        }

        return credentials;

    }

    // IMPORTAR PILOTOS

    public static void importDrivers(ArrayList<Piloto> driverList){

        String[] credentials = PilotsCRUD.loadDatabaseProperties();

        String URL = credentials[0];
        String USER = credentials[1];
        String PASSWORD = credentials[2];

        String sentenciaSQL = "SELECT * FROM drivers";

        try(Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){
                int driverId = resultados.getInt("driverid");
                String code = resultados.getString("code");
                String forename = resultados.getString("forename");
                String surname = resultados.getString("surname");
                String dob = resultados.getString("dob");
                String nationality = resultados.getString("nationality");
                String url = resultados.getString("url");

                Piloto driver = new Piloto(driverId, code, forename, surname, dob, nationality, url);
                driverList.add(driver);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    // CREAR Y AÑADIR PILOTO A LA BASE DE DATOS

    public static void createPilot(Scanner read, ArrayList<Piloto> driverList){

        String[] credentials = PilotsCRUD.loadDatabaseProperties();
        String sentenciaSQL = "INSERT into drivers (driverid, code, forename, surname, dob, nationality, url) VALUES (?, ?, ?, ?, ? , ?, ?)";

        boolean safeToAdd = true;

        int driverId = 0;
        String code = "";
        String forename = "";
        String surname = "";
        String dob = "";
        String nationality = "";
        String url = "";

        try {

            System.out.println(" ");
            System.out.print("Introduce la ID del piloto: ");
            driverId = read.nextInt();
            read.nextLine();

            System.out.print("Introduce el código del piloto: ");
            code = read.nextLine();

            System.out.print("Introduce el nombre del piloto: ");
            forename = read.nextLine();

            System.out.print("Introduce el apellido del piloto: ");
            surname = read.nextLine();

            System.out.print("Introduce la fecha de nacimiento del piloto (AAAA-MM-DD): ");
            dob = read.nextLine();

            System.out.print("Introduce la nacionalidad del piloto: ");
            nationality = read.nextLine();

            System.out.print("Introduce la página web del piloto: ");
            url = read.nextLine();

        } catch (Exception e) {

            safeToAdd = false;

            System.out.println(" ");
            System.out.println("Se ha producido un error en la introducción de datos. Por favor, inténtalo de nuevo.");

            read.nextLine();

        } finally {

            if (safeToAdd) {

                Piloto driver = new Piloto(driverId, code, forename, surname, dob, nationality, url);
                driverList.add(driver);

                try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
                    PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

                    sentencia.setInt(1, driverId);
                    sentencia.setString(2, code);
                    sentencia.setString(3, forename);
                    sentencia.setString(4, surname);
                    sentencia.setDate(5, Date.valueOf(dob));
                    sentencia.setString(6, nationality);
                    sentencia.setString(7, url);

                    int rowsAffected = sentencia.executeUpdate();

                    System.out.println(" ");
                    System.out.println(rowsAffected + " fila(s) insertada(s) correctamente.");

                } catch (SQLException e) {

                    throw new RuntimeException(e);

                }

                System.out.println(" ");
                System.out.println("El piloto " + forename + " " + surname + " ha sido añadido a la base de datos.");

            }

        }

    }

    // DEVUELVE UN PILOTO EN BASE A UN ENTERO

    public static void readPilot(Scanner read, ArrayList<Piloto> driverList){

        int idToSearch = 0;
        boolean found = false;

        try {

            System.out.println(" ");
            System.out.print("Introduce la ID del piloto a comprobar: ");
            idToSearch = read.nextInt();

        } catch (Exception e) {

            System.out.println(" ");
            System.out.println("Se ha producido un error en la introducción de datos. Por favor, inténtalo de nuevo.");
            read.nextLine();

        } finally {

            if (idToSearch >= 1) {

                for (int i = 0; i < driverList.size(); i++) {

                    if (idToSearch == driverList.get(i).getDriverId()) {

                        found = true;

                        System.out.println(" ");
                        System.out.println(driverList.get(i));

                    }

                }

                if (!found) {

                    System.out.println(" ");
                    System.out.println("La ID introducida no corresponde a la de ningún piloto en la base de datos.");

                }

            } else {

                System.out.println(" ");
                System.out.println("La ID introducida no puede ser menor o igual a 0.");

            }

        }

    }

    // MUESTRA LA LISTA DE PILOTOS COMPLETA

    public static void readPilots(ArrayList<Piloto> driverList){

        System.out.println(" ");
        System.out.println("Lista completa de pilotos:");
        System.out.println(" ");

        for (int i = 0; i < driverList.size(); i++) {

            System.out.println(driverList.get(i));

        }

    }

    // ACTUALIZAR LOS DATOS DE UN PILOTO

    public static void updatePilot(Scanner read, ArrayList<Piloto> driverList){

        String[] credentials = PilotsCRUD.loadDatabaseProperties();
        String sentenciaSQL = "UPDATE drivers SET code = ?, forename = ?, surname = ?, dob = ?, nationality = ?, url = ? WHERE driverid = ?";

        int idToSearch = 0;
        int driverToModify = 0;
        boolean found = false;

        String code = "";
        String forename = "";
        String surname = "";
        String dob = "";
        String nationality = "";
        String url = "";

        try {

            System.out.println(" ");
            System.out.print("Introduce la ID del piloto a modificar: ");
            idToSearch = read.nextInt();
            read.nextLine();

            System.out.print("Introduce el nuevo código del piloto: ");
            code = read.nextLine();

            System.out.print("Introduce el nuevo nombre del piloto: ");
            forename = read.nextLine();

            System.out.print("Introduce el nuevo apellido del piloto: ");
            surname = read.nextLine();

            System.out.print("Introduce la nueva fecha de nacimiento del piloto (AAAA-MM-DD): ");
            dob = read.nextLine();

            System.out.print("Introduce la nueva nacionalidad del piloto: ");
            nationality = read.nextLine();

            System.out.print("Introduce la nueva página web del piloto: ");
            url = read.nextLine();


        } catch (Exception e) {

            System.out.println(" ");
            System.out.println("Se ha producido un error en la introducción de datos. Por favor, inténtalo de nuevo.");
            read.nextLine();

        } finally {

            if (idToSearch >= 1) {

                for (int i = 0; i < driverList.size(); i++) {

                    if (idToSearch == driverList.get(i).getDriverId()) {

                        found = true;
                        driverToModify = i;

                    }

                }

                if (!found) {

                    System.out.println(" ");
                    System.out.println("La ID introducida no corresponde a la de ningún piloto en la base de datos.");

                } else {

                    driverList.get(driverToModify).setCode(code);
                    driverList.get(driverToModify).setForename(forename);
                    driverList.get(driverToModify).setSurname(surname);
                    driverList.get(driverToModify).setDateOfBirth(dob);
                    driverList.get(driverToModify).setNationality(nationality);
                    driverList.get(driverToModify).setUrl(url);

                    try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
                        PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

                        sentencia.setString(1, code);
                        sentencia.setString(2, forename);
                        sentencia.setString(3, surname);
                        sentencia.setDate(4, Date.valueOf(dob));
                        sentencia.setString(5, nationality);
                        sentencia.setString(6, url);
                        sentencia.setInt(7, idToSearch);

                        int rowsAffected = sentencia.executeUpdate();

                        System.out.println(" ");
                        System.out.println(rowsAffected + " fila(s) insertada(s) correctamente.");

                    } catch (SQLException e) {

                        throw new RuntimeException(e);

                    }

                    System.out.println(" ");
                    System.out.println("El piloto con la ID " + idToSearch + " ha sido modificado.");

                }

            } else {

                System.out.println(" ");
                System.out.println("La ID introducida no puede ser menor o igual a 0.");

            }

        }

    }

    // ELIMINAR PILOTO DE LA BASE DE DATOS

    public static void deletePilot(Scanner read, ArrayList<Piloto> driverList){

        String[] credentials = PilotsCRUD.loadDatabaseProperties();
        String sentenciaSQL = "DELETE from drivers WHERE driverid = ?";

        int idToSearch = 0;
        int driverToDelete = 0;
        boolean found = false;

        try {

            System.out.println(" ");
            System.out.print("Introduce la ID del piloto a eliminar: ");
            idToSearch = read.nextInt();

        } catch (Exception e) {

            System.out.println(" ");
            System.out.println("Se ha producido un error en la introducción de datos. Por favor, inténtalo de nuevo.");
            read.nextLine();

        } finally {

            if (idToSearch >= 1) {

                for (int i = 0; i < driverList.size(); i++) {

                    if (idToSearch == driverList.get(i).getDriverId()) {

                        found = true;
                        driverToDelete = i;

                    }

                }

                if (!found) {

                    System.out.println(" ");
                    System.out.println("La ID introducida no corresponde a la de ningún piloto en la base de datos.");

                } else {

                    driverList.remove(driverToDelete);

                    try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
                        PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

                        sentencia.setInt(1, idToSearch);

                        int rowsAffected = sentencia.executeUpdate();

                        System.out.println(" ");
                        System.out.println(rowsAffected + " fila(s) insertada(s) correctamente.");

                    } catch (SQLException e) {

                        throw new RuntimeException(e);

                    }

                    System.out.println(" ");
                    System.out.println("El piloto con la ID " + idToSearch + " ha sido eliminado de la base de datos.");

                }

            } else {

                System.out.println(" ");
                System.out.println("La ID introducida no puede ser menor o igual a 0.");

            }

        }

    }

    // MOSTRAR CLASIFICACIÓN DE PILOTOS POR PUNTOS

    public static void showPilotClassification(){

        String[] credentials = PilotsCRUD.loadDatabaseProperties();
        String sentenciaSQL = """
                SELECT drivers.forename, SUM(results.points) AS puntos
                FROM drivers
                JOIN results ON drivers.driverid = results.driverid
                GROUP BY drivers.forename
                ORDER BY puntos DESC""";

        System.out.println(" ");
        System.out.println("Clasificación mundial de pilotos, ordenada por puntos:");
        System.out.println(" ");

        try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
            PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){

                String forename = resultados.getString("forename");
                int puntos = resultados.getInt("puntos");

                System.out.println(forename + " - " + puntos);

            }

        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

    }

    // MOSTRAR CLASIFICACIÓN MUNDIAL DE EQUIPOS POR PUNTOS

    public static void showBuildersClassification(){

        String[] credentials = PilotsCRUD.loadDatabaseProperties();
        String sentenciaSQL = """
                SELECT constructors.name AS nombre, SUM(results.points) AS points\s
                FROM results\s
                JOIN drivers ON results.driverid = drivers.driverid\s
                JOIN constructors ON drivers.constructorid = constructors.constructorid\s
                GROUP BY constructors.name\s
                ORDER BY points DESC""";

        System.out.println(" ");
        System.out.println("Clasificación mundial de equipos, ordenada por puntos:");
        System.out.println(" ");

        try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
            PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){

                String nombre = resultados.getString("nombre");
                int points = resultados.getInt("points");

                System.out.println(nombre + " - " + points);

            }

        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

    }

}