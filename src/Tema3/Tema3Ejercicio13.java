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

        System.out.println("Introduce la intensidad del router (1 - 6):");

        int signal = read.nextInt();

        int signalTemp = signal;

        int signalTemp2 = signal;

        hotel[room] = signal;

        hotelTemp[room] = signal;


        for (int i = room; i >= 0 && signalTemp > 0; i--){

            hotel[room--] = signalTemp--;

        }
        //------------------------------------------------------------------------

        for (int i = roomTemp; i < hotel.length && signalTemp2 > 0; i++){

            hotel[roomTemp++] = signalTemp2--;

        }

        System.out.println(Arrays.toString(hotel));

        read.close();

    }

}
