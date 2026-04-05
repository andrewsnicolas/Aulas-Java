package Aulas.Aula9;

abstract class AutomobileConcept2{
    abstract public void drive();
    public AutomobileConcept2(){
        System.out.println("Ligar o automóvel");
    }
    abstract static class CarConcept{
        public void OpenWindows(){
            System.out.println("Abrindo as janelas");
        }
        abstract public void tryEatSomething();
    }
}
class Car2 extends AutomobileConcept2.CarConcept {
    @Override
    public void tryEatSomething(){
        System.out.println("Você não pode comer nada no carro");
    }
}
public class aula9_10 {
    public static void main(String args[]){
        AutomobileConcept2 moto = new AutomobileConcept2() {
            @Override
            public void drive() {
                System.out.println("Dirigindo a moto...");
            }
            public void popAWheelie(){
                System.out.println("Dando grau de moto...");
            }
        };
        Car2 carro = new Car2();
        carro.tryEatSomething();
    }
}
