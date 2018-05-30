
package ReinoAnimal;

public class Tigre extends Felino {
    
    public Tigre(){
        super();
    }
    
    @Override
    public void comer(){
        System.out.println("ñam ñam!!! - Tigre");
    }
    @Override
    public void hacerRuido(){
        System.out.println("grrroar!!! - Leon");
    }
    public void dormir(){
        System.out.println("ZzZzZz - Tigre");
    }
}
