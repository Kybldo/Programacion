package Tema5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GatoMain2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        read.useDelimiter("\\R");

        List<Gato> catList = new ArrayList<>();

        Gato cat = null;

        int catCounter = 1;
        boolean validCat = false;

        System.out.println(" ");
        System.out.println("Introduce los datos de 5 gatos.");
        System.out.println(" ");
        System.out.println("¡Atención! El nombre del gato no puede tener menos de 3 carácteres, y la edad no puede ser negativa.");

        while (catCounter != 6){

            System.out.println("________________________________________________________________________________________");
            System.out.println(" ");
            System.out.println("Datos del gato número " + catCounter);

            try {

                System.out.print("Nombre: ");
                String name = read.nextLine();

                System.out.print("Edad: ");
                int age = read.nextInt();
                read.nextLine();

                cat = new Gato(name, age);
                validCat = true;

            } catch (InputMismatchException ex){

                System.out.println("El tipo de valor introducido no es correcto (Nombre: Cadena, Edad: Entero).");
                validCat = false;

            } catch (Exception ex) {

                System.out.println("Se han introducido incorrectamente la edad o el nombre.");
                validCat = false;

            } finally {

                if (validCat){

                    catList.add(cat);
                    catCounter++;

                } else {

                    read.nextLine();
                    System.out.println(" ");
                    System.out.println("La información del gato no es correcta. Vuelve a intentarlo.");

                }

            }

        }

        System.out.println(catList);

    }

}
