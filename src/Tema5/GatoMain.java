package Tema5;

public class GatoMain {

    public static void main(String[] args) {

        Gato cat1 = new Gato();
        Gato cat2 = new Gato();

        try {

            cat1 = new Gato("Michael", 3);

        } catch (Exception ex) {

            System.out.println("Se han introducido incorrectamente la edad o el nombre.");

        } finally {

            System.out.println(cat1);

        }

        try {

            cat2 = new Gato("Ab", 7);

        } catch (Exception ex) {

            System.out.println("Se han introducido incorrectamente la edad o el nombre.");

        } finally {

            System.out.println(cat2);

        }

        try {

            cat1.setAge(-2);

        } catch (Exception ex) {

            System.out.println("Se han introducido incorrectamente la edad.");

        } finally {

            System.out.println(cat1.getAge());

        }

        try {

            cat2.setName("Pe");

        } catch (Exception ex) {

            System.out.println("Se han introducido incorrectamente el nombre.");

        } finally {

            System.out.println(cat2.getName());

        }

    }

}
