package Aulas.Aula9;
import java.util.Scanner;

class Calculadora{
    /*
    Essa classe que armazena funções que irão ser recebidas de outras classes
    se chama "classe pai" ou "super classe".
     */
    public int soma(int... num){
        int som = 0;
        for(int i: num) som+=i;
        return som;
    }
}
class Calculadora_Melhorada extends Calculadora{
    /*
    Já essa classe que recebe as funções da Super Classe, se chama subclasse
    ou classe filho. Ela é identificada pela propriedade "extends nome_classe_pai".
     */
    public int subtracao(int n1, int n2){
        return (n2-n1);
    }
}
class Calculadora_MUITO_Melhorada extends Calculadora_Melhorada{
    //Uma classe filho pode ter outra classe filho
    public int mult(int n1, int n2){
        return (n1*n2);
    }
}
public class aula9_1 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int num, total;
        Calculadora_Melhorada calc = new Calculadora_Melhorada();
        do{
        System.out.println("O que você quer fazer?" +
                "\n[1] Fazer a soma" +
                "\n[2] Fazer a subtração");
        int escolha = reader.nextInt();
        if(escolha == 1){
            System.out.println("Digite quantos valores você quer adicionar: ");
                num = reader.nextInt();
                int[] vetor = new int[num];
                for(int i = 0; i<num; i++){
                    System.out.printf("\nDigite o %d° valor para somar", (i+1));
                    vetor[i] = reader.nextInt();
                }
            total = calc.soma(vetor);
        } else if(escolha == 2){
            System.out.println("Digite o 1° valor para subtrair");
            int n1 = reader.nextInt();
            System.out.println("Digite o 2° valor para subtrair");
            int n2 = reader.nextInt();
            total = calc.subtracao(n1,n2);
        } else continue;
        System.out.println("O valor total é: "+total);
        break;
        } while(true);
        Calculadora_MUITO_Melhorada calc_melh = new Calculadora_MUITO_Melhorada();
        total = calc_melh.mult(50,12);
        System.out.println("O valor da multiplicação entre 50 e 12 é: "+ total);
    }
}
