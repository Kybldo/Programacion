package Tema5.Ficha;

public class Ficha {

    private String title;
    private int number;

    public Ficha(String title, int number) {

        this.title = title;
        this.number = number;

    }

    public Ficha() {

        this.title = "";
        this.number = 0;

    }

    @Override
    public String toString() {

        return "Título: " + this.title + ", Número: " + this.number;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
