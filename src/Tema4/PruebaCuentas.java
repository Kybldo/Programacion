package Tema4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PruebaCuentas {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        PersonaBanco[] persons = new PersonaBanco[10];
        int numberOfPersons = 0;

        String[] accountDisplay = new String[persons.length];

        Arrays.fill(accountDisplay, "*");

        int menuChoice = 0;

        while (menuChoice == 0){

            if (persons[0] != null){

                accountDisplay[numberOfPersons - 1] = "■";

            }

            System.out.println(" ");

            System.out.println("--------------------------------------------------------------------------------------");

            System.out.println("Personas actuales:");
            System.out.println(Arrays.toString(accountDisplay));

            System.out.println(" ");

            System.out.println("Elige tu veneno:");
            System.out.println(" ");
            System.out.println("1. Crear una persona");
            System.out.println("2. Crear y asociar una cuenta a una persona");
            System.out.println("3. Mostrar datos de una persona");
            System.out.println("4. Ingresar nómina a una persona");
            System.out.println("5. Enviar dinero a una cuenta");

            menuChoice = read.nextInt();

            switch (menuChoice){

                case 1 -> {

                    createPerson(numberOfPersons, persons);

                    numberOfPersons++;

                    menuChoice = 0;

                }

                case 2 -> {

                    createAccount(persons, numberOfPersons);

                    menuChoice = 0;

                }

                case 3 -> {

                    showInfo(persons, numberOfPersons);

                    menuChoice = 0;

                }

                case 4 -> {

                    monthlyCheck(persons, numberOfPersons);

                    menuChoice = 0;

                }

                case 5 -> {

                    receiveMoney(persons, numberOfPersons);

                    menuChoice = 0;

                }

            }

        }

    }

    // Crear personas --------------------------------------------------------------------------------------------------

    public static void createPerson(int numberOfPersons, PersonaBanco[] persons){

        Scanner read = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("Introduce el DNI de la persona:");

        String dni = read.nextLine();

        PersonaBanco person = new PersonaBanco();

        person.setDni(dni);

        if (numberOfPersons < persons.length){

            persons[numberOfPersons] = person;

        }
    }

    // Crear cuentas ---------------------------------------------------------------------------------------------------

    public static void createAccount(PersonaBanco[] persons, int numberOfPersons){

        Scanner read = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("Escribe el DNI de la persona:");

        String selectedPersonDNI = read.nextLine();

        String personDNI;
        int personNumber = 0;
        String finalPersonDNI = "";

        for (int i = 0; i < numberOfPersons; i++){

            personDNI = persons[i].getDni();

            if (Objects.equals(selectedPersonDNI, personDNI)){

                finalPersonDNI = personDNI;
                personNumber = i;

            }

        }

        if (Objects.equals(selectedPersonDNI, finalPersonDNI)){

            Cuenta[] accountsArray = persons[personNumber].getAccounts();

            if (accountsArray[2] != null){

                System.out.println("No puedes añadir más cuentas.");

            } else {

                System.out.println("Introduce el número de cuenta:");

                String accountNumber = read.nextLine();

                System.out.println("Introduce el saldo de cuenta:");

                int accountBalance = read.nextInt();

                Cuenta account = new Cuenta();

                account.setAccountNumber(accountNumber);

                account.setBalance(accountBalance);

                persons[personNumber].addAccount(account);

            }

        } else System.out.println("DNI inválido.");

    }

    // Ver información de la persona -----------------------------------------------------------------------------------

    public static void showInfo(PersonaBanco[] persons, int numberOfPersons){

        Scanner read = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("Escribe el DNI de la persona:");

        String selectedPersonDNI = read.nextLine();

        String personDNI;
        int personNumber = 0;
        String finalPersonDNI = "";

        for (int i = 0; i < numberOfPersons; i++){

            personDNI = persons[i].getDni();

            if (Objects.equals(selectedPersonDNI, personDNI)){

                finalPersonDNI = personDNI;
                personNumber = i;

            }

        }

        if (Objects.equals(selectedPersonDNI, finalPersonDNI)){

            System.out.println(Arrays.toString(persons[personNumber].getAccounts()));

        } else System.out.println("DNI inválido.");


    }

    // Ingresar nómina en una cuenta -----------------------------------------------------------------------------------

    public static void monthlyCheck(PersonaBanco[] persons, int numberOfPersons){

        Scanner read = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("Escribe el DNI de la persona:");

        String selectedPersonDNI = read.nextLine();

        String personDNI;
        int personNumber = 0;
        String finalPersonDNI = "";

        for (int i = 0; i < numberOfPersons; i++){

            personDNI = persons[i].getDni();

            if (Objects.equals(selectedPersonDNI, personDNI)){

                finalPersonDNI = personDNI;
                personNumber = i;

            }

        }

        if (Objects.equals(selectedPersonDNI, finalPersonDNI)){

            System.out.println(" ");

            System.out.println("Introduce el número de cuenta a ingresar:");

            String selectedAccount = read.nextLine();

            String personAccount;
            int accountNumber = 0;
            String finalAccountNumber = "";

            int numberOfAccounts = persons[personNumber].getNumberOfAccounts();

            Cuenta[] accounts = persons[personNumber].getAccounts();

            for (int i = 0; i < numberOfAccounts; i++){

                personAccount = accounts[i].getAccountNumber();

                if (Objects.equals(selectedAccount, personAccount)){

                    finalAccountNumber = personAccount;
                    accountNumber = i;

                }

            }

            if (Objects.equals(selectedAccount, finalAccountNumber)){

                int accountBalance = accounts[accountNumber].getBalance();

                accounts[accountNumber].setBalance(accountBalance + 1200);

                accountBalance = accounts[accountNumber].getBalance();

                System.out.println("Se han ingresado 1200€");

                System.out.println("El saldo de la cuenta es: " + accountBalance + "€");

            } else System.out.println("Número de cuenta inválido.");

        } else System.out.println("DNI inválido.");

    }

    // Recibir un pago en una cuenta -----------------------------------------------------------------------------------

    public static void receiveMoney(PersonaBanco[] persons, int numberOfPersons){

        Scanner read = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("Escribe el DNI de la persona:");

        String selectedPersonDNI = read.nextLine();

        String personDNI;
        int personNumber = 0;
        String finalPersonDNI = "";

        for (int i = 0; i < numberOfPersons; i++){

            personDNI = persons[i].getDni();

            if (Objects.equals(selectedPersonDNI, personDNI)){

                finalPersonDNI = personDNI;
                personNumber = i;

            }

        }

        if (Objects.equals(selectedPersonDNI, finalPersonDNI)){

            System.out.println(" ");

            System.out.println("Introduce el número de cuenta a ingresar:");

            String selectedAccount = read.nextLine();

            String personAccount;
            int accountNumber = 0;
            String finalAccountNumber = "";

            int numberOfAccounts = persons[personNumber].getNumberOfAccounts();

            Cuenta[] accounts = persons[personNumber].getAccounts();

            for (int i = 0; i < numberOfAccounts; i++){

                personAccount = accounts[i].getAccountNumber();

                if (Objects.equals(selectedAccount, personAccount)){

                    finalAccountNumber = personAccount;
                    accountNumber = i;

                }

            }

            if (Objects.equals(selectedAccount, finalAccountNumber)){

                System.out.println(" ");

                System.out.println("Introduce la cantidad a ingresar:");

                int quantity = read.nextInt();

                int accountBalance = accounts[accountNumber].getBalance();

                accounts[accountNumber].setBalance(accountBalance + quantity);

                accountBalance = accounts[accountNumber].getBalance();

                System.out.println("Se han ingresado " + quantity + "€");

                System.out.println("El saldo de la cuenta es: " + accountBalance + "€");

            } else System.out.println("Número de cuenta inválido.");

        } else System.out.println("DNI inválido.");

    }

}