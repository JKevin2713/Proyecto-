
package proyecto;

import java.util.Random;


public class Proyecto {

   
    public static void main(String[] args) throws InterruptedException{
        Display Pantalla = new Display();
        Pantalla.setTitle("Proyecto");
        Pantalla.setVisible(true);
        
        
        Lista lista = new Lista();
        /*ListaObjetos listaO = new ListaObjetos();
        ListaAmenaza listaA = new ListaAmenaza();*/
        ListaRecursos listaR = new ListaRecursos();
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            Agentes agente = new Defensores(1, random.nextInt(3)+1, false, 10, 30);
            lista.agregarAlFinal(agente);
        }
        
        for (int i = 0; i < 10; i++) {
            Agentes agente = new Recolectores(random.nextInt(3)+1, false, 10, 30);
            lista.agregarAlFinal(agente);
        }
        /*
        for (int i = 0; i < 5; i++) {
            Amenaza objeto = new Amenaza(10, 100+random.nextInt(400), 100+random.nextInt(400));
            listaA.agregarAlFinal(objeto);
        }
        
        for (int i = 0; i < 5; i++) {
            Objetos objeto = new Obstaculo(100+random.nextInt(400), 100+random.nextInt(400));
            listaO.agregarAlFinal(objeto);
        }*/
        
        for (int i = 0; i <= 5; i++) {
            Recursos objeto = new Recursos(10, 100+random.nextInt(300), 100+random.nextInt(300));
            listaR.agregarAlFinal(objeto);
        }
        
        //Pantalla.setListaObjetos(listaO);
        Pantalla.setListaRecursos(listaR);
        Pantalla.setLista(lista);
        
        //Thread.sleep(2000);

        
    }
}
