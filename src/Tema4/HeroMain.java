package Tema4;

public class HeroMain {

    public static void main(String[] args) {

        Hero hero1 = new Hero("Marcos", 1, 100, 100, 0, 15, 5);
        Hero hero2 = new Hero("Christian", 1, 80, 80, 0, 20, 4);

        printStats(hero1, hero2);

        System.out.println(hero2.rest());

        System.out.println(hero1.attack(hero2));

        System.out.println(hero2.drinkPotion());

        System.out.println(hero1.attack(hero2));
        System.out.println(hero1.attack(hero2));
        System.out.println(hero1.attack(hero2));
        System.out.println(hero1.attack(hero2));


        System.out.println(" ");

        printStats(hero1, hero2);

    }

    private static void printStats(Hero hero1, Hero hero2) {

        System.out.println(" ");

        System.out.println(hero1);
        System.out.println(hero2);

    }

}
