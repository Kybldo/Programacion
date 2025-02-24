package Tema5.Publicacion;

public class PublicacionFoto implements IPublicacion, IAbrirPublicacion, IReaccion {

    private String content;

    public PublicacionFoto(String content) {

        this.content = content;

    }

    @Override
    public String toString() {

        return content;

    }

    @Override
    public void Publish() {

        System.out.println("Publicando: " + content);

    }

    @Override
    public void Share() {

        System.out.println("Compartiendo: " + content);

    }

    @Override
    public void Open() {

        System.out.println("Abriendo: " + content);

    }

    @Override
    public void Comment() {

        System.out.println("Reaccionando, comentando: " + comment);

    }

    @Override
    public void ShareReact() {

        System.out.println("Reaccionando, compartiendo: " + content);

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
