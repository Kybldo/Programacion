package Tema4;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PruebaCuentas {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        // Crea array vacío de personas a registrar en el banco

        PersonaBanco[] persons = new PersonaBanco[10];
        int numberOfPersons = 0;

        // Crea un segundo array que sirve para enseñar visualmente qué espacios del primer array tienen una persona

        String[] accountDisplay = new String[persons.length];

        Arrays.fill(accountDisplay, "*");

        // A partir de aquí es el menú

        int menuChoice = 0;

        while (menuChoice == 0) {

            //Si la variable numberOfPersons equivale a más de 0, se empezarán a registrar personas en el segundo array para demostración visual

            if (persons[0] != null) accountDisplay[numberOfPersons - 1] = "■";

            // El texto del menú

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
            System.out.println("6. Realizar una transferencia entre cuentas");
            System.out.println("7. Detectar e imprimir morosos");
            System.out.println("8. Salir");

            menuChoice = read.nextInt();

            switch (menuChoice) {

                // Crear persona

                case 1 -> {

                    createPerson(numberOfPersons, persons);

                    numberOfPersons++;
                    menuChoice = 0;

                }

                // Crear una cuenta y asociarla a una persona anteriormente creada

                case 2 -> {

                    createAccount(persons, numberOfPersons);
                    menuChoice = 0;

                }

                // Mostrar información de una persona (sus cuentas y sus respectivos balances)

                case 3 -> {

                    showInfo(persons, numberOfPersons);
                    menuChoice = 0;

                }

                // Ingresar la nómina a la cuenta de una persona (por defecto, 1200 euros)

                case 4 -> {

                    monthlyCheck(persons, numberOfPersons);
                    menuChoice = 0;

                }

                // Enviar una cantidad personalizada de dinero a la cuenta de una persona

                case 5 -> {

                    receiveMoney(persons, numberOfPersons);
                    menuChoice = 0;

                }

                // Transferir dinero de una cuenta a otra

                case 6 -> {

                    transferMoney(persons, numberOfPersons);
                    menuChoice = 0;

                }

                // Detectar e imprimir morosos (personas que tengan cuentas con balances negativos)

                case 7 -> {

                    printDefaulters(persons, numberOfPersons);
                    menuChoice = 0;

                }

                // Sale del programa

                case 8 -> System.out.println("Has salido del programa.");
            }
        }
    }

    // Crear personas --------------------------------------------------------------------------------------------------

    public static void createPerson(int numberOfPersons, PersonaBanco[] persons) {

        Scanner read = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("Introduce el DNI de la persona:");

        String dni = read.nextLine();

        PersonaBanco person = new PersonaBanco();

        person.setDni(dni);

        // Una vez introducido el DNI de la persona, se comprueba si se puede meter en el array; si se puede, se mete
        // numberOfPersons se aumenta en el main tras llamar a la función

        if (numberOfPersons < persons.length) persons[numberOfPersons] = person;
    }

    // Crear cuentas ---------------------------------------------------------------------------------------------------

    public static void createAccount(PersonaBanco[] persons, int numberOfPersons) {

        Scanner read = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("Escribe el DNI de la persona:");

        String selectedPersonDNI = read.nextLine();

        // Se crean las siguientes variables y se usa un for para recorrer el array de personas y comparar el DNI introducido con los guardados
        // De coincidir los DNI, se cambia el número de la persona en la que operar por aquel que ha dado la equivalencia

        String personDNI;
        int personNumber = 0;
        String finalPersonDNI = "";

        for (int i = 0; i < numberOfPersons; i++) {

            personDNI = persons[i].getDni();

            if (Objects.equals(selectedPersonDNI, personDNI)) {

                finalPersonDNI = personDNI;
                personNumber = i;

            }
        }

        // Una vez confirmado el DNI, revisa el número de cuentas; si la persona ya tiene 3 cuentas registradas, no puede añadir más

        if (Objects.equals(selectedPersonDNI, finalPersonDNI)) {

            Cuenta[] accountsArray = persons[personNumber].getAccounts();

            if (accountsArray[2] != null) {

                System.out.println("No puedes añadir más cuentas.");

            } else {

                System.out.println("Introduce el número de cuenta:");

                String accountNumber = read.nextLine();

                System.out.println("Introduce el saldo de cuenta:");

                int accountBalance = read.nextInt();

                // Igual que al añadir las personas anteriormente, se hace lo mismo para las cuentas, siendo enviadas a su respectivo array

                Cuenta account = new Cuenta();

                account.setAccountNumber(accountNumber);

                account.setBalance(accountBalance);

                persons[personNumber].addAccount(account);

            }

        } else System.out.println("DNI inválido.");
    }

    // Ver información de la persona -----------------------------------------------------------------------------------

    public static void showInfo(PersonaBanco[] persons, int numberOfPersons) {

        Scanner read = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("Escribe el DNI de la persona:");

        String selectedPersonDNI = read.nextLine();

        // Se crean las siguientes variables y se usa un for para recorrer el array de personas y comparar el DNI introducido con los guardados

        String personDNI;
        int personNumber = 0;
        String finalPersonDNI = "";

        for (int i = 0; i < numberOfPersons; i++) {

            personDNI = persons[i].getDni();

            if (Objects.equals(selectedPersonDNI, personDNI)) {

                finalPersonDNI = personDNI;
                personNumber = i;

            }
        }

        // Se imprime su información si el DNI introducido coincide con el registrado; de lo contrario, imprime el error

        if (Objects.equals(selectedPersonDNI, finalPersonDNI)) {

            System.out.println(Arrays.toString(persons[personNumber].getAccounts()));

        } else System.out.println("DNI inválido.");
    }

    // Ingresar nómina en una cuenta -----------------------------------------------------------------------------------

    public static void monthlyCheck(PersonaBanco[] persons, int numberOfPersons) {

        Scanner read = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("Escribe el DNI de la persona:");

        String selectedPersonDNI = read.nextLine();

        // Se crean las siguientes variables y se usa un for para recorrer el array de personas y comparar el DNI introducido con los guardados

        String personDNI;
        int personNumber = 0;
        String finalPersonDNI = "";

        for (int i = 0; i < numberOfPersons; i++) {

            personDNI = persons[i].getDni();

            if (Objects.equals(selectedPersonDNI, personDNI)) {

                finalPersonDNI = personDNI;
                personNumber = i;

            }
        }

        // Igual que con el DNI, se comprueba el número de cuenta

        if (Objects.equals(selectedPersonDNI, finalPersonDNI)) {

            System.out.println(" ");

            System.out.println("Introduce el número de cuenta a ingresar:");

            String selectedAccount = read.nextLine();

            // Se crean las siguientes variables y se usa un for para recorrer el array de cuentas y comparar el número de cuenta introducido con los guardados

            String personAccount;
            int accountNumber = 0;
            String finalAccountNumber = "";

            int numberOfAccounts = persons[personNumber].getNumberOfAccounts();

            Cuenta[] accounts = persons[personNumber].getAccounts();

            for (int i = 0; i < numberOfAccounts; i++) {

                personAccount = accounts[i].getAccountNumber();

                if (Objects.equals(selectedAccount, personAccount)) {

                    finalAccountNumber = personAccount;
                    accountNumber = i;

                }
            }

            // Si los números de cuenta coinciden, se suma la cantidad de dinero de la nómina al balance de la cuenta

            if (Objects.equals(selectedAccount, finalAccountNumber)) {

                int accountBalance = accounts[accountNumber].getBalance();

                accounts[accountNumber].setBalance(accountBalance + 1200);

                accountBalance = accounts[accountNumber].getBalance();

                System.out.println("Se han ingresado 1200€");

                System.out.println("El saldo de la cuenta es: " + accountBalance + "€");

            } else System.out.println("Número de cuenta inválido.");

        } else System.out.println("DNI inválido.");
    }

    // Recibir un pago en una cuenta -----------------------------------------------------------------------------------

    public static void receiveMoney(PersonaBanco[] persons, int numberOfPersons) {

        Scanner read = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("Escribe el DNI de la persona:");

        String selectedPersonDNI = read.nextLine();

        // Se crean las siguientes variables y se usa un for para recorrer el array de personas y comparar el DNI introducido con los guardados

        String personDNI;
        int personNumber = 0;
        String finalPersonDNI = "";

        for (int i = 0; i < numberOfPersons; i++) {

            personDNI = persons[i].getDni();

            if (Objects.equals(selectedPersonDNI, personDNI)) {

                finalPersonDNI = personDNI;
                personNumber = i;

            }
        }

        // Si los DNI coinciden, se pide y se comprueba el número de cuenta

        if (Objects.equals(selectedPersonDNI, finalPersonDNI)) {

            System.out.println(" ");

            System.out.println("Introduce el número de cuenta a ingresar:");

            String selectedAccount = read.nextLine();

            String personAccount;
            int accountNumber = 0;
            String finalAccountNumber = "";

            int numberOfAccounts = persons[personNumber].getNumberOfAccounts();

            Cuenta[] accounts = persons[personNumber].getAccounts();

            for (int i = 0; i < numberOfAccounts; i++) {

                personAccount = accounts[i].getAccountNumber();

                if (Objects.equals(selectedAccount, personAccount)) {

                    finalAccountNumber = personAccount;
                    accountNumber = i;

                }
            }

            // Si los números de cuenta coinciden, se pide una cantidad de dinero, y se suma al balance de la cuenta

            if (Objects.equals(selectedAccount, finalAccountNumber)) {

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

    // Realizar transferencia entre cuentas

    public static void transferMoney(PersonaBanco[] persons, int numberOfPersons) {

        Scanner read = new Scanner(System.in);

        System.out.println(" ");

        System.out.println("Escribe el DNI de la persona que va a recibir el dinero:");

        String selectedPersonDNI = read.nextLine();

        // Se pide el primer DNI, el de la persona a recibir dinero

        String personDNI;
        int personNumber = 0;
        String finalPersonDNI = "";

        for (int i = 0; i < numberOfPersons; i++) {

            personDNI = persons[i].getDni();

            if (Objects.equals(selectedPersonDNI, personDNI)) {

                finalPersonDNI = personDNI;
                personNumber = i;

            }
        }

        // Si el DNI coincide, se pide y se comprueba el número de cuenta

        if (Objects.equals(selectedPersonDNI, finalPersonDNI)) {

            System.out.println(" ");

            System.out.println("Introduce el número de cuenta que va a recibir el dinero:");

            String selectedAccount = read.nextLine();

            String personAccount;
            int accountNumber = 0;
            String finalAccountNumber = "";

            int numberOfAccounts = persons[personNumber].getNumberOfAccounts();

            Cuenta[] accounts = persons[personNumber].getAccounts();

            for (int i = 0; i < numberOfAccounts; i++) {

                personAccount = accounts[i].getAccountNumber();

                if (Objects.equals(selectedAccount, personAccount)) {

                    finalAccountNumber = personAccount;
                    accountNumber = i;

                }
            }

            // Si el número de cuenta coincide, se pide el DNI de la segunda persona, la que va a enviar el dinero

            if (Objects.equals(selectedAccount, finalAccountNumber)) {

                System.out.println(" ");

                System.out.println("Escribe el DNI de la persona que va a enviar el dinero:");

                String selectedPersonDNI2 = read.nextLine();

                String personDNI2;
                int personNumber2 = 0;
                String finalPersonDNI2 = "";

                for (int i = 0; i < numberOfPersons; i++) {

                    personDNI2 = persons[i].getDni();

                    if (Objects.equals(selectedPersonDNI2, personDNI2)) {

                        finalPersonDNI2 = personDNI2;
                        personNumber2 = i;

                    }
                }

                // Si coincide, igual que antes, se pide y se comprueba el número de cuenta del que sacar el dinero

                if (Objects.equals(selectedPersonDNI2, finalPersonDNI2)) {

                    System.out.println(" ");

                    System.out.println("Introduce el número de cuenta desde la que se va a enviar el dinero:");

                    String selectedAccount2 = read.nextLine();

                    String personAccount2;
                    int accountNumber2 = 0;
                    String finalAccountNumber2 = "";

                    int numberOfAccounts2 = persons[personNumber2].getNumberOfAccounts();

                    Cuenta[] accounts2 = persons[personNumber2].getAccounts();

                    for (int i = 0; i < numberOfAccounts2; i++) {

                        personAccount2 = accounts2[i].getAccountNumber();

                        if (Objects.equals(selectedAccount2, personAccount2)) {

                            finalAccountNumber2 = personAccount2;
                            accountNumber2 = i;

                        }
                    }

                    // Si coinciden, se pide la cantidad a sacar de la cuenta número 2, para ingresarla en la cuenta número 1

                    if (Objects.equals(selectedAccount2, finalAccountNumber2)) {

                        System.out.println(" ");

                        System.out.println("Introduce la cantidad a transferir:");

                        int quantity = read.nextInt();

                        int accountBalance = accounts[accountNumber].getBalance();

                        int account2Balance = accounts2[accountNumber2].getBalance();

                        // Se ingresa el dinero y se actualizan los valores para mostrarlos

                        accounts[accountNumber].setBalance(account2Balance - quantity);

                        accounts2[accountNumber2].setBalance(accountBalance + quantity);

                        accountBalance = accounts[accountNumber].getBalance();

                        account2Balance = accounts2[accountNumber2].getBalance();

                        System.out.println("Se han ingresado " + quantity + "€");

                        System.out.println("El saldo de la cuenta que ha recibido es: " + account2Balance + "€");

                        System.out.println("El saldo de la cuenta que ha enviado es: " + accountBalance + "€");

                    } else System.out.println("Número de cuenta inválido.");

                } else System.out.println("DNI inválido.");

            } else System.out.println("DNI inválido.");

        }
    }

    // Detectar e imprimir morosos

    public static void printDefaulters(PersonaBanco[] persons, int numberOfPersons){

        System.out.println(" ");

        boolean defaulter = false;

        int count = 0;

        // Recorre con un for anidado el array de personas, y posteriormente sus respectivas cuentas
        // Comprueba los balances de cada cuenta, y, de ser negativos, el DNI de la persona con la cuenta en negativo se imprime como moroso

        for (int i = 0; i < numberOfPersons; i++){

            Cuenta[] accounts = persons[i].getAccounts();

            int numberOfAccounts = persons[i].getNumberOfAccounts();

            String dni = persons[i].getDni();

            for (int j = 0; j < numberOfAccounts; j++) {

                int balance = accounts[j].getBalance();

                if (balance < 0){

                    defaulter = true;
                    count++;

                }
            }

            if (defaulter){

                System.out.println("La persona con el DNI " + dni + " es un/a moroso/a.");

                defaulter = false;

            }
        }
    }
}