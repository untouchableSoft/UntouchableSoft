/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponentesPresentacion;

import ComponenteClase.CatalogoCuenta;
import ComponenteDatos.BDCatalogoCuenta;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mega-Mic
 */
public class JpanelMantenimientoCatalogoCuenta extends javax.swing.JPanel {

    /**
     * Creates new form JpanelMantenimiento
     */
    public JpanelMantenimientoCatalogoCuenta() {
        initComponents();
        MostrarCatalogoCuenta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNomCuenta = new javax.swing.JTextField();
        txtCodCuenta = new javax.swing.JTextField();
        btNuevoCatalogo = new javax.swing.JButton();
        btEditarCatalogo = new javax.swing.JButton();
        btGuardarCatalogo = new javax.swing.JButton();
        btCancelarCatalogo = new javax.swing.JButton();
        txtBuscarCatalogo = new javax.swing.JTextField();
        btBuscarCatalogo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCatalogo = new javax.swing.JTable();
        btActualizarCatalogo = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(730, 0));
        setPreferredSize(new java.awt.Dimension(730, 462));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Registrar Catálogo de Cuenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(725, 212));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Código:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Nombre:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 60, -1, -1));

        txtNomCuenta.setEditable(false);
        txtNomCuenta.setBackground(new java.awt.Color(204, 204, 255));
        txtNomCuenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtNomCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 55, 290, -1));

        txtCodCuenta.setEditable(false);
        txtCodCuenta.setBackground(new java.awt.Color(204, 204, 255));
        txtCodCuenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtCodCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 25, 120, -1));

        btNuevoCatalogo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btNuevoCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/nuevo icono.png"))); // NOI18N
        btNuevoCatalogo.setText("Nuevo");
        btNuevoCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoCatalogoActionPerformed(evt);
            }
        });

        btEditarCatalogo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btEditarCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Editar.png"))); // NOI18N
        btEditarCatalogo.setText("Editar");
        btEditarCatalogo.setEnabled(false);
        btEditarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarCatalogoActionPerformed(evt);
            }
        });

        btGuardarCatalogo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btGuardarCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Guardar.png"))); // NOI18N
        btGuardarCatalogo.setText("Guardar");
        btGuardarCatalogo.setEnabled(false);
        btGuardarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarCatalogoActionPerformed(evt);
            }
        });

        btCancelarCatalogo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btCancelarCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Cancelar.png"))); // NOI18N
        btCancelarCatalogo.setText("Cancelar");
        btCancelarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarCatalogoActionPerformed(evt);
            }
        });

        txtBuscarCatalogo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBuscarCatalogo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarCatalogoKeyPressed(evt);
            }
        });

        btBuscarCatalogo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btBuscarCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Buscar.png"))); // NOI18N
        btBuscarCatalogo.setText("Buscar");
        btBuscarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCatalogoActionPerformed(evt);
            }
        });

        jTableCatalogo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nombre"
            }
        ));
        jTableCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCatalogoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCatalogo);

        btActualizarCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/actualizar.png"))); // NOI18N
        btActualizarCatalogo.setOpaque(false);
        btActualizarCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarCatalogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btBuscarCatalogo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBuscarCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btActualizarCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btNuevoCatalogo)
                                        .addGap(18, 18, 18)
                                        .addComponent(btEditarCatalogo)
                                        .addGap(18, 18, 18)
                                        .addComponent(btGuardarCatalogo)
                                        .addGap(18, 18, 18)
                                        .addComponent(btCancelarCatalogo)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardarCatalogo)
                    .addComponent(btCancelarCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarCatalogo)
                    .addComponent(btNuevoCatalogo))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btBuscarCatalogo)
                        .addComponent(txtBuscarCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btActualizarCatalogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoCatalogoActionPerformed
        HabilitarTXT(true);
        borrar();
        btGuardarCatalogo.setEnabled(true);
        btEditarCatalogo.setEnabled(false);
        btNuevoCatalogo.setEnabled(false);
    }//GEN-LAST:event_btNuevoCatalogoActionPerformed

    private void btGuardarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarCatalogoActionPerformed
        CatalogoCuenta CC = new CatalogoCuenta() {}; 
        
        if(verificarEstado()==true){
            if(verificar()==false){
                CC.setCodCatalogoCuenta(txtCodCuenta.getText());
                CC.setNomCatalogoCuenta(txtNomCuenta.getText());
                try {
                    BDCatalogoCuenta.insertarCatalogoCuenta(CC);
                    borrar();
                    btGuardarCatalogo.setEnabled(false);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error BD: " + e.getMessage());
                }
                JOptionPane.showMessageDialog(this, "Se Agregó Correctamente!!");

            }else{
                JOptionPane.showMessageDialog(this, "Campos vacios.");  
            }
        }else{
                JOptionPane.showMessageDialog(this, "Pesione el boton Nuevo para Guardar.");  
            }
    }//GEN-LAST:event_btGuardarCatalogoActionPerformed

    private void btBuscarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCatalogoActionPerformed
        MostrarCatalogoCuenta(); borrar();
        HabilitarTXT(false);
    }//GEN-LAST:event_btBuscarCatalogoActionPerformed

    private void btCancelarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarCatalogoActionPerformed
        HabilitarTXT(false);
        borrar();
        btEditarCatalogo.setEnabled(false);
        btGuardarCatalogo.setEnabled(false);
    }//GEN-LAST:event_btCancelarCatalogoActionPerformed

    private void btActualizarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarCatalogoActionPerformed
        MostrarCatalogoCuenta();
    }//GEN-LAST:event_btActualizarCatalogoActionPerformed

    private void txtBuscarCatalogoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCatalogoKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            HabilitarTXT(false);
            MostrarCatalogoCuenta();
            borrar();
        }
    }//GEN-LAST:event_txtBuscarCatalogoKeyPressed

    private void jTableCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCatalogoMouseClicked
        btEditarCatalogo.setEnabled(true);
        btGuardarCatalogo.setEnabled(false);
        HabilitarTXT(true);
        int fila=jTableCatalogo.getSelectedRow();
        txtCodCuenta.setText(jTableCatalogo.getValueAt(fila, 0).toString());
        txtNomCuenta.setText(jTableCatalogo.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_jTableCatalogoMouseClicked

    private void btEditarCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarCatalogoActionPerformed
        int fila=jTableCatalogo.getSelectedRow();
         CatalogoCuenta CC;   
        if(jTableCatalogo.getSelectedRow()>=0){
            try {
                CC= BDCatalogoCuenta.mostrarCatalogoCuenta(jTableCatalogo.getValueAt(fila, 0).toString());
                CC.setNomCatalogoCuenta(txtNomCuenta.getText());
                CC.setCodCatalogoCuenta(txtCodCuenta.getText());

                BDCatalogoCuenta.actualizarCatalogoCuenta(CC,jTableCatalogo.getValueAt(fila, 0).toString());
                JOptionPane.showMessageDialog(this, " [ Datos Actualizados ]");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            borrar();
        } else{
            JOptionPane.showMessageDialog(this, "Seleccione el dato que desea editar ");
        } 
    }//GEN-LAST:event_btEditarCatalogoActionPerformed

    private void MostrarCatalogoCuenta(){
        btEditarCatalogo.setEnabled(false);
        btGuardarCatalogo.setEnabled(false);
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            String titulos[] = {"Código", "Nombre"};
            modelo.setColumnIdentifiers(titulos);
            
            if(true==txtBuscarCatalogo.getText().isEmpty()){
                for (CatalogoCuenta CC : BDCatalogoCuenta.mostrarCatalogoCuenta()) {
                    String Datos[] = {String.valueOf(CC.getCodCatalogoCuenta()), CC.getNomCatalogoCuenta()};
                    modelo.addRow(Datos);
                }
            }else{
                for (CatalogoCuenta CC : BDCatalogoCuenta.mostrarCatalogoCuenta1(txtBuscarCatalogo.getText())) {
                    String Datos[] = {String.valueOf(CC.getCodCatalogoCuenta()), CC.getNomCatalogoCuenta()};
                    modelo.addRow(Datos);
                }
            }
            
            jTableCatalogo.setModel(modelo);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }
    
    private void HabilitarTXT(boolean estado){
        txtNomCuenta.setEditable(estado);
        txtCodCuenta.setEditable(estado);
    }
    
    private void borrar(){
        txtNomCuenta.setText("");
        txtCodCuenta.setText("");
    }
    
    private boolean verificar(){
        if (txtNomCuenta.getText().isEmpty()==true & txtCodCuenta.getText().isEmpty()==true)
            return true;
        else
            return false;  
    }
    
    private boolean verificarEstado(){
        if (txtNomCuenta.isEditable()==false & txtCodCuenta.isEditable()==false)
            return false;
        else
            return true;  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizarCatalogo;
    private javax.swing.JButton btBuscarCatalogo;
    private javax.swing.JButton btCancelarCatalogo;
    private javax.swing.JButton btEditarCatalogo;
    private javax.swing.JButton btGuardarCatalogo;
    private javax.swing.JButton btNuevoCatalogo;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCatalogo;
    private javax.swing.JTextField txtBuscarCatalogo;
    private javax.swing.JTextField txtCodCuenta;
    private javax.swing.JTextField txtNomCuenta;
    // End of variables declaration//GEN-END:variables
}