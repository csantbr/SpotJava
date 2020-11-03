import java.util.ArrayList;

public class Rock extends Genero {

    public Rock() {
        super();
        musicas = new ArrayList<Musica>();
        genero = "Rock";
    }
    
    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void addMusica(Musica musica) {
        musicas.add(musica);
    }

    public String toString() {
        return genero;
    }
    
}
