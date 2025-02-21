package Tema5.Figura2D;

public class Triangulo extends Figura2D{

    private double ladoA;
    private double ladoB;
    private double base;
    private double altura;

    public Triangulo(double ladoA, double ladoB, double base, double altura) {

        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.base = base;
        this.altura = altura;

    }

    @Override
    public String toString() {

        return "Lado A: " + this.ladoA + " Lado B: " + this.ladoB + " Base: " + this.base + " Altura: " + this.altura;

    }

    @Override
    public double area(){

        return (this.base * this.altura) / 2;

    }

    @Override
    public double perimeter() {

        return this.ladoA + this.ladoB + this.base;

    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
