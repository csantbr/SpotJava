import java.util.ArrayList;

public abstract class Genero {
    //Atributos
    protected ArrayList<Musica> musicas;
    protected String genero;
    public abstract ArrayList<Musica> getMusicas();

    //Método
    public abstract void addMusica(Musica musica);
}
