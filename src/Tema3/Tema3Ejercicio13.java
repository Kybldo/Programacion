package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class Tema3Ejercicio13 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[] hotel = new int[20];

        int[] hotelTemp = new int[20];

        System.out.println("Introduce el número de la habitación (1 - 20):");

        int room = read.nextInt();

        room--;

        int roomTemp = room;

        int roomTemp2 = room;

        System.out.println("Introduce la intensidad del router (1 - 6):");

        int signal = read.nextInt();

        int signalTemp = signal;

        int signalTemp2 = signal;

        hotel[room] = signal;

        hotelTemp[room] = signal;

        for (int i = 0; i < signal; i++){

            hotel[room--] = signalTemp--;

        }

        //------------------------------------------------------------------------

        for (int i = 0; i < signal; i++){

            hotelTemp[roomTemp++] = signalTemp2--;

        }

        //------------------------------------------------------------------------

        int[] hotelFinal = new int[hotel.length];

        for (int i = 0; i < hotel.length; i++){

            hotelFinal[i] = hotel[i] + hotelTemp[i];

        }

        hotelFinal[roomTemp2] -= signal;

//        System.out.println(Arrays.toString(hotel));
//        System.out.println(Arrays.toString(hotelTemp));
        System.out.println(Arrays.toString(hotelFinal));

        read.close();

    }

}
