package ComponenteDatos;

import ComponenteClase.AcapitePresupuestal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class BDAcapitePresupuestal {

    public static void insertarAcapitePresupuestal(AcapitePresupuestal AP) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "INSERT INTO acapitepresupuestal (AcapitePresupuestalNombre,\n" +
                                    "AcapitePresupuestalDescripcion,CatalogoCuentaCodigo,\n" +
                                    "CatalogoPresupuestoId)VALUES (?,?,?,?)");
        ps.setString(1, AP.getNomAcapitePresupuestal());
        ps.setString(2, AP.getDescripcionAcapitePresupuestal());
        ps.setString(3, AP.getCodCatalogoCuenta().getCodCatalogoCuenta());
        ps.setInt(4, AP.getIdCatalogoPresupuesto().getIdCatalogoPresupuesto());
        ps.executeUpdate();
        cnn.close();
        ps.close();
    }
    
    public static AcapitePresupuestal buscarMaxCatalogoPresupuesto() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        AcapitePresupuestal c = new AcapitePresupuestal() {};
        ps = cnn.prepareStatement(  "SELECT max(AcapitePresupuestalCodigo) FROM acapitepresupuestal");
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            c.setCodAcapitePresupuestal(rs.getInt("max(AcapitePresupuestalCodigo)"));
        }else
            c.setCodAcapitePresupuestal(0);
        cnn.close();
        ps.close();
        return c;
    }
    
    public static ArrayList<AcapitePresupuestal> mostrarAcapitePresupuestal() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<AcapitePresupuestal> lista = new ArrayList<AcapitePresupuestal>();

        ps = cnn.prepareStatement(  "SELECT AcapitePresupuestalCodigo,AcapitePresupuestalNombre,\n" +
                                    "AcapitePresupuestalDescripcion,CatalogoCuentaCodigo,\n" +
                                    "CatalogoPresupuestoCodigo FROM acapitepresupuestal \n" +
                                    "inner join catalogopresupuesto on \n" +
                                    "acapitepresupuestal.CatalogoPresupuestoId=catalogopresupuesto.CatalogoPresupuestoId");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           AcapitePresupuestal c = new AcapitePresupuestal() {};
            c.setCodAcapitePresupuestal(rs.getInt("AcapitePresupuestalCodigo"));
            c.setNomAcapitePresupuestal(rs.getString("AcapitePresupuestalNombre"));
            c.setDescripcionAcapitePresupuestal(rs.getString("AcapitePresupuestalDescripcion"));
            c.setCodCatalogoCuenta(BDCatalogoCuenta.mostrarCatalogoCuenta(rs.getString("CatalogoCuentaCodigo")));
            c.setIdCatalogoPresupuesto(BDCatalogoPresupuesto.buscarCatalogoPresupuesto(rs.getString("CatalogoPresupuestoCodigo")));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static ArrayList<AcapitePresupuestal> mostrarAcapitePresupuestal(String acapite) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<AcapitePresupuestal> lista = new ArrayList<AcapitePresupuestal>();

        ps = cnn.prepareStatement(  "SELECT AcapitePresupuestalCodigo,AcapitePresupuestalNombre,\n" +
                                    "AcapitePresupuestalDescripcion,CatalogoCuentaCodigo,\n" +
                                    "CatalogoPresupuestoCodigo FROM acapitepresupuestal \n" +
                                    "inner join catalogopresupuesto on \n" +
                                    "acapitepresupuestal.CatalogoPresupuestoId=catalogopresupuesto.CatalogoPresupuestoId \n"+
                                    " where AcapitePresupuestalCodigo=? or AcapitePresupuestalNombre like'%"+acapite+"%'");
        ps.setString(1, acapite);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           AcapitePresupuestal c = new AcapitePresupuestal() {};
            c.setCodAcapitePresupuestal(rs.getInt("AcapitePresupuestalCodigo"));
            c.setNomAcapitePresupuestal(rs.getString("AcapitePresupuestalNombre"));
            c.setDescripcionAcapitePresupuestal(rs.getString("AcapitePresupuestalDescripcion"));
            c.setCodCatalogoCuenta(BDCatalogoCuenta.mostrarCatalogoCuenta(rs.getString("CatalogoCuentaCodigo")));
            c.setIdCatalogoPresupuesto(BDCatalogoPresupuesto.buscarCatalogoPresupuesto(rs.getString("CatalogoPresupuestoCodigo")));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static AcapitePresupuestal buscarAcapitePresupuestal(String codigo) throws SQLException {
        return buscarAcapitePresupuestal(codigo, null);
    }
    public static AcapitePresupuestal buscarAcapitePresupuestal(String codigo, AcapitePresupuestal c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "SELECT AcapitePresupuestalCodigo,AcapitePresupuestalNombre,\n" +
                                    "AcapitePresupuestalDescripcion,CatalogoCuentaCodigo,\n" +
                                    "CatalogoPresupuestoCodigo FROM acapitepresupuestal \n" +
                                    "inner join catalogopresupuesto on \n" +
                                    "acapitepresupuestal.CatalogoPresupuestoId=catalogopresupuesto.CatalogoPresupuestoId \n"+
                                    " where AcapitePresupuestalCodigo=?");
        ps.setString(1, codigo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
           c = new AcapitePresupuestal() {};
            c.setCodAcapitePresupuestal(rs.getInt("AcapitePresupuestalCodigo"));
            c.setNomAcapitePresupuestal(rs.getString("AcapitePresupuestalNombre"));
            c.setDescripcionAcapitePresupuestal(rs.getString("AcapitePresupuestalDescripcion"));
            c.setCodCatalogoCuenta(BDCatalogoCuenta.mostrarCatalogoCuenta(rs.getString("CatalogoCuentaCodigo")));
            c.setIdCatalogoPresupuesto(BDCatalogoPresupuesto.buscarCatalogoPresupuesto(rs.getString("CatalogoPresupuestoCodigo")));
            
        }
        cnn.close();
        ps.close();
        return c;
    }
    
    public static AcapitePresupuestal buscarNomAcapitePresupuestal(String nombre) throws SQLException {
        return buscarNomAcapitePresupuestal(nombre, null);
    }
    public static AcapitePresupuestal buscarNomAcapitePresupuestal(String nombre, AcapitePresupuestal c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "SELECT AcapitePresupuestalCodigo,AcapitePresupuestalNombre,\n" +
                                    "AcapitePresupuestalDescripcion,CatalogoCuentaCodigo,\n" +
                                    "CatalogoPresupuestoCodigo FROM acapitepresupuestal \n" +
                                    "inner join catalogopresupuesto on \n" +
                                    "acapitepresupuestal.CatalogoPresupuestoId=catalogopresupuesto.CatalogoPresupuestoId \n"+
                                    " where AcapitePresupuestalNombre=?");
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
           c = new AcapitePresupuestal() {};
            c.setCodAcapitePresupuestal(rs.getInt("AcapitePresupuestalCodigo"));
            c.setNomAcapitePresupuestal(rs.getString("AcapitePresupuestalNombre"));
            c.setDescripcionAcapitePresupuestal(rs.getString("AcapitePresupuestalDescripcion"));
            c.setCodCatalogoCuenta(BDCatalogoCuenta.mostrarCatalogoCuenta(rs.getString("CatalogoCuentaCodigo")));
            c.setIdCatalogoPresupuesto(BDCatalogoPresupuesto.buscarCatalogoPresupuesto(rs.getString("CatalogoPresupuestoCodigo")));
            
        }
        cnn.close();
        ps.close();
        return c;
    }
    
    public static boolean actualizarAcapitePresupuestal(AcapitePresupuestal c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement(  "UPDATE acapitepresupuestal SET AcapitePresupuestalNombre = ?,\n" +
                                    "AcapitePresupuestalDescripcion = ?, CatalogoCuentaCodigo = ?,\n" +
                                    "CatalogoPresupuestoId = ? WHERE AcapitePresupuestalCodigo = ?");
        ps.setString(1, c.getNomAcapitePresupuestal());
        ps.setString(2, c.getDescripcionAcapitePresupuestal());
        ps.setString(3, c.getCodCatalogoCuenta().getCodCatalogoCuenta());
        ps.setInt(4, c.getIdCatalogoPresupuesto().getIdCatalogoPresupuesto());
        ps.setInt(5, c.getCodAcapitePresupuestal());
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
