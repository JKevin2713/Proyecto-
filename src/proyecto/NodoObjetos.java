
package proyecto;


public class NodoObjetos {
    // Variable en la cual se va a guardar el valor.
    private Objetos objeto;
    // Variable para enlazar los nodos.
    private NodoObjetos siguiente;
    
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void NodoObjetos(){
        this.objeto = null;
        this.siguiente = null;
    }
    
    
    
    public Objetos getValor() {
        return objeto;
    }

    public void setValor(Objetos valor) {
        this.objeto = valor;
    }

    public NodoObjetos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoObjetos siguiente) {
        this.siguiente = siguiente;
    }   
    
}
