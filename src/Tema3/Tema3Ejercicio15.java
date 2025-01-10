package Tema3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Tema3Ejercicio15 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[] mines = new int[20];

        String[] minesFilled = new String[20];

        String[] board = new String[20];

        Arrays.fill(board, "■");

        scrambleMines(mines);

        addNumbers(mines);

        intToString(mines, minesFilled);

        numToMines(minesFilled);

        String[] copyWinDisplay = Arrays.copyOf(minesFilled, 20);

        int moves = 0;
        boolean bomb = false;

        System.out.println("¡Evita las minas!");

        while (moves < 14 && !bomb){

            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println(" ");
            System.out.println("Introduce un número (1 - 20) para desvelar qué hay en esa posición:");
            System.out.println(" ");
            System.out.println(Arrays.toString(board));
            System.out.println(" ");

            int selection = 0;

            while (selection == 0 || selection > 20){

                selection  = read.nextInt();

                if (selection == 0 || selection > 20){

                    System.out.println("Introduce un número válido.");
                    System.out.println(" ");

                }

            }

            selection--;

            if (check(minesFilled, board, selection)){

                bomb = true;

            } else {

                uncheck(minesFilled, board, selection);
                moves++;

            }

        }

        System.out.println(" ");

        if (bomb) {

            System.out.println("¡Has pisado una mina!");

        } else {

            System.out.println(Arrays.toString(copyWinDisplay));
            System.out.println(" ");
            System.out.println("¡Has ganado!");

        }

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

                if (mines[i] == 7 || mines[i] == 8 || mines[i] == 9){

                    mines[i + 1]++;
                    mines[i - 1]++;

                }

            }

        }

    }

    public static void intToString(int[] mines, String[] minesFilled){

        for (int i = 0; i < minesFilled.length; i++){

            int temp;

            temp = Integer.parseInt(String.valueOf(mines[i]));

            minesFilled[i] = String.valueOf(temp);

        }

    }

    public static void numToMines(String[] minesFilled){

        for (int i = 0; i < minesFilled.length; i++){

            if (Objects.equals(minesFilled[i], "7") || Objects.equals(minesFilled[i], "8") || Objects.equals(minesFilled[i], "9")){

                minesFilled[i] = "*";

            }

        }

    }

    public static boolean check(String[] minesFilled, String[] board, int num) {

        boolean bomb = false;

        String tempPairs1 = minesFilled[num]; //a
        String tempPairs2 = board[num]; //b

        minesFilled[num] = board[num]; //a = 1
        board[num] = tempPairs1; //1 = a

        minesFilled[num] = board[num]; //b = 2
        board[num] = tempPairs2; //2 = b

        if (Objects.equals(minesFilled[num], "*")) {

            bomb = true;

        }

        return bomb;

    }

    public static void uncheck(String[] minesFilled, String[] board, int num) {

        String tempPairs1 = minesFilled[num]; //a

        minesFilled[num] = board[num]; //a = 1
        board[num] = tempPairs1; //1 = a

    }

}