
package proyecto;


public class Defensores extends Agentes{
  
   private int Ataque;

    public Defensores(int Ataque, int Velocidad, boolean Recurso, int x, int y) {
        super(Velocidad, Recurso, x, y);
        this.Ataque = Ataque;
    }
   
    
   
}
