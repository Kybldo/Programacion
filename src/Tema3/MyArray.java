package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {

    public static void main(String[] args) {

        /*

        int[] numbers = {1, 9, 3, 12, -3, 6};

        int[] numbers2 = {12, 24, 23};

        int[] numbers3 = {54, 25, 6};

        int[] capi = {1, 2, 3, 2, 1};

        int num = 3;

        printArray(numbers);

        System.out.println(arrayMax(numbers));

        System.out.println(arrayMin(numbers));

        System.out.println(arrayAvg(numbers));

        System.out.println(arrayCheck(numbers, num));

        System.out.println(Arrays.toString(arraySum(numbers2, numbers3)));

        System.out.println(Arrays.toString(arraySubtract(numbers2, numbers3)));

        System.out.println(Arrays.toString(arrayInvert(numbers)));

        procArrayInvert(numbers);

        System.out.println(arrayCapi(capi));

         */

        Scanner read = new Scanner(System.in);

        System.out.println("Selecciona un programa:");
        System.out.println(" ");
        System.out.println("1. Imprimir un array");
        System.out.println("2. Devolver valor máximo de un array");
        System.out.println("3. Devolver valor mínimo de un array");
        System.out.println("4. Devolver la media de los valores de un array");
        System.out.println("5. Comprobar si un elemento existe o no en un array");
        System.out.println("6. Sumar dos arrays");
        System.out.println("7. Restar dos arrays");
        System.out.println("8. Multiplicar dos arrays");
        System.out.println("9. Invertir el orden de un array");
        System.out.println("10. Invertir el orden de un array (pero este es un procedimiento)");
        System.out.println("11. Comprobar si un array es capicúa");

        System.out.println(" ");

        int selection = read.nextInt();

        switch (selection){

            case 1 -> {

                System.out.println("Vas a crear un array; introduce el número de elementos que quieres que tenga:");

                int userLength = read.nextInt();

                System.out.println(" ");

                int[] userArray = new int[userLength];

                for (int i = 0; i < userLength; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del array:");

                    userArray[i] = read.nextInt();

                }

                System.out.println(" ");

                printArray(userArray);

            }

            case 2 -> {

                System.out.println("Vas a crear un array; introduce el número de elementos que quieres que tenga:");

                int userLength = read.nextInt();

                System.out.println(" ");

                int[] userArray = new int[userLength];

                for (int i = 0; i < userLength; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del array:");

                    userArray[i] = read.nextInt();

                }

                System.out.println(" ");

                System.out.println("El número más alto del array es " + arrayMax(userArray));

            }

            case 3 -> {

                System.out.println("Vas a crear un array; introduce el número de elementos que quieres que tenga:");

                int userLength = read.nextInt();

                System.out.println(" ");

                int[] userArray = new int[userLength];

                for (int i = 0; i < userLength; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del array:");

                    userArray[i] = read.nextInt();

                }

                System.out.println(" ");

                System.out.println("El número más bajo del array es " + arrayMin(userArray));

            }

            case 4 -> {

                System.out.println("Vas a crear un array; introduce el número de elementos que quieres que tenga:");

                int userLength = read.nextInt();

                System.out.println(" ");

                int[] userArray = new int[userLength];

                for (int i = 0; i < userLength; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del array:");

                    userArray[i] = read.nextInt();

                }

                System.out.println(" ");

                System.out.println("La media de los elementos del array es " + arrayAvg(userArray));

            }

            case 5 -> {

                System.out.println("Vas a crear un array; introduce el número de elementos que quieres que tenga:");

                int userLength = read.nextInt();

                System.out.println(" ");

                int[] userArray = new int[userLength];

                for (int i = 0; i < userLength; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del array:");

                    userArray[i] = read.nextInt();

                }

                System.out.println(" ");

                System.out.println("Introduce el número que quieras comprobar:");

                int userCheck = read.nextInt();

                if (arrayCheck(userArray, userCheck)){

                    System.out.println("El número " + userCheck + " está en el array.");

                } else System.out.println("El número " + userCheck + " no está en el array.");

            }

            case 6 -> {

                System.out.println("Este programa necesita dos arrays. Los dos arrays tienen que ser del mismo tamaño.");

                System.out.println("Vas a crear el primer array; introduce el número de elementos que quieres que tenga:");

                int userLength1 = read.nextInt();

                System.out.println(" ");

                int[] userArray1 = new int[userLength1];

                for (int i = 0; i < userLength1; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del primer array:");

                    userArray1[i] = read.nextInt();

                }

                System.out.println(" ");

                // Se crea el segundo array ------------------------------------------------------------------------------------------

                System.out.println("Vas a crear el segundo array; introduce el número de elementos que quieres que tenga:");

                int userLength2 = read.nextInt();

                System.out.println(" ");

                int[] userArray2 = new int[userLength2];

                for (int i = 0; i < userLength2; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del segundo array:");

                    userArray2[i] = read.nextInt();

                }

                System.out.println(" ");

                System.out.println("La suma de los dos arrays resulta en:");
                System.out.println(Arrays.toString(arraySum(userArray1, userArray2)));

            }

            case 7 -> {

                System.out.println("Este programa necesita dos arrays. Los dos arrays tienen que ser del mismo tamaño.");

                System.out.println("Vas a crear el primer array; introduce el número de elementos que quieres que tenga:");

                int userLength1 = read.nextInt();

                System.out.println(" ");

                int[] userArray1 = new int[userLength1];

                for (int i = 0; i < userLength1; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del primer array:");

                    userArray1[i] = read.nextInt();

                }

                System.out.println(" ");

                // Se crea el segundo array ------------------------------------------------------------------------------------------

                System.out.println("Vas a crear el segundo array; introduce el número de elementos que quieres que tenga:");

                int userLength2 = read.nextInt();

                System.out.println(" ");

                int[] userArray2 = new int[userLength2];

                for (int i = 0; i < userLength2; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del segundo array:");

                    userArray2[i] = read.nextInt();

                }

                System.out.println(" ");

                System.out.println("La resta de los dos arrays resulta en:");
                System.out.println(Arrays.toString(arraySubtract(userArray1, userArray2)));

            }

            case 8 -> {

                System.out.println("Este programa necesita dos arrays. Los dos arrays tienen que ser del mismo tamaño.");

                System.out.println("Vas a crear el primer array; introduce el número de elementos que quieres que tenga:");

                int userLength1 = read.nextInt();

                System.out.println(" ");

                int[] userArray1 = new int[userLength1];

                for (int i = 0; i < userLength1; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del primer array:");

                    userArray1[i] = read.nextInt();

                }

                System.out.println(" ");

                // Se crea el segundo array ------------------------------------------------------------------------------------------

                System.out.println("Vas a crear el segundo array; introduce el número de elementos que quieres que tenga:");

                int userLength2 = read.nextInt();

                System.out.println(" ");

                int[] userArray2 = new int[userLength2];

                for (int i = 0; i < userLength2; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del segundo array:");

                    userArray2[i] = read.nextInt();

                }

                System.out.println(" ");

                System.out.println("La multiplicación de los dos arrays resulta en:");
                System.out.println(Arrays.toString(arrayMultiply(userArray1, userArray2)));

            }

            case 9 -> {

                System.out.println("Vas a crear un array; introduce el número de elementos que quieres que tenga:");

                int userLength = read.nextInt();

                System.out.println(" ");

                int[] userArray = new int[userLength];

                for (int i = 0; i < userLength; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del array:");

                    userArray[i] = read.nextInt();

                }

                System.out.println(" ");

                System.out.println("El array original es:");
                System.out.println(Arrays.toString(userArray));

                System.out.println(" ");

                System.out.println("El array invertido es:");
                System.out.println(Arrays.toString(arrayInvert(userArray)));

            }

            case 10 -> {

                System.out.println("Vas a crear un array; introduce el número de elementos que quieres que tenga:");

                int userLength = read.nextInt();

                System.out.println(" ");

                int[] userArray = new int[userLength];

                for (int i = 0; i < userLength; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del array:");

                    userArray[i] = read.nextInt();

                }

                System.out.println(" ");

                System.out.println("El array original es:");
                System.out.println(Arrays.toString(userArray));

                System.out.println(" ");

                System.out.println("El array invertido es:");
                procArrayInvert(userArray);

            }

            case 11 -> {

                System.out.println("Vas a crear un array; introduce el número de elementos que quieres que tenga:");

                int userLength = read.nextInt();

                System.out.println(" ");

                int[] userArray = new int[userLength];

                for (int i = 0; i < userLength; i++){

                    System.out.println("Introduce el valor del elemento " + i + " del array:");

                    userArray[i] = read.nextInt();

                }

                System.out.println(" ");

                if (arrayCapi(userArray)){

                    System.out.println("El array es capicúa.");

                } else System.out.println("El array no es capicúa.");

            }

        }

        read.close();

    }

    // A PARTIR DE AQUÍ FUNCIONES ---------------------------------------------------------------------------------------------------

    // a) Imprime el array
    public static void printArray(int[] array){

        System.out.println(Arrays.toString(array));

    }

    // b) Devuelve el máximo del array
    public static int arrayMax(int[] array){

        int result = array[0];

        for (int i : array) {

            if (i > result) {

                result = i;

            }

        }

        return result;

    }

    // c) Devuelve el mínimo del array
    public static int arrayMin(int[] array){

        int result = array[0];

        for (int i : array) {

            if (i < result) {

                result = i;

            }

        }

        return result;

    }

    // d) Devuelve la media del array
    public static double arrayAvg(int[] array){

        double result = 0;

        for (int i : array) {

            result += i;

        }

        result /= array.length;

        return result;

    }

    // e) Dice si un elemento está o no en el array
    public static boolean arrayCheck(int[] array, int num){

        boolean check = false;

        for (int i : array) {

            if (num == i) check = true;

        }

        return check;

    }

    // f) Suma dos arrays
    public static int[] arraySum(int[] array1, int[] array2){

        int[] arraySum = new int[array1.length];
        
        for (int i = 0; i < array1.length; i++){
            
            arraySum[i] = array1[i] + array2[i];
            
        }

        return arraySum;

    }

    // g) Resta dos arrays
    public static int[] arraySubtract(int[] array1, int[] array2){

        int[] arraySubtract = new int[array1.length];

        for (int i = 0; i < array1.length; i++){

            arraySubtract[i] = array1[i] - array2[i];

        }

        return arraySubtract;

    }

    // h) Qué coño es un producto escalar
    public static int[] arrayMultiply(int[] array1, int[] array2){

        int[] arrayMultiply = new int[array1.length];

        for (int i = 0; i < array1.length; i++){

            arrayMultiply[i] = array1[i] * array2[i];

        }

        return arrayMultiply;

    }

    // i) Invierte el orden de un array
    public static int[] arrayInvert(int[] array){

        int[] invertedArray = new int[array.length];

        for (int i = 0; i < array.length; i++){

            int num = array.length - i - 1;
            invertedArray[num] = array[i];

        }

        return invertedArray;

    }

    // j) La función de invertir ha vuelto, en forma de procedimiento
    public static void procArrayInvert(int[] array){

        int[] invertedArray = new int[array.length];

        for (int i = 0; i < array.length; i++){

            int num = array.length - i - 1;
            invertedArray[num] = array[i];

        }

        System.out.println(Arrays.toString(invertedArray));

    }

    // k) Dice si el array es capicúa
    public static boolean arrayCapi(int[] array){

        boolean capi = false;
        boolean notCapi = false;

        for (int i = 0; i < array.length; i++){

            int num = array.length - i - 1;

            if (array[num] == array[i]){

                capi = true;

            } else notCapi = true;

        }

        if (notCapi && capi) capi = false;

        return capi;

    }

}
