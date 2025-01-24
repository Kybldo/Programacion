package Tema4;

public class Persona {

    private final static String dni = "45274853H";
    private String name;
    private String surnames;
    private int age;
    private final static int adultAge = 18;
    private final static int retiredAge = 65;

    public Persona() {

        this.name = "";
        this.surnames = "";
        this.age = 0;

    }

    public Persona(String dni, String name, String surnames, int age) {

        this.name = name;
        this.surnames = surnames;
        this.age = age;
        
    }

    public String getDni() {

        return dni;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getSurnames() {

        return surnames;

    }

    public void setSurnames(String surnames) {

        this.surnames = surnames;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        if (this.age < 0) {

            this.age = 0;

        }

        this.age = age;

    }

    public String toString(){

        return print();

    }

    public String print(){

        return name + " " + surnames + ", Edad: " + age + " años, DNI: " + dni;

    }

    public String isAdult(){

        if (this.age >= adultAge){

            return "Es un adulto/a.";

        } else return "No es un adulto/a.";

    }

    public String isRetired(){

        if (this.age >= retiredAge){

            return "Está jubilado/a.";

        } else return "No está jubilado/a.";

    }

    public String ageDifference(Persona persona){

        int difference;

        if (persona.age > this.age){

            difference = persona.age - this.age;

        } else difference = this.age - persona.age;

        return "Tienen " + difference + " años de diferencia.";

    }
    
    public static String checkDNI(){

        String dniNumbersString = dni.substring(0,8);

        char dniLetter = dni.charAt(8);

        int dniNumbers = Integer.parseInt(dniNumbersString);

        int dniCheck = dniNumbers % 23;

        if (dniCheck == 0 && dniLetter == 'T'){

            return "El DNI es válido.";

        } else if (dniCheck == 1 && dniLetter == 'R') {

            return "El DNI es válido.";

        } else if (dniCheck == 2 && dniLetter == 'W') {

            return "El DNI es válido.";

        } else if (dniCheck == 3 && dniLetter == 'A') {

            return "El DNI es válido.";

        } else if (dniCheck == 4 && dniLetter == 'G') {

            return "El DNI es válido.";

        } else if (dniCheck == 5 && dniLetter == 'M') {

            return "El DNI es válido.";

        } else if (dniCheck == 6 && dniLetter == 'Y') {

            return "El DNI es válido.";

        } else if (dniCheck == 7 && dniLetter == 'F') {

            return "El DNI es válido.";

        } else if (dniCheck == 8 && dniLetter == 'P') {

            return "El DNI es válido.";

        } else if (dniCheck == 9 && dniLetter == 'D') {

            return "El DNI es válido.";

        } else if (dniCheck == 10 && dniLetter == 'X') {

            return "El DNI es válido.";

        } else if (dniCheck == 11 && dniLetter == 'B') {

            return "El DNI es válido.";

        } else if (dniCheck == 12 && dniLetter == 'N') {

            return "El DNI es válido.";

        } else if (dniCheck == 13 && dniLetter == 'J') {

            return "El DNI es válido.";

        } else if (dniCheck == 14 && dniLetter == 'Z') {

            return "El DNI es válido.";

        } else if (dniCheck == 15 && dniLetter == 'S') {

            return "El DNI es válido.";

        } else if (dniCheck == 16 && dniLetter == 'Q') {

            return "El DNI es válido.";

        } else if (dniCheck == 17 && dniLetter == 'V') {

            return "El DNI es válido.";

        } else if (dniCheck == 18 && dniLetter == 'H') {

            return "El DNI es válido.";

        } else if (dniCheck == 19 && dniLetter == 'L') {

            return "El DNI es válido.";

        } else if (dniCheck == 20 && dniLetter == 'C') {

            return "El DNI es válido.";

        } else if (dniCheck == 21 && dniLetter == 'K') {

            return "El DNI es válido.";

        } else if (dniCheck == 22 && dniLetter == 'E') {

            return "El DNI es válido.";

        } else return "El DNI es inválido.";
    }

}
