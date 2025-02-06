package Tema5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gimnasio {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Map<String, Usuario> users = new HashMap<>();

        Usuario user1 = new Usuario("Eric", 23);

        String dni = "20973509Q";

        users.put(dni, user1);

        String key = read.nextLine();

        if (users.containsKey(key)){

            System.out.println("Está en el mapa");

            System.out.println(users.get(key).getAge());

        } else System.out.println("No está en el mapa");

    }

    public static void addUser(Map<String, Usuario> users){



    }

}
