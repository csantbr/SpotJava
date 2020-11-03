import java.util.ArrayList;

public class Forró extends Genero {

    public Forró() {
        super();
        musicas = new ArrayList<Musica>();
        genero = "Funk";
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
