package Aulas.Aula8.Vetores;
import java.util.Arrays;
import java.util.Scanner;
public class Ex41 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int[] sequencia = new int[10];
        for(int c = 0; c<sequencia.length; c++){
            System.out.println("Digite um valor para a lista");
            sequencia[c] = reader.nextInt();
        }
        int aux1, aux2;
        System.out.println(Arrays.toString(sequencia));
        reader.close();
        for(int c = 0; c<sequencia.length; c++){
            aux1 = sequencia[0];
            aux2 = sequencia[c];
            sequencia[0] = aux2;
            sequencia[c] = aux1;
        }
        System.out.println(Arrays.toString(sequencia));
    }
}
