package Tema5.Vehiculo;

public class Ciclomotor extends Vehiculo {

    private int cc;

    public Ciclomotor(String make, String model, int topSpeed, int cc) {

        super(make, model, topSpeed);
        setCc(cc);

    }

    @Override
    public String toString() {

        return super.toString();

    }

    public boolean needsLicense(){

        return this.cc > 125;

    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {

        if (cc < 1) {

            System.out.println("Cilindrada inválida.");
            this.cc = 0;

        } else this.cc = cc;

    }
}
