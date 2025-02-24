package Tema5.Ataque;

public class AtaqueFisicoYMagico implements IAtaque {

    private String name;
    private int costF;
    private int costM;
    private int dmgValue;

    public AtaqueFisicoYMagico(String name, int costF, int costM, int dmgValue) {

        this.name = name;
        this.costF = costF;
        this.costM = costM;
        this.dmgValue = dmgValue;

    }

    @Override
    public String toString() {

        return name + ", Coste Físico: " + costF + ", Coste Mágico: " + costM + ", Daño: " + dmgValue;

    }

    @Override
    public void attack() {

        System.out.println("¡Has usado " + name + "!");

    }

    @Override
    public void seeCost() {

        System.out.println(name + " tiene un coste físico de " + costF + " y un coste mágico de " + costM + ".");

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
