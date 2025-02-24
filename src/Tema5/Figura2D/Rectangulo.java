package Tema5.Figura2D;

public class Rectangulo extends Figura2D{

    protected double sideA;
    private double sideB;

    public Rectangulo(double sideA, double sideB) {

        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public String toString() {

        return "Lado A: " + sideA + " Lado B: " + sideB;

    }

    @Override
    public double area(){

        return this.sideA * this.sideB;

    }

    @Override
    public double perimeter() {

        return this.sideA + this.sideA + this.sideB + this.sideB;

    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
