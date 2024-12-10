package Tema3;

public class Utils {

    //Ejercicio 2

    //Pasa de millas a kilómetros
    public static double miles2Kilometers(double num){

        return num * 1.60934;

    }

    //Ejercicio 3

    //Calcula impuestos
    public static double getTaxes(double num, double percentage){

        double tax = percentage / 100;

        return num * tax;

    }

    //Ejercicio 4

    //Calcula impuestos, y devuelve el total
    public static double getNetPrice(double num, double percentage){

        double tax = percentage / 100;

        return num + (num * tax);

    }

    //Ejercicio 5

    //El enunciado es muy largo como para resumirlo aquí y que siga teniendo sentido
    public static int getCoins(double num){

        int mon2 = 0;
        int mon1 = 0;
        int mon50 = 0;
        int mon20 = 0;
        int mon10 = 0;
        int mon5 = 0;
        int mon2c = 0;
        int mon1c = 0;

        while (num >= 2){

            mon2++;
            num -= 2;

        }

        while (num >= 1){

            mon1++;
            num -= 1;

        }

        while (num >= 0.50){

            mon50++;
            num -= 0.50;

        }

        while (num >= 0.20){

            mon20++;
            num -= 0.20;

        }

        while (num >= 0.10){

            mon10++;
            num -= 0.10;

        }

        while (num >= 0.05){

            mon5++;
            num -= 0.05;

        }

        while (num >= 0.02){

            mon2c++;
            num -= 0.02;

        }

        while (num >= 0.01){

            mon1c++;
            num -= 0.01;

        }

        String mon2String = Integer.toString(mon2);
        String mon1String = Integer.toString(mon1);
        String mon50String = Integer.toString(mon50);
        String mon20String = Integer.toString(mon20);
        String mon10String = Integer.toString(mon10);
        String mon5String = Integer.toString(mon5);
        String mon2cString = Integer.toString(mon2c);
        String mon1cString = Integer.toString(mon1c);

        String result = mon2String + mon1String + mon50String + mon20String + mon10String + mon5String + mon2cString + mon1cString;

        return Integer.parseInt(result);

    }

    //Ejercicio 6

    //Calcula la letra del DNI (NIF) en base al número (DNI)
    public static char getNIF(int num){

        int operation = num % 23;

        char result = 0;

        switch (operation) {

            case 0 -> result = 'T';
            case 1 -> result = 'R';
            case 2 -> result = 'W';
            case 3 -> result = 'A';
            case 4 -> result = 'G';
            case 5 -> result = 'M';
            case 6 -> result = 'Y';
            case 7 -> result = 'F';
            case 8 -> result = 'P';
            case 9 -> result = 'D';
            case 10 -> result = 'X';
            case 11 -> result = 'B';
            case 12 -> result = 'N';
            case 13 -> result = 'J';
            case 14 -> result = 'Z';
            case 15 -> result = 'S';
            case 16 -> result = 'Q';
            case 17 -> result = 'V';
            case 18 -> result = 'H';
            case 19 -> result = 'L';
            case 20 -> result = 'C';
            case 21 -> result = 'K';
            case 22 -> result = 'E';

        }

        return result;

    }

    //Ejercicio 7

    //Dados un DNI y un NIF, te dice si la combinación es válida
    public static boolean isValidNIF(int num, char nif){

        int result = num % 23;

        char validate = getNIF(result);

        return validate == nif;

    }

    //Ejercicio 8

    //Basado en la franja de salario, determina el IRPF
    public static double calculateIRPF(int num){

        double irpf = num;

        if (num <= 12450){

            irpf *= 0.19;

        } else if (num <= 20199) {

            irpf *= 0.24;

        } else if (num <= 35199) {

            irpf *= 0.30;

        } else if (num <= 59999) {

            irpf *= 0.37;

        } else if (num <= 299999) {

            irpf *= 0.45;

        } else irpf *= 0.47;

        return irpf;

    }

}
