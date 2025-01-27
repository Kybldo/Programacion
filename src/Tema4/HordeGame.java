package Tema4;

import java.util.Random;

public class HordeGame {

    public static void main(String[] args) {

        // Importaciones

        Random roll = new Random();

        // Héroe y enemigos

        Hero hero = new Hero("Apolinar", 1, 100, 100, 0, 8, 5);

        Hero[] enemies = new Hero[3];

        enemies[0] = new Hero("Miguelito", 1, 15, 15, 0, 7, 5);
        enemies[1] = new Hero("Rebeca", 1, 20, 20, 0, 10, 6);
        enemies[2] = new Hero("Albarracín", 1, 10, 10, 0, 12, 4);

        // Variables

        int heroHealth = hero.getHealth();
        int enemy0Health;
        int enemy1Health;
        int enemy2Health;

        int enemy0MaxHealth = enemies[0].getMaxHealth();
        int enemy1MaxHealth = enemies[1].getMaxHealth();
        int enemy2MaxHealth = enemies[2].getMaxHealth();

        int horde = 0;
        int numberOfEnemies;
        int attackingEnemyNumber;

        while (heroHealth > 0){

            System.out.println(" ");

            // Aumentar número de horda y mostrar contador de hordas
            horde++;

            System.out.println("HORDA " + horde);

            // Elegir los enemigos que van a aparecer utilizando un random que toma la longitud del array de enemigos
            numberOfEnemies = roll.nextInt(enemies.length);

            switch (numberOfEnemies){

                case 0 -> {

                    System.out.println(" ");

                    System.out.println("¡Ha aparecido un enemigo!");

                    // Intento de escape
                    enemyFleeing(enemies[0]);

                    // Recuperar vida en caso de que haya escapado
                    enemy0Health = enemies[0].getHealth();

                    while (heroHealth > 0 && enemy0Health > 0){

                        // Ataque héroe
                        System.out.println(hero.attack(enemies[0]));

                        // Recuperar vida del enemigo para comprobar
                        enemy0Health = enemies[0].getHealth();

                        // Ataque enemigo

                        if (enemy0Health > 0){

                            System.out.println(enemies[0].attack(hero));
                        }

                        // Recuperar vida del héroe para comprobar
                        heroHealth = hero.getHealth();

                        // Recuperar vida máxima del enemigo para restaurarla más adelante
                        enemy0MaxHealth = enemies[0].getMaxHealth();

                        // Enseñar el estado de la pelea
                        printStats(hero);
                        printStats(enemies[0]);

                    }

                    // Devolver la vida al enemigo muerto para que pueda volver a pelear
                    enemies[0].setHealth(enemy0MaxHealth);

                }

                case 1 -> {

                    System.out.println(" ");

                    System.out.println("¡Han aparecido dos enemigos!");

                    // Intento de escape
                    enemyFleeing(enemies[0]);
                    enemyFleeing(enemies[1]);

                    // Recuperar vida en caso de que hayan escapado
                    enemy0Health = enemies[0].getHealth();
                    enemy1Health = enemies[1].getHealth();

                    while (heroHealth > 0 && enemy0Health > 0 || heroHealth > 0 && enemy1Health > 0){

                        // Ataque héroe
                        attackingEnemyNumber = rollAttackChoice1(enemies[0], enemies[1]);

                        System.out.println(hero.attack(enemies[attackingEnemyNumber]));

                        // Recuperar vida de los enemigos para comprobar
                        enemy0Health = enemies[0].getHealth();
                        enemy1Health = enemies[1].getHealth();

                        // Ataques enemigos
                        if (enemy0Health > 0){

                            System.out.println(enemies[0].attack(hero));
                        }

                        if (enemy1Health > 0){

                            System.out.println(enemies[1].attack(hero));
                        }

                        // Recuperar vida del héroe para comprobar
                        heroHealth = hero.getHealth();

                        // Recuperar vida máxima de los enemigos para restaurarla más adelante
                        enemy0MaxHealth = enemies[0].getMaxHealth();
                        enemy1MaxHealth = enemies[1].getMaxHealth();

                        // Enseñar el estado de la pelea
                        printStats(hero);
                        printStats(enemies[0]);
                        printStats(enemies[1]);

                    }

                    // Devolver la vida a los enemigos muertos para que puedan volver a pelear
                    enemies[0].setHealth(enemy0MaxHealth);
                    enemies[1].setHealth(enemy1MaxHealth);

                }

                case 2 -> {

                    System.out.println(" ");

                    System.out.println("¡Han aparecido tres enemigos!");

                    // Intento de escape
                    enemyFleeing(enemies[0]);
                    enemyFleeing(enemies[1]);
                    enemyFleeing(enemies[2]);

                    // Recuperar vida en caso de que hayan escapado
                    enemy0Health = enemies[0].getHealth();
                    enemy1Health = enemies[1].getHealth();
                    enemy2Health = enemies[2].getHealth();

                    while (heroHealth > 0 && enemy0Health > 0 || heroHealth > 0 && enemy1Health > 0 || heroHealth > 0 && enemy2Health > 0){

                        // Ataque héroe
                        attackingEnemyNumber = rollAttackChoice2(enemies[0], enemies[1], enemies[2]);

                        System.out.println(hero.attack(enemies[attackingEnemyNumber]));

                        // Recuperar vida de los enemigos para comprobar
                        enemy0Health = enemies[0].getHealth();
                        enemy1Health = enemies[1].getHealth();
                        enemy2Health = enemies[2].getHealth();

                        // Ataques enemigos
                        if (enemy0Health > 0){

                            System.out.println(enemies[0].attack(hero));
                        }

                        if (enemy1Health > 0){

                            System.out.println(enemies[1].attack(hero));
                        }

                        if (enemy2Health > 0){

                            System.out.println(enemies[2].attack(hero));
                        }

                        // Recuperar vida del héroe para comprobar
                        heroHealth = hero.getHealth();

                        // Recuperar vida máxima de los enemigos para restaurarla más adelante
                        enemy0MaxHealth = enemies[0].getMaxHealth();
                        enemy1MaxHealth = enemies[1].getMaxHealth();
                        enemy2MaxHealth = enemies[2].getMaxHealth();

                        // Enseñar el estado de la pelea
                        printStats(hero);
                        printStats(enemies[0]);
                        printStats(enemies[1]);
                        printStats(enemies[2]);

                    }

                    // Devolver la vida a los enemigos muertos para que puedan volver a pelear
                    enemies[0].setHealth(enemy0MaxHealth);
                    enemies[1].setHealth(enemy1MaxHealth);
                    enemies[2].setHealth(enemy2MaxHealth);

                }
            }

            // Condicional de resultado

            System.out.println(" ");

            if (heroHealth > 0){

                System.out.println("¡Has superado la horda número " + horde + "!");

                // Probabilidad de curarse con una poción
                potionEvent(hero);

                //Probabilidad de descansar
                restEvent(hero);

            } else {

                System.out.println("FIN DEL JUEGO");

                System.out.println(" ");

                System.out.println("Has sobrevivido " + horde + " hordas.");

            }

        }

    }

