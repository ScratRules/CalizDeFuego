
package ReinoAnimal;

public class Leon extends Felino {
    
    public Leon(){
        super();
    }
    
    @Override
    public void comer(){
        System.out.println("ñam ñam!!! - Leon");
    }
    @Override
    public void hacerRuido(){
        System.out.println("grrroar!!! - Leon");
    }
    public void dormir(){
        System.out.println("ZzZzZz - Leon");
    }
}
