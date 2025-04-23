package Tema5;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ColaDelBanco {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        List<UsuarioBanco> queue = new ArrayList<>();

        int queueCounter = 0;

        int menuChoice = 0;

        while (menuChoice == 0){

            System.out.println("________________________________________________________________________________________");
            System.out.println(" ");
            System.out.println("Cola:");

            for (UsuarioBanco u : queue){

                queueCounter++;

                System.out.print(queueCounter + ". ");
                System.out.println(u);

            }

            queueCounter = 0;

            System.out.println(" ");
            System.out.println("Selecciona un programa:");
            System.out.println(" ");
            System.out.println("1. Añadir usuario a la cola");
            System.out.println("2. Eliminar al primer usuario de la cola");
            System.out.println("3. Eliminar a un usuario de la cola");
            System.out.println("4. Salir");

            menuChoice = read.nextInt();

            switch (menuChoice){

                case 1 -> {

                    addUser(queue);
                    menuChoice = 0;

                }

                case 2 -> {

                    removeFirst(queue);
                    menuChoice = 0;

                }

                case 3 -> {

                    removeFromQueue(queue);
                    menuChoice = 0;

                }

                case 4 -> System.out.println("Has salido del programa.");

            }
        }

    }

    // Operaciones -------------------------------------------------------------------------------------------------------

    public static void addUser(List<UsuarioBanco> queue){

        Scanner read = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Introduce el nombre del usuario a añadir a la cola:");

        String name = read.nextLine();

        System.out.println(" ");
        System.out.println("Introduce el DNI del usuario a añadir a la cola:");

        String dni = read.nextLine();

        System.out.println(" ");
        System.out.println("Introduce la edad del usuario a añadir a la cola:");

        int age = read.nextInt();

        UsuarioBanco user = new UsuarioBanco(name, dni, age);

        queue.add(user);

        System.out.println("El usuario " + name + ", de DNI " + dni + ", ha sido añadido a la cola.");

    }

    public static void removeFirst(List<UsuarioBanco> queue){

        try {

            queue.removeFirst();

        } catch (NoSuchElementException ex){

            System.out.println(" ");
            System.out.println("La cola está vacía.");

        }
    }

    public static void removeFromQueue(List<UsuarioBanco> queue){

        Scanner read = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Introduce la posición del usuario a eliminar de la cola:");

        int num = read.nextInt();

        num--;

        try {

            queue.remove(num);

        } catch (IndexOutOfBoundsException ex){

            System.out.println(" ");
            System.out.println("No hay usuarios en esa posición de la cola.");

        }
    }
}