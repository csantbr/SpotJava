import java.util.ArrayList;

public class Eletrônica extends Genero {

    public Eletrônica() {
        super();
        musicas = new ArrayList<Musica>();
        genero = "Eletrônica";
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
