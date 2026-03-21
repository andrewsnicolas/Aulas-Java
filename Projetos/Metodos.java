package Aulas.Projetos;
import java.util.Scanner;
public class Metodos {
    static int validar_valor_entrada(String conteudo_digitado){
        Scanner reader = new Scanner(System.in);
        int entrada;
        do{
            System.out.printf("\nDigite um valor de %s válido: ",conteudo_digitado);
            entrada = reader.nextInt();
        } while(entrada<=0);
        return entrada;
    }
    static float calcular_media_alunos(int[] notas){
        float media = 0F;
        for(float c: notas) media+=c;
        media = (media)/(notas.length);
        return media;
    }
    static float calcular_media_prova(int[][] notas, int provaIndex){
        float media = 0F;
        provaIndex--;
        for(int c = 0; c < notas.length; c++) media += notas[c][provaIndex];
        media = media/notas.length;
        return media;
    }
    static void melhor_pior_media_aluno(int[][] notas){
        int piorAluno=0, melhorAluno=0;
        float piorMedia=10000F, melhorMedia=0F, media;
        for(int c = 0; c<notas.length; c++){
            media = calcular_media_aluno(notas[c]);
            if(media>melhorMedia){
                melhorAluno = c;
                melhorMedia = media;
            }
            else if(media<piorMedia){
                piorAluno = c;
                piorMedia = media;
            }
        }
        System.out.printf("\nO %d aluno é o melhor e obteve a média: %.2f", melhorAluno, melhorMedia);
        System.out.printf("\nO %d aluno é o pior e obteve a média: %.2f", piorAluno, piorMedia);
    }
    static float calcular_media_aluno(int notas[]){
        float media = 0F;
        for(float c : notas) media += c;
        media/=notas.length;
        return media;
    }
    static int[][] ordenar_alunos_media(int[][] notas){
        //int[][]
        return notas;
    }
}
