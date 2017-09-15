
package ComponentesPresentacion;

import ComponenteClase.AcapitePresupuestal;
import ComponenteClase.CatalogoPresupuesto;
import ComponenteClase.EscenarioPresupuesto;
import ComponenteClase.EscenarioPresupuestoDetalle;
import ComponenteClase.PeriodoContable;
import ComponenteDatos.BDAcapitePresupuestal;
import ComponenteDatos.BDCatalogoPresupuesto;
import ComponenteDatos.BDEscenarioPresupuesto;
import ComponenteDatos.BDEscenarioPresupuestoDetalle;
import ComponenteDatos.BDPeriodoContable;
import ComponenteDatos.BDUsuario;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JpanelEscenarioPresupuestal extends javax.swing.JPanel {

    private int CodUsu;
    public JpanelEscenarioPresupuestal(int CodUsu) throws SQLException {
        initComponents();
        this.CodUsu =CodUsu;
        mostrarAcapite();
        mostrarPeriodoContable();
        habilitar(false);
        borrar();
        MostrarEscenarioPresupuesto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtMontoEjecudato = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCatalogo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fechaEscenario = new com.toedter.calendar.JDateChooser();
        txtMontoSolicitado = new javax.swing.JTextField();
        txtMontoAprobado = new javax.swing.JTextField();
        cbAcapite = new javax.swing.JComboBox<>();
        txtNumero = new javax.swing.JTextField();
        cbPeriodo = new javax.swing.JComboBox<>();
        btNuevo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEscenario = new javax.swing.JTable();
        btActualizar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Registrar Escenario Presupuestal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(725, 212));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("N°:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        txtMontoEjecudato.setEditable(false);
        txtMontoEjecudato.setBackground(new java.awt.Color(204, 204, 255));
        txtMontoEjecudato.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMontoEjecudato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoEjecudatoKeyTyped(evt);
            }
        });
        jPanel3.add(txtMontoEjecudato, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 85, 110, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Acápite:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 60, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Monto Solicitado:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 100, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Fecha:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 150, -1, -1));

        txtDescripcion.setEditable(false);
        txtDescripcion.setBackground(new java.awt.Color(204, 204, 255));
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setPreferredSize(new java.awt.Dimension(158, 80));
        jScrollPane4.setViewportView(txtDescripcion);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 115, 280, 53));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Monto Aprobado:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Periodo:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Monto Ejecutado:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        txtNombreCatalogo.setEditable(false);
        txtNombreCatalogo.setBackground(new java.awt.Color(204, 204, 255));
        txtNombreCatalogo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtNombreCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 85, 220, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Descripción:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 120, -1, -1));

        fechaEscenario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(fechaEscenario, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 145, 120, 23));

        txtMontoSolicitado.setEditable(false);
        txtMontoSolicitado.setBackground(new java.awt.Color(204, 204, 255));
        txtMontoSolicitado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMontoSolicitado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoSolicitadoKeyTyped(evt);
            }
        });
        jPanel3.add(txtMontoSolicitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 25, 110, -1));

        txtMontoAprobado.setEditable(false);
        txtMontoAprobado.setBackground(new java.awt.Color(204, 204, 255));
        txtMontoAprobado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMontoAprobado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoAprobadoKeyTyped(evt);
            }
        });
        jPanel3.add(txtMontoAprobado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 55, 110, -1));

        cbAcapite.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbAcapite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAcapiteActionPerformed(evt);
            }
        });
        jPanel3.add(cbAcapite, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 55, 150, 23));

        txtNumero.setEditable(false);
        txtNumero.setBackground(new java.awt.Color(204, 204, 255));
        txtNumero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 25, 70, -1));

        cbPeriodo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(cbPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 115, 120, -1));

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
        btCancelar.setPreferredSize(new java.awt.Dimension(111, 29));
        btCancelar.setRequestFocusEnabled(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btBuscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Buscar.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jTableEscenario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableEscenario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Período", "Acápite", "Fecha", "Descripcion", "Monto Solicitado", "Monto Aprobado", "Monto Ejecutado"
            }
        ));
        jScrollPane2.setViewportView(jTableEscenario);

        btActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/actualizar.png"))); // NOI18N
        btActualizar.setOpaque(false);
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 275, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardar)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar)
                    .addComponent(btNuevo))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btBuscar)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void borrar(){
        txtDescripcion.setText("");
        txtMontoAprobado.setText("");
        txtMontoEjecudato.setText("");
        txtMontoSolicitado.setText("");
        txtNumero.setText("");
        txtNombreCatalogo.setText("");
    }
    
    private void habilitar(boolean estado){
        txtDescripcion.setEditable(estado);
        txtMontoAprobado.setEditable(estado);
        txtMontoEjecudato.setEditable(estado);
        txtMontoSolicitado.setEditable(estado);
        cbAcapite.setEnabled(estado);
        cbPeriodo.setEnabled(estado);
    }
    
    private String optenerFecha(JDateChooser date){
        String dia = Integer.toString(date.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(date.getCalendar().get(Calendar.MONTH)+1);
        String year = Integer.toString(date.getCalendar().get(Calendar.YEAR));
        return (year + "-" + mes+ "-" + dia);
    }
    
    private String numeroEscenario(String numero){
        return "ESC-".concat(numero);
    }
    
    private String idnumeroEscenario(String numero){
        String dato[] = null;
        String delimiter="-";
        dato= numero.split(delimiter);
        return dato[1];
    }
    
    private void mostrarPeriodoContable() throws SQLException{
        for (PeriodoContable PC : BDPeriodoContable.mostrarPeriodoContable()) {
            cbPeriodo.addItem(PC.getCodPeriodoContable());
        }
    }
    
    private boolean ComprobarMonto(){
        int mAprobado,mSolicitado,mEjecutado;
        boolean verificar = false;
        mAprobado = Integer.parseInt(txtMontoAprobado.getText());
        mSolicitado = Integer.parseInt(txtMontoSolicitado.getText());
        mEjecutado = Integer.parseInt(txtMontoEjecudato.getText());
        
        if(mSolicitado!=0 & mAprobado!=0){
            if(mEjecutado<=mSolicitado){
                if(mSolicitado<=mAprobado){
                    verificar=true;
                }
            }
        }
        return verificar;
    }
    
    private void mostrarAcapite() throws SQLException{
        for (AcapitePresupuestal PC : BDAcapitePresupuestal.mostrarAcapitePresupuestal()) {
            cbAcapite.addItem(PC.getNomAcapitePresupuestal());
        }
    }
    
    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        btEditar.setEnabled(false);
        btGuardar.setEnabled(true);
        btNuevo.setEnabled(false);
        habilitar(true);
        try {
            txtNumero.setText(numeroEscenario(String.valueOf(BDEscenarioPresupuesto.buscarMaxEscenarioPresupuesto())));
        } catch (SQLException ex) {
            Logger.getLogger(JpanelEscenarioPresupuestal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        btEditar.setEnabled(false);
        btGuardar.setEnabled(false);
        btNuevo.setEnabled(true);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        EscenarioPresupuesto EP=new EscenarioPresupuesto() {};
        EscenarioPresupuestoDetalle EPD= new EscenarioPresupuestoDetalle(){};
        
        if(txtDescripcion.isEditable()){
            EP.setDescripcionEscenarioPresupuesto(txtDescripcion.getText());
            EP.setFechaEscenarioPresupuesto(Date.valueOf(optenerFecha(fechaEscenario)));
            EP.setNumeroEscenarioPresupuesto(txtNumero.getText());
            try {
                EP.setIdUsuario(BDUsuario.mostrarUsuario1(String.valueOf(CodUsu)));
                BDEscenarioPresupuesto.insertarEscenarioPresupuesto(EP);
                
                EPD.setCodAcapitePresupuestal(BDAcapitePresupuestal.buscarNomAcapitePresupuestal(cbAcapite.getSelectedItem().toString()));
                EPD.setCodPeriodoContable(BDPeriodoContable.buscarPeriodoContable(cbPeriodo.getSelectedItem().toString()));
                EPD.setIdEscenarioPresupuesto(BDEscenarioPresupuesto.buscarEscenarioPresupuesto(txtNumero.getText()));
                EPD.setMontoAprobado(Double.valueOf(txtMontoAprobado.getText()));
                EPD.setMontoEjecutado(Double.valueOf(txtMontoEjecudato.getText()));
                EPD.setMontoSolicitado(Double.valueOf(txtMontoSolicitado.getText()));
                BDEscenarioPresupuestoDetalle.insertarEscenarioPresupuestoDetalle(EPD);
                
                borrar();
                habilitar(false);
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

    private void cbAcapiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAcapiteActionPerformed
        AcapitePresupuestal AP;
        CatalogoPresupuesto CP;
        try {
            AP= BDAcapitePresupuestal.buscarNomAcapitePresupuestal(cbAcapite.getSelectedItem().toString());
            CP= BDCatalogoPresupuesto.buscarCatalogoPresupuesto(AP.getIdCatalogoPresupuesto().getCodCatalogoPresupuesto());
            
            txtNombreCatalogo.setText(CP.getNomCatalogoPresupuesto());
            
        } catch (SQLException ex) {
            Logger.getLogger(JpanelEscenarioPresupuestal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbAcapiteActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        MostrarEscenarioPresupuesto();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        MostrarEscenarioPresupuesto();
    }//GEN-LAST:event_btActualizarActionPerformed

    private void txtMontoSolicitadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoSolicitadoKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
                || (vChar == KeyEvent.VK_BACK_SPACE)
                || (vChar == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoSolicitadoKeyTyped

    private void txtMontoAprobadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoAprobadoKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
                || (vChar == KeyEvent.VK_BACK_SPACE)
                || (vChar == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoAprobadoKeyTyped

    private void txtMontoEjecudatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoEjecudatoKeyTyped
        char vChar = evt.getKeyChar();
        if (!(Character.isDigit(vChar)
                || (vChar == KeyEvent.VK_BACK_SPACE)
                || (vChar == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoEjecudatoKeyTyped

    private void MostrarEscenarioPresupuesto(){
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            String titulos[] = {"Nº", "Período", "Acápite", "Fecha" , 
                                "Descripción", "Monto Solicitado", "Monto Aprobado",
                                "Monto Ejecutado"};
            modelo.setColumnIdentifiers(titulos);
            
            if(true==txtBuscar.getText().isEmpty()){
                for (EscenarioPresupuestoDetalle EP : BDEscenarioPresupuestoDetalle.mostrarEscenarioPresupuesto()) {
                    String Datos[] = {EP.getIdEscenarioPresupuesto().getNumeroEscenarioPresupuesto(),
                    EP.getCodPeriodoContable().getCodPeriodoContable(),
                    EP.getCodAcapitePresupuestal().getNomAcapitePresupuestal(),
                    EP.getIdEscenarioPresupuesto().getFechaEscenarioPresupuesto().toString(),
                    EP.getIdEscenarioPresupuesto().getDescripcionEscenarioPresupuesto(),
                    String.valueOf(EP.getMontoSolicitado()),
                    String.valueOf(EP.getMontoAprobado()),
                    String.valueOf(EP.getMontoEjecutado())};
                    modelo.addRow(Datos);
                }
            }else{
                
            }
            jTableEscenario.setModel(modelo);
            
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
    private javax.swing.JComboBox<String> cbAcapite;
    private javax.swing.JComboBox<String> cbPeriodo;
    private com.toedter.calendar.JDateChooser fechaEscenario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableEscenario;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtMontoAprobado;
    private javax.swing.JTextField txtMontoEjecudato;
    private javax.swing.JTextField txtMontoSolicitado;
    private javax.swing.JTextField txtNombreCatalogo;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
