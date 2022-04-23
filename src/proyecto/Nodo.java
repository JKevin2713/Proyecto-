
package proyecto;


public class Nodo {
    // Variable en la cual se va a guardar el valor.
    private Agentes agente;
    // Variable para enlazar los nodos.
    private Nodo siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Nodo(){
        this.agente = null;
        
        this.siguiente = null;
    }
    
    
    
    public Agentes getValor() {
        return agente;
    }

    public void setValor(Agentes valor) {
        this.agente = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   
    
}
