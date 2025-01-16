package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio17 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[][] hotel = new int[12][5];

        int floor= 0;

        while (floor == 0 || floor > 20){

            System.out.println(" ");
            System.out.println("Introduce el número de la planta (1 - 12):");

            floor = read.nextInt();

            if (floor == 0 || floor > 12){

                System.out.println("Introduce un número válido.");
                System.out.println(" ");

            }

        }

        floor = 12 - floor;

        int room = 0;

        while (room == 0 || room > 20){

            System.out.println(" ");
            System.out.println("Introduce el número de la habitación (1 - 5):");

            room = read.nextInt();

            if (room == 0 || room > 5){

                System.out.println("Introduce un número válido.");
                System.out.println(" ");

            }

        }

        room--;

        int signal = 0;

        while (signal == 0 || signal > 6){

            System.out.println(" ");
            System.out.println("Introduce la intensidad del router (1 - 3):");

            signal = read.nextInt();

            if (signal == 0 || signal > 3){

                System.out.println("Introduce un número válido.");
                System.out.println(" ");

            }

        }

        hotel[floor][room] = signal;

        for (int i = 0; i < hotel.length; i++) {

            for (int j = 0; j < hotel[i].length; j++) {

                if (hotel[i][j] == signal){

                    // Horizontal
                    if (i != 0) hotel[i - 1][j ] = signal - 1;
                    if (i != hotel.length - 1) hotel[i + 1][j ] = signal - 1;
                    if (j != 0) hotel[i ][j - 1] = signal - 1;
                    if (j != hotel[i].length-1) hotel[i ][j + 1] = signal - 1;

                    // Diagonal y extensiones laterales

                    if (signal > 2){

                        //Esquina superior izquierda
                        if (i != 0 && j != 0) hotel[i - 1][j - 1] = signal - 2;
                        //Esquina inferior derecha
                        if (i != hotel.length - 1) hotel[i + 1][j + 1] = signal - 2;
                        //Esquina inferior izquierda
                        if (i != 0 && j != hotel.length) hotel[i + 1][j - 1] = signal - 2;
                        //Esquina superior derecha
                        if (i != hotel[i].length - 1 && i != 0) hotel[i - 1][j + 1] = signal - 2;

                        //Arriba
                        if (i != 0) hotel[i - 2][j ] = signal - 2;
                        //Abajo
                        if (i != hotel.length - 1) hotel[i + 2][j ] = signal - 2;
                        //Izquierda
                        if (j != 0) hotel[i ][j - 2] = signal - 2;
                        //Derecha
                        if (j != hotel[i].length-1) hotel[i ][j + 2] = signal - 2;

                    }

                }

            }

        }

        System.out.println(" ");
        MyMatrix.printMatrix(hotel);

        read.close();

    }

}
