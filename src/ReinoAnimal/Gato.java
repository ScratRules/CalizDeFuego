
package ReinoAnimal;

public class Gato extends Felino {
    
    public Gato(){
        super();
    }
    
    @Override
    public void comer(){
        System.out.println("ñam ñam!!! - Gato");
    }
    @Override
    public void hacerRuido(){
        System.out.println("Miau - Gato");
    }
    public void vacunar(){
        System.out.println("<----  - Gato");
    }
    public void dormir(){
        System.out.println("ZzZzZz - Miau");
    }
}
