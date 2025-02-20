package Tema5.Vehiculo;

import java.util.ArrayList;

public class VehiculoMain {

    public static void main(String[] args) {

        ArrayList<Vehiculo> vehicleList = new ArrayList<>();

        vehicleList.add(new Turismo("Hyundai", "i30", 250, "profesional", 5));
        vehicleList.add(new Camiones("BrumBrum", "Camioncito", 30, 600, true));
        vehicleList.add(new Ciclomotor("Motillo", "950S", 340, 15));

        System.out.println( ((Turismo)vehicleList.getFirst()).getSeats() );

        for (Vehiculo vehicle : vehicleList){

            System.out.println("________________________________________________________________");

            System.out.println(" ");

            System.out.println(vehicle.getMake() + " " + vehicle.getModel());

            if (vehicle instanceof Turismo){

                System.out.println(" ");

                System.out.print("Número de asientos: ");
                System.out.println(((Turismo) vehicle).getSeats());

            } else if (vehicle instanceof Camiones){

                System.out.println(" ");

                System.out.print("Peso: ");
                System.out.println(((Camiones) vehicle).getWeight());

                System.out.println(" ");

                System.out.print("Mercancía peligrosa: ");
                System.out.println(((Camiones) vehicle).isDangerousLoad());

            } else if (vehicle instanceof Ciclomotor) {

                System.out.println(" ");

                System.out.print("Cilindrada: ");
                System.out.println(((Ciclomotor) vehicle).getCc());

                System.out.println(" ");

                System.out.print("Necesita carnet: ");
                System.out.println(((Ciclomotor) vehicle).needsLicense());

            }

        }

    }

}
