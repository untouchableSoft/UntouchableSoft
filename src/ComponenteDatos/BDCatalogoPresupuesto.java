package ComponenteDatos;

import ComponenteClase.CatalogoPresupuesto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class BDCatalogoPresupuesto {
    
    public static void insertarCatalogoPresupuesto(CatalogoPresupuesto CP) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "INSERT INTO catalogopresupuesto (CatalogoPresupuestoCodigo, CatalogoPresupuestoNombre,\n" +
                                    "CatalogoPresupuestoDescripcion) VALUES (?,?,?)");
        ps.setString(1, CP.getCodCatalogoPresupuesto());
        ps.setString(2, CP.getNomCatalogoPresupuesto());
        ps.setString(3, CP.getDescripcionCatalogoPresupuesto());
        ps.executeUpdate();
        cnn.close();
        ps.close();
    }
    
    public static ArrayList<CatalogoPresupuesto> mostrarCatalogoPresupuesto() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<CatalogoPresupuesto> lista = new ArrayList<CatalogoPresupuesto>();

        ps = cnn.prepareStatement(  "SELECT CatalogoPresupuestoId, CatalogoPresupuestoCodigo,\n" +
                                    "CatalogoPresupuestoNombre,CatalogoPresupuestoDescripcion\n" +
                                    "FROM catalogopresupuesto");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           CatalogoPresupuesto c = new CatalogoPresupuesto() {};
            c.setIdCatalogoPresupuesto(rs.getInt("CatalogoPresupuestoId"));
            c.setCodCatalogoPresupuesto(rs.getString("CatalogoPresupuestoCodigo"));
            c.setNomCatalogoPresupuesto(rs.getString("CatalogoPresupuestoNombre"));
            c.setDescripcionCatalogoPresupuesto(rs.getString("CatalogoPresupuestoDescripcion"));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static ArrayList<CatalogoPresupuesto> mostrarCatalogoPresupuesto(String dato) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<CatalogoPresupuesto> lista = new ArrayList<CatalogoPresupuesto>();

        ps = cnn.prepareStatement(  "SELECT CatalogoPresupuestoId, CatalogoPresupuestoCodigo,\n" +
                                    "CatalogoPresupuestoNombre,CatalogoPresupuestoDescripcion\n" +
                                    "FROM catalogopresupuesto where CatalogoPresupuestoId like'%"+dato+"%' or CatalogoPresupuestoNombre like'%"+dato+"%'");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           CatalogoPresupuesto c = new CatalogoPresupuesto() {};
            c.setIdCatalogoPresupuesto(rs.getInt("CatalogoPresupuestoId"));
            c.setCodCatalogoPresupuesto(rs.getString("CatalogoPresupuestoCodigo"));
            c.setNomCatalogoPresupuesto(rs.getString("CatalogoPresupuestoNombre"));
            c.setDescripcionCatalogoPresupuesto(rs.getString("CatalogoPresupuestoDescripcion"));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
    
        
    public static CatalogoPresupuesto buscarCatalogoPresupuesto(String dato) throws SQLException {
        return buscarCatalogoPresupuesto(dato,null);
    }
    public static CatalogoPresupuesto buscarCatalogoPresupuesto(String dato, CatalogoPresupuesto c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement(  "SELECT CatalogoPresupuestoId, CatalogoPresupuestoCodigo,\n" +
                                    "CatalogoPresupuestoNombre,CatalogoPresupuestoDescripcion\n" +
                                    "FROM catalogopresupuesto where CatalogoPresupuestoCodigo=?");
        ps.setString(1, dato);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            c = new CatalogoPresupuesto() {};
            c.setIdCatalogoPresupuesto(rs.getInt("CatalogoPresupuestoId"));
            c.setCodCatalogoPresupuesto(rs.getString("CatalogoPresupuestoCodigo"));
            c.setNomCatalogoPresupuesto(rs.getString("CatalogoPresupuestoNombre"));
            c.setDescripcionCatalogoPresupuesto(rs.getString("CatalogoPresupuestoDescripcion"));
        }
        cnn.close();
        ps.close();
        return c;
    }
    
    
    public static int buscarMaxCatalogoPresupuesto() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        CatalogoPresupuesto c = new CatalogoPresupuesto() {};
        ps = cnn.prepareStatement(  "SELECT max(CatalogoPresupuestoId) FROM catalogopresupuesto ");
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            c.setIdCatalogoPresupuesto(rs.getInt("max(CatalogoPresupuestoId)"));
        }
        cnn.close();
        ps.close();
        return c.getIdCatalogoPresupuesto();
    }
    
    public static boolean buscarExistenciaCatalogoPresupuesto(String dato) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        boolean esistencia;
        ps = cnn.prepareStatement(  "SELECT CatalogoPresupuestoCodigo \n" +
                                    "FROM catalogopresupuesto where CatalogoPresupuestoCodigo=?");
        ps.setString(1, dato);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            esistencia=true;
        }else
            esistencia=false;
        
        cnn.close();
        ps.close();
        return esistencia;
    }
    
    public static boolean actualizarCatalogoPresupuesto(CatalogoPresupuesto c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement(  "UPDATE catalogopresupuesto SET CatalogoPresupuestoNombre = ?,\n" +
                                    "CatalogoPresupuestoDescripcion = ? WHERE  CatalogoPresupuestoCodigo = ?");
        ps.setString(1, c.getNomCatalogoPresupuesto());
        ps.setString(2, c.getDescripcionCatalogoPresupuesto());
        ps.setString(3, c.getCodCatalogoPresupuesto());
        int rowsUpdated = ps.executeUpdate();
        cnn.close();
        ps.close();
        if (rowsUpdated > 0) {
            return true;
        } else {
            return false;
        }
    }
}
