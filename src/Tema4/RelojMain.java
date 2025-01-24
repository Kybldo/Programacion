package Tema4;

public class RelojMain {

    public static void main(String[] args) {

        Reloj reloj = new Reloj(15, 23, 34);

        reloj.setFormat(12);
        int format = reloj.getFormat();

        System.out.println(reloj);

    }

}
