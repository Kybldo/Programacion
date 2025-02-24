package Tema5.Vehiculo;

import java.util.Objects;

public class Turismo extends Vehiculo {

    private String useCase;
    private int seats;

    public Turismo(String make, String model, int topSpeed, String useCase, int seats) {

        super(make, model, topSpeed);
        setUseCase(useCase);
        setSeats(seats);

    }

    @Override
    public String toString() {

        return super.toString();

    }

    public String getUseCase() {
        return useCase;
    }

    public void setUseCase(String useCase) {

        if (!Objects.equals(useCase, "profesional") && !Objects.equals(useCase, "particular")){

            System.out.println("Ana ayuda");
            this.useCase = "profesional";

        } else this.useCase = useCase;

    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {

        if (seats < 1){

            System.out.println("Número de asientos inválidos.");
            this.seats = 1;

        } else this.seats = seats;

    }
}
