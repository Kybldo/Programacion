import java.util.Scanner;

public class Tema1Ejercicio8 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce un primer número entero:");
        int num = read.nextInt();

        System.out.println("Introduce un segundo número entero:");
        int num2 = read.nextInt();

        if (num == num2) {
            System.out.println(num + " y " + num2 + " son iguales.");
        } else if (num > num2) {
            System.out.println(num + " es mayor que " + num2 + ".");
        } else {
            System.out.println(num2 + " es mayor que " + num + ".");
        }
    }
}
