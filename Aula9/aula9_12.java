package Aulas.Aula9;
import java.util.Scanner;
enum Generos_Filmes{
    Terror, Drama, Romance, Acao, Ciencia, Comedia, Ficcao, Aventura;
}
public class aula9_12 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        Generos_Filmes[] disponiveis = Generos_Filmes.values();
        System.out.println("Os generos de filmes disponíveis são: ");
        for(Generos_Filmes itens : disponiveis) System.out.print(itens + " ");
        System.out.print("\nDigite qual é o índice do filme que você quer: ");
        int ind = reader.nextInt();
        ind--;
        Generos_Filmes genChose = Generos_Filmes.values()[ind];
        System.out.println("\nO gênero do filme escolhido foi: "+genChose);
        System.out.println("Recomendações: ");
        if(ind<3) System.out.println("Geralmente esses filmes não são recomendados para menores");
        else if(ind>4) System.out.println("Geralmente o público desse gênero de filme é livre");
        switch(genChose){
            case Acao:
                System.out.println("É recomendado que se pesquise sobre o filme para saber a recomendação");
                break;
            case Ciencia:
                System.out.println("É difícil de entender esse tipo de filme");
                break;
        }
    }
}
