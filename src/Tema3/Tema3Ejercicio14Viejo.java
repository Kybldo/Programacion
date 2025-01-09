package Tema3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Tema3Ejercicio14Viejo {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("PAREJAS");
        System.out.println("AA, BB, CC, DD, EE, FF, GG, HH, II, JJ");

        String[] pairs = new String[20];

        Arrays.fill(pairs," ");

        assignA(pairs);
        assignB(pairs);
        assignC(pairs);
        assignD(pairs);
        assignE(pairs);
        assignF(pairs);
        assignG(pairs);
        assignH(pairs);
        assignI(pairs);
        assignJ(pairs);

        System.out.println(Arrays.toString(pairs));

        String[] board = Arrays.copyOf(pairs, 20);

        System.out.println(Arrays.toString(board));

    }

    // Funciones --------------------------------------------------------

    public static String[] assignA(String[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (Objects.equals(pairs[assign], " ")){

                pairs[assign] = "AA";

                count--;

            }

        }

        return pairs;

    }

    public static String[] assignB(String[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (Objects.equals(pairs[assign], " ")){

                pairs[assign] = "BB";

                count--;

            }

        }

        return pairs;

    }

    public static String[] assignC(String[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (Objects.equals(pairs[assign], " ")){

                pairs[assign] = "CC";

                count--;

            }

        }

        return pairs;

    }

    public static String[] assignD(String[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (Objects.equals(pairs[assign], " ")){

                pairs[assign] = "DD";

                count--;

            }

        }

        return pairs;

    }

    public static String[] assignE(String[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (Objects.equals(pairs[assign], " ")){

                pairs[assign] = "EE";

                count--;

            }

        }

        return pairs;

    }

    public static String[] assignF(String[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (Objects.equals(pairs[assign], " ")){

                pairs[assign] = "FF";

                count--;

            }

        }

        return pairs;

    }

    public static String[] assignG(String[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (Objects.equals(pairs[assign], " ")){

                pairs[assign] = "GG";

                count--;

            }

        }

        return pairs;

    }

    public static String[] assignH(String[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (Objects.equals(pairs[assign], " ")){

                pairs[assign] = "HH";

                count--;

            }

        }

        return pairs;

    }

    public static String[] assignI(String[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (Objects.equals(pairs[assign], " ")){

                pairs[assign] = "II";

                count--;

            }

        }

        return pairs;

    }

    public static String[] assignJ(String[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (Objects.equals(pairs[assign], " ")){

                pairs[assign] = "JJ";

                count--;

            }

        }

        return pairs;

    }

}
