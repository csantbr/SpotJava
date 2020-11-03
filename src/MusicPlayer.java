import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MusicPlayer {

    //Atributos
    final Map<String, Genero> generos = new HashMap<String, Genero>();
    
    //Construtores
    public MusicPlayer() {
        generos.put("Rock", new Rock());
        generos.put("Sertanejo", new Sertanejo());
        generos.put("Pop", new Pop());
        generos.put("Eletrônica", new Eletrônica());
        generos.put("Gospel", new Gospel());
        generos.put("Forró", new Forró());
        generos.put("Samba", new Samba());
        generos.put("Funk", new Funk());
        generos.put("Desconhecido", new Desconhecido());
    }
    
    //Métodos
    public void listaMusicas(String dir) {
        File file = new File(dir);

        for (File arquivo : file.listFiles()) {
            if (arquivo.isDirectory()) {
                listaMusicas(arquivo.getAbsolutePath());
                continue;
            }
            
            Musica musica = new Musica(arquivo.getAbsolutePath());
            try {
                musica.carregaMusica();
            } catch (Exception e) {
                System.out.println("Erro ao carregar a musica! " + arquivo.getAbsolutePath());
                e.printStackTrace();
            }
            
            boolean achouGenero = false;
            for (String key : generos.keySet()) {
                if (musica.getGenero().contains(key)) {
                    generos.get(key).addMusica(musica);
                    achouGenero = true;
                    break;
                }
            }
            
            if (!achouGenero) {
                generos.get("Desconhecido").musicas.add(musica);
            }
        }
    }
}
