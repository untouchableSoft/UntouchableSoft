package ComponenteDatos;

import ComponenteClase.CatalogoCuenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class BDCatalogoCuenta {

    public static void insertarCatalogoCuenta(CatalogoCuenta CC) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "INSERT INTO catalogocuenta (CatalogoCuentaCodigo,CatalogoCuentaNombre) VALUES (?,?)");
        ps.setString(1, CC.getCodCatalogoCuenta());
        ps.setString(2, CC.getNomCatalogoCuenta());
        ps.executeUpdate();
        cnn.close();
        ps.close();
    }
    
    public static ArrayList<CatalogoCuenta> mostrarCatalogoCuenta() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<CatalogoCuenta> lista = new ArrayList<CatalogoCuenta>();

        ps = cnn.prepareStatement("SELECT CatalogoCuentaCodigo, CatalogoCuentaNombre FROM catalogocuenta");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           CatalogoCuenta c = new CatalogoCuenta() {};
            c.setCodCatalogoCuenta(rs.getString("CatalogoCuentaCodigo"));
            c.setNomCatalogoCuenta(rs.getString("CatalogoCuentaNombre"));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static ArrayList<CatalogoCuenta> mostrarCatalogoCuenta1(String dato) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<CatalogoCuenta> lista = new ArrayList<CatalogoCuenta>();

        ps = cnn.prepareStatement("SELECT CatalogoCuentaCodigo, CatalogoCuentaNombre FROM catalogocuenta where \n"+
                "CatalogoCuentaCodigo like'%"+dato+"%' or CatalogoCuentaNombre like'%"+dato+"%'");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           CatalogoCuenta c = new CatalogoCuenta() {};
            c.setCodCatalogoCuenta(rs.getString("CatalogoCuentaCodigo"));
            c.setNomCatalogoCuenta(rs.getString("CatalogoCuentaNombre"));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static CatalogoCuenta mostrarCatalogoCuenta(String cod) throws SQLException {
        return mostrarCatalogoCuenta(cod, null);
    }
    
     public static CatalogoCuenta mostrarCatalogoCuenta(String cod, CatalogoCuenta CC) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        
        ps = cnn.prepareStatement("SELECT CatalogoCuentaCodigo, CatalogoCuentaNombre FROM catalogocuenta where CatalogoCuentaCodigo='"+cod+"'");
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            CC = new CatalogoCuenta() {};
            CC.setCodCatalogoCuenta(rs.getString("CatalogoCuentaCodigo"));
            CC.setNomCatalogoCuenta(rs.getString("CatalogoCuentaNombre"));
       
        }
        cnn.close();
        ps.close();
        return CC;
    }
     
    public static boolean actualizarCatalogoCuenta(CatalogoCuenta CC, String cod) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement(  "UPDATE catalogocuenta SET CatalogoCuentaCodigo =?,CatalogoCuentaNombre = ? \n" +
                                    "WHERE CatalogoCuentaCodigo ='"+cod+"' ");
        ps.setString(2, CC.getNomCatalogoCuenta());
        ps.setString(1, CC.getCodCatalogoCuenta());
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
