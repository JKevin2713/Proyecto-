
package proyecto;


public class ListaRecursos {
    
    private NodoObjetos inicio;
    private int Size;
    
    public void ListaObjetos(){
        inicio = null;
        Size = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
    
    
    public int getTamanio(){
        return Size;
    }

    public NodoObjetos getInicio() {
        return inicio;
    }

    public int getSize() {
        return Size;
    }
    
    
    
    public void agregarAlFinal(Recursos valor){
        
        NodoObjetos nuevo = new NodoObjetos();
        nuevo.setValor(valor);
        
        if (esVacia()) {
            
            inicio = nuevo;
            
        } else{
            
            NodoObjetos aux = inicio;
            
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }   
            aux.setSiguiente(nuevo);
        }
        Size++;
    }
    
      
    public void agregarAlInicio(Recursos valor){

        NodoObjetos nuevo = new NodoObjetos();
        nuevo.setValor(valor);
      
        if (esVacia()) {
            
            inicio = nuevo;
        
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        Size++;
    }
    

    
    public void insrtarPorPosicion(int posicion, Recursos valor){
       
        if(posicion>=0 && posicion<=Size){
            NodoObjetos nuevo = new NodoObjetos();
            nuevo.setValor(valor);
            
            if(posicion == 0){
                
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }
            else{
                
                if(posicion == Size){
                    NodoObjetos aux = inicio;
                    
                    while(aux.getSiguiente() != null){
                        aux = aux.getSiguiente();
                    }
                    
                    aux.setSiguiente(nuevo);              
                }
                else{
                    
                    NodoObjetos aux = inicio;
                    
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSiguiente();
                    }
                    
                    NodoObjetos siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            }
            
            Size++;
        }
    }
    
    public Recursos getValor(int posicion) throws Exception{
        
        if(posicion>=0 && posicion<Size){
            
            if (posicion == 0) {
               
                return (Recursos)inicio.getValor();
            }else{
                
                NodoObjetos aux = inicio;
                
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                
                return (Recursos)aux.getValor();
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
                
                NodoObjetos aux = inicio;
                
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                
                NodoObjetos siguiente = aux.getSiguiente();
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
            
            NodoObjetos aux = inicio;
            
            int i = 0;
           
            while(aux != null){
                
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");        
                aux = aux.getSiguiente();
                i++;
            }
        }
    }
}
