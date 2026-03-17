package Aulas.Aula8.Matrizes;
import java.util.Scanner;
import java.util.Arrays;
public class Ex52 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        String[] entrada = new String[8];
        int[][] matriz = new int[6][8];
        int maiorSequencia = 0, maiorSequenciaL=0, maiorSequenciaC=0;
        boolean verf = false;
        int sequencia = 0, sequenciaCol = 0;
        for(int l = 0; l<matriz.length; l++){
            entrada = reader.nextLine().split(" ");
            for(int c = 0; c<matriz[l].length; c++){
                matriz[l][c] = Integer.parseInt(entrada[c]);
            }
        }
        for(int l = 0; l<matriz.length; l++){
            sequencia = 0;
            for(int c = 0; c<matriz[l].length; c++){
                if(matriz[l][c] == 0) {
                    sequencia++;
                    if(sequencia == 1){
                        sequenciaCol = c;
                        verf = true;
                    }
                }
                else sequencia = 0;
            }
            if(sequencia>maiorSequencia){
                maiorSequencia = sequencia;
                if(verf) maiorSequenciaC = sequenciaCol;
                maiorSequenciaL = l;
            }
            sequenciaCol = 0;
            verf = false;
        }
        System.out.println("Maior bloco de vagas livres: "+maiorSequencia);
        System.out.println("Linha: "+(maiorSequenciaL+1));
        System.out.println("Coluna inicial: "+(maiorSequenciaC+1));
    }
}
