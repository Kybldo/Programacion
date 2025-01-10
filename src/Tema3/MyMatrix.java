package Tema3;

import java.util.Arrays;

public class MyMatrix  {

    public static void main(String[] args) {

        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} };

        int[][] matrix2 = { {1, 2, 3}, {4, 5, 6} };

        int[][] matrix3 = {
                            {1, 0, 0, 0},
                            {0, 1, 0, 0},
                            {0, 0, 1, 0},
                            {0, 0, 0, 1} };

        printMatrix(matrix1);

        System.out.println(maxValue(matrix1));

        System.out.println(minValue(matrix1));

        System.out.println(avgValue(matrix1));

        int num = 4;

        System.out.println(doesItExist(matrix1, num));

        System.out.println(doesItRepeat(matrix1, num));

        // Como se pasan por referencia solo uno de estos dos puede funcionar al mismo tiempo

        System.out.println(Arrays.deepToString(sumMatrix(matrix1, matrix2)));

        System.out.println(Arrays.deepToString(subtractMatrix(matrix1, matrix2)));

        System.out.println(unidadMatrix(matrix3));

    }

    // Ejercicio 1 (Imprimir)

    public static void printMatrix(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]);

            }

            System.out.print("\n");

        }

        System.out.println(" ");

    }

    // Ejercicio 2 (Devuelve el máximo)

    public static int maxValue(int[][] matrix){

        int result = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > result) {

                    result = matrix[i][j];

                }

            }

        }

        return result;

    }

    // Ejercicio 3 (Devuelve el mínimo)

    public static int minValue(int[][] matrix){

        int result = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] < result) {

                    result = matrix[i][j];

                }

            }

        }

        return result;

    }

    // Ejercicio 4 (Devuelve la media)

    public static double avgValue(int[][] matrix){

        double result = 0;
        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                result += matrix[i][j];
                counter++;

            }

        }

        result /= counter;

        return result;

    }

    // Ejercicio 5 (Dice si un elemento existe)

    public static boolean doesItExist(int[][] matrix, int num){

        boolean exists = false;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (num == matrix[i][j]) exists = true;

            }

        }

        return exists;

    }

    // Ejercicio 6 (Dice cuantas veces se repite un elemento)

    public static int doesItRepeat(int[][] matrix, int num) {

        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (num == matrix[i][j]) counter++;

            }

        }

        return counter;

    }

    // Ejercicio 7 (Suma dos matrices)

    public static int[][] sumMatrix(int[][] matrix1, int[][] matrix2) {

        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1[i].length; j++) {

                matrix1[i][j] += matrix2[i][j];

            }

        }

        return matrix1;

    }

    // Ejercicio 8 (Resta dos matrices)

    public static int[][] subtractMatrix(int[][] matrix1, int[][] matrix2) {

        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1[i].length; j++) {

                matrix1[i][j] -= matrix2[i][j];

            }

        }

        return matrix1;

    }

    // Ejercicio 9 (Comprueba la matriz unidad)

    public static boolean unidadMatrix(int[][] matrix) {

        boolean unidad = false;
        int counter = 0;

        if (matrix[0].length == matrix[1].length && matrix[0].length == matrix[2].length && matrix[0].length == matrix[3].length){

            for (int i = 0; i < matrix.length; i++) {

                for (int j = 0; j < matrix[i].length; j++) {

                    if (matrix[i][j] == matrix[0][0]){

                        counter++;

                    }

                }

            }

            if (counter == matrix[0].length) unidad = true;

        }

        return unidad;

    }

}
