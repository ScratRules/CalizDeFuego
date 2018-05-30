
package ReinoAnimal;

public class Perro extends Canino {
    
    public Perro(){
        super();
    }
    
    //Redefinir Clase
    @Override
    public void comer(){
        System.out.println("ñammmm ñammm delicious - Perro");
    }
    @Override
    public void hacerRuido(){
        System.out.println("Guau guau - Perro");
    }
    public void vacunar(){
        System.out.println("<----  - Perro");
    }
    public void sacarPasear(){
        System.out.println("Sacame a pasear qlero - Perro");
    }
    public void dormir(){
        System.out.println("ZzZzZz - Perro");
    }
}
