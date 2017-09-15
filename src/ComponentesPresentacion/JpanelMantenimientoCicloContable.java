package ComponentesPresentacion;

import ComponenteClase.CicloContable;
import ComponenteDatos.BDCicloContable;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JpanelMantenimientoCicloContable extends javax.swing.JPanel {

    public JpanelMantenimientoCicloContable() {
        initComponents();
        MostrarCicloContable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btNuevo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCicloContable = new javax.swing.JTable();
        btActualizar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtCodCicloContable = new javax.swing.JTextField();
        fechaInicial = new com.toedter.calendar.JDateChooser();
        fechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbCerrado = new javax.swing.JRadioButton();
        rbAbierto = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionCicloContable = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        yearCicloContable = new com.toedter.calendar.JYearChooser();

        setBackground(new java.awt.Color(204, 204, 255));

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

        jTableCicloContable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableCicloContable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Año", "Fecha Inicial", "Fecha Final", "Estado", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableCicloContable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCicloContableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCicloContable);

        btActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/actualizar.png"))); // NOI18N
        btActualizar.setOpaque(false);
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Registrar Ciclo Contable", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(725, 212));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Código:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 35, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Descripción:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, -1, -1));

        txtCodCicloContable.setEditable(false);
        txtCodCicloContable.setBackground(new java.awt.Color(204, 204, 255));
        txtCodCicloContable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.add(txtCodCicloContable, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 70, -1));

        fechaInicial.setDateFormatString("d-MM-yyyy");
        fechaInicial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.add(fechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 120, 23));

        fechaFinal.setDateFormatString("d-MM-yyyy");
        fechaFinal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fechaFinal.setMaxSelectableDate(new java.util.Date(253370782873000L));
        jPanel4.add(fechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 120, 23));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("Fecha Inicial:");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 35, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setText("Fecha Final:");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 65, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbCerrado.setBackground(new java.awt.Color(0, 153, 255));
        buttonGroup1.add(rbCerrado);
        rbCerrado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbCerrado.setText("Cerrado");
        jPanel1.add(rbCerrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 23));

        rbAbierto.setBackground(new java.awt.Color(0, 153, 255));
        buttonGroup1.add(rbAbierto);
        rbAbierto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbAbierto.setText("Abierto");
        jPanel1.add(rbAbierto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, 23));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 22, 100, 70));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));

        txtDescripcionCicloContable.setEditable(false);
        txtDescripcionCicloContable.setBackground(new java.awt.Color(204, 204, 255));
        txtDescripcionCicloContable.setColumns(20);
        txtDescripcionCicloContable.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        txtDescripcionCicloContable.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionCicloContable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 260, 60));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setText("Año:");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 65, -1, -1));

        yearCicloContable.setOpaque(false);
        jPanel4.add(yearCicloContable, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 55, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
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
                                .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 256, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar)
                    .addComponent(btNuevo))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btBuscar)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private String optenerFecha(JDateChooser date){
        String dia = Integer.toString(date.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(date.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(date.getCalendar().get(Calendar.YEAR));
        return (year + "-" + mes+ "-" + dia);
    }
    
    private boolean Estado(){
        boolean estado;
        if(rbAbierto.isSelected()==true)
            estado=true;
        else 
            estado=false;
        
        return estado ;
    }
    
    private void borrar(){
        txtCodCicloContable.setText("");
        txtDescripcionCicloContable.setText("");
        rbAbierto.setSelected(false);
        rbCerrado.setSelected(false);
    }
    private void habilitar(boolean estado){
        txtDescripcionCicloContable.setEditable(estado); 
    }
    
    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        CicloContable CC = new CicloContable() {};
        boolean existencia = true;
        try {
            existencia = BDCicloContable.buscarExsistenciaCicloContable(String.valueOf(yearCicloContable.getYear()));
        } catch (SQLException ex) {
            Logger.getLogger(JpanelMantenimientoCicloContable.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(txtDescripcionCicloContable.isEditable()){
            if(fechaFinal.getCalendar().get(Calendar.YEAR)==yearCicloContable.getYear() & 
               fechaInicial.getCalendar().get(Calendar.YEAR)==yearCicloContable.getYear()){
                if(rbAbierto.isSelected()==true | rbCerrado.isSelected()==true){
                    if(existencia==false){
                        CC.setCodCicloContable( String.valueOf(yearCicloContable.getYear()));
                        CC.setFechaInicioCicloContable(Date.valueOf(optenerFecha(fechaInicial)));
                        CC.setFechaFinCicloContable(Date.valueOf(optenerFecha(fechaFinal)));
                        CC.setDescripcion(txtDescripcionCicloContable.getText());
                        CC.setEstado(Estado());
                        try {
                            BDCicloContable.insertarCicloContable(CC);
                            borrar();
                            btGuardar.setEnabled(false);
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(this, "Error BD: " + e.getMessage());
                        }
                        JOptionPane.showMessageDialog(this, "Se Agregó Correctamente!!");
                    }else{
                        JOptionPane.showMessageDialog(this, "Este Ciclo Contable existe.");
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Seleccione el estado del Ciclo Contable.");
                }
            }else{
                JOptionPane.showMessageDialog(this, "El año del Ciclo Contable tiene que coincidir.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Presione el boton nuevo.");
        }
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        habilitar(true);
        btGuardar.setEnabled(true);
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        MostrarCicloContable();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
       MostrarCicloContable();
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        txtCodCicloContable.setText("");
        txtDescripcionCicloContable.setText("");
        habilitar(false);
        btGuardar.setEnabled(false);
        btEditar.setEnabled(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void jTableCicloContableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCicloContableMouseClicked
            habilitar(true);
            btEditar.setEnabled(true);
            int fila=jTableCicloContable.getSelectedRow();
            txtCodCicloContable.setText(jTableCicloContable.getValueAt(fila, 0).toString());
            txtDescripcionCicloContable.setText(jTableCicloContable.getValueAt(fila, 5).toString());
            fechaFinal.setDate(Date.valueOf(jTableCicloContable.getValueAt(fila, 3).toString()));
            fechaInicial.setDate(Date.valueOf(jTableCicloContable.getValueAt(fila, 2).toString()));
            yearCicloContable.setYear(Integer.parseInt(jTableCicloContable.getValueAt(fila, 0).toString()));
            if(Boolean.valueOf(jTableCicloContable.getValueAt(fila, 4).toString())==true)
                rbAbierto.setSelected(true);
            else 
                rbCerrado.setSelected(true);
    }//GEN-LAST:event_jTableCicloContableMouseClicked

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int fila=jTableCicloContable.getSelectedRow();
         CicloContable CC;   
        if(jTableCicloContable.getSelectedRow()>=0){
            if(fechaFinal.getCalendar().get(Calendar.YEAR)==fechaInicial.getCalendar().get(Calendar.YEAR)){
                try {
                    CC= BDCicloContable.buscarCicloContable(txtCodCicloContable.getText());
                    CC.setFechaInicioCicloContable(Date.valueOf(optenerFecha(fechaInicial)));
                    CC.setFechaFinCicloContable(Date.valueOf(optenerFecha(fechaFinal)));
                    CC.setEstado(Estado());
                    CC.setDescripcion(txtDescripcionCicloContable.getText());

                    BDCicloContable.actualizarCicloContable(CC);
                    JOptionPane.showMessageDialog(this, " [ Datos Actualizados ]");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
                }
                borrar();
            }else{
                JOptionPane.showMessageDialog(this, "El año del Ciclo Contable tiene que coincidir.");
            }
        } else{
            JOptionPane.showMessageDialog(this, "Seleccione el dato que desea editar.");
        } 
    }//GEN-LAST:event_btEditarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            MostrarCicloContable(); 
            habilitar(false);  
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void MostrarCicloContable(){
        btEditar.setEnabled(false);
        btGuardar.setEnabled(false);
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            String titulos[] = {"Código", "Año", "Fecha Inicial" , "Fecha Final", "Estado", "Descripcion"};
            modelo.setColumnIdentifiers(titulos);
            
            if(true==txtBuscar.getText().isEmpty()){
                for (CicloContable CC : BDCicloContable.mostrarCicloContable()) {
                    String Datos[] = {CC.getCodCicloContable(), CC.getCodCicloContable(),
                    CC.getFechaInicioCicloContable().toString(),CC.getFechaFinCicloContable().toString(),
                    String.valueOf(CC.isEstado()), CC.getDescripcion()};
                    modelo.addRow(Datos);
                }
            }else{
                for (CicloContable CC : BDCicloContable.mostrarCicloContable(txtBuscar.getText())) {
                    String Datos[] = {CC.getCodCicloContable(), CC.getCodCicloContable(),
                    CC.getFechaInicioCicloContable().toString(),CC.getFechaFinCicloContable().toString(),
                    String.valueOf(CC.isEstado()), CC.getDescripcion()};
                    modelo.addRow(Datos);
                }
            }
            
            jTableCicloContable.setModel(modelo);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser fechaFinal;
    private com.toedter.calendar.JDateChooser fechaInicial;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCicloContable;
    private javax.swing.JRadioButton rbAbierto;
    private javax.swing.JRadioButton rbCerrado;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodCicloContable;
    private javax.swing.JTextArea txtDescripcionCicloContable;
    private com.toedter.calendar.JYearChooser yearCicloContable;
    // End of variables declaration//GEN-END:variables
}
