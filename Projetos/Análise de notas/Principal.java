package Aulas.Projetos;
import java.util.Scanner;
import java.io.File;
public class Principal {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int quant_alunos = Metodos.validar_valor_entrada("alunos");
        int quant_provas = Metodos.validar_valor_entrada("provas");
        float[][] notas = new float[quant_alunos][quant_provas];
        int index_aluno, index_prova, aprovados;
        float media_aluno, media_geral, media_prova;
        int acao = 0;
        for(int l = 0; l<quant_alunos; l++){
            for(int k = 0; k< quant_provas; k++){
                do{
                    System.out.printf("\nDigite a nota da %d° prova do %d° aluno: ", (k+1), (l+1));
                    notas[l][k] = reader.nextFloat();
                } while(notas[l][k]<0 || notas[l][k]>10);
            }
        }
        do{
            System.out.println("\nDigite a ação que você quer tomar:\n" +
                    "[1] ver média de um aluno\n" +
                    "[2] ver média geral\n" +
                    "[3] ver média por prova\n" +
                    "[4] ver o pior e melhor aluno\n" +
                    "[5] ver o ranking\n" +
                    "[6] fazer contagem de aprovadosn\n" +
                    "[7] fazer análise de desempenho\n" +
                    "[8] fazer desvio simples de desempenho\n" +
                    "[9] detectar padrões estranhos");
            acao = reader.nextInt();
            switch(acao){
                case 0: break;
                case 1:
                    do{
                        System.out.println("Digite o aluno que você quer calcular a média: ");
                        index_aluno = reader.nextInt();
                        index_aluno--;
                    } while(index_aluno<0 || index_aluno >= quant_alunos);
                    media_aluno = Metodos.calcular_media_aluno(notas[index_aluno]);
                    System.out.printf("\nA média do %d° aluno é: %.2f\n", (index_aluno+1),media_aluno);
                    break;
                case 2:
                    media_geral = Metodos.calcular_media_geral(notas);
                    System.out.printf("\nA média geral atual é: %.2f\n",media_geral);
                    break;
                case 3:
                    do{
                        System.out.println("\nDigite a prova que você quer calcular a média: ");
                        index_prova = reader.nextInt();
                        index_prova--;
                    } while(index_prova<0 || index_prova >= quant_provas);
                    media_prova = Metodos.calcular_media_prova(notas, index_prova);
                    System.out.printf("\nA média da %d° prova é %.2f", (index_prova+1), media_prova);
                    break;
                case 4:
                    Metodos.melhor_pior_media_aluno(notas);
                    break;
                case 5:
                    Metodos.ordenar_alunos_media(notas);
                    break;
                case 6:
                    aprovados = Metodos.contagem_aprovados(notas);
                    System.out.println("O total de aprovados (tem média maior ou igual a 6) é: "+aprovados);
                    break;
                case 7:
                    Metodos.desempenho_geral(notas);
                    break;
                case 8:
                    Metodos.desvio_desempenho(notas);
                    break;
                case 9:
                    Metodos.detectar_padrao_estranho(notas, 3.5F);
                    break;
                default:
                    System.out.println("Valor digitado é inválido");
                    break;
            }
        } while(acao!=0);
    }
}
