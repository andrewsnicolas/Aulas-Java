package Aulas.Aula8.Vetores;
import java.util.Scanner;
import java.util.Arrays;
public class Ex45 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int[] vetor = new int[6];
        int aux;
        for(int c = 0; c < vetor.length; c++){
            System.out.println("Digite um valor para o vetor");
            vetor[c] = reader.nextInt();
            if(c>0 && c<(vetor.length-1)){
                if(vetor[c]<vetor[c+1]){
                    aux = vetor[c+1];
                    vetor[c+1] = vetor[c];
                    vetor[c] = aux;
                }
            }
        }
        System.out.println("Aqui está o vetor ordenado");
        for(int c = 0; c<vetor.length;c++) System.out.print(vetor[c]+" ");
    }
}

