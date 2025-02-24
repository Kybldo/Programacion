package Tema5.Publicacion;

public class PublicacionMain {

    public static void main(String[] args) {

        PublicacionTexto texto = new PublicacionTexto("Encierren a Pau Albarracín");
        PublicacionFoto foto = new PublicacionFoto("Foto");
        PublicacionVideo video = new PublicacionVideo("Vídeo");

        System.out.println(" ");

        texto.Publish();
        texto.Share();
        texto.Comment();
        texto.ShareReact();

        System.out.println(" ");

        foto.Publish();
        foto.Share();
        foto.Open();
        foto.Comment();
        foto.ShareReact();

        System.out.println(" ");

        video.Publish();
        video.Share();
        video.Open();
        video.Comment();
        video.ShareReact();

    }

}
