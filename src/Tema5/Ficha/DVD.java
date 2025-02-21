package Tema5.Ficha;

public class DVD extends Ficha {

    public enum Type {

        ANIMATION, ACTION, DOCUMENTARY, SCIENCE_FICTION

    }

    private String director;
    private int year;
    private Type type;

    public DVD(String title, int number, String director, int year, Type type) {

        super(title, number);
        this.director = director;
        this.year = year;
        this.type = type;

    }

    public DVD() {

        this.director = "";
        this.year = 0;
        this.type = Type.ANIMATION;

    }

    @Override
    public String toString() {

        return super.toString() + " - Director: " + this.director + " Año: " + this.year + " Tipo: " + type;

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
