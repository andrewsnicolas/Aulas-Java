package com.mycompany.mavenproject1.Aulas.Aula3;

public class amb_teste {
    public static void main(String args[]){
        byte b = 127;
        int c = 256;
        int d = 257;
        // b = c; Não funciona

        b = (byte) c;
        //Quando uma variável de menor capacidade recebe uma de maior, acontece o casting

        d = (int) b;
        //Porém, quando uma maior recebe uma menor, há uma conversão

        System.out.print(b);
    }
}
