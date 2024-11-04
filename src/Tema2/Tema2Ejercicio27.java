package Tema2;

public class Tema2Ejercicio27 {

    public static void main(String[] args){

        //Se inicializan las variables para contadores y cálculos.
        int calc;
        int count = 0;
        boolean primo;
        int num = 1;

        //El bucle imprimirá 20 números.
        while (count < 20){

            num++;

            primo = false;

            //Se comprueba si el número es o no primo.
            for (int i = 2; i < num; i++){
                calc = num % i;

                if (calc == 0){
                    primo = true;
                }
            }

            //Se muestra el resultado.
            if (!primo){
                System.out.println(num);
                count++;
            }
        }
    }
}
