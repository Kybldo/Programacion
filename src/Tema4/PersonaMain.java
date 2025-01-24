package Tema4;

import java.util.Scanner;

public class PersonaMain {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Persona persona1 = new Persona();

        Persona persona2 = new Persona();

        System.out.println("Introduce el nombre de la primera persona:");

        String name1 = read.nextLine();

        persona1.setName(name1);

        System.out.println("Introduce los apellidos de la primera persona:");

        String surnames1 = read.nextLine();

        persona1.setSurnames(surnames1);

        System.out.println("Introduce la edad de la primera persona:");

        int age1 = read.nextInt();
        read.nextLine();

        persona1.setAge(age1);

        System.out.println(" ");

        //--------------------------------------------------------------------------

        System.out.println("Introduce el nombre de la segunda persona:");

        String name2 = read.nextLine();

        persona2.setName(name2);

        System.out.println("Introduce los apellidos de la segunda persona:");

        String surnames2 = read.nextLine();

        persona2.setSurnames(surnames2);

        System.out.println("Introduce la edad de la segunda persona:");

        int age2 = read.nextInt();
        read.nextLine();

        persona2.setAge(age2);

        System.out.println(" ");

        //--------------------------------------------------------------------------

        System.out.println(persona1);
        System.out.println(persona2);

        System.out.println(" ");

        System.out.println(persona1.isAdult());
        System.out.println(persona2.isAdult());

        System.out.println(" ");

        System.out.println(persona1.isRetired());
        System.out.println(persona2.isRetired());

        System.out.println(" ");

        System.out.println(persona1.ageDifference(persona2));

        System.out.println(" ");

        System.out.println(Persona.checkDNI());

        read.close();

    }

}
