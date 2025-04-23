package Tema5;

import java.util.*;

public class Ejercicio1Ampliado {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Set<String> shoppingCart = new HashSet<>();

        Set<String> shoppingList = new HashSet<>();

        int numberOfListElements = 0;
        int numberOfCartElements = 0;

        int menuChoice = 0;

        while (menuChoice == 0) {

            System.out.println("________________________________________________________________________________________");
            System.out.println(" ");

            System.out.println("Lista de la compra:");
            System.out.println(shoppingList);

            System.out.println("Carrito de la compra:");
            System.out.println(shoppingCart);

            System.out.println(" ");
            System.out.println("Selecciona un programa:");
            System.out.println(" ");
            System.out.println("1. Añadir un producto a la lista");
            System.out.println("2. Añadir un producto al carrito");
            System.out.println("3. Comprobar carrito");
            System.out.println("4. Comprobar carrito (explicación de Ana)");
            System.out.println("5. Salir");

            menuChoice = read.nextInt();

            switch (menuChoice) {

                case 1 -> {

                    numberOfListElements = addItemToList(shoppingList, numberOfListElements);
                    menuChoice = 0;

                }

                case 2 -> {

                    numberOfCartElements = addItemToCart(shoppingCart, numberOfCartElements);
                    menuChoice = 0;

                }

                case 3 -> {

                    System.out.println(checkCart(shoppingList, shoppingCart));
                    menuChoice = 0;

                }

                case 4 -> {

                    checkCartAlt(shoppingList, shoppingCart);
                    menuChoice = 0;

                }

                case 5 -> System.out.println("Has salido del programa.");

            }
        }
    }

    // Operaciones -------------------------------------------------------------------------------------------------------

    public static int addItemToList(Set<String> shoppingList, int numberOfElements){

        Scanner read = new Scanner(System.in);
        String itemToAdd;
        boolean add = false;
        boolean trigger = false;

        System.out.println(" ");
        System.out.println("Escribe el objeto a añadir:");

        itemToAdd = read.nextLine();
        //creo que este if  no es necesario.
        if (numberOfElements == 0) {

            shoppingList.add(itemToAdd);
            numberOfElements++;

        } else {

            for (String item : shoppingList){

                if (Objects.equals(itemToAdd, item)){

                    System.out.println(" ");
                    System.out.println("El objeto ya está en la lista.");
                    trigger = true;

                }
            }

            if (!trigger){

                add = true;

            }

            if (add){

                shoppingList.add(itemToAdd);
                numberOfElements++;

            }
        }

        return numberOfElements;
    }

    public static int addItemToCart(Set<String> shoppingCart, int numberOfElements){

        Scanner read = new Scanner(System.in);
        String itemToAdd;
        boolean add = false;
        boolean trigger = false;

        System.out.println(" ");
        System.out.println("Escribe el objeto a añadir:");

        itemToAdd = read.nextLine();

        if (numberOfElements == 0) {

            shoppingCart.add(itemToAdd);
            numberOfElements++;

        } else {

            for (String item : shoppingCart){

                if (Objects.equals(itemToAdd, item)){

                    System.out.println(" ");
                    System.out.println("El objeto ya está en el carrito.");
                    trigger = true;

                }
            }

            if (!trigger){

                add = true;

            }

            if (add){

                shoppingCart.add(itemToAdd);
                numberOfElements++;

            }
        }

        return numberOfElements;
    }

    public static String checkCart(Set<String> shoppingList, Set<String> shoppingCart){

        int counter = 0;

        StringBuilder missingItems = new StringBuilder();

        for (String s : shoppingList){

            if (shoppingCart.contains(s)){

                counter++;

            } else {

                missingItems.append(s);
                missingItems.append(" ");

            }
        }

        String finalList = missingItems.toString();

        if (counter == shoppingList.size()){

            System.out.println(" ");
            return "No falta ningún objeto por añadir al carrito.";

        } else {

            return "Objetos que faltan en el carrito: " + finalList;

        }
    }

    public static void checkCartAlt(Set<String> shoppingList, Set<String> shoppingCart){

        shoppingList.removeAll(shoppingCart);

    }
}