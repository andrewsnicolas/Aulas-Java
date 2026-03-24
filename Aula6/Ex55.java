package Aulas.Aula6;
import java.util.Scanner;
import java.util.Arrays;
public class Ex55 {

    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int linhas_x = 0, linhas_y = 0;
        int coluna_x = 0, coluna_y = 0;

        linhas_x = verificar_valores_nulos(linhas_x, "linhas", 1);
        coluna_x = verificar_valores_nulos(coluna_x, "colunas", 1);
        linhas_y = verificar_valores_nulos(linhas_y, "linhas", 2);
        coluna_y = verificar_valores_nulos(coluna_y, "colunas", 2);


        int[][] matriz_x = new int[linhas_x][coluna_x];
        int[][] matriz_y = new int[linhas_y][coluna_y];

        receber_valores_matriz(matriz_x, 1);
        receber_valores_matriz(matriz_y, 2);

        int[][] matriz_retorno = multiplicar_matrizes(matriz_x, matriz_y);
        System.out.println("\nO resultado da multiplicação é: \n");
        for(int l = 0; l<matriz_retorno.length; l++){
            for(int c = 0; c<matriz_retorno[0].length; c++){
                System.out.print(matriz_retorno[l][c]+" ");
            }
            System.out.println();
        }
    }

    static int[][] multiplicar_matrizes(int[][] matriz_a, int[][] matriz_b){
        int[][] matriz_r = new int[matriz_a.length][matriz_b[0].length];
        int ac;
        for(int i = 0; i<matriz_a.length; i++){
            //for responsável pela mudança de linhas da matriz de resultado
            for(int l = 0; l<matriz_b[0].length; l++){
                //for responsável pela mudança das linhas da matriz b
                ac = 0;
                for(int c = 0; c<matriz_b.length; c++){
                    //fo responsável pela multiplicação atual
                    ac += matriz_a[i][c]*matriz_b[c][l];
                }
                matriz_r[i][l]=ac;
            }
        }
        return matriz_r;
    }
    static int[][] receber_valores_matriz(int[][] matriz, int numeroMatriz){
            Scanner reader = new Scanner(System.in);
            System.out.printf("\nDigite os valores da %d° matriz\n", numeroMatriz);

            for(int l = 0; l<matriz.length;l++){
                //Recebe os valores de cada linha da matriz
                String[] entrada = reader.nextLine().split(" ");
                for(int i=0; i<entrada.length; i++)
                    matriz[l][i] = Integer.parseInt(entrada[i]);
                //Converte os valores de cada posição da matriz
        }
        return matriz;
    }
    static int verificar_valores_nulos(int objetoaVerificar, String conteudo_digitado, int numeroMatriz){
        Scanner reader = new Scanner(System.in);
        do{
            System.out.printf("\nDigite o número de %s da %d° matriz\n", conteudo_digitado, numeroMatriz);
            objetoaVerificar = reader.nextInt(); 
        } while(objetoaVerificar==0);
        return objetoaVerificar;
    }
}
