
package ComponentesPresentacion;

import ComponenteClase.TipoUsuario;
import ComponenteClase.Usuario;
import ComponenteDatos.BDTipoUsuario;
import ComponenteDatos.BDUsuario;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class JpanelMantenimientoUsuario extends javax.swing.JPanel {

    public JpanelMantenimientoUsuario() {
        initComponents();
        MostrarTipoUsuario();
        MostrarUsuario();
        mostrardatosBox();
        txtCodTipoUsuario.setEditable(false);
        txtNomTipoUsuario.setEditable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtNickUsuario = new javax.swing.JTextField();
        txtApeUsuario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtDirUsuario = new javax.swing.JTextArea();
        txtCelUsuario = new javax.swing.JTextField();
        txtCedUsuario = new javax.swing.JTextField();
        txtNomUsuario = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtTelUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCodUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boxTipoUsuario = new javax.swing.JComboBox<>();
        txtContUsuario = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        checkEstadoUsuario = new javax.swing.JCheckBox();
        btNuevoUsuario = new javax.swing.JButton();
        btEditarUsuario = new javax.swing.JButton();
        btGuardarUsuario = new javax.swing.JButton();
        btCancelarUsuario = new javax.swing.JButton();
        txtBuscarUsuario = new javax.swing.JTextField();
        btBuscarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        btActualizarUsuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtNomTipoUsuario = new javax.swing.JTextField();
        txtCodTipoUsuario = new javax.swing.JTextField();
        btNuevoTipoUsuario = new javax.swing.JButton();
        btEditarTipoUsuario = new javax.swing.JButton();
        btGuardarTipoUsuario = new javax.swing.JButton();
        btCancelarTipoUsuario = new javax.swing.JButton();
        txtBuscarTipoUsuario = new javax.swing.JTextField();
        btBuscarTipoUsuario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTipoUsuario = new javax.swing.JTable();
        btActualizarTipoUsuario = new javax.swing.JButton();

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Registrar Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(725, 212));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Código:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txtNickUsuario.setEditable(false);
        txtNickUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtNickUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtNickUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 85, 130, -1));

        txtApeUsuario.setEditable(false);
        txtApeUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtApeUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtApeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 115, 208, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Nombre:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("Apellido:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 120, 50, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setText("Celular:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 150, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setText("Cédula:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 60, -1, -1));

        txtDirUsuario.setEditable(false);
        txtDirUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtDirUsuario.setColumns(20);
        txtDirUsuario.setRows(5);
        txtDirUsuario.setPreferredSize(new java.awt.Dimension(158, 80));
        jScrollPane4.setViewportView(txtDirUsuario);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 25, 270, 52));

        txtCelUsuario.setEditable(false);
        txtCelUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtCelUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCelUsuario.setToolTipText("Numero Celular");
        jPanel3.add(txtCelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 145, 109, -1));

        txtCedUsuario.setEditable(false);
        txtCedUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtCedUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCedUsuario.setToolTipText("");
        txtCedUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCedUsuario.setName("   -       -"); // NOI18N
        jPanel3.add(txtCedUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 55, 108, -1));

        txtNomUsuario.setEditable(false);
        txtNomUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtNomUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtNomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 85, 208, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("Direccion:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setText("Teléfono:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtTelUsuario.setEditable(false);
        txtTelUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtTelUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtTelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 175, 109, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Nick Name:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        txtCodUsuario.setEditable(false);
        txtCodUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtCodUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtCodUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 25, 97, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Tipo Usuario:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        boxTipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(boxTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 145, 190, -1));

        txtContUsuario.setEditable(false);
        txtContUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtContUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel3.add(txtContUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 115, 130, -1));

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Estado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkEstadoUsuario.setBackground(new java.awt.Color(0, 153, 255));
        checkEstadoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        checkEstadoUsuario.setText("Activo");
        jPanel5.add(checkEstadoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 90, 50));

        btNuevoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/nuevo icono.png"))); // NOI18N
        btNuevoUsuario.setText("Nuevo");
        btNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoUsuarioActionPerformed(evt);
            }
        });

        btEditarUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Editar.png"))); // NOI18N
        btEditarUsuario.setText("Editar");
        btEditarUsuario.setEnabled(false);
        btEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarUsuarioActionPerformed(evt);
            }
        });

        btGuardarUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btGuardarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Guardar.png"))); // NOI18N
        btGuardarUsuario.setText("Guardar");
        btGuardarUsuario.setEnabled(false);
        btGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarUsuarioActionPerformed(evt);
            }
        });

        btCancelarUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btCancelarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Cancelar.png"))); // NOI18N
        btCancelarUsuario.setText("Cancelar");
        btCancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarUsuarioActionPerformed(evt);
            }
        });

        txtBuscarUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBuscarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarUsuarioKeyPressed(evt);
            }
        });

        btBuscarUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Buscar.png"))); // NOI18N
        btBuscarUsuario.setText("Buscar");
        btBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarUsuarioActionPerformed(evt);
            }
        });

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cédula", "Nombre", "Apellido", "Celular", "Teléfono", "Nick Name", "Estado", "Tipo de Usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuario);
        if (jTableUsuario.getColumnModel().getColumnCount() > 0) {
            jTableUsuario.getColumnModel().getColumn(7).setResizable(false);
        }

        btActualizarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/actualizar.png"))); // NOI18N
        btActualizarUsuario.setOpaque(false);
        btActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btNuevoUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(btEditarUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(btGuardarUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelarUsuario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btBuscarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardarUsuario)
                    .addComponent(btCancelarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarUsuario)
                    .addComponent(btNuevoUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btBuscarUsuario)
                        .addComponent(txtBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btActualizarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Usuario", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Registrar Tipo de Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(725, 212));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("Código:");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("Nombre:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        txtNomTipoUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtNomTipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.add(txtNomTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 55, 208, -1));

        txtCodTipoUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txtCodTipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel4.add(txtCodTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 55, 97, -1));

        btNuevoTipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btNuevoTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/nuevo icono.png"))); // NOI18N
        btNuevoTipoUsuario.setText("Nuevo");
        btNuevoTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoTipoUsuarioActionPerformed(evt);
            }
        });

        btEditarTipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btEditarTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Editar.png"))); // NOI18N
        btEditarTipoUsuario.setText("Editar");
        btEditarTipoUsuario.setEnabled(false);
        btEditarTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarTipoUsuarioActionPerformed(evt);
            }
        });

        btGuardarTipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btGuardarTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Guardar.png"))); // NOI18N
        btGuardarTipoUsuario.setText("Guardar");
        btGuardarTipoUsuario.setEnabled(false);
        btGuardarTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarTipoUsuarioActionPerformed(evt);
            }
        });

        btCancelarTipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btCancelarTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Cancelar.png"))); // NOI18N
        btCancelarTipoUsuario.setText("Cancelar");
        btCancelarTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarTipoUsuarioActionPerformed(evt);
            }
        });

        txtBuscarTipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBuscarTipoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarTipoUsuarioMouseClicked(evt);
            }
        });
        txtBuscarTipoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarTipoUsuarioKeyPressed(evt);
            }
        });

        btBuscarTipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btBuscarTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/Buscar.png"))); // NOI18N
        btBuscarTipoUsuario.setText("Buscar");
        btBuscarTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarTipoUsuarioActionPerformed(evt);
            }
        });

        jTableTipoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTableTipoUsuario.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableTipoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTipoUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableTipoUsuario);
        if (jTableTipoUsuario.getColumnModel().getColumnCount() > 0) {
            jTableTipoUsuario.getColumnModel().getColumn(0).setHeaderValue("Código");
            jTableTipoUsuario.getColumnModel().getColumn(1).setHeaderValue("Nombre");
        }

        btActualizarTipoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/actualizar.png"))); // NOI18N
        btActualizarTipoUsuario.setOpaque(false);
        btActualizarTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarTipoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btNuevoTipoUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(btEditarTipoUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(btGuardarTipoUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelarTipoUsuario))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btBuscarTipoUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btActualizarTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGuardarTipoUsuario)
                    .addComponent(btCancelarTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarTipoUsuario)
                    .addComponent(btNuevoTipoUsuario))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btBuscarTipoUsuario)
                        .addComponent(txtBuscarTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btActualizarTipoUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tipo de Usuario", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mostrardatosBox(){
        try {         
            for (TipoUsuario TU : BDTipoUsuario.mostrarNomTipoUsuario()) {
                boxTipoUsuario.addItem(TU.getNomTipoUsuario());
            }
            
     
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }
    
    private void CodigoMaxTipoUsuario(){
        try {
            txtCodTipoUsuario.setText(String.valueOf(1+(BDTipoUsuario.BuscarCodMax().getCodTipoUsuario())));
        } catch (SQLException ex) {
            Logger.getLogger(JpanelMantenimientoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void CodigoMaxUsuario(){
        try {
            txtCodUsuario.setText(String.valueOf(1+(BDUsuario.BuscarCodMax().getIdUsuario())));
        } catch (SQLException ex) {
            Logger.getLogger(JpanelMantenimientoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void borrar(){
        txtNomTipoUsuario.setText("");
        txtCodTipoUsuario.setText("");
        txtApeUsuario.setText("");
        txtNomUsuario.setText("");
        txtNickUsuario.setText("");
        txtContUsuario.setText("");
        txtCelUsuario.setText("");
        txtDirUsuario.setText("");
        txtCedUsuario.setText("");
        txtTelUsuario.setText("");
        txtCodUsuario.setText("");
        estadoUsuario("false");
    }
    
    private void estadoUsuario(String estado){ 
        checkEstadoUsuario.setSelected(Boolean.valueOf(estado));
    }
    
    private void HabilitarTextfileUsurio(boolean estado){
        txtApeUsuario.setEditable(estado);
        txtNomUsuario.setEditable(estado);
        txtNickUsuario.setEditable(estado);
        txtContUsuario.setEditable(estado);
        txtCelUsuario.setEditable(estado);
        txtDirUsuario.setEditable(estado);
        txtCedUsuario.setEditable(estado);
        txtTelUsuario.setEditable(estado);
    }
    
    private void btEditarTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarTipoUsuarioActionPerformed
        TipoUsuario TU;
        if(jTableTipoUsuario.getSelectedRow()>=0){
            try {
                TU = BDTipoUsuario.buscarTipoUsuarioPorId(txtCodTipoUsuario.getText());
                TU.setNomTipoUsuario(txtNomTipoUsuario.getText());
               
                BDTipoUsuario.actualizarTipoUsuario(TU);
                JOptionPane.showMessageDialog(this, " [ Datos Actualizados ]");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            
        } else{
            JOptionPane.showMessageDialog(this, "Seleccione el dato que desea editar ");
        }    
    }//GEN-LAST:event_btEditarTipoUsuarioActionPerformed

    private void btGuardarTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarTipoUsuarioActionPerformed
        TipoUsuario TU = new TipoUsuario() {}; 
       
        TU.setNomTipoUsuario(txtNomTipoUsuario.getText());
        try {
            BDTipoUsuario.insertarTipoUsuario(TU);
            txtNomTipoUsuario.setText("");
            btGuardarTipoUsuario.setEnabled(false);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error BD: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(this, "Se Agregó Correctamente!!");
        CodigoMaxTipoUsuario();
    }//GEN-LAST:event_btGuardarTipoUsuarioActionPerformed

    private void btCancelarTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarTipoUsuarioActionPerformed
        txtNomTipoUsuario.setText("");
        txtCodTipoUsuario.setText("");
        txtNomTipoUsuario.setEditable(false);
        btEditarTipoUsuario.setEnabled(false);
        btGuardarTipoUsuario.setEnabled(false);
    }//GEN-LAST:event_btCancelarTipoUsuarioActionPerformed

    private void btBuscarTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarTipoUsuarioActionPerformed
        txtNomTipoUsuario.setEditable(false);
        MostrarTipoUsuario();
    }//GEN-LAST:event_btBuscarTipoUsuarioActionPerformed

    private void btActualizarTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarTipoUsuarioActionPerformed
        MostrarTipoUsuario();
        borrar();
    }//GEN-LAST:event_btActualizarTipoUsuarioActionPerformed

    private void btNuevoTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoTipoUsuarioActionPerformed
        txtNomTipoUsuario.setEditable(true);
        txtNomTipoUsuario.setText("");
        CodigoMaxTipoUsuario();
        btGuardarTipoUsuario.setEnabled(true);
        btEditarTipoUsuario.setEnabled(false);
    }//GEN-LAST:event_btNuevoTipoUsuarioActionPerformed

    private void jTableTipoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTipoUsuarioMouseClicked
        btEditarTipoUsuario.setEnabled(true);
        btGuardarTipoUsuario.setEnabled(false);
        txtNomTipoUsuario.setEditable(true);
        int fila=jTableTipoUsuario.getSelectedRow();
        txtCodTipoUsuario.setText(jTableTipoUsuario.getValueAt(fila, 0).toString());
        txtNomTipoUsuario.setText(jTableTipoUsuario.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_jTableTipoUsuarioMouseClicked

    private void txtBuscarTipoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarTipoUsuarioMouseClicked
        txtNomTipoUsuario.setEditable(false);
        borrar();
    }//GEN-LAST:event_txtBuscarTipoUsuarioMouseClicked

    private void btBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarUsuarioActionPerformed
        MostrarUsuario(); HabilitarTextfileUsurio(false);  
    }//GEN-LAST:event_btBuscarUsuarioActionPerformed

    private void btNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoUsuarioActionPerformed
        HabilitarTextfileUsurio(true);  
        CodigoMaxUsuario();
        btGuardarUsuario.setEnabled(true);
        btEditarUsuario.setEnabled(false);
    }//GEN-LAST:event_btNuevoUsuarioActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
        btEditarUsuario.setEnabled(true);
        btGuardarUsuario.setEnabled(false);
        HabilitarTextfileUsurio(true);
        int fila=jTableUsuario.getSelectedRow();

        txtCodUsuario.setText(jTableUsuario.getValueAt(fila, 0).toString());
        txtCedUsuario.setText(jTableUsuario.getValueAt(fila, 1).toString());
        txtNomUsuario.setText(jTableUsuario.getValueAt(fila, 2).toString());
        txtApeUsuario.setText(jTableUsuario.getValueAt(fila, 3).toString());
        txtCelUsuario.setText(jTableUsuario.getValueAt(fila, 4).toString());
        txtTelUsuario.setText(jTableUsuario.getValueAt(fila, 5).toString());
        txtNickUsuario.setText(jTableUsuario.getValueAt(fila, 6).toString());
        estadoUsuario(jTableUsuario.getValueAt(fila, 7).toString());
        try {
            txtDirUsuario.setText(BDUsuario.mostrarUsuario1(jTableUsuario.getValueAt(fila, 0).toString()).getDireccion());
        } catch (SQLException ex) {
            Logger.getLogger(JpanelMantenimientoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        boxTipoUsuario.setSelectedItem(jTableUsuario.getValueAt(fila, 8).toString());
    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void btGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarUsuarioActionPerformed
        Usuario user = new Usuario() {}; 
       
        user.setNombre(txtNomUsuario.getText());
        user.setCedula(txtCedUsuario.getText());
        user.setApellido(txtApeUsuario.getText());
        user.setCelular(txtCelUsuario.getText());
        user.setTelefono(txtTelUsuario.getText());
        user.setNickname(txtNickUsuario.getText());
        user.setEstado(checkEstadoUsuario.isSelected());
        user.setDireccion(txtDirUsuario.getText());
        user.setDireccion(txtContUsuario.getText());
        try {
            user.setCodTipoUsuario(BDTipoUsuario.buscarTipoUsuarioPorId(boxTipoUsuario.getSelectedIndex()+1));
            BDUsuario.insertarUsuario(user);
        } catch (SQLException ex) {
            Logger.getLogger(JpanelMantenimientoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        btGuardarUsuario.setEnabled(false);
        borrar();
        HabilitarTextfileUsurio(false);
        JOptionPane.showMessageDialog(this, "Se Agregó Correctamente!!");
        CodigoMaxTipoUsuario();
    }//GEN-LAST:event_btGuardarUsuarioActionPerformed

    private void btCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarUsuarioActionPerformed
        borrar(); HabilitarTextfileUsurio(false);
        btEditarUsuario.setEnabled(false);
        btGuardarUsuario.setEnabled(false);
    }//GEN-LAST:event_btCancelarUsuarioActionPerformed

    private void btActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarUsuarioActionPerformed
        MostrarUsuario(); HabilitarTextfileUsurio(false);
    }//GEN-LAST:event_btActualizarUsuarioActionPerformed

    private void btEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarUsuarioActionPerformed
        Usuario user;
        if(jTableUsuario.getSelectedRow()>=0){
            try {
                user = BDUsuario.mostrarUsuario1(txtCodUsuario.getText());
                user.setNombre(txtNomUsuario.getText());
                user.setApellido(txtApeUsuario.getText());
                user.setCedula(txtCedUsuario.getText());
                user.setCelular(txtCelUsuario.getText());
                user.setTelefono(txtTelUsuario.getText());
                user.setDireccion(txtDirUsuario.getText());
                user.setNickname(txtNickUsuario.getText());
                user.setContrasena(txtContUsuario.getText());
                user.setEstado(checkEstadoUsuario.isSelected());
                user.setCodTipoUsuario(BDTipoUsuario.buscarTipoUsuarioPorId(boxTipoUsuario.getSelectedIndex()+1));
               
                BDUsuario.actualizarUsuario(user);
                JOptionPane.showMessageDialog(this, " [ Datos Actualizados ]");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error BD: " + e.getMessage());
            }
            
        } else{
            JOptionPane.showMessageDialog(this, "Seleccione el dato que desea editar ");
        } 
    }//GEN-LAST:event_btEditarUsuarioActionPerformed

    private void txtBuscarUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarUsuarioKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            MostrarUsuario(); 
            HabilitarTextfileUsurio(false);  
        }
			
    }//GEN-LAST:event_txtBuscarUsuarioKeyPressed

    private void txtBuscarTipoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarTipoUsuarioKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            txtNomTipoUsuario.setEditable(false);
            MostrarTipoUsuario();
        }
    }//GEN-LAST:event_txtBuscarTipoUsuarioKeyPressed

    void MostrarUsuario(){
        btEditarUsuario.setEnabled(false);
        btGuardarUsuario.setEnabled(false);
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            String titulos[] = {"Código", "Cédula", "Nombre", "Apellido", "Celular", "Teléfono", "Nickname", "Estado", "Tipo de Usuario"};
            modelo.setColumnIdentifiers(titulos);
            
            if(true==txtBuscarUsuario.getText().isEmpty()){
                for (Usuario user : BDUsuario.mostrarUsuario()) {
                    String Datos[] = {String.valueOf(user.getIdUsuario()),
                        user.getCedula(), user.getNombre(),user.getApellido(),
                        user.getCelular(),user.getTelefono(), user.getNickname(),
                        String.valueOf(user.isEstado()),user.getCodTipoUsuario().getNomTipoUsuario()};
                    modelo.addRow(Datos);
                }
            }else{
                for (Usuario user : BDUsuario.mostrarUsuario(txtBuscarUsuario.getText())) {
                    String Datos[] = {String.valueOf(user.getIdUsuario()),
                        user.getCedula(), user.getNombre(),user.getApellido(),
                        user.getCelular(),user.getTelefono(), user.getNickname(),
                        String.valueOf(user.isEstado()),user.getCodTipoUsuario().getNomTipoUsuario()};
                    modelo.addRow(Datos);
                }
            }
            
            jTableUsuario.setModel(modelo);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }
    
    void MostrarTipoUsuario(){
        btEditarTipoUsuario.setEnabled(false);
        btGuardarTipoUsuario.setEnabled(false);
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            String titulos[] = {"Código", "Nombre"};
            modelo.setColumnIdentifiers(titulos);
            
            if(true==txtBuscarTipoUsuario.getText().isEmpty()){
                for (TipoUsuario TU : BDTipoUsuario.mostrarTipoUsuario()) {
                    String Datos[] = {String.valueOf(TU.getCodTipoUsuario()), TU.getNomTipoUsuario()};
                    modelo.addRow(Datos);
                }
            }else{
                for (TipoUsuario TU : BDTipoUsuario.buscarTipoUsuario(txtBuscarTipoUsuario.getText(), txtBuscarTipoUsuario.getText())) {
                    String Datos[] = {String.valueOf(TU.getCodTipoUsuario()), TU.getNomTipoUsuario()};
                    modelo.addRow(Datos);
                }
            }
            
            jTableTipoUsuario.setModel(modelo);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoUsuario;
    private javax.swing.JButton btActualizarTipoUsuario;
    private javax.swing.JButton btActualizarUsuario;
    private javax.swing.JButton btBuscarTipoUsuario;
    private javax.swing.JButton btBuscarUsuario;
    private javax.swing.JButton btCancelarTipoUsuario;
    private javax.swing.JButton btCancelarUsuario;
    private javax.swing.JButton btEditarTipoUsuario;
    private javax.swing.JButton btEditarUsuario;
    private javax.swing.JButton btGuardarTipoUsuario;
    private javax.swing.JButton btGuardarUsuario;
    private javax.swing.JButton btNuevoTipoUsuario;
    private javax.swing.JButton btNuevoUsuario;
    private javax.swing.JCheckBox checkEstadoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableTipoUsuario;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField txtApeUsuario;
    private javax.swing.JTextField txtBuscarTipoUsuario;
    private javax.swing.JTextField txtBuscarUsuario;
    private javax.swing.JTextField txtCedUsuario;
    private javax.swing.JTextField txtCelUsuario;
    private javax.swing.JTextField txtCodTipoUsuario;
    private javax.swing.JTextField txtCodUsuario;
    private javax.swing.JPasswordField txtContUsuario;
    private javax.swing.JTextArea txtDirUsuario;
    private javax.swing.JTextField txtNickUsuario;
    private javax.swing.JTextField txtNomTipoUsuario;
    private javax.swing.JTextField txtNomUsuario;
    private javax.swing.JTextField txtTelUsuario;
    // End of variables declaration//GEN-END:variables
}
