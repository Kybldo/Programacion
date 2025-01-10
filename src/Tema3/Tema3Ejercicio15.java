package Tema3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Tema3Ejercicio15 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Random roll = new Random();

        int[] mines = new int[20];

        String[] minesFilled = new String[20];

        scrambleMines(mines);

        addNumbers(mines);

        intToString(mines, minesFilled);

        numToMines(minesFilled);

        System.out.println(Arrays.toString(minesFilled));

    }

    public static void scrambleMines(int[] mines) {

        Random roll = new Random();

        int minesPlaced = 0;

        while (minesPlaced < 6){

            int positionRoll = roll.nextInt(0, mines.length);

            if (mines[positionRoll] == 0){

                mines[positionRoll] = 7;

                minesPlaced++;

            }

        }

    }

    public static void addNumbers(int[] mines) {

        for (int i = 0; i < mines.length; i++) {

            if (i == 0){

                if (mines[i] == 7){

                    mines[i + 1]++;

                }

            } else if (i == 19) {

                if (mines[i] == 7 || mines[i] == 8){

                    mines[i - 1]++;

                }

            } else {

                if (mines[i] == 7 || mines[i] == 8){

                    mines[i + 1]++;
                    mines[i - 1]++;

                }

            }

        }

    }

    public static void intToString(int[] mines, String[] minesFilled){

        for (int i = 0; i < minesFilled.length; i++){

            int temp = 0;

            temp = Integer.parseInt(String.valueOf(mines[i]));

            minesFilled[i] = String.valueOf(temp);

        }

    }

    public static void numToMines(String[] minesFilled){

        for (int i = 0; i < minesFilled.length; i++){

            if (Objects.equals(minesFilled[i], "7") || Objects.equals(minesFilled[i], "8")){

                minesFilled[i] = "*";

            }

        }

    }

}