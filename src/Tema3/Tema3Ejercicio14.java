package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema3Ejercicio14 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("PAREJAS");
        System.out.println("A, B, C, D, E, F, G, H, I, J");

        char[] pairs = new char[20];

        pairs = assignA(pairs);
        pairs = assignB(pairs);
        pairs = assignC(pairs);
        pairs = assignD(pairs);
        pairs = assignE(pairs);
        pairs = assignF(pairs);
        pairs = assignG(pairs);
        pairs = assignH(pairs);
        pairs = assignI(pairs);
        pairs = assignJ(pairs);

        System.out.println(Arrays.toString(pairs));

    }

    public static char[] assignA(char[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign = 0;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (pairs[assign] == ' '){

                pairs[assign] = 'A';

                count--;

            }

        }

        return pairs;

    }

    public static char[] assignB(char[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign = 0;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (pairs[assign] == ' '){

                pairs[assign] = 'B';

                count--;

            }

        }

        return pairs;

    }

    public static char[] assignC(char[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign = 0;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (pairs[assign] == ' '){

                pairs[assign] = 'C';

                count--;

            }

        }

        return pairs;

    }

    public static char[] assignD(char[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign = 0;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (pairs[assign] == ' '){

                pairs[assign] = 'D';

                count--;

            }

        }

        return pairs;

    }

    public static char[] assignE(char[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign = 0;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (pairs[assign] == ' '){

                pairs[assign] = 'E';

                count--;

            }

        }

        return pairs;

    }

    public static char[] assignF(char[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign = 0;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (pairs[assign] == ' '){

                pairs[assign] = 'F';

                count--;

            }

        }

        return pairs;

    }

    public static char[] assignG(char[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign = 0;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (pairs[assign] == ' '){

                pairs[assign] = 'G';

                count--;

            }

        }

        return pairs;

    }

    public static char[] assignH(char[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign = 0;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (pairs[assign] == ' '){

                pairs[assign] = 'H';

                count--;

            }

        }

        return pairs;

    }

    public static char[] assignI(char[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign = 0;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (pairs[assign] == ' '){

                pairs[assign] = 'I';

                count--;

            }

        }

        return pairs;

    }

    public static char[] assignJ(char[] pairs){

        Random roll = new Random();

        int count = 2;
        int assign = 0;

        while (count > 0){

            assign = roll.nextInt(0, 19);

            if (pairs[assign] == ' '){

                pairs[assign] = 'J';

                count--;

            }

        }

        return pairs;

    }

}
