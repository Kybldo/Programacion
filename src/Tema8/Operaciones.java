package Tema8;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.*;

public class Operaciones {

    // CARGAR CREDENCIALES DE LA BASE DE DATOS

    public static String[] loadDatabaseProperties() {

        Properties properties = new Properties();
        String[] credentials = new String[3];

        try (InputStream input = Files.newInputStream(Path.of("C:\\Users\\ericm\\Desktop\\db.properties.txt"))) {

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

    // CONSULTAR LISTA DE ASIGNATURAS

    public static void listadoAsignaturas() {

        String[] credentials = Operaciones.loadDatabaseProperties();
        String sentenciaSQL = "SELECT * FROM asignatura";

        try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
            PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){

                String id = resultados.getString("id_asignatura");
                String nombre = resultados.getString("nombre");
                String aula = resultados.getString("aula");
                boolean obligatoria = resultados.getBoolean("obligatoria");

                String obligatoriaString = "No";

                if (obligatoria) obligatoriaString = "Sí";

                System.out.println(id + " - " + nombre + ", Aula: " + aula + ", Obligatoria: " +  obligatoriaString);
            }

        } catch (SQLException e) {

            throw new RuntimeException(e);

        }
    }

    // CONSULTAR ESTUDIANTES DE UNA CASA

