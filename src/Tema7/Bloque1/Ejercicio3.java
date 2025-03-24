package Tema7.Bloque1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {

        File fileUser = new File("C:/Users/ericm/IdeaProjects/Programacion/usuario.txt");

        String[] userInfo = Files.readAllLines(fileUser.toPath()).toArray(new String[0]);

        int wordcount = 0;

        for (int i = 0; i < userInfo.length; i++){

            String ayuda = userInfo[i];

            wordcount += ayuda.split("\\s").length;

        }

        System.out.println("Total de palabras del fichero: " + wordcount);

    }

}
