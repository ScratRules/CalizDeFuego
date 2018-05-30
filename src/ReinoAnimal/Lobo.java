
package ReinoAnimal;

public class Lobo extends Canino {
    
    public Lobo(){
        super();
    }
    
    @Override
    public void comer(){
        System.out.println("ñammmm ñammmm! - Lobo");
    }
    @Override
    public void hacerRuido(){
        System.out.println("grrroar!!! - Lobo");
    }
    public void dormir(){
        System.out.println("ZzZzZz - Lobo");
    }
           
}
