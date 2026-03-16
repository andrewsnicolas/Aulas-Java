package Aulas.Aula8.Vetores;
import java.util.Scanner;
public class Ex46 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int[] vetor = new int[8];
        int ac = 0;
        int maior = 0;
        int[] aux = {1,1,1,1,1,1,1,1};
        System.out.println("Digite os valores para o vetor (8):");
        String[] entrada = reader.nextLine().split(" ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(entrada[i]);
            if (i > 0) {
                if (vetor[i - 1] < vetor[i]) aux[ac]++;
                else ac++;
            }
        }
        for(int i = 0; i<aux.length; i++){
            if(i==0) maior = aux[i];
            else if(maior<aux[i]) maior = aux[i];
        }
        System.out.printf("A maior sequência é %d", maior);
    }
}
