package Aulas.Aula8.Vetores;
import java.util.Scanner;
import java.util.Arrays;
public class Ex42 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int[] sequencia = new int[6];
        for (int c=0; c<(sequencia.length-1); c++){
            System.out.println("Digite um número");
            sequencia[c] = reader.nextInt();
        }
        System.out.println("Digite o valor que você quer adicionar");
        int num = reader.nextInt();
        System.out.println("Digite a posição que você quer adicionar");
        int i = reader.nextInt();
        reader.close();
        int aux1, aux2;
        aux1 = sequencia[i];
        sequencia[i] = num;
        for(int c = i+1; c<sequencia.length; c++){
            aux2 = sequencia[c];
            sequencia[c] = aux1;
            aux1 = aux2;
        }
        System.out.println(Arrays.toString(sequencia));
    }
}
