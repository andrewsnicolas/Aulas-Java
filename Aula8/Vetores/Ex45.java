package Aulas.Aula8.Vetores;
import java.util.Scanner;
public class Ex45 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int[] vetor = new int[8];
        int aux1, aux2;
        for(int c = 0; c < vetor.length; c++){
            System.out.println("Digite um valor para o vetor");
            vetor[c] = reader.nextInt();
            if(c>0){
                for(int i=c; i>0; i--){
                    if(vetor[i]<vetor[i-1]){
                        aux1=vetor[i];
                        aux2=vetor[i-1];
                        vetor[i-1] = aux1;
                        vetor[i] = aux2;
                    }
                }
            }
        }
        System.out.println("Aqui está o vetor ordenado");
        for(int c = 0; c<vetor.length;c++) System.out.print(vetor[c]+" ");
    }
}
