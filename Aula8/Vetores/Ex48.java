package Aulas.Aula8.Vetores;
import java.util.Scanner;
public class Ex48 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int[] vetor = new int[10];
        int aux = 0;
        String[] entrada = reader.nextLine().split(" ");
        for(int c = 0; c<vetor.length; c++) vetor[c] = Integer.parseInt(entrada[c]);
        for(int c = 0; c<vetor.length; c++){
            if(c>0){
                for(int i = 0; i<c; i++){
                    if(vetor[c]<vetor[i]){
                        for(int k = i; k<c; k++){
                            aux = vetor[k];
                            vetor[k] = vetor[c];
                            vetor[c] = aux;
                        }
                    }
                }
            }
        }
        System.out.println("Insira seus pontos");
        aux = reader.nextInt();
        for(int c = vetor.length-1; c>=0; c--){
            if(vetor[c] <= aux){
                System.out.printf("%d° lugar", (vetor.length-c));
                break;
            }
        }
    }
}
