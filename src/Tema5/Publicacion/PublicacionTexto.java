package Tema5.Publicacion;

public class PublicacionTexto implements IPublicacion, IReaccion {

    private String content;

    public PublicacionTexto(String content) {

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
    public void comment() {

        System.out.println("Reaccionando, comentando: " + comment);

    }

    @Override
    public void shareReact() {

        System.out.println("Reaccionando, comentando: " + content);

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
