package Tema7.Bloque3;

import java.io.Serializable;

abstract class Videojuego implements Serializable {

    private String title;
    private String platform;
    private int rating;

    public Videojuego(String title, String platform, int rating) {
        this.title = title;
        this.platform = platform;
        this.rating = rating;
    }

    public Videojuego() {
        this.title = "";
        this.platform = "";
        this.rating = 0;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Título: " + this.title + ", Plataforma: " + this.platform + ", Nota: " + this.rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
