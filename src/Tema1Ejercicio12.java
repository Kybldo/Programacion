import java.util.Scanner;

public class Tema1Ejercicio12 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un año para saber si es bisiesto:");
        int num = read.nextInt();

        if (num % 4 == 0){
            System.out.println("El año " + num + " es bisiesto.");
        } else System.out.println("El año " + num + " no es bisiesto.");
    }
}
