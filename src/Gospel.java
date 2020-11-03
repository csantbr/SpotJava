import java.util.ArrayList;

public class Gospel extends Genero {

    public Gospel() {
        super();
        musicas = new ArrayList<Musica>();
        genero = "Gospel";
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
