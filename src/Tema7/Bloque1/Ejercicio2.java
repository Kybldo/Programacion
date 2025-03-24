package Tema7.Bloque1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Ejercicio2 {

    public static void main(String[] args) throws IOException {

        File fileUser = new File("C:/Users/ericm/IdeaProjects/Programacion/usuario.txt");

        String[] userInfo = Files.readAllLines(fileUser.toPath()).toArray(new String[0]);

        System.out.println(userInfo[0]);
        System.out.println(userInfo[1]);

    }

}
