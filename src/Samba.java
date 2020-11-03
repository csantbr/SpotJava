import java.util.ArrayList;

public class Samba extends Genero {

    public Samba() {
        super();
        musicas = new ArrayList<Musica>();
        genero = "Samba";
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
