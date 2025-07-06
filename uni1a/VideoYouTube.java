
package projectoaudiovisual.uni1a;


public class VideoYouTube extends ContenidoAudiovisual {
    private String url;
    private String canal;
    private int duracionSegundos;

    public VideoYouTube(String titulo, int anioLanzamiento, String genero, String url, String canal, int duracionSegundos) {
        super(titulo, anioLanzamiento, genero);
        this.url = url;
        this.canal= canal;
        this.duracionSegundos = duracionSegundos;
    }
    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url= url;
    }
    public String getCanal(){
        return canal;
    }
    public void setCanal(){
        this.canal = canal;
    }
    public int getDuracionSegundos(){
        return duracionSegundos;
    }
    public void setDuracionSegundos(int duracionSegundos){
        this.duracionSegundos = duracionSegundos;
    }
    @Override
    public void reproducir(){
        System.out.println("Abriendo video de YouTube: " + titulo + " en " + url);
    }
    public String toString(){
        return "Video YouTube: " + super.toString() + ", URL: " + url + ", Canal: " + canal + ", Duración: " + duracionSegundos + "s";
    }
}
