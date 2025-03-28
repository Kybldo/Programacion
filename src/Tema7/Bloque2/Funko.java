package Tema7.Bloque2;

import java.io.Serializable;

public class Funko implements Serializable {

    private String code;
    private String name;
    private String model;
    private double price;
    private String releaseDate;

    public Funko(String code, String name, String model, double price, String releaseDate) {
        this.code = code;
        this.name = name;
        this.model = model;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public Funko() {

        this.code = "";
        this.name = "";
        this.model = "";
        this.price = 0;
        this.releaseDate = "";

    }

    @Override
    public String toString() {

        return "■ " + this.code + ", Nombre: " + this.name + ", Modelo: " + this.model + ", Precio: " + this.price + ", Fecha Lanzamiento: " + this.releaseDate;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
