package gereanimais;

import java.util.ArrayList;
import java.util.List;

public class GereAnimais {

    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Animal> animais = new ArrayList<>();
        animais.add(new cachorro());
        animais.add(new gato());
        animais.add(new passaro());

        
        for (Animal animal : animais) {
            animal.emitirSom();
            animal.mover();
            System.out.println("--------------------");
        }
        
    }
    
}
