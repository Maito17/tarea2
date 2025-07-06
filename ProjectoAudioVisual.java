
package projectoaudiovisual;

import java.util.ArrayList;
import java.util.List;
import projectoaudiovisual.uni1a.Actor;
import projectoaudiovisual.uni1a.ContenidoAudiovisual;
import projectoaudiovisual.uni1a.Cortometraje;
import projectoaudiovisual.uni1a.Documental;
import projectoaudiovisual.uni1a.Investigador;
import projectoaudiovisual.uni1a.Pelicula;
import projectoaudiovisual.uni1a.SerieDeTV;
import projectoaudiovisual.uni1a.Temporada;
import projectoaudiovisual.uni1a.VideoYouTube;


public class ProjectoAudioVisual {

   public static void main(String[] args) {
        System.out.println("Hola bienvenido a Apache NetBeans!");

        
        List<ContenidoAudiovisual> contenidos = new ArrayList<>();

        //parametros de la pelicula
        Pelicula pelicula1 = new Pelicula("Avatar", 2009, "Ciencia Ficción", "James Cameron", 162);
        Actor actor1 = new Actor("Santiago Campo", "USA");
        Actor actor2 = new Actor("Monica Acilvar", "Canada");
        pelicula1.agregarActor(actor1);
        pelicula1.agregarActor(actor2);
        contenidos.add(pelicula1);
        //parametro de Serietv
        SerieDeTV serie1 = new SerieDeTV("Game of Thrones", 2011, "Fantasía", 8) {};
        Temporada temp1 = new Temporada(1,10);
        Temporada temp2 = new Temporada(2,10);
        serie1.agregarTemporada(temp1);
        serie1.agregarTemporada(temp2);
        contenidos.add(serie1);
        //parametros de Documental
        Documental documental1 = new Documental("Cosmos: A Spacetime Odyssey", 2014, "Ciencia", "El Universo");
        Investigador inv1 = new Investigador("Carlos Sarango", "Ecuador");
        Investigador inv2 = new Investigador("Maria Gongora", "Colombia");
        documental1.agregarInvestigador(inv1);
        documental1.agregarInvestigador(inv2);
        contenidos.add(documental1);

        VideoYouTube youtubeVideo = new VideoYouTube("Introducion Django", 2023, "Educación", "https://www.youtube.com/watch?v=DjangoPrincipiantes", "CanalTech", 1800);
        contenidos.add(youtubeVideo);

        Cortometraje corto = new Cortometraje("Defendiendo al enemigo", 1939, "Animación", "BAron Rojo", 5, "Cannes Film Festival");
        contenidos.add(corto);


        System.out.println("\n--- Detalles de Contenidos Audiovisuales ---");
        
        for (ContenidoAudiovisual contenido : contenidos) {
            System.out.println(contenido); 
            contenido.reproducir();        
            System.out.println("--------------------");
        }
    }

    
}

    

