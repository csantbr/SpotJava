import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Musica implements Automatiza {
    //Atributos
    private String nome;
    private String autor;
    private String album;
    private String genero;
    private String diretorio;
    private File musica;
    private Player player;

    //Construtores
    public Musica() {}
    
    public Musica(String diretorio) {
        this.diretorio = diretorio;
        musica = new File(diretorio);
    }
	
    //Métodos
    public String getAlbum() {
        return (album != null) ? album : "-";
    }

    public String getNome() {
        return (nome != null) ? nome : "-";
    }

    public String getGenero() {
        return (genero != null) ? genero : "-";
    }
    
    public void carregaMusica() throws IOException, JavaLayerException, UnsupportedTagException, InvalidDataException {
        Mp3File mp3file = new Mp3File(musica);

        if(mp3file.hasId3v1Tag()) {
            ID3v1 id3v1Tag = mp3file.getId3v1Tag();
            nome = id3v1Tag.getTitle();
            autor = id3v1Tag.getArtist();
            album = id3v1Tag.getAlbum();
            genero = id3v1Tag.getGenreDescription();
        }
        
        if(mp3file.hasId3v2Tag()) {
            ID3v2 id3v2Tag = mp3file.getId3v2Tag();
            nome = id3v2Tag.getTitle();
            autor = id3v2Tag.getArtist();
            album = id3v2Tag.getAlbum();
            genero = id3v2Tag.getGenreDescription();
        }
        
        FileInputStream stream = new FileInputStream(musica);
        BufferedInputStream buffer = new BufferedInputStream(stream);
        this.player = new Player(buffer);
    }

    public void Tocar() {
        try {
            System.out.println("Tocando a musica " + nome + " do autor " + autor);
            player.play();
            System.out.println("Reprodução finalizada!");
        } catch (Exception e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

    public String toString() {
        return " Nome: " + nome + " / Autor: " + autor + " / Album: " + album + " / Genero: " + genero;
    }
}
