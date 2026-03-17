package Aulas.Aula8.Matrizes;
import java.util.Scanner;
public class Ex50 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        float[][] matriz = new float[4][3];
        float ac = 0, maiorMedia=0, media = 0;
        int melhorAluno = 0;
        for(int l = 0; l<matriz.length; l++){
            ac = 0;
            for(int k = 0; k<matriz[l].length; k++){
                do{
                    System.out.printf("\nDigite a %d° para o aluno %d\n", (k+1), (l+1));
                    matriz[l][k] = reader.nextFloat();
                }while(matriz[l][k] > 10 || matriz[l][k] < 0);
                ac += matriz[l][k];
            }
            media = ac/3;
            if(media>maiorMedia){
                maiorMedia = media;
                melhorAluno = l;
            }
        }
        System.out.printf("A maior média foi do aluno %d, que obteve uma média de %.2f", melhorAluno, maiorMedia);
    }
}
