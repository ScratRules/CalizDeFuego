
package ReinoAnimal;

public class Main {
    public static void main(String[] args){
        
        Perro dog = new Perro();
        dog.sacarPasear();
        dog.comer();
        dog.hacerRuido();
        dog.dormir();
        dog.vacunar();
        
        
        Gato cat = new Gato();
        cat.hacerRuido();
        cat.comer();
    }
    
}
