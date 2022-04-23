
package proyecto;


public class Lista {
    
    private Nodo inicio;
    private int Size;
    
    public void Lista(){
        inicio = null;
        Size = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    
    public int getTamanio(){
        return Size;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public int getSize() {
        return Size;
    }
    
    
    
    public void agregarAlFinal(Agentes valor){
        
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        
        if (esVacia()) {
            
            inicio = nuevo;
            
        } else{
            
            Nodo aux = inicio;
            
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }   
            aux.setSiguiente(nuevo);
        }
        Size++;
    }
    
      
    public void agregarAlInicio(Agentes valor){

        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
      
        if (esVacia()) {
            
            inicio = nuevo;
        
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        Size++;
    }
    

    
    public void insrtarPorPosicion(int posicion, Agentes valor){
       
        if(posicion>=0 && posicion<=Size){
            Nodo nuevo = new Nodo();
            nuevo.setValor(valor);
            
            if(posicion == 0){
                
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }
            else{
                
                if(posicion == Size){
                    Nodo aux = inicio;
                    
                    while(aux.getSiguiente() != null){
                        aux = aux.getSiguiente();
                    }
                    
                    aux.setSiguiente(nuevo);              
                }
                else{
                    
                    Nodo aux = inicio;
                    
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSiguiente();
                    }
                    
                    Nodo siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            
            Size++;
        }
    }
    
    public Agentes getValor(int posicion) throws Exception{
        
        if(posicion>=0 && posicion<Size){
            
            if (posicion == 0) {
               
                return inicio.getValor();
            }else{
                
                Nodo aux = inicio;
                
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                
                return aux.getValor();
            }
        
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }
    }
  
    
    public void removerPorPosicion(int posicion){
        
        if(posicion>=0 && posicion<Size){
            
            if(posicion == 0){
                
                inicio = inicio.getSiguiente();
            }
            
            else{
                
                Nodo aux = inicio;
                
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            
            Size--;
        }
    }
    
    public void eliminar(){
        
        inicio = null;
        
        Size = 0;
    }
    
    public void listar(){
        
        if (!esVacia()) {
            
            Nodo aux = inicio;
            
            int i = 0;
           
            while(aux != null){
                
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");        
                aux = aux.getSiguiente();
                i++;
            }
        }
    }
}
