package Tema5.AtaqueAvanzado;

public class AtaqueAvanzadoMain {

    public static void main(String[] args) {

        AtaqueBolaFuego fireball = new AtaqueBolaFuego("Bola de Fuego", 2, 4);
        AtaqueEspazado swordSwing = new AtaqueEspazado("Espadazo", 1, 2);
        AtaqueEspadazoEncantado enchantedSwing = new AtaqueEspadazoEncantado("Espadazo Encantado", 3, 4, 4, 6);

        System.out.println(" ");

        fireball.attack();
        fireball.seeCost();
        fireball.attackDealt();

        System.out.println(" ");

        swordSwing.attack();
        swordSwing.seeCost();
        swordSwing.attackDealt();

        System.out.println(" ");

        enchantedSwing.attack();
        enchantedSwing.seeCost();
        enchantedSwing.attackDealt();

    }

}
