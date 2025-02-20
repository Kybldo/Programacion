package Tema5.Vehiculo;

public class Camiones extends Vehiculo {

    private int weight;
    private boolean dangerousLoad;

    public Camiones(String make, String model, int topSpeed, int weight, boolean dangerousLoad) {

        super(make, model, topSpeed);
        setWeight(weight);
        this.dangerousLoad = dangerousLoad;

    }

    @Override
    public String toString() {

        return super.toString();

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {

        if (weight < 0){

            System.out.println("Peso inválido.");
            this.weight = 0;

        } else this.weight = weight;

    }

    public boolean isDangerousLoad() {
        return dangerousLoad;
    }

    public void setDangerousLoad(boolean dangerousLoad) {
        this.dangerousLoad = dangerousLoad;
    }
}
