import java.util.Scanner;

public class Tema1Ejercicio7 {

    public static void  main(String[] args) {

        Scanner read = new Scanner(System.in);

        boolean flag = false;

        int num = 0;

        int num2 = 0;

        System.out.println("Introduce un número del 1 al 6 (es un dado):");

        do {
            num = read.nextInt();

            if (num < 1 || num > 6){
                System.out.println("Introduce un número válido.");
            } else flag = true;

            switch (num) {
                case 1 -> {
                    num2 = 6;
                }
                case 2 -> {
                    num2 = 5;
                }
                case 3 -> {
                    num2 = 4;
                }
                case 4 -> {
                    num2 = 3;
                }
                case 5 -> {
                    num2 = 2;
                }
                case 6 -> {
                    num2 = 1;
                }
            }
          } while (!flag);

        System.out.println("La cara de tu dado es " + num + ", y su cara contraría sería " + num2 + ".");
    }
}