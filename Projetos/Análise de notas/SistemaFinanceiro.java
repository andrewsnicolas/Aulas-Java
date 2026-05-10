import java.util.ArrayList;
import java.util.Scanner;
class ValorForaIntervalo extends Exception{
    public ValorForaIntervalo(String msg){
        super(msg);
    }
}
class ValorNegativo extends Exception{
    public ValorNegativo(String msg){
        super(msg);
    }
}

class Transacao{
    public enum Tipo{
        RECEITA,
        DESPESA
    }
    private Tipo tipo;
    float valor;
    String descricao;
}
class Conta{
    float saldo;
    ArrayList<Transacao> historico;
}
public class SistemaFinanceiro{
    static Scanner reader = new Scanner(System.in);
    static int validar_entrada(String ent){
        int retorno = 0;
        try{
            retorno = Integer.parseInt(ent);
            if(retorno<1 || retorno>5) throw new ValorForaIntervalo("Valor fora do intervalo pré-definido.");
            //Adicionar uma exceção personalizada que verifica se está dentro do intervalo
        } catch(Exception e){
            System.out.println("Digite um número válido!");
            System.out.println("Digite outro valor");
            ent = reader.next();
            validar_entrada(ent);
        }
            return retorno;
    }
    public static void main(String args[]){

        int respUsuar = 0;
        boolean sair = false;
        String entrada;
        System.out.println("\033[0;36m************Gerenciador de Finanças Pessoais****************\033[0m");
        do{
            System.out.println("1 - Adicionar receita\n" +
                               "2 - Adicionar despesa\n" +
                               "3 - Ver saldo\n" +
                               "4 - Ver extrato\n" +
                               "5 - Salvar e sair");
            entrada = reader.next();
            respUsuar = validar_entrada(entrada);
            System.out.println(respUsuar);
            switch(respUsuar){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    break;
            }
        } while(!sair);

    }
}