package Tema5.Ficha;

public class Libro extends Ficha {

    public String author;
    public String editorial;

    public Libro(String title, int number, String author, String editorial) {

        super(title, number);
        this.author = author;
        this.editorial = editorial;

    }

    public Libro() {

        this.author = "";
        this.editorial = "";

    }

    @Override
    public String toString() {

        return super.toString() + " - Autor: " + this.author + " Editorial: " + this.editorial;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