    // Determina a qué enemigo se va a atacar en la situación de que aparezcan dos enemigos
    public static int rollAttackChoice1(Hero enemy0, Hero enemy1){

        Random roll = new Random();

        int enemy0Health = enemy0.getHealth();
        int enemy1Health = enemy1.getHealth();

        int chance;

        // De estar alguno de los dos enemigos muertos, se seguirán generando aleatorios hasta que caiga en el enemigo al que se puede atacar
        do {

            chance = roll.nextInt(0, 2);

        } while (enemy0Health == 0 && chance == 0 || enemy1Health == 0 && chance == 1);

        return chance;

    }

    // Determina a qué enemigo se va a atacar en la situación de que aparezcan tres enemigos
    public static int rollAttackChoice2(Hero enemy0, Hero enemy1, Hero enemy2){

        Random roll = new Random();

        int enemy0Health = enemy0.getHealth();
        int enemy1Health = enemy1.getHealth();
        int enemy2Health = enemy2.getHealth();

        int chance;

        // De estar alguno de los tres enemigos muertos, se seguirán generando aleatorios hasta que caiga en un enemigo al que se puede atacar
        do {

            chance = roll.nextInt(0, 3);

        } while (enemy0Health == 0 && chance == 0 || enemy1Health == 0 && chance == 1 || enemy2Health == 0 && chance == 2);

        return chance;

    }

    // Determina si un enemigo huye de la pelea o no
    public static void enemyFleeing(Hero enemy){

        Random roll = new Random();

        String enemyName = enemy.getName();

        int chance = roll.nextInt(11);

        if (chance == 1){

            System.out.println(" ");

            System.out.println("¡" + enemyName + " ha escapado!");

            enemy.setHealth(0);

        }

    }

    // Determina si el héroe se toma o no la poción
    public static void potionEvent(Hero hero){

        Random roll = new Random();

        int chance = roll.nextInt(11);

        if (chance == 10){

            System.out.println(hero.drinkPotion());

        }

    }

    // Determina si el héroe descansa
    public static void restEvent(Hero hero){

        Random roll = new Random();

        int chance = roll.nextInt(101);

        if (chance == 100){

            System.out.println(hero.rest());

        }

    }

    // Imprime las estadísticas de los distintos personajes
    private static void printStats(Hero hero) {

        System.out.println(" ");

        System.out.println(hero);

    }

}
