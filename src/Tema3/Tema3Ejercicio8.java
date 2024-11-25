package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio8 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        int month = 0;
        int day = 0;
        int year;

        System.out.println("Introduce un año:");

        year = read.nextInt();

        while (month == 0 || month > 12){

            System.out.println(" ");
            System.out.println("Introduce un mes:");

            month = read.nextInt();

            System.out.println(" ");
            if (month == 0 || month > 12) System.out.println("Introduce un mes válido.");

        }

        while (day == 0 || day > 31){

            System.out.println("Introduce un día:");

            day = read.nextInt();

            System.out.println(" ");
            if (day == 0 || day > 31) System.out.println("Introduce un día válido.");

        }

        System.out.println(day + " del " + month + " de " + year);
        System.out.println(" ");

        boolean result = dateValid(month, day, year);

        if (result){

            System.out.println("La fecha es válida.");

        } else System.out.println("La fecha no es válida.");

        read.close();

    }

    public static boolean dateValid(int month, int day, int year){

        boolean valid = false;
        
        if (month == 2 && day > 0 && day <= 29 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

            valid = true;
            
        } else if (month == 2 && day > 0 && day <= 28) {

            valid = true;

        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && day > 0 && day <= 31){
            
            valid = true;
            
        } else if (month == 4 || month == 6 || month == 9 || month == 11 && day > 0 && day <= 30) {

            valid = true;
            
        }

        return valid;

    }

}
