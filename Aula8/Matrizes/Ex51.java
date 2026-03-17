package Aulas.Aula8.Matrizes;
import java.util.Scanner;
public class Ex51 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        float[][] sensores = new float[5][6];
        float[] mediaTempSensor = new float[5];
        int tempCritica = 0, maiorSensor = 0, maiorHorario = 0;
        float maiorTemp = 0;
        //As linhas são os sensores, as colunas os horários
        for(int l = 0; l<sensores.length; l++){
            mediaTempSensor[l] = 0;
            for(int c = 0; c<sensores[l].length; c++){
                System.out.printf("\nDigite a tempera do sensor %d: \n", (l+1));
                sensores[l][c] = reader.nextFloat();
                mediaTempSensor[l] += sensores[l][c];
                if(sensores[l][c]>=40) tempCritica++;
                if(sensores[l][c]>maiorTemp){
                    maiorTemp = sensores[l][c];
                    maiorSensor = l;
                    maiorHorario = c;
                }
            }
            mediaTempSensor[l] /= 3;
        }
        System.out.printf("\nMaior temperatura: %.2f\nSensor: %d\nHorário: %d", maiorTemp, (maiorSensor+1), (maiorHorario+1));
        for(int c = 0; c<mediaTempSensor.length; c++){
            System.out.printf("\nMédia do sensor %d: %.2f", (c+1), mediaTempSensor[c]);
        }
    }
}
