package com.mycompany.mavenproject1.Aulas.Aula2;
import java.util.Scanner;
public class Ex10 {
    public static void main(String a[]){
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um número de 6 digitos");
    int num = leitor.nextInt();
    int s1 =  num/100000;
    int s2 = (num/10000) % 10;
    int s3 = (num/1000) % 10;
    int s4 = (num/100) % 10;
    int s5 = (num/10) % 10;
    int s6 =  num % 10;
    System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6);
    }
}
