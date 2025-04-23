package Tema4;

public class Hero {

    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    private final static int potionHeal = 10;
    private final static int restHeal = 50;
    private final static int earnExperience = 10;

    private final static int lvlUpHealth = 5;
    private final static int lvlUpAttack = 1;
    private final static int lvlUpDefense = 1;

    public Hero() {

        this.name = "";
        this.level = 0;
        this.health = 0;
        this.maxHealth = 0;
        this.experience = 0;
        this.attack = 0;
        this.defense = 0;

    }

    public Hero(String name, int level, int health, int maxHealth, int experience, int attack, int defense) {

        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;

    }

    // Operaciones

    public String toString(){

        return this.name + " Nivel: " + this.level + " (Experiencia: " + this.experience + "/50)" + " Vida: " + this.health + " (Máxima: " + this.maxHealth + ") Ataque: " + this.attack + " Defensa: " + this.defense;

    }

    public String drinkPotion(){

        System.out.println("__________________________________________________");
        System.out.println(" ");

        int rest = 0;

        if (this.health == this.maxHealth){

            return this.name + " ha encontrado una poción, pero ya tiene la vida al máximo.";

        } else {

            this.health += potionHeal;

            if (this.health > this.maxHealth) {

                rest = this.health - this.maxHealth;

                this.health = this.maxHealth;

            }

            return this.name + " se ha bebido una poción y ha recuperado " + (potionHeal - rest) + " puntos de salud.";

        }
    }

    public String rest(){

        System.out.println("__________________________________________________");
        System.out.println(" ");

        int rest = 0;

        if (this.health == this.maxHealth){

            return this.name + " tiene la vida al máximo, pero se ha sentado a descansar igualmente.";

        } else {

            this.health += restHeal;

            if (this.health > this.maxHealth) {

                rest = this.health - this.maxHealth;

                this.health = this.maxHealth;

            }

            return this.name + " ha descansado y ha recuperado " + (restHeal - rest) + " puntos de salud.";

        }
    }

    public String attack(Hero hero1){

        System.out.println("__________________________________________________");
        System.out.println(" ");

        System.out.println("¡" + this.name + " ataca a " + hero1.name + "!");

        int attackCalc = Math.max(1, this.attack - hero1.defense);

        hero1.health -= attackCalc;

        if (hero1.health < 0) hero1.setHealth(0);

        this.experience += earnExperience;

        if (this.experience % 50 == 0) levelUp();

        System.out.println(" ");

        return hero1.name + " ha recibido " + attackCalc + " puntos de daño.";

    }

    public void levelUp(){

        System.out.println(" ");

        this.level++;

        this.health += lvlUpHealth;
        this.maxHealth += lvlUpHealth;
        this.attack += lvlUpAttack;
        this.defense += lvlUpDefense;

        this.experience -= this.experience;

        System.out.println("¡" + this.name + " ha subido de nivel! " + this.name + " es ahora nivel " + this.level + ".");

    }

    // Getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {

        if (this.level < 0){

            this.level = 0;

        }

        this.level = level;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {

        if (this.health < 0){

            this.health = 0;

        }

        this.health = health;

    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {

        if (this.maxHealth < 0){

            this.maxHealth = 0;

        }

        this.maxHealth = maxHealth;

    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {

        if (this.experience < 0){

            this.experience = 0;

        }


        this.experience = experience;

    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {

        if (this.attack < 0){

            this.attack = 0;

        }

        this.attack = attack;

    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {

        if (this.defense < 0){

            this.defense = 0;

        }

        this.defense = defense;

    }
}
