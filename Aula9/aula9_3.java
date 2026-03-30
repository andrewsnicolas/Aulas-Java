package Aulas.Aula9;

class A{
    public void mostrar(){
        System.out.println("O método chamado 'mostrar' foi requisitado pela classe A");
    }
}
class B extends A{
    public void mostrar(){
        System.out.println("O método chamado 'mostrar' foi requisitado pela classe B");
    }
}
public class aula9_3 {
    public static void main(String args[]){
        B obj = new B();
        obj.mostrar();
    }
}

