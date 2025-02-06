package Tema5;

public class UsuarioBanco {

    private String name;
    private String dni;
    private int age;

    public UsuarioBanco() {

        this.name = "";
        this.dni = "";
        this.age = 0;

    }

    public UsuarioBanco(String name, String dni, int age) {

        this.name = name;
        this.dni = dni;
        this.age = age;

    }

    public String toString(){

        return name + " - Edad: " + age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
