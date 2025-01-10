package Tema3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Tema3Ejercicio15 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Random roll = new Random();

        String[] mines = new String[20];

        Arrays.fill(mines, " ");

        scrambleMines(mines);



    }

    public static void scrambleMines(String[] mines) {

        Random roll = new Random();

        int minesPlaced = 0;

        while (minesPlaced < 6){

            int positionRoll = roll.nextInt(0, mines.length);

            if (Objects.equals(mines[positionRoll], " ")){

                mines[positionRoll] = "*";

                minesPlaced++;

            }

        }

    }

    public static void addNumbers(String[] mines){

        for (int i = 0; i < mines.length; i++){

            if (Objects.equals(mines[i], "*") && Objects.equals(mines[i--], " ") && Objects.equals(mines[i++], " ")){

                mines[i--] = "1";
                mines[i++] = "1";

            } else if (Objects.equals(mines[i], "*") && Objects.equals(mines[i--], "*") && Objects.equals(mines[i++], " ")) {

                mines[i--] = "1";
                mines[i++] = "0";

            } else if (Objects.equals(mines[i], "*") && Objects.equals(mines[i--], " ") && Objects.equals(mines[i++], "*")) {

                mines[i--] = "0";
                mines[i++] = "1";

            } else if (Objects.equals(mines[i], " ") && Objects.equals(mines[i--], "*") && Objects.equals(mines[i++], "*")) {

                mines[i] = "2";

            } else mines[i] = "0";

        }

    }

}
