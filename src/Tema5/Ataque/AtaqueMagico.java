package Tema5.Ataque;

public class AtaqueMagico implements IAtaque {

    private String name;
    private int costM;
    private int dmgValue;

    public AtaqueMagico(String name, int costM, int dmgValue) {

        this.name = name;
        this.costM = costM;
        this.dmgValue = dmgValue;

    }

    @Override
    public String toString() {

        return name + ", Coste: " + costM + ", Daño: " + dmgValue;

    }

    @Override
    public void attack() {

        System.out.println("¡Has usado " + name + "!");

    }

    @Override
    public void seeCost() {

        System.out.println(name + " tiene un coste mágico de " + costM + ".");

    }

    @Override
    public void attackDealt() {

        System.out.println(name + " causa " + dmgValue + " puntos de daño.");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostM() {
        return costM;
    }

    public void setCostM(int costM) {
        this.costM = costM;
    }

    public int getDmgValue() {
        return dmgValue;
    }

    public void setDmgValue(int dmgValue) {
        this.dmgValue = dmgValue;
    }
}
