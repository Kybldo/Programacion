package Tema5.Animal;

public class Animal {

    public String name;

    public Animal() {

        this.name = "";

    }

    public Animal(String name) {

        this.name = name;

    }

    public void comer(){

        System.out.println(" ");

        System.out.println("Ñom ñom ñom");
        System.out.println("(" + this.name + " se lo ha comido todo)");

    }

    public void dormir(){

        System.out.println(" ");

        System.out.println("Snort snort mimimimimi");
        System.out.println("(" + this.name + " ha caído en coma)");

    }

    public void hacerRuido(){

        System.out.println(" ");

        System.out.println("El estado del mercado inmobiliario es deplorable");
        System.out.println("(" + this.name + " ha dicho verdades como puños)");

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
