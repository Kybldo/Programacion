package Tema5.Animal;

public class AnimalMain {

    public static void main(String[] args) {

        Animal perro = new AnimalPerro("Benjamín");
        Animal gato = new AnimalGato("Michael");
        Animal vaca = new AnimalVaca("Jose Javier");
        Animal mono = new AnimalMono("El monito ese que corre muy rápido");
        Animal fernando = new AnimalFernando("Fernando");

        perro.hacerRuido();

        ((AnimalPerro) perro).aullar();

        gato.hacerRuido();

        ((AnimalGato) gato).bolaPelo();

        vaca.hacerRuido();

        ((AnimalVaca) vaca).leche();

        mono.hacerRuido();

        ((AnimalMono) mono).correrMuyVeloz();

        fernando.hacerRuido();

        ((AnimalFernando) fernando).lionKiller();

    }

}
