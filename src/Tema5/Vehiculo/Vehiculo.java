package Tema5.Vehiculo;

public class Vehiculo {

    private String make;
    private String model;
    private int topSpeed;

    public Vehiculo() {

        this.make = "";
        this.model = "";
        this.topSpeed = 0;

    }

    public Vehiculo(String make, String model, int topSpeed) {

        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;

    }

    @Override
    public String toString() {

        return make + " " + model + ", Velocidad máxima: " + topSpeed + "hm/h.";

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
