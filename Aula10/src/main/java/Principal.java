import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        boolean errou = false;
        int escolha = 0;
        do{
        do{
            if(errou) System.out.println("\033[1;31mVALOR DIGITADO INVÁLIDO\nPOR FAVOR, DIGITE OUTRO NÚMERO\033[0m");
            System.out.println("O que você quer fazer?\n" +
                    "1)Criar um aluno\n" +
                    "2)Verificar se um aluno existe\n" +
                    "3)Ver a nota de um aluno\n" +
                    "4)Criar um arquivo de alunos aprovados\n" +
                    "5)Exibir as médias dos alunos\n" +
                    "6)Gerar um arquivo das médias dos alunos\n" +
                    "7)Fazer backup\n" +
                    "8)Sair");
            escolha = reader.nextInt();
            errou = true;
        } while(escolha < 1 || escolha>7);
        if(escolha==8) break;
        switch(escolha) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
        }while(true);
    }
}
