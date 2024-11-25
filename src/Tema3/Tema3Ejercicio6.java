package Tema3;

public class Tema3Ejercicio6 {

    public static void main(String[] args) {

        tables();

    }

    public static void tables(){

        int num;

        for (num = 1; num <= 10; num++){

            System.out.println(" ");
            System.out.println("Tabla del " + num);

            for (int i = 0; i <= 10; i++){

                System.out.println(num + " * " + i + " = " + (num * i));

            }

        }

    }

}
