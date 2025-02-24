package Tema5.Ataque;

public class AtaqueFisico implements IAtaque {

    private String name;
    private int costF;
    private int dmgValue;

    public AtaqueFisico(String name, int costF, int dmgValue) {

        this.name = name;
        this.costF = costF;
        this.dmgValue = dmgValue;

    }

    @Override
    public String toString() {

        return name + ", Coste: " + costF + ", Daño: " + dmgValue;

    }

    @Override
    public void attack() {

        System.out.println("¡Has usado " + name + "!");

    }

    @Override
    public void seeCost() {

        System.out.println(name + " tiene un coste físico de " + costF + ".");

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

    public int getCostF() {
        return costF;
    }

    public void setCostF(int costF) {
        this.costF = costF;
    }

    public int getDmgValue() {
        return dmgValue;
    }

    public void setDmgValue(int dmgValue) {
        this.dmgValue = dmgValue;
    }

}
