package gereanimais;

public class cachorro extends Animal{
    
    @Override
    public void emitirSom() {
        System.out.println("O cachorro latiu: Au au!");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está correndo.");
    }
    
}
