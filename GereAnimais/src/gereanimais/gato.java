package gereanimais;

public class gato extends Animal{
    
    @Override
    public void emitirSom() {
        System.out.println("O gato miou: Miau!");
    }

    @Override
    public void mover() {
        System.out.println("O gato está andando sorrateiramente.");
    }
    
}
