package Tema5.Animal;

public class AnimalVaca extends Animal {

    public AnimalVaca() {
    }

    public AnimalVaca(String name) {
        super(name);
    }

    @Override
    public void hacerRuido() {

        System.out.println(" ");

        System.out.println("Moo moo");
        System.out.println("(" + this.name + " ha mooado)");

    }

    public void leche(){

        System.out.println(" ");
        System.out.println("Ha dao leche");

    }

}
