package Tema5.AtaqueAvanzado;

public class AtaqueEspazado implements IAtaqueAvanzado {

    private String name;
    private int cost;
    private int dmgValue;

    public AtaqueEspazado(String name, int cost, int dmgValue) {

        this.name = name;
        this.cost = cost;
        this.dmgValue = dmgValue;
    }

    @Override
    public String toString() {

        return name + ", Coste Físico: " + cost + ", Daño Físico: " + dmgValue + ".";

    }


    @Override
    public void attack() {

        System.out.println("¡Has usado " + name + "!");

    }

    @Override
    public void seeCost() {

        System.out.println(name + " un coste mágico de " + cost);

    }

    @Override
    public void attackDealt() {

        System.out.println(name + " causa " + dmgValue + " puntos de daño físico.");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDmgValue() {
        return dmgValue;
    }

    public void setDmgValue(int dmgValue) {
        this.dmgValue = dmgValue;
    }

}
