package Tema5.AtaqueAvanzado;

public class AtaqueEspadazoEncantado implements IAtaqueAvanzado {

    private String name;
    private int costF;
    private int costM;
    private int dmgValueF;
    private int dmgValueM;

    public AtaqueEspadazoEncantado(String name, int costF, int costM, int dmgValueF, int DmgValueM) {

        this.name = name;
        this.costF = costF;
        this.costM = costM;
        this.dmgValueF = dmgValueF;
        this.dmgValueM = DmgValueM;

    }

    @Override
    public String toString() {

        return name + ", Coste Físico: " + costF + ", Coste Mágico: " + costM + ", Daño Físico: " + dmgValueF + ", Daño Mágico: " + dmgValueM + ".";

    }


    @Override
    public void attack() {

        System.out.println("¡Has usado " + name + "!");

    }

    @Override
    public void seeCost() {

        System.out.println(name + " un coste físico de " + costF + " y un coste mágico de " + costM + ".");

    }

    @Override
    public void attackDealt() {

        System.out.println(name + " causa " + dmgValueF + " puntos de daño físico y " + dmgValueM + " puntos de daño mágico.");

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

    public int getDmgValueF() {
        return dmgValueF;
    }

    public void setDmgValueF(int dmgValueF) {
        this.dmgValueF = dmgValueF;
    }

    public int getDmgValueM() {
        return dmgValueM;
    }

    public void setDmgValueM(int dmgValueM) {
        this.dmgValueM = dmgValueM;
    }
}
