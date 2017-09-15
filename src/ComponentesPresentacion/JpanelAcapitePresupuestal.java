/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponentesPresentacion;

import ComponenteClase.AcapitePresupuestal;
import ComponenteClase.CatalogoCuenta;
import ComponenteClase.CatalogoPresupuesto;
import ComponenteDatos.BDAcapitePresupuestal;
import ComponenteDatos.BDCatalogoCuenta;
import ComponenteDatos.BDCatalogoPresupuesto;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JpanelAcapitePresupuestal extends javax.swing.JPanel {

    public JpanelAcapitePresupuestal() throws SQLException {
        initComponents();
        mostrarCatalogoCuenta();
        mostrarCatalogoPresupuesto();
        MostrarAcapitePresupuestal();
        borrar();
        cbCatalogoCuenta.setEnabled(false);
        cbPresupuesto.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtAcapite = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cbCatalogoCuenta = new javax.swing.JComboBox<>();
        cbPresupuesto = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btNuevo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableAcapite = new javax.swing.JTable();
        btActualizaar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel8.setBackground(new java.awt.Color(0, 153, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Registrar Acápite de Presupuesto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel27.setText("Código:");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(204, 204, 255));
        txtCodigo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel8.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 25, 40, -1));

        txtAcapite.setEditable(false);
        txtAcapite.setBackground(new java.awt.Color(204, 204, 255));
        txtAcapite.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel8.add(txtAcapite, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 55, 170, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel28.setText("Acápite:");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 60, -1, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Cuenta:");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        cbCatalogoCuenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbCatalogoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCatalogoCuentaActionPerformed(evt);
            }
        });
        jPanel8.add(cbCatalogoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 25, 310, -1));

        cbPresupuesto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel8.add(cbPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 55, 310, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setText("Presupuesto:");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 60, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Descripción:");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        txtDescripcion.setEditable(false);
        txtDescripcion.setBackground(new java.awt.Color(204, 204, 255));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 85, 300, 50));

        btNuevo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/nuevo icono.png"))); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Editar.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btGuardar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Guardar.png"))); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.setEnabled(false);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        btBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Buscar.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jTableAcapite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Acapite", "Cuenta", "Presupuesto", "Descripción"
            }
        ));
        jTableAcapite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAcapiteMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableAcapite);

        btActualizaar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/actualizar.png"))); // NOI18N
        btActualizaar.setOpaque(false);
        btActualizaar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizaarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btActualizaar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar)
                    .addComponent(btNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btActualizaar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btBuscar)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void borrar(){
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtAcapite.setText("");
    }
    
    private void habilitartxt(boolean estado){
        txtDescripcion.setEditable(estado);
        cbCatalogoCuenta.setEnabled(estado);
        cbPresupuesto.setEnabled(estado);                
    }
    
    private int max() throws SQLException{
        AcapitePresupuestal AP;
        AP=BDAcapitePresupuestal.buscarMaxCatalogoPresupuesto();
        return AP.getCodAcapitePresupuestal()+1;
    }
    
    private String[] CodigoCuenta() throws SQLException{
        String codigo[], dato=" | ";
        codigo=cbCatalogoCuenta.getSelectedItem().toString().split(dato);
        return codigo;
    }
    
    private String[] CodigoPresupuesto() throws SQLException{
        String codigo[], dato=" | ";
        codigo=cbPresupuesto.getSelectedItem().toString().split(dato);
        return codigo;
    }
    
    private void SelectboxCatalogo(String dato){
        int i =cbCatalogoCuenta.getItemCount();
        
    }
    
    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        borrar();
        habilitartxt(true);
        btGuardar.setEnabled(true);
        btNuevo.setEnabled(false);
        btEditar.setEnabled(false);
        try {
            txtCodigo.setText(String.valueOf(max()));
        } catch (SQLException ex) {
            Logger.getLogger(JpanelAcapitePresupuestal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        borrar();
        habilitartxt(false);
        btGuardar.setEnabled(false);
        btNuevo.setEnabled(true);
        btEditar.setEnabled(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void cbCatalogoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCatalogoCuentaActionPerformed
        if(cbCatalogoCuenta.getSelectedIndex()>=0){
            try {
                txtAcapite.setText(CodigoCuenta()[0].concat("-"+txtCodigo.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(JpanelAcapitePresupuestal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_cbCatalogoCuentaActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        AcapitePresupuestal AP=new AcapitePresupuestal() {};
        
        if(txtDescripcion.isEditable()){
            AP.setNomAcapitePresupuestal(txtAcapite.getText());
            AP.setDescripcionAcapitePresupuestal(txtDescripcion.getText());
            try {
                AP.setCodCatalogoCuenta(BDCatalogoCuenta.mostrarCatalogoCuenta(CodigoCuenta()[0]));
                AP.setIdCatalogoPresupuesto(BDCatalogoPresupuesto.buscarCatalogoPresupuesto(CodigoPresupuesto()[0]));
            } catch (SQLException ex) {
                Logger.getLogger(JpanelMantenimientoPeriodoContable.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                BDAcapitePresupuestal.insertarAcapitePresupuestal(AP);
                borrar();
                habilitartxt(false);
                btGuardar.setEnabled(false);
                btNuevo.setEnabled(true);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error BD: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(this, "Se Agregó Correctamente!!");
        }else{
            JOptionPane.showMessageDialog(this, "Presione el boton nuevo.");
        }                            
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        MostrarAcapitePresupuestal();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void jTableAcapiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAcapiteMouseClicked
            habilitartxt(true);
            btEditar.setEnabled(true);
            int fila=jTableAcapite.getSelectedRow();
            txtCodigo.setText(jTableAcapite.getValueAt(fila, 0).toString());
            txtAcapite.setText(jTableAcapite.getValueAt(fila, 1).toString());
            txtDescripcion.setText(jTableAcapite.getValueAt(fila, 4).toString());
            cbCatalogoCuenta.setSelectedItem(jTableAcapite.getValueAt(fila, 2).toString());
            cbPresupuesto.setSelectedItem(jTableAcapite.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_jTableAcapiteMouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int fila=jTableAcapite.getSelectedRow();
        AcapitePresupuestal AP;   
        if(jTableAcapite.getSelectedRow()>=0){
            
            try {
                AP= BDAcapitePresupuestal.buscarAcapitePresupuestal(txtCodigo.getText());
                AP.setNomAcapitePresupuestal(txtAcapite.getText());
                AP.setDescripcionAcapitePresupuestal(txtDescripcion.getText());
                AP.setCodCatalogoCuenta(BDCatalogoCuenta.mostrarCatalogoCuenta(CodigoCuenta()[0]));
                AP.setIdCatalogoPresupuesto(BDCatalogoPresupuesto.buscarCatalogoPresupuesto(CodigoPresupuesto()[0]));

                BDAcapitePresupuestal.actualizarAcapitePresupuestal(AP);
                JOptionPane.showMessageDialog(this, " [ Datos Actualizados ]");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            borrar();
            btEditar.setEnabled(false);
            habilitartxt(false);
        } else{
            JOptionPane.showMessageDialog(this, "Seleccione el dato que desea editar.");
        } 
    }//GEN-LAST:event_btEditarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            MostrarAcapitePresupuestal(); 
            habilitartxt(false);
            borrar();
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void btActualizaarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizaarActionPerformed
        MostrarAcapitePresupuestal();
    }//GEN-LAST:event_btActualizaarActionPerformed

    private void mostrarCatalogoCuenta() throws SQLException{
        for (CatalogoCuenta CC : BDCatalogoCuenta.mostrarCatalogoCuenta()) {
            cbCatalogoCuenta.addItem(CC.getCodCatalogoCuenta().concat(" | "+CC.getNomCatalogoCuenta()));
        }
    }
    
    private void mostrarCatalogoPresupuesto() throws SQLException{
        for (CatalogoPresupuesto CP : BDCatalogoPresupuesto.mostrarCatalogoPresupuesto()) {
            cbPresupuesto.addItem(CP.getCodCatalogoPresupuesto().concat(" | "+CP.getNomCatalogoPresupuesto()));
        }
    }
    
    private void MostrarAcapitePresupuestal(){
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            String titulos[] = {"Código", "Acápite", "Cuenta", "Presupuesto", "Descripción"};
            modelo.setColumnIdentifiers(titulos);
            
            if(true==txtBuscar.getText().isEmpty()){
                for (AcapitePresupuestal AP : BDAcapitePresupuestal.mostrarAcapitePresupuestal()) {
                    String Datos[] = {String.valueOf(AP.getCodAcapitePresupuestal()), AP.getNomAcapitePresupuestal(),
                    AP.getCodCatalogoCuenta().getCodCatalogoCuenta().concat(" | "+AP.getCodCatalogoCuenta().getNomCatalogoCuenta()),
                    AP.getIdCatalogoPresupuesto().getCodCatalogoPresupuesto().concat(" | "+AP.getIdCatalogoPresupuesto().getNomCatalogoPresupuesto()),
                    AP.getDescripcionAcapitePresupuestal()};
                    modelo.addRow(Datos);
                }
            }else{
                for (AcapitePresupuestal AP : BDAcapitePresupuestal.mostrarAcapitePresupuestal(txtBuscar.getText())) {
                    String Datos[] = {String.valueOf(AP.getCodAcapitePresupuestal()), AP.getNomAcapitePresupuestal(),
                    AP.getCodCatalogoCuenta().getNomCatalogoCuenta(),
                    AP.getIdCatalogoPresupuesto().getNomCatalogoPresupuesto(),
                    AP.getDescripcionAcapitePresupuestal()};
                    modelo.addRow(Datos);
                }
            }
            jTableAcapite.setModel(modelo);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizaar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JComboBox<String> cbCatalogoCuenta;
    private javax.swing.JComboBox<String> cbPresupuesto;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableAcapite;
    private javax.swing.JTextField txtAcapite;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
