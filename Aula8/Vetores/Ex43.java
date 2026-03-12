package Aulas.Aula8.Vetores;
import java.util.Scanner;
import java.util.Arrays;
public class Ex43 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int[] sequencia = new int[10];
        for(int c =0; c<sequencia.length; c++){
            System.out.println("Digite um valor para adicionar a sequência");
            sequencia[c] = reader.nextInt();
        }
        boolean vrf = true;
        int idx = 0;
        do{
            System.out.println("Digite o número que você digitou na sequência que você deseja remover");
            int remover = reader.nextInt();
            for(int c = 0; c<sequencia.length; c++){
                if(remover == sequencia[c]) {
                    idx = c;
                    vrf=false;
                    break;
                }
            }
        }while(vrf);
        int aux1, aux2;
        sequencia[idx] = sequencia[(sequencia.length-1)];
        for(int c =  (sequencia.length-1); idx<c; c--){
            aux1 = sequencia[idx];
            aux2 = sequencia[c];
            sequencia[idx] = aux2;
            sequencia[c] = aux1;
        }
        sequencia[sequencia.length-1] = 0;
        System.out.println(Arrays.toString(sequencia));
    }
}
