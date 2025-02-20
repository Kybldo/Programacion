package Tema5.Animal;

public class AnimalPerro extends Animal {

    public AnimalPerro() {
    }

    public AnimalPerro(String name) {
        super(name);
    }

    @Override
    public void hacerRuido() {

        System.out.println(" ");

        System.out.println("Guau guau");
        System.out.println("(" + this.name + " ha ladrado)");

    }

    public void aullar(){

        System.out.println(" ");
        System.out.println("Awooooooooo");

    }

}
