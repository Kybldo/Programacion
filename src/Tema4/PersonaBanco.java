package Tema4;

import java.util.Scanner;

public class PersonaBanco {

    private String dni;
    private Cuenta[] accounts = new Cuenta[3];
    private int numberOfAccounts = 0;

    // Constructores ---------------------------------------------------------------------------------------------------

    public PersonaBanco() {

        this.dni = "";

    }

    public PersonaBanco(String dni) {

        this.dni = dni;

    }

    // Operaciones -------------------------------------------------------------------------------------------------------

    public void addAccount(Cuenta account){

        if (this.numberOfAccounts < accounts.length){

            this.accounts[numberOfAccounts] = account;
            numberOfAccounts++;

        } else System.out.println("No se pueden añadir más cuentas a esta persona.");

    }

    public boolean defaulter(){
        
        boolean defaulter = false;
        
        for (int i = 0; i < numberOfAccounts; i++){
            
            if (this.accounts[i].getBalance() < 0){
                
                defaulter = true;
                
            } else defaulter = false;
            
        }
        
        return defaulter;
        
    }

    // Getters & setters -----------------------------------------------------------------------------------------------

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {

        if (dni.length() != 9){

            dni = "Inválido";

        }

        this.dni = dni;

    }

    public Cuenta[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Cuenta[] accounts) {
        this.accounts = accounts;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }
}
