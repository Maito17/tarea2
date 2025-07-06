
package projectoaudiovisual.uni1a;


public class Cortometraje extends ContenidoAudiovisual{
    private String directorCorto;
    private int duracionMinutos;
    private String festivalGanado;
    
    public Cortometraje(String titulo, int anioLanzamiento, String genero, String directorCorto, int duracionMinutos, String festivalGanado){
        super(titulo, anioLanzamiento, genero);
        this.directorCorto = directorCorto;
        this.duracionMinutos = duracionMinutos;
        this.festivalGanado = festivalGanado;
    }
    public String getDirectorCorto(){
        return directorCorto;
       
    }
    public void setDirectorCorto(String directorCorto){
        this.directorCorto = directorCorto;
    }
    public int getDuracionMinutos(){
        return duracionMinutos;
    }
    public void setDuracionMinutos(){
        this.duracionMinutos = duracionMinutos;
    }
    public String getFestivalGanado(){
        return festivalGanado;
    }
    public void setFestivalGanado(){
        this.festivalGanado = festivalGanado;
    }
    @Override
    public void reproducir(){
        System.out.println("Reproduciendo el cortometraje: " + titulo + " (Dirigido por: " + directorCorto + ")");
    }
    public String toString(){
        return "Cortometraje: " + super.toString() + ", Director: " + directorCorto + ", Duración: " + duracionMinutos + " min, Festival: " + festivalGanado; 
    }
}
