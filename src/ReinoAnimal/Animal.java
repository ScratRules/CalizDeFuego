
package ReinoAnimal;

public abstract class Animal {
    protected String foto, comida, localizacion, tamano;
    
    public Animal(){
        this.foto = "null";
        this.comida = "null";
        this.localizacion = "null";
        this.tamano = "null";
    }
    
    public void hacerRuido(){
        System.out.println("Guau guau");
    }
    public void comer(){
        System.out.println("delicious");
    }

    public abstract void dormir();
    
    public void rugir(){
        System.out.println("miau");
    }
    
    public Animal(String foto, String comida, String localizacion, String tamano){
        this.comida = comida;
        this.foto = foto;
        this.localizacion = localizacion;
        this.tamano = tamano;
    }
    
}
