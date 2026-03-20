package Aulas.Aula6;
import java.util.Scanner;
import java.util.Arrays;
public class Ex53 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        String[] vetor = new String[10];
        do{
            System.out.println("Digite o vetor você quer inverter, limite 10 valores");
            vetor = reader.nextLine().split(" ");
        } while(vetor[0] =="");

        inverter(vetor);

    }
    static void inverter(String... array){
        int metadeVetor = (int) (array.length/2);
        int posicao_oposta;
        String aux;
        for(int c = 0; c<metadeVetor; c++){
            posicao_oposta = array.length-c-1;
           aux = array[c];
           array[c] = array[posicao_oposta];
           array[posicao_oposta] = aux;
        }
        System.out.println(Arrays.toString(array));
    }
}
