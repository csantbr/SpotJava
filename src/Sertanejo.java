import java.util.ArrayList;

public class Sertanejo extends Genero {
    
    public Sertanejo() {
        super();
        musicas = new ArrayList<Musica>();
        genero = "Sertanejo";
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
