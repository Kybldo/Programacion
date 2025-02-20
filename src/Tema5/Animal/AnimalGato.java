package Tema5.Animal;

public class AnimalGato extends Animal {

    public AnimalGato() {
    }

    public AnimalGato(String name) {
        super(name);
    }

    @Override
    public void hacerRuido() {

        System.out.println(" ");

        System.out.println("Miau miau");
        System.out.println("(" + this.name + " ha maullado)");

    }

    public void bolaPelo(){

        System.out.println(" ");
        System.out.println("GRUACK-");
        System.out.println("GUCK-");
        System.out.println("GUCK-");
        System.out.println("GUSÇJHK-");
        System.out.println("(Ha vomitao)");

    }

}
