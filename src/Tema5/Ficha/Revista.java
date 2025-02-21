package Tema5.Ficha;

public class Revista extends Ficha {

    private int publishing;
    private int year;

    public Revista(String title, int number, int publishing, int year) {

        super(title, number);
        this.publishing = publishing;
        this.year = year;

    }

    public Revista() {

        this.publishing = 0;
        this.year = 0;

    }

    @Override
    public String toString() {

        return super.toString() + " - Publicación: " + this.publishing + " Año: " + this.year;

    }

    public int getPublishing() {
        return publishing;
    }

    public void setPublishing(int publishing) {
        this.publishing = publishing;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
