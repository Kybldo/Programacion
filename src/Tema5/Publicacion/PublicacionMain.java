package Tema5.Publicacion;

public class PublicacionMain {

    public static void main(String[] args) {

        PublicacionTexto texto = new PublicacionTexto("Encierren a Pau Albarracín");
        PublicacionFoto foto = new PublicacionFoto("Foto");
        PublicacionVideo video = new PublicacionVideo("Vídeo");

        System.out.println(" ");

        texto.publish();
        texto.share();
        texto.comment();
        texto.shareReact();

        System.out.println(" ");

        foto.publish();
        foto.share();
        foto.open();
        foto.comment();
        foto.shareReact();

        System.out.println(" ");

        video.publish();
        video.share();
        video.open();
        video.comment();
        video.shareReact();

    }

}
