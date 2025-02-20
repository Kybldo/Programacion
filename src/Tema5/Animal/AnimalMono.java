package Tema5.Animal;

public class AnimalMono extends Animal {

    public AnimalMono() {
    }

    public AnimalMono(String name) {
        super(name);
    }

    @Override
    public void hacerRuido() {

        System.out.println(" ");

        System.out.println("U u a a");
        System.out.println("(" + this.name + " ha u u a ado)");

    }

    public void correrMuyVeloz(){

        System.out.println(" ");
        System.out.println("Tú no lo has visto, pero el monito ha corrido muy rápido");

    }

}
