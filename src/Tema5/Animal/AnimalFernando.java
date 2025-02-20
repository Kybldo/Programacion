package Tema5.Animal;

public class AnimalFernando extends Animal{

    public AnimalFernando() {
    }

    public AnimalFernando(String name) {
        super(name);
    }

    @Override
    public void hacerRuido() {

        System.out.println(" ");

        System.out.println("La vida termina a los 30 de todas formas");
        System.out.println("(" + this.name + " ha vuelto a ser pesimista)");

    }

    public void lionKiller(){

        System.out.println(" ");
        System.out.println("Se ha levantado de la silla y le ha hecho un mataleón a Aida");

    }

}
