package Tema5.Ataque;

public class AtaqueMain {

    public static void main(String[] args) {

        AtaqueFisico punch = new AtaqueFisico("Puñetazo", 1, 2);
        AtaqueMagico burn = new AtaqueMagico("Chamuscar", 2, 5);
        AtaqueFisicoYMagico firePunch = new AtaqueFisicoYMagico("Puñetazo de fuego", 3, 4, 10);

        System.out.println(" ");

        punch.attack();
        punch.seeCost();
        punch.attackDealt();

        System.out.println(" ");

        burn.attack();
        burn.seeCost();
        burn.attackDealt();

        System.out.println(" ");

        firePunch.attack();
        firePunch.seeCost();
        firePunch.attackDealt();

    }

}
