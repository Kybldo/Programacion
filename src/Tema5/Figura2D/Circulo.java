package Tema5.Figura2D;

public class Circulo extends Figura2D {

    private double radius;

    public Circulo(double radius) {

        this.radius = radius;

    }

    @Override
    public String toString() {

        return "Radio: " + this.radius;

    }

    @Override
    public double area(){

        return 3.14 * (radius * radius);

    }

    @Override
    public double perimeter() {

        return 2 * 3.14 * radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
