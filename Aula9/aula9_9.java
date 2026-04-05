package Aulas.Aula9;

abstract class AutomobileConcept{
    abstract public void drive();
    abstract public void playMusic();
    abstract public void fly();
    public void turnOn(){
        System.out.println("Ligando o automóvel...");
    }
}
abstract class Car extends AutomobileConcept{
    //Se você não usar todos os métodos declarados de uma classe abstrata, dará erro e isso terá que ser uma
    //classe abstrata
    public void drive(){
        System.out.println("Dirigindo o carro...");
    }
    public void playMusic(){
        System.out.println("Tocando música no carro...");
    }
}
class ToyCar extends Car{
    public void fly(){
        System.out.println("Uma criança decidiu que seu carro pode voar");
    }
}
public class aula9_9 {
    public static void main(String args[]){
        AutomobileConcept toyCar = new ToyCar();
        toyCar.drive();
        toyCar.turnOn();
        toyCar.playMusic();
        toyCar.fly();
    }
}
