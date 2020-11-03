import java.util.ArrayList;

public class Pop extends Genero {
    
    public Pop() {
        super();
        musicas = new ArrayList<Musica>();
        genero = "Pop";
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
