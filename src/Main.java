import java.util.Map;
import java.util.Scanner;

public class Main {
    static String diretorio = "C:/Users/CAIO/Desktop/Musicas/";
    
    public static void main(String[] args) {        
        Scanner inpt = new Scanner(System.in, "latin1");
               
        System.out.println("Catalogando musicas...");
        
        MusicPlayer player = new MusicPlayer();
        player.listaMusicas(diretorio);
        
        System.out.println("Musicas Organizadas pelos Generos Disponiveis:");
        
        for (Map.Entry<String, Genero> entrada : player.generos.entrySet()) {
            System.out.println("Genero: " + entrada.getKey());
        }
        
        System.out.println("Digite o Genero desejado para carregar a lista de musica...");
        
        String generoDigitado = inpt.nextLine();
        
        System.out.println("Carregando lista de musicas...");
        
        Genero generoEscolhido = player.generos.get(generoDigitado);
        for (Musica musica : generoEscolhido.musicas) {
            System.out.println(musica.toString());
        }
        
        System.out.println("Digite o nome da musica para toca-la.");
        
        String nomeDaMusica = inpt.nextLine();
        
        Musica musicaEscolhida = new Musica();
        boolean achou = false;
        for (Musica musica : generoEscolhido.musicas) {
            if (musica.getNome().equals(nomeDaMusica)) {
                musicaEscolhida = musica;
                achou = true;
                break;
            }
        }
        
        if (achou) {
            musicaEscolhida.Tocar();
        }
    }
}
