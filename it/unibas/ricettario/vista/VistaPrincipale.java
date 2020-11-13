
package it.unibas.ricettario.vista;

import it.unibas.ricettario.Applicazione;
import it.unibas.ricettario.modello.Costanti;
import it.unibas.ricettario.modello.ModelloTabellaPietanze;
import it.unibas.ricettario.modello.Pietanza;
import java.util.List;


public class VistaPrincipale extends javax.swing.JPanel {


 public void inizializza(){
     initComponents();
     inizializzaComponenti();
     inizializzaAzioni();
     this.tabellaPietanze.setModel(new ModelloTabellaPietanze());
 }
 
 private void inizializzaAzioni(){
     this.bottoneCercaCategoria.setAction(Applicazione.getInstance().getControlloPrincipale().getAzioneCercaTipologia());
     this.bottoneCercaSimle.setAction(Applicazione.getInstance().getControlloPrincipale().getAzioneCercaPietanzaSimile());
 }
 
 public void aggiornaTabella(){
     List<Pietanza> listePietanze = (List<Pietanza>) Applicazione.getInstance().getModello().getBean(Costanti.LISTA_FILTRATA);
     ModelloTabellaPietanze modelloTabella = (ModelloTabellaPietanze) this.tabellaPietanze.getModel();
     modelloTabella.setListaPietanze(listePietanze);
     modelloTabella.aggiornaContenuto();
  
 }
 
public int getRigaSelezionata(){
    return this.tabellaPietanze.getSelectedRow();
}
 
 public String getComboCategoria(){
     return (String) this.comboCategoria.getSelectedItem();
 }
 
     private void inizializzaComponenti() {
      this.comboCategoria.removeAllItems();
     this.comboCategoria.addItem("");
     this.comboCategoria.addItem(Costanti.ANTIPASTO);
     this.comboCategoria.addItem(Costanti.PRIMO);
     this.comboCategoria.addItem(Costanti.SECONDO);
     this.comboCategoria.addItem(Costanti.DESSERT);
    }

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        bottoneCercaCategoria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellaPietanze = new javax.swing.JTable();
        bottoneCercaSimle = new javax.swing.JButton();

        jLabel1.setText("CATEGORIA:");

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bottoneCercaCategoria.setText("jButton1");

        tabellaPietanze.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabellaPietanze);

        bottoneCercaSimle.setText("jButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bottoneCercaSimle)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCategoria, 0, 229, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(bottoneCercaCategoria))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bottoneCercaCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottoneCercaSimle)
                .addGap(9, 9, 9))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottoneCercaCategoria;
    private javax.swing.JButton bottoneCercaSimle;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabellaPietanze;
    // End of variables declaration//GEN-END:variables


}
