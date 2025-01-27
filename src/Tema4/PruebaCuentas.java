package Tema4;

import java.util.Scanner;

public class PruebaCuentas {

    public static void main(String[] args) {

        PersonaBanco[] persons;
        int numberOfPersons = 0;

    }

    public static void createPerson(int numberOfPersons, PersonaBanco[] persons){

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce el DNI de la persona:");

        String dni = read.nextLine();

        PersonaBanco person = new PersonaBanco(dni);

        if (numberOfPersons < persons.length){

            persons[numberOfPersons] = person;
            numberOfPersons++;
        }
    }

    public static void createAccount(PersonaBanco[] persons){

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce el número de cuenta:");

        String accountNumber = read.nextLine();

        System.out.println("Introduce el saldo de cuenta:");

        int accountBalance = read.nextInt();

        Cuenta account = new Cuenta(accountNumber, accountBalance);

        persons[0].addAccount(account);

    }

    public static void showInfo(PersonaBanco[] persons){

        String dni = persons[0].getDni();

        System.out.println("DNI es: " + dni);

    }



}
