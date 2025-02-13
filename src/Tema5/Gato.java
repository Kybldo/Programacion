package Tema5;

public class Gato {

    private String name;
    private int age;

    public Gato() {

        this.name = "Sweetpea";
        this.age = 0;

    }

    public Gato(String name, int age) throws Exception{
        this.setName(name);
        /*
        if (name.length() < 3){

            throw new Exception("El nombre no puede tener menos de tres carácteres.");

        } else this.name = name;

         */

        if (age < 0){

            throw new Exception("La edad no puede ser negativa.");

        } else this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{

        if (name.length() < 3){

            throw new Exception("El nombre no puede tener menos de tres carácteres.");

        } else this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{

        if (age < 0){

            throw new Exception("La edad no puede ser negativa.");

        } else this.age = age;

    }

    public String toString(){

        return name + " - Edad: " + age;

    }

}