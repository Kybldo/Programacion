package Tema3;

public class MyString {

    public static void main(String[] args) {

        String test1 = "Ayuda";

        System.out.println(invertToUpper(test1));

    }

    public static String invertToUpper(String string){

        String newString = "";

        for (int i = string.length() -1; i >= 0; i--){

            newString = newString + string.charAt(i);

        }

        return newString.toUpperCase();

    }

}
