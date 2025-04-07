package Tema7.Bloque3;

public class VideojuegoDigital extends Videojuego{

    private String onlineStore;
    private double sizeGB;

    public VideojuegoDigital(String title, String platform, int rating, String onlineStore, double sizeGB) {
        super(title, platform, rating);
        this.onlineStore = onlineStore;
        this.sizeGB = sizeGB;
    }

    public VideojuegoDigital() {
        this.onlineStore = "";
        this.sizeGB = 0;
    }

    public VideojuegoDigital(String onlineStore, double sizeGB) {
        this.onlineStore = onlineStore;
        this.sizeGB = sizeGB;
    }

    @Override
    public String getType() {
        return "Este juego es Digital.";
    }

    @Override
    public String toString() {
        return super.toString() + ", Tienda (Online): " + this.onlineStore + ", Tamaño: " + this.sizeGB + "GB.";
    }

    public String getOnlineStore() {
        return onlineStore;
    }

    public void setOnlineStore(String onlineStore) {
        this.onlineStore = onlineStore;
    }

    public double getSizeGB() {
        return sizeGB;
    }

    public void setSizeGB(double sizeGB) {
        this.sizeGB = sizeGB;
    }
}
