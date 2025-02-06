package Tema5;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        boolean stop = false;

        Set<String> shoppingList = new HashSet<>();

        int numberOfElements = 0;

        while (!stop){

            numberOfElements = addItem(shoppingList, numberOfElements);

            System.out.println(" ");
            System.out.println("¿Quieres añadir otro objeto?");
            System.out.println("1. Sí | 2. No");

            int choice = read.nextInt();

            switch (choice){

                case 1 -> System.out.print("");

                case 2 -> stop = true;

            }
        }

        System.out.println(shoppingList);

    }

    public static int addItem(Set<String> shoppingList, int numberOfElements){

        Scanner read = new Scanner(System.in);
        String itemToAdd;
        boolean add = false;
        boolean trigger = false;

        System.out.println(" ");
        System.out.println("Escribe el objeto a añadir:");

        itemToAdd = read.nextLine();

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
}
