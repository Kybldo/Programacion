package Tema5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gimnasio {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Map<String, Usuario> users = new HashMap<>();

        int menuChoice = 0;

        while (menuChoice == 0){

            System.out.println("________________________________________________________________________________________");
            System.out.println(" ");
            System.out.println("Lista de usuarios:");
            System.out.println(users);

            System.out.println(" ");
            System.out.println("Selecciona un programa:");
            System.out.println(" ");
            System.out.println("1. Dar de alta a un usuario");
            System.out.println("2. Dar de baja a un usuario");
            System.out.println("3. Mostrar los datos de un usuario");
            System.out.println("4. Modificar los datos de un usuario");
            System.out.println("5. Salir");

            menuChoice = read.nextInt();

            switch (menuChoice){

                case 1 -> {

                    addUser(users);
                    menuChoice = 0;

                }

                case 2 -> {

                    removeUsers(users);
                    menuChoice = 0;

                }

                case 3 -> {

                    showUserData(users);
                    menuChoice = 0;

                }

                case 4 -> {

                    editUser(users);
                    menuChoice = 0;

                }

                case 5 ->System.out.println("Has salido del programa.");

            }
        }
    }

    // Funciones -------------------------------------------------------------------------------------------------------

    public static void addUser(Map<String, Usuario> users){

        Scanner read = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Introduce el DNI del usuario a dar de alta:");

        String dni = read.nextLine();

        System.out.println(" ");
        System.out.println("Introduce el nombre del usuario:");

        String name = read.nextLine();

        System.out.println(" ");
        System.out.println("Introduce la edad del usuario:");

        int age = read.nextInt();

        Usuario user = new Usuario(name, age);

        users.put(dni, user);

        System.out.println(" ");
        System.out.println("Se ha dado de alta al usuario " + name + ", con el DNI " + dni + ".");

    }

    public static void removeUsers(Map<String, Usuario> users){

        Scanner read = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Introduce el DNI del usuario a dar de baja:");

        String dni = read.nextLine();

        if (users.containsKey(dni)){

            System.out.println(" ");
            users.remove(dni);
            System.out.println("Se ha dado de baja al usuario con el DNI: " + dni + ".");

        } else System.out.println("El DNI introducido no coincide con el de ningún usuario.");
    }

    public static void showUserData(Map<String, Usuario> users){

        Scanner read = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Introduce el DNI del usuario cuyos datos quieras mostrar:");

        String dni = read.nextLine();

        if (users.containsKey(dni)){

            System.out.println(" ");
            System.out.print("DNI: " + dni + ", Nombre: ");
            System.out.println(users.get(dni));

        } else System.out.println("El DNI introducido no coincide con el de ningún usuario.");
    }

    public static void editUser(Map<String, Usuario> users){

        Scanner read = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Introduce el DNI del usuario cuyos datos quieras modificar:");

        String dni = read.nextLine();

        if (users.containsKey(dni)){

            System.out.println(" ");
            System.out.println("Introduce un nuevo nombre para " + users.get(dni).getName() + ":");

            String newName = read.nextLine();

            System.out.println(" ");
            System.out.println("Introduce una nueva edad para " + users.get(dni).getName() + ":");

            int newAge = read.nextInt();

            users.get(dni).setName(newName);
            users.get(dni).setAge(newAge);

            System.out.println("Los datos del usuario con el DNI " + dni + " se han actualizado con éxito.");

        } else System.out.println("El DNI introducido no coincide con el de ningún usuario.");
    }
}
