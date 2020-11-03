import java.util.ArrayList;


public class Desconhecido extends Genero {

    public Desconhecido() {
        musicas = new ArrayList<Musica>();
        genero = "";
    }
    
    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void addMusica(Musica musica) {
        musicas.add(musica);
    }

    public String toString() {
        return "Desconhecido";
    }
}