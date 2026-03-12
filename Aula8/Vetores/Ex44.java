package Aulas.Aula8.Vetores;
import java.util.Scanner;
import java.util.Arrays;
public class Ex44 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        int[] vetor1 = new int[8];
        int[] vetor2 = new int[8];
        int[] comum = new int[8];
        int i = 0;
        int ac = 0;
        boolean vrf = true;
        do {
            i++;
            vrf = true;
            for (int c = 0; c < vetor1.length; c++) {
                System.out.printf("\nDigite um valor para o vetor %d \n", i);
                if (i == 1) vetor1[c] = reader.nextInt();
                else {
                    vetor2[c] = reader.nextInt();
                    for(int k = 0; k<=ac; k++) {
                        if(comum[k] == vetor2[c]) {
                            vrf = false;
                            break;
                        }
                    }
                    if(vrf){
                        for (int k = 0; k < vetor1.length; k++) {
                            if (vetor1[k] == vetor2[c]) {
                                comum[ac] = vetor2[c];
                                ac++;
                                break;
                            }
                        }
                    }
                }
            }
        } while (i < 2);
        reader.close();
        System.out.println("Os valores comuns são: ");
        for (int c = 0; c < ac; c++) System.out.print(comum[c]+" ");
    }
}
