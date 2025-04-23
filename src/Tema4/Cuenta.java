package Tema4;

public class Cuenta {

    private String accountNumber;
    private int balance;

    // Constructores ---------------------------------------------------------------------------------------------------

    public Cuenta() {

        this.accountNumber = "";
        this.balance = 0;

    }

    public Cuenta(String accountNumber, int balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    // Operaciones -------------------------------------------------------------------------------------------------------

    public String toString(){

        return "Número de cuenta: " + this.accountNumber + " - Saldo de la cuenta: " + this.balance;

    }

    public void checkBalance(){

        System.out.println("El saldo de la cuenta es: " + this.balance);

    }

    public void receiveMoney(int receivedAmount){

        this.balance += receivedAmount;

        System.out.println("Se han ingresado " + receivedAmount + "€ en la cuenta. El saldo de tu cuenta es ahora " + this.balance + "€.");

    }

    public void payReceipt(int receiptAmount){

        if (this.balance > receiptAmount){

            this.balance -= receiptAmount;

            System.out.println("Se ha pagado un recibo con el valor de " + receiptAmount + ". El saldo de tu cuenta es ahora " + this.balance + "€.");

        } else System.out.println("La cuenta no tiene el saldo suficiente para pagar este recibo.");

    }

    // Getters & setters -----------------------------------------------------------------------------------------------

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