    public static void consultarEstudiantesCasa(Scanner read){

        String[] credentials = Operaciones.loadDatabaseProperties();
        String sentenciaSQL = "SELECT * FROM casa";
        String sentenciaSQL2 = "SELECT * FROM estudiante";

        System.out.println(" ");
        System.out.print("Introduce el nombre de una casa: ");

        String casa = "";
        int idToSearch = -1;

        try {

            casa = read.nextLine();

        } catch (Exception e){

            e.printStackTrace();
            read.nextLine();

        } finally {

            try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
                PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

                ResultSet resultados = sentencia.executeQuery();

                while(resultados.next()){

                    int id = resultados.getInt("id_casa");
                    String nombre = resultados.getString("nombre");

                    if (casa.equalsIgnoreCase(nombre)){

                        idToSearch = id;

                    }
                }

            } catch (SQLException e) {

                throw new RuntimeException(e);

            } finally {

                System.out.println(" ");

                if (idToSearch != -1){

                    System.out.println("Estudiantes de \"" + casa + "\":");

                    try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
                        PreparedStatement sentencia = con.prepareStatement(sentenciaSQL2)){

                        ResultSet resultados = sentencia.executeQuery();

                        while(resultados.next()){

                            int id = resultados.getInt("id_casa");
                            String nombre = resultados.getString("nombre");
                            String apellido = resultados.getString("apellido");

                            if (idToSearch == id){

                                System.out.println(nombre + " " + apellido);

                            }
                        }

                    } catch (SQLException e) {

                        throw new RuntimeException(e);

                    }

                } else {

                    System.out.println("La casa con ese nombre no está en la base de datos o no contiene alumnos.");

                }
            }
        }
    }

    // CONSULTAR MASCOTA DE UN ESTUDIANTE ESPECÍFICO

    public static void consultarMascota(Scanner read){

        String[] credentials = Operaciones.loadDatabaseProperties();
        String sentenciaSQL = "SELECT * FROM estudiante";
        String sentenciaSQL2 = "SELECT * FROM mascota";

        String studentName = "";
        String studentSurname = "";
        int idToSearch = -1;

        try {

            System.out.println(" ");
            System.out.print("Introduce el nombre de un estudiante: ");

            studentName = read.nextLine();

            System.out.print("Introduce el apellido del estudiante: ");

            studentSurname = read.nextLine();

        } catch (Exception e){

            e.printStackTrace();

        } finally {

            try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
                PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

                ResultSet resultados = sentencia.executeQuery();

                while(resultados.next()){

                    int id = resultados.getInt("id_estudiante");
                    String nombre = resultados.getString("nombre");
                    String apellido = resultados.getString("apellido");

                    if (studentName.equalsIgnoreCase(nombre) && studentSurname.equalsIgnoreCase(apellido)){

                        idToSearch = id;

                    }
                }

            } catch (SQLException e) {

                throw new RuntimeException(e);

            } finally {

                System.out.println(" ");

                if (idToSearch != -1){

                    System.out.println("La mascota de " + studentName + " " + studentSurname + " es:");

                    try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
                        PreparedStatement sentencia = con.prepareStatement(sentenciaSQL2)){

                        ResultSet resultados = sentencia.executeQuery();

                        while(resultados.next()){

                            int id = resultados.getInt("id_estudiante");
                            String nombre = resultados.getString("nombre");
                            String especie = resultados.getString("especie");

                            if (idToSearch == id){

                                System.out.println(nombre + ", Especie: " + especie);

                            }
                        }

                    } catch (SQLException e) {

                        throw new RuntimeException(e);

                    }

                } else {

                    System.out.println("Este estudiante no está en la base de datos o no tiene mascota.");

                }
            }
        }
    }

    // CONSULTAR NÚMERO DE ESTUDIANTES DE CADA CASA

    public static void consultarNumEstudiantesPorCasa(){

        String[] credentials = Operaciones.loadDatabaseProperties();
        String sentenciaSQL = "SELECT * FROM casa";
        String sentenciaSQL2 = "SELECT * FROM estudiante";

        HashMap<Integer, String> casas = new HashMap<>();
        HashMap<Integer, Integer> estudiantes = new HashMap<>();

        try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
            PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){

                int id = resultados.getInt("id_casa");
                String nombre = resultados.getString("nombre");

                casas.put(id, nombre);
                estudiantes.put(id, 0);

            }

        } catch (SQLException e) {

            throw new RuntimeException(e);

        } finally {

            try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
                PreparedStatement sentencia = con.prepareStatement(sentenciaSQL2)){

                ResultSet resultados = sentencia.executeQuery();

                int key;
                int value;

                while(resultados.next()){

                    int id = resultados.getInt("id_casa");

                    for (HashMap.Entry<Integer, Integer> entry : estudiantes.entrySet()) {

                        key = entry.getKey();
                        value = entry.getValue();

                        if (id == key){

                            value++;
                            estudiantes.put(key, value);

                        }
                    }
                }

            } catch (SQLException e) {

                throw new RuntimeException(e);

            } finally {

                for (HashMap.Entry<Integer, String> entry : casas.entrySet()) {

                    int key = entry.getKey();
                    String value = entry.getValue();

                    for (HashMap.Entry<Integer, Integer> entry2 : estudiantes.entrySet()) {

                        int key2 = entry2.getKey();
                        int value2 = entry2.getValue();

                        if (key == key2){

                            System.out.println(value + ": " + value2);

                        }
                    }
                }
            }
        }
    }

    // SOLUCIÓN APAÑADA DEL DE ANTES QUE ME HE LIADO Y ME HE ACORDADO DE QUE PODÍA HACER JOINS Y USAR AGREGADOS Y ESAS COSAS

    public static void consultarNumEstudiantesPorCasa2() {

        String[] credentials = Operaciones.loadDatabaseProperties();

        String sentenciaSQL = "SELECT c.id_casa, c.nombre, COUNT(e.id_estudiante) as num_estudiantes " +
                "FROM casa c LEFT JOIN estudiante e ON c.id_casa = e.id_casa " +
                "GROUP BY c.id_casa, c.nombre";

        try (Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
             PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)) {

            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String nombre = resultados.getString("nombre");
                int estudiantes = resultados.getInt("num_estudiantes");
                System.out.println(nombre + ": " + estudiantes);
            }

        } catch (SQLException e) {

            throw new RuntimeException("Error querying database", e);

        }
    }

    // AGREGAR ENTRADA A LA TABLA ASIGNATURA

    public static void agregarAsignatura(Scanner read){

        String[] credentials = Operaciones.loadDatabaseProperties();

        String sentenciaSQL = "INSERT into ASIGNATURA (nombre, aula, obligatoria) VALUES (?, ?, ?)";

        String nombre = "";
        String aula = "";
        boolean obligatoria = false;

        try {

            System.out.println(" ");
            System.out.print("Introduce el nombre de la asignatura a introducir: ");

            nombre = read.nextLine();

            System.out.print("Introduce el nombre del aula correspondiente: ");

            aula = read.nextLine();

            System.out.print("¿Es la clase obligatoria? (Sí / No): ");

            String booleanCheck = read.nextLine();

            if (booleanCheck.equalsIgnoreCase("si") || booleanCheck.equalsIgnoreCase("sí")){

                obligatoria = true;

            }

        } catch (Exception e){

            e.printStackTrace();

        } finally {

            try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
                PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

                sentencia.setString(1, nombre);
                sentencia.setString(2, aula);
                sentencia.setBoolean(3, obligatoria);

                int rowsAffected = sentencia.executeUpdate();

                System.out.println(" ");
                System.out.println(rowsAffected + " fila(s) insertada(s) correctamente.");

            } catch (SQLException e) {

                throw new RuntimeException(e);

            }
        }
    }

    // MODIFICAR AULA DE UNA ASIGNATURA

    public static void modificarAulaAsignatura(Scanner read){

        String[] credentials = Operaciones.loadDatabaseProperties();

        String sentenciaSQL = "UPDATE Asignatura SET aula = ? WHERE id_asignatura = ?";

        String aula = "";
        int id_asignatura = 0;

        try {

            System.out.println(" ");
            System.out.print("Introduce el ID de la asignatura a modificar: ");

            id_asignatura = read.nextInt();
            read.nextLine();

            System.out.print("Introduce el nombre de la nueva aula: ");

            aula = read.nextLine();

        } catch (Exception e){

            e.printStackTrace();

        } finally {

            try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
                PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

                sentencia.setString(1, aula);
                sentencia.setInt(2, id_asignatura);

                int rowsAffected = sentencia.executeUpdate();

                System.out.println(" ");
                System.out.println(rowsAffected + " fila(s) insertada(s) correctamente.");

            } catch (SQLException e) {

                throw new RuntimeException(e);

            }
        }
    }

    // ELIMINAR UNA ASIGNATURA

    public static void eliminarAsignatura(Scanner read){

        String[] credentials = Operaciones.loadDatabaseProperties();

        String sentenciaSQL = "DELETE FROM Asignatura WHERE id_asignatura = ?";

        int id_asignatura = 0;

        try {

            System.out.println(" ");
            System.out.print("Introduce el ID de la asignatura a eliminar: ");

            id_asignatura = read.nextInt();
            read.nextLine();

        } catch (Exception e){

            e.printStackTrace();

        } finally {

            try(Connection con = DriverManager.getConnection(credentials[0], credentials[1], credentials[2]);
                PreparedStatement sentencia = con.prepareStatement(sentenciaSQL)){

                sentencia.setInt(1, id_asignatura);

                int rowsAffected = sentencia.executeUpdate();

                System.out.println(" ");
                System.out.println(rowsAffected + " fila(s) eliminada(s) correctamente.");

            } catch (SQLException e) {

                throw new RuntimeException(e);

            }
        }
    }
}