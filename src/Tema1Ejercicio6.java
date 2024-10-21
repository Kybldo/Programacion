import java.util.Scanner;

public class Tema1Ejercicio6 {

    public static void  main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Introduce el radio de un círculo (se calculará el área):");

        double radio = read.nextDouble();

        double area = 3.14 * radio * radio;

        System.out.println("El área de tu círculo, basado en el radio, es: " + area + " metros cuadrados.");
    }
}
