package Aulas.Aula8.Vetores;
import java.util.Scanner;
import java.util.Arrays;
public class Ex49 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int[] vetor = new int[15];
        int aux = 0;
        int c = 0;
        String[] entrada = reader.nextLine().split(" ");
        for(int i = 0; i<vetor.length; i++) vetor[i] = Integer.parseInt(entrada[i]);
        for(int i = 0; i<vetor.length; i++){
            if(vetor[i] != 0){
                aux = vetor[i];
                vetor[i] = vetor[c];
                vetor[c] = aux;
                c++;
                }
            }
        System.out.println(Arrays.toString(vetor));
        }
    }

