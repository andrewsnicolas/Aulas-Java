package Aulas.Aula9;
import java.util.Arrays;
/*
class --> class = extends
class --> interface = implements
interface --> interface = extends
 */
interface ButtonPower{
    void turnOn();
    void turnOff();
}
interface Software{
    //Uma interface armazena apenas métodos abstratos e variávveis finals e statics
    void code();
    void openPrograms(String[] program);
}
class Laptop implements ButtonPower, Software{
    @Override
    public void turnOn(){
        System.out.println("O laptop está ligando");
    }
    public void turnOff(){
        System.out.println("O laptop está desligando");
    }
    public void code(){
        System.out.println("Você está codando");
    }
    public void openPrograms(String[] programs){
        if(programs.length==1) System.out.printf("Você está abrindo %s \n", Arrays.toString(programs));
        else System.out.println("O computador não pode abrir mais de um programa de uma vez");
    }
}
class Desktop implements ButtonPower, Software{
    @Override
    public void turnOn(){
        System.out.println("O desktop está ligando rápido");
    }
    public void turnOff(){
        System.out.println("O desktop está desligando rápido");
    }
    public void code(){
        System.out.println("Você está codando rápido");
    }
    public void openPrograms(String[] programs){
        System.out.printf("Você está abrindo %s \n", Arrays.toString(programs));
    }
}
public class aula9_11 {
    public static void main(String args[]){
        Laptop notebook = new Laptop();
        Desktop pc = new Desktop();
        notebook.turnOn();
        String[] programas = new String[] {"Opera", "Goodgle Chrome", "Edge"};
        notebook.openPrograms(programas);
        pc.turnOn();
        pc.openPrograms(programas);
    }
}
