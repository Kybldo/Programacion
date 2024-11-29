package Tema3;

public class Utils {

    public static void main(String[] args) {

        double num = 1;
        double percentage = 21;

        System.out.println(getNetPrice(num, percentage));

    }

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

        while (num >= 0){

            while (num >= 2){

                mon2++;
                num -= 2;

            }

            while (num >= 1){

                mon1++;
                num -= 1;

            }

            while (num >= 0.99){

                mon50++;
                num -= 0.50;

            }

            while (num >= 0.49){

                mon20++;
                num -= 0.20;

            }

            while (num >= 0.19){

                mon10++;
                num -= 0.10;

            }

            while (num >= 0.04){

                mon5++;
                num -= 0.5;

            }

            while (num >= 0.03){

                mon2c++;
                num -= 0.2;

            }

            while (num == 0.01){

                mon1c++;
                num -= 0.1;

            }

        }

        System.out.println();

    }

}
