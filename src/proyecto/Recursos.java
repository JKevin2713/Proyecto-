
package proyecto;


public class Recursos extends Objetos{
    
    private int Vida;
    private boolean Eliminado;

    public Recursos(int Vida, int X, int Y) {
        super(X, Y);
        this.Vida = Vida;
        this.Eliminado = false;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public boolean isEliminado() {
        return Eliminado;
    }

    public void setEliminado(boolean Eliminado) {
        this.Eliminado = Eliminado;
    }
    
    
}
