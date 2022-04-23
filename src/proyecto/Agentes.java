
package proyecto;

import java.util.logging.Logger;


public class Agentes {
    private int Velocidad;
    private boolean Recurso;
    private int x;
    private int y;

    public Agentes(int Velocidad, boolean Recurso, int x, int y) {
        this.Velocidad = Velocidad;
        this.Recurso = Recurso;
        this.x = x;
        this.y = y;
    }
    
    void Moverse(int Direccion){
        
        switch(Direccion){
            case 0:
                if(this.x > 10){
                    x = x - 10 * Velocidad;
                }
               break;
            case 1:
                x = x + 10 * Velocidad;
                break;
            case 2:
                if(this.y > 30){
                    y = y - 10 * Velocidad;
                }
                break;
            case 3:
                y = y + 10 * Velocidad;
            default:
                break;
        }
    }
    
    public void Recolectar(ListaRecursos recurso){
       Recursos hoja = HojaMasCercana(recurso);
        if(hoja != null){
            if(getX() < hoja.getX()-10){
                 Moverse(1);
            }else if(getY() < hoja.getY()-10){
                 Moverse(3);
            }else if(getX() > hoja.getX()+10){
                 Moverse(0);
            }else if(getY() > hoja.getY()+10){
                 Moverse(2);
            }else{
                 hoja.setVida(hoja.getVida()-1);
                 if(hoja.getVida()<1){
                     hoja.setEliminado(true);
                 }
                 setRecurso(true);
            }
        }else{
            Moverse(5);
        }
       
   }
   
   public Recursos HojaMasCercana(ListaRecursos recurso){
       NodoObjetos aux = recurso.getInicio();
       Recursos recursoMasCercano = null;
       Recursos recursoaux = null;
       int cont = 0;
       while(aux.getSiguiente() != null){
           recursoaux = (Recursos)aux.getValor();
           if(!recursoaux.isEliminado()){
                if(recursoMasCercano == null){
                    recursoMasCercano = (Recursos)aux.getValor();
                }else{
                    if(aux.getValor().getX() + aux.getValor().getY() < recursoMasCercano.getX() + recursoMasCercano.getY()){
                        recursoMasCercano = (Recursos)aux.getValor();
                    }
                }
           }else{
               recurso.removerPorPosicion(cont);
           }
           cont++;
           aux = aux.getSiguiente();
           
       }
    
       return recursoMasCercano;
       
   }
   
   public void Ruta(ListaRecursos recurso){
       if(!isRecurso()){
            Recolectar(recurso);
       }else{
           if(getX() > 10){
               Moverse(0);
           }else if(getY() > 30){
               Moverse(2);
           }else{
               setRecurso(false);
           }
       }
   }

    public int getVelocidad() {
        return Velocidad;
    }

    public boolean isRecurso() {
        return Recurso;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public void setRecurso(boolean Recurso) {
        this.Recurso = Recurso;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
   
    
     
    
}
