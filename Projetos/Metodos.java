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
    static void ordenar_alunos_media(int[][] notas) {
        float[] media = new float[notas.length];
        int ac = 0;
        int[] alunos = new int[notas.length];
        for (int i = 0; i < notas.length; i++) {
            ac = 0;
            alunos[i] = i + 1;
            media[i] = calcular_media_aluno(notas[i]);
        }
        float aux1;
        int aux2;
        for (int i = 0; i < media.length; i++) {
            for (int c = 0; c < media.length; c++) {
                if (media[i] < media[c]) {
                    aux1 = media[i];
                    media[i] = media[c];
                    media[c] = aux1;
                    aux2 = alunos[i];
                    alunos[i] = alunos[c];
                    alunos[c] = aux2;
                }
            }
        }
        for (int i = 0; i < notas.length; i++)
            System.out.printf("\n%d° lugar: Aluno %d (Nota: %.2f)", (i + 1), alunos[i], media[i]);
    }
    static int contagem_aprovados(int[][] notas){
        int aprovados = 0;
        float media = 0F;
        for(int i = 0; i<notas.length; i++){
            media = calcular_media_aluno(notas[i]);
            if(media>=6) aprovados++;
        }
        return aprovados;
    }
    static float calcular_media_geral(int[][] notas){
        float media_geral = 0F;
        for(int i = 0; i<notas.length; i++) media_geral += calcular_media_aluno(notas[i]);
        media_geral /= notas.length;
        return media_geral;
    }
    static void desempenho_geral(int[][] notas){
        float media_geral = calcular_media_geral(notas);
        float nota_prova_mais_dificil = 9999F;
        float nota_prova_mais_facil = 0F;
        int index_prova_mais_dificil = 0;
        int index_prova_mais_facil = 0;
        float ac;
        for(int k=0; k<notas[k].length; k++){
            ac = 0;
            for(int l = 0; l<notas.length; l++){
                ac+=notas[l][k];
            }
            ac/=notas.length;
            if(ac<nota_prova_mais_dificil) {
                nota_prova_mais_dificil = ac;
                index_prova_mais_dificil = k;
            } else if(ac>nota_prova_mais_facil){
                nota_prova_mais_facil = ac;
                index_prova_mais_facil = k;
            }
        }
        System.out.printf("\nA %d prova foi a mais difícil, tendo a média geral: %.2f", (index_prova_mais_dificil+1), nota_prova_mais_dificil);
        System.out.printf("\nA %d prova foi a mais fácil, tendo a média geral: %.2f", (index_prova_mais_facil+1), nota_prova_mais_facil);
        System.out.printf("\nMédia geral da turma: %.2f", media_geral);
    }
    static void desvio_desempenho(int[][] notas){
        float media_geral = calcular_media_geral(notas);
        float[] desvio_nota = new float[notas.length];
        float media = 0F;
        String mensagem = "";
        float modulo_desvio_nota;
        for(int i =0; i<notas.length; i++){
            media = calcular_media_aluno(notas[i]);
            desvio_nota[i] = media-media_geral;
            if(desvio_nota[i]<0){
                mensagem = "abaixo da média";
                modulo_desvio_nota = (-1) * desvio_nota[i];
            }
            else{
                mensagem = "a cima da média";
                modulo_desvio_nota = desvio_nota[i];
            }
            mensagem = desvio_nota[i]<0? "abaixo da média":"a cima da média";
            System.out.printf("\nO aluno %d, teve um desvio de %.2f %s", (i+1), modulo_desvio_nota, mensagem );
        }
    }
    static void detectar_padrao_estranho(int[][] notas, float desvio_consistente){
        int quantidade_alunos_padroes_estranhos = 0;
        int[] index_alunos_padroes_estranhos = new int [notas.length];
        float media = 0;
        float modulo_diferenca_media_nota;
        int excecao;
        for(int i = 0; i<notas.length;i++){
            media = calcular_media_aluno(notas[i]);
            excecao = 0;
            for(int c = 0; c<notas[i].length; c++){

                if(notas[i][c]<media) modulo_diferenca_media_nota = (notas[i][c]-media)*(-1);
                else modulo_diferenca_media_nota = (notas[i][c]-media);

                if(modulo_diferenca_media_nota>=desvio_consistente) {
                    index_alunos_padroes_estranhos[quantidade_alunos_padroes_estranhos] = i;
                    quantidade_alunos_padroes_estranhos++;
                    excecao++;
                }
                if (excecao>1) {
                    quantidade_alunos_padroes_estranhos--;
                    break;
                    //Um único aluno não pode ter 2 provas que indiquem uma exceção, apenas uma.
                }
            }
        }
        for(int i = 0; i<quantidade_alunos_padroes_estranhos; i++){
            System.out.println("\nO aluno de index %d teve um padrão estranho");
            for(int c = 0; c<notas[i].length; c++){
                System.out.print(notas[index_alunos_padroes_estranhos[i]][c]+ " ");
            }
        }
    }
}
