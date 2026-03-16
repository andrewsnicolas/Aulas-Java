package Aulas.Aula8.Vetores;
import java.util.Scanner;
public class Ex47 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int[] vetor = new int[10];
        for(int c = 0; c<vetor.length; c++){
            System.out.printf("\nDigite o %d valor para o vetor\n", (c+1));
            vetor[c] = reader.nextInt();
        }
        reader.close();
        int metadeVetor = (int) (vetor.length/2);
        boolean verf = true;
        for(int c = 0; c<(metadeVetor); c++){
            if(vetor[c] != vetor[vetor.length-c-1]) {
                verf = false;
                break;
            }
        }
        if(verf) System.out.println("É palíndromo");
        else System.out.println("Não é palíndromo");
    }
}
