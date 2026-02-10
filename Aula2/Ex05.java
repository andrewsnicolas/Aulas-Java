package com.mycompany.mavenproject1.Aulas.Aula2;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex05 {
    public static void main(String a[]){
        LocalTime tempoatual = LocalTime.now();
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formatado = hora.format(tempoatual);

        System.out.print("Agora é: "+formatado);

    }
}
