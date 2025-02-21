package Tema5.Ficha;

public class FichaMain {

    public static void main(String[] args) {

        Ficha libro = new Libro("Apolinar vuelve a clase", 1, "Eric Montiel", "Caminos");
        Ficha revista = new Revista("Fernando al Día", 2, 5, 1987);
        Ficha dvd = new DVD("Lo que Poli se llevó", 3, "Aida León", 2025, DVD.Type.DOCUMENTARY);

        System.out.println(libro);
        System.out.println(revista);
        System.out.println(dvd);

    }

}
