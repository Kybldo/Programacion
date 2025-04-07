package Tema7.Bloque3;

public class VideojuegoFisico extends Videojuego{

    private String physicalStore;
    private String status;

    public VideojuegoFisico(String title, String platform, int rating, String physicalStore, String status) {
        super(title, platform, rating);
        this.physicalStore = physicalStore;

        if (!status.equalsIgnoreCase("nuevo") && !status.equalsIgnoreCase("usado")) {

            status = "Nuevo";

        } else if (status.equalsIgnoreCase("nuevo")) {

            status = "Nuevo";

        } else status = "Usado";

        this.status = status;
    }

    public VideojuegoFisico() {
        this.physicalStore = "";
        this.status = "";
    }

    @Override
    public String getType() {
        return "Este juego es Físico.";
    }

    @Override
    public String toString() {
        return super.toString() + " - Tienda (Física): " + this.physicalStore + " - Estado: " + this.status + ".";
    }

    public String getPhysicalStore() {
        return physicalStore;
    }

    public void setPhysicalStore(String physicalStore) {
        this.physicalStore = physicalStore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
