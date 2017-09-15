package ComponenteDatos;

import ComponenteClase.EscenarioPresupuesto;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class BDEscenarioPresupuesto {
    
    public static void insertarEscenarioPresupuesto(EscenarioPresupuesto EP) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "INSERT INTO esceariopresupuesto (EscearioPresupuestoNumero,\n" +
                                    "EscearioPresupuestoFecha, EscearioPresupuestoDescripcion,\n" +
                                    "UsuarioId) VALUES (?,?,?,?)");
        ps.setString(1, EP.getNumeroEscenarioPresupuesto());
        ps.setDate(2, (java.sql.Date) EP.getFechaEscenarioPresupuesto());
        ps.setString(3, EP.getDescripcionEscenarioPresupuesto());
        ps.setInt(4, EP.getIdUsuario().getIdUsuario());
        ps.executeUpdate();
        cnn.close();
        ps.close();
    }
    
    public static EscenarioPresupuesto buscarEscenarioPresupuesto(String numero) throws SQLException {
        return buscarEscenarioPresupuesto(numero, null);
    }
    public static EscenarioPresupuesto buscarEscenarioPresupuesto(String numero, EscenarioPresupuesto c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "SELECT EscearioPresupuestoId,EscearioPresupuestoNumero,EscearioPresupuestoFecha,\n" +
                                    "EscearioPresupuestoDescripcion,UsuarioId FROM esceariopresupuesto\n" +
                                    "where EscearioPresupuestoNumero=?");
        ps.setString(1, numero);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            c = new EscenarioPresupuesto() {};
            c.setIdEscenarioPresupuesto(rs.getInt("EscearioPresupuestoId"));
            c.setNumeroEscenarioPresupuesto(rs.getString("EscearioPresupuestoNumero"));
            c.setFechaEscenarioPresupuesto(rs.getDate("EscearioPresupuestoFecha"));
            c.setDescripcionEscenarioPresupuesto(rs.getString("EscearioPresupuestoDescripcion"));
            c.setIdUsuario(BDUsuario.mostrarUsuario1(rs.getString("UsuarioId")));
            
        }
        cnn.close();
        ps.close();
        return c;
    }
    
    public static EscenarioPresupuesto buscarEscenarioPresupuesto(int numero) throws SQLException {
        return buscarEscenarioPresupuesto(numero, null);
    }
    public static EscenarioPresupuesto buscarEscenarioPresupuesto(int numero, EscenarioPresupuesto c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "SELECT EscearioPresupuestoId,EscearioPresupuestoNumero,EscearioPresupuestoFecha,\n" +
                                    "EscearioPresupuestoDescripcion,UsuarioId FROM esceariopresupuesto\n" +
                                    "where EscearioPresupuestoId=?");
        ps.setInt(1, numero);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            c = new EscenarioPresupuesto() {};
            c.setIdEscenarioPresupuesto(rs.getInt("EscearioPresupuestoId"));
            c.setNumeroEscenarioPresupuesto(rs.getString("EscearioPresupuestoNumero"));
            c.setFechaEscenarioPresupuesto(rs.getDate("EscearioPresupuestoFecha"));
            c.setDescripcionEscenarioPresupuesto(rs.getString("EscearioPresupuestoDescripcion"));
            c.setIdUsuario(BDUsuario.mostrarUsuario1(rs.getString("UsuarioId")));
            
        }
        cnn.close();
        ps.close();
        return c;
    }
    
    public static int buscarMaxEscenarioPresupuesto() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        int numero;
        ps = cnn.prepareStatement(  "SELECT max(EscearioPresupuestoId) FROM esceariopresupuesto\n");
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            numero=rs.getInt("max(EscearioPresupuestoId)");
        }else{
            numero=0;
        }
        cnn.close();
        ps.close();
        return numero+1;
    }
   
}
