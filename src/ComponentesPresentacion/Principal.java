
package ComponentesPresentacion;
import ComponenteClase.Usuario;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends javax.swing.JFrame implements Runnable{

    private int CodUsu;
    private String hora, minutos, segundos, ampm;
    private Calendar calendario;
    private final CardLayout Card;
    private final Thread h1;
    
    public Principal(Usuario usu) {
        initComponents();
        this.setLocationRelativeTo(null);
        Card=(CardLayout) desktop.getLayout(); 
        lbFecha.setText(Fecha());
        h1 = new Thread(this);
        h1.start();
        JpMenuMantenimiento.setSize(190, 57);
        mostrarJpanelLogoInico();
        lUsuario.setText(usu.getNombre());
        CodUsu = usu.getIdUsuario();
    }
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        Card=(CardLayout) desktop.getLayout(); 
        lbFecha.setText(Fecha());
        h1 = new Thread(this);
        h1.start();
        JpMenuMantenimiento.setSize(190, 57);
        mostrarJpanelLogoInico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        desktop = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbReloj = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lUsuario = new javax.swing.JLabel();
        JpMenuAdministracion = new javax.swing.JPanel();
        btAdministracionPresupuesto = new javax.swing.JButton();
        btMantenimiento1 = new javax.swing.JButton();
        btMantenimientoCicloContable1 = new javax.swing.JButton();
        btMantenimientoCatalogoCuenta1 = new javax.swing.JButton();
        btMantenimientoPeriodoContable1 = new javax.swing.JButton();
        JpMenuMantenimiento = new javax.swing.JPanel();
        btMantenimientoUsuario = new javax.swing.JButton();
        btMantenimiento = new javax.swing.JButton();
        btMantenimientoCicloContable = new javax.swing.JButton();
        btMantenimientoCatalogoCuenta = new javax.swing.JButton();
        btMantenimientoPeriodoContable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 670));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btSalir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/door-exit grande.png"))); // NOI18N
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 200, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("UntouchableSoft");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 6, -1, 22));

        desktop.setLayout(new java.awt.CardLayout());
        jPanel1.add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 70, 750, 589));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Software para manejar Presupuesto Financiero");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 30, -1, -1));

        lbFecha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbFecha.setText("DD/MM/AAAA");
        jPanel1.add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        lbReloj.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbReloj.setText("00:00:00 AM");
        jPanel1.add(lbReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setText("Cerrar Secion");
        jButton4.setPreferredSize(new java.awt.Dimension(93, 39));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 200, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, -1));

        lUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lUsuario.setText("Micael");
        jPanel1.add(lUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 14, -1, -1));

        JpMenuAdministracion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JpMenuAdministracion.setPreferredSize(new java.awt.Dimension(190, 208));
        JpMenuAdministracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btAdministracionPresupuesto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btAdministracionPresupuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/budget-management.png"))); // NOI18N
        btAdministracionPresupuesto.setText("Escenario de Presupuesto");
        btAdministracionPresupuesto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btAdministracionPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdministracionPresupuestoActionPerformed(evt);
            }
        });
        JpMenuAdministracion.add(btAdministracionPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 200, -1));

        btMantenimiento1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btMantenimiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/presupuesto icono.png"))); // NOI18N
        btMantenimiento1.setText("Administración");
        btMantenimiento1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JpMenuAdministracion.add(btMantenimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 57));

        btMantenimientoCicloContable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btMantenimientoCicloContable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/catalogopresu.png"))); // NOI18N
        btMantenimientoCicloContable1.setText("Catálogo de Presupuesto");
        btMantenimientoCicloContable1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btMantenimientoCicloContable1.setPreferredSize(new java.awt.Dimension(171, 27));
        btMantenimientoCicloContable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMantenimientoCicloContable1ActionPerformed(evt);
            }
        });
        JpMenuAdministracion.add(btMantenimientoCicloContable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 108, 200, -1));

        btMantenimientoCatalogoCuenta1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btMantenimientoCatalogoCuenta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/acapite.png"))); // NOI18N
        btMantenimientoCatalogoCuenta1.setText("Acápite Presupuestal");
        btMantenimientoCatalogoCuenta1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btMantenimientoCatalogoCuenta1.setPreferredSize(new java.awt.Dimension(149, 27));
        btMantenimientoCatalogoCuenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMantenimientoCatalogoCuenta1ActionPerformed(evt);
            }
        });
        JpMenuAdministracion.add(btMantenimientoCatalogoCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 82, 200, -1));

        btMantenimientoPeriodoContable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btMantenimientoPeriodoContable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/reporte icono.png"))); // NOI18N
        btMantenimientoPeriodoContable1.setText(" Informe");
        btMantenimientoPeriodoContable1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btMantenimientoPeriodoContable1.setPreferredSize(new java.awt.Dimension(79, 27));
        JpMenuAdministracion.add(btMantenimientoPeriodoContable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 134, 200, -1));

        jPanel1.add(JpMenuAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 300, 200, 162));

        JpMenuMantenimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JpMenuMantenimiento.setPreferredSize(new java.awt.Dimension(190, 208));
        JpMenuMantenimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btMantenimientoUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btMantenimientoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/mmusuariotext.png"))); // NOI18N
        btMantenimientoUsuario.setText("  Usuario");
        btMantenimientoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btMantenimientoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMantenimientoUsuarioActionPerformed(evt);
            }
        });
        JpMenuMantenimiento.add(btMantenimientoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 200, -1));

        btMantenimiento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/mantenimiento.png"))); // NOI18N
        btMantenimiento.setText("Mantenimiento");
        btMantenimiento.setBorderPainted(false);
        btMantenimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JpMenuMantenimiento.add(btMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 57));

        btMantenimientoCicloContable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btMantenimientoCicloContable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/ciclo.png"))); // NOI18N
        btMantenimientoCicloContable.setText(" Ciclo Contable");
        btMantenimientoCicloContable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btMantenimientoCicloContable.setPreferredSize(new java.awt.Dimension(115, 27));
        btMantenimientoCicloContable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMantenimientoCicloContableActionPerformed(evt);
            }
        });
        JpMenuMantenimiento.add(btMantenimientoCicloContable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 108, 200, -1));

        btMantenimientoCatalogoCuenta.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btMantenimientoCatalogoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/catalogo de cuentas.png"))); // NOI18N
        btMantenimientoCatalogoCuenta.setText("  Catálogo de Cuentas");
        btMantenimientoCatalogoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btMantenimientoCatalogoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMantenimientoCatalogoCuentaActionPerformed(evt);
            }
        });
        JpMenuMantenimiento.add(btMantenimientoCatalogoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 82, 200, -1));

        btMantenimientoPeriodoContable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btMantenimientoPeriodoContable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilidades/periodo.png"))); // NOI18N
        btMantenimientoPeriodoContable.setText(" Período Contable");
        btMantenimientoPeriodoContable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btMantenimientoPeriodoContable.setPreferredSize(new java.awt.Dimension(129, 27));
        btMantenimientoPeriodoContable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMantenimientoPeriodoContableActionPerformed(evt);
            }
        });
        JpMenuMantenimiento.add(btMantenimientoPeriodoContable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 134, 200, -1));

        jPanel1.add(JpMenuMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, 200, 162));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void run() {
        Thread ct= Thread.currentThread();
        
        while(ct==h1){
            calcula();
            lbReloj.setText(hora+":"+minutos+":"+segundos+" "+ampm);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
    }
    
    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        
        calendario.setTime(fechaHoraActual);
        ampm= calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        
        if(ampm.equals("PM")){
            int h=calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?""+h:"0"+h;
        }else{
            hora= calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY); 
        }
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    
    public static String Fecha(){
         Date fecha=new Date();
         SimpleDateFormat FormatoFecha= new SimpleDateFormat("dd/MM/YYYY"); 
         return FormatoFecha.format(fecha);
    }
     
    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Loging lg=new Loging();
        lg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btMantenimientoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMantenimientoUsuarioActionPerformed
        mostrarJpanelMantenimientoUsuario();
    }//GEN-LAST:event_btMantenimientoUsuarioActionPerformed

    private void btMantenimientoCatalogoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMantenimientoCatalogoCuentaActionPerformed
        mostrarJpanelMantenimientoCatalogoCuenta();
    }//GEN-LAST:event_btMantenimientoCatalogoCuentaActionPerformed

    private void btMantenimientoCicloContableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMantenimientoCicloContableActionPerformed
        mostrarJpanelMantenimientoCicloContable();
    }//GEN-LAST:event_btMantenimientoCicloContableActionPerformed

    private void btMantenimientoPeriodoContableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMantenimientoPeriodoContableActionPerformed
        try {
            mostrarJpanelMantenimientoPeriodoContable();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btMantenimientoPeriodoContableActionPerformed

    private void btAdministracionPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdministracionPresupuestoActionPerformed
        mostrarJpanelEscenarioPresupuestal();
    }//GEN-LAST:event_btAdministracionPresupuestoActionPerformed

    private void btMantenimientoCatalogoCuenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMantenimientoCatalogoCuenta1ActionPerformed
        try {
            mostrarJpanelAcapitePresupuestal();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btMantenimientoCatalogoCuenta1ActionPerformed

    private void btMantenimientoCicloContable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMantenimientoCicloContable1ActionPerformed
        mostrarJpanelCatalogoPresupuesto();
    }//GEN-LAST:event_btMantenimientoCicloContable1ActionPerformed
 
    void mostrarJpanelCatalogoPresupuesto(){
        JpanelCatalogoPresupuesto Jp= new JpanelCatalogoPresupuesto();
        desktop.add(Jp,"Mantenimiento");
        Card.show(desktop, "Mantenimiento");
    }
    
    void mostrarJpanelAcapitePresupuestal() throws SQLException{
        JpanelAcapitePresupuestal Jp= new JpanelAcapitePresupuestal();
        desktop.add(Jp,"Mantenimiento");
        Card.show(desktop, "Mantenimiento");
    }
    
    void mostrarJpanelEscenarioPresupuestal(){
        JpanelEscenarioPresupuestal Jp= new JpanelEscenarioPresupuestal(CodUsu);
        desktop.add(Jp,"Mantenimiento");
        Card.show(desktop, "Mantenimiento");
    }
    
    void mostrarJpanelMantenimientoCicloContable(){
        JpanelMantenimientoCicloContable Jp= new JpanelMantenimientoCicloContable();
        desktop.add(Jp,"Mantenimiento");
        Card.show(desktop, "Mantenimiento");
    }
    
    void mostrarJpanelMantenimientoPeriodoContable() throws SQLException{
        JpanelMantenimientoPeriodoContable Jp= new JpanelMantenimientoPeriodoContable();
        desktop.add(Jp,"Mantenimiento");
        Card.show(desktop, "Mantenimiento");
    }
    
    void mostrarJpanelLogoInico(){
        JpanelLogoInicio Jp= new JpanelLogoInicio();
        desktop.add(Jp,"LogoInicio");
        Card.show(desktop, "LogoInicio");
    }
    
    void mostrarJpanelMantenimientoCatalogoCuenta(){
        JpanelMantenimientoCatalogoCuenta Jp= new JpanelMantenimientoCatalogoCuenta();
        desktop.add(Jp,"Mantenimiento");
        Card.show(desktop, "Mantenimiento");
    }
    
    void mostrarJpanelMantenimientoUsuario(){
        JpanelMantenimientoUsuario Jp= new JpanelMantenimientoUsuario();
        desktop.add(Jp,"Mantenimiento");
        Card.show(desktop, "Mantenimiento");
    }
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpMenuAdministracion;
    private javax.swing.JPanel JpMenuMantenimiento;
    private javax.swing.JButton btAdministracionPresupuesto;
    private javax.swing.JButton btMantenimiento;
    private javax.swing.JButton btMantenimiento1;
    private javax.swing.JButton btMantenimientoCatalogoCuenta;
    private javax.swing.JButton btMantenimientoCatalogoCuenta1;
    private javax.swing.JButton btMantenimientoCicloContable;
    private javax.swing.JButton btMantenimientoCicloContable1;
    private javax.swing.JButton btMantenimientoPeriodoContable;
    private javax.swing.JButton btMantenimientoPeriodoContable1;
    private javax.swing.JButton btMantenimientoUsuario;
    private javax.swing.JButton btSalir;
    private javax.swing.JPanel desktop;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lUsuario;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbReloj;
    // End of variables declaration//GEN-END:variables
}
