package Tema5.Publicacion;

public class PublicacionVideo implements IPublicacion, IAbrirPublicacion, IReaccion {

    private String content;

    public PublicacionVideo(String content) {

        this.content = content;

    }

    @Override
    public String toString() {

        return content;

    }

    @Override
    public void publish() {

        System.out.println("Publicando: " + content);

    }

    @Override
    public void share() {

        System.out.println("Compartiendo: " + content);

    }

    @Override
    public void open() {

        System.out.println("Abriendo: " + content);

    }

    @Override
    public void comment() {

        System.out.println("Reaccionando, comentando: " + comment);

    }

    @Override
    public void shareReact() {

        System.out.println("Reaccionando, compartiendo: " + content);

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
