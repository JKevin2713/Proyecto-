
package proyecto;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;


public class Display extends javax.swing.JFrame {
    
    private Lista lista;
    /*private ListaObjetos listaO = new ListaObjetos();
    private ListaAmenaza listaA = new ListaAmenaza();*/
    private ListaRecursos listaR;
    
    public Display() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        PanelPrincipal = new javax.swing.JPanel();
        BotonMover = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(510, 510));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonMover.setText("Mover");
        BotonMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 556, Short.MAX_VALUE)
                .addComponent(BotonMover))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(BotonMover)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMoverActionPerformed
            
        Random rn = new Random();
        int random;
        random = rn.nextInt(2)+0;
        Nodo Aux = lista.getInicio();
        Recolectores recolector;
        //System.out.println(random);
        //System.out.println(listaR.getSize());
        if(random == 1 && listaR.getSize() < 6){
            Recursos recurso = new Recursos(10, 100+rn.nextInt(300), 100+rn.nextInt(300));
            listaR.agregarAlFinal(recurso);
        }
        while(Aux.getSiguiente() != null){
            Aux.getValor().Ruta(listaR);
            Aux = Aux.getSiguiente();
        }
        this.setLista(lista);
    }//GEN-LAST:event_BotonMoverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Display().setVisible(true);
            }
        });
        
   
    }
    
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        //System.out.println("Estoy pintando");
        Graphics2D g2D = (Graphics2D) g;
        Toolkit t = Toolkit.getDefaultToolkit();
        Image hoja = t.getImage("src/Imagenes/Hoja.png");
        Image obstaculo = t.getImage("src/Imagenes/Obstaculo.png");
        Image amenaza = t.getImage("src/Imagenes/Abeja.png");
        Image hormiga = t.getImage("src/Imagenes/Hormiga Roja.png");
        Image hormiguero = t.getImage("src/Imagenes/Hormiguero.jpg");
        g2D.drawImage(hormiguero, 5,30,30,30, this);
        /*
        NodoObjetos auxOb = listaO.getInicio();
        while(auxOb.getSiguiente() != null){
            g2D.drawImage(obstaculo, auxOb.getValor().getX(),auxOb.getValor().getY(),60,60, this);
            auxOb = auxOb.getSiguiente();
        }
        */
        if(listaR != null){
            NodoObjetos auxR = listaR.getInicio();
            while(auxR.getSiguiente() != null){
                g2D.drawImage(hoja, auxR.getValor().getX(),auxR.getValor().getY(),30,30, this);
                auxR = auxR.getSiguiente();
            }
        }
        if(lista != null){
            Nodo aux = lista.getInicio();
            while(aux.getSiguiente() != null){
                g2D.drawImage(hormiga, aux.getValor().getX(),aux.getValor().getY(), 10,10, this);
                aux = aux.getSiguiente();
            }
        }
        
    }

    public void setLista(Lista lista) {
        this.lista = lista;
        this.repaint();
    }
    /*
    public void setListaObjetos(ListaObjetos lista){
        this.listaO = lista;
    }
    */
    public void setListaRecursos(ListaRecursos lista){
        this.listaR = lista;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonMover;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}