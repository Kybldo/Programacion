package Tema2;

public class Tema2Ejercicio21 {

    public static void main(String[] args){

        //Declarado el int para futuros cálculos.
        int suma = 0;

        //Se cuentan los pares y se suman consecutivamente.
        for (int i = 0; i <= 1000; i = i + 2){
            suma = suma + i;
        }

        //Se muestra el resultado.
        System.out.println(suma);
    }

}
