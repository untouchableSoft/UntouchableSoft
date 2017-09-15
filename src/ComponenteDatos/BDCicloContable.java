package ComponenteDatos;

import ComponenteClase.CicloContable;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class BDCicloContable {

    public static void insertarCicloContable(CicloContable CC) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "INSERT INTO ciclocontable (CicloContableCodigo, CicloContableFechaInicio,\n" +
                                    "CicloContableFechaFin, CicloContableDescripcion, CicloContableEstado)\n" +
                                    "VALUES (?,?,?,?,?);");
        ps.setString(1, CC.getCodCicloContable());
        ps.setDate(2, (java.sql.Date) CC.getFechaInicioCicloContable());
        ps.setDate(3, (java.sql.Date) CC.getFechaFinCicloContable());
        ps.setString(4, CC.getDescripcion());
        ps.setBoolean(5, CC.isEstado());
        ps.executeUpdate();
        cnn.close();
        ps.close();
    }
    
    public static ArrayList<CicloContable> mostrarCicloContable() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<CicloContable> lista = new ArrayList<CicloContable>();

        ps = cnn.prepareStatement(  "SELECT CicloContableCodigo,CicloContableFechaInicio,CicloContableFechaFin,\n" +
                                    "CicloContableDescripcion,CicloContableEstado FROM ciclocontable;");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           CicloContable c = new CicloContable() {};
            c.setCodCicloContable(rs.getString("CicloContableCodigo"));
            c.setFechaInicioCicloContable(rs.getDate("CicloContableFechaInicio"));
            c.setFechaFinCicloContable(rs.getDate("CicloContableFechaFin"));
            c.setDescripcion(rs.getString("CicloContableDescripcion"));
            c.setEstado(rs.getBoolean("CicloContableEstado"));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static ArrayList<CicloContable> mostrarCicloContable(String codigo) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<CicloContable> lista = new ArrayList<CicloContable>();

        ps = cnn.prepareStatement(  "SELECT CicloContableCodigo,CicloContableFechaInicio,CicloContableFechaFin,\n" +
                                    "CicloContableDescripcion,CicloContableEstado FROM ciclocontable where CicloContableCodigo like'%"+codigo+"%'");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           CicloContable c = new CicloContable() {};
            c.setCodCicloContable(rs.getString("CicloContableCodigo"));
            c.setFechaInicioCicloContable(rs.getDate("CicloContableFechaInicio"));
            c.setFechaFinCicloContable(rs.getDate("CicloContableFechaFin"));
            c.setDescripcion(rs.getString("CicloContableDescripcion"));
            c.setEstado(rs.getBoolean("CicloContableEstado"));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static CicloContable buscarCicloContable(String cod) throws SQLException {
        return buscarCicloContable(cod, null);
    }
    public static CicloContable buscarCicloContable(String cod,CicloContable c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement(  "SELECT CicloContableCodigo,CicloContableFechaInicio,CicloContableFechaFin,\n" +
                                    "CicloContableDescripcion,CicloContableEstado FROM ciclocontable where CicloContableCodigo='"+cod+"'");
     
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            c = new CicloContable() {};
            c.setCodCicloContable(rs.getString("CicloContableCodigo"));
            c.setFechaInicioCicloContable(rs.getDate("CicloContableFechaInicio"));
            c.setFechaFinCicloContable(rs.getDate("CicloContableFechaFin"));
            c.setDescripcion(rs.getString("CicloContableDescripcion"));
            c.setEstado(rs.getBoolean("CicloContableEstado"));
        }
        cnn.close();
        ps.close();
        return c;
    }
    
    
    public static boolean buscarExsistenciaCicloContable(String cod) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        boolean b;
        ps = cnn.prepareStatement(  "SELECT CicloContableCodigo FROM ciclocontable where CicloContableCodigo='"+cod+"'");
     
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            b=true;
        }else b=false;
        cnn.close();
        ps.close();
        return b;
    }
    
    public static boolean actualizarCicloContable(CicloContable CC) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement(  "UPDATE ciclocontable SET CicloContableFechaInicio = ?, CicloContableFechaFin = ?,\n" +
                                    "CicloContableDescripcion = ?, CicloContableEstado = ? WHERE CicloContableCodigo = '"+CC.getCodCicloContable()+"';");
        ps.setDate(1, (java.sql.Date) CC.getFechaInicioCicloContable());
        ps.setDate(2, (java.sql.Date) CC.getFechaFinCicloContable());
        ps.setString(3,  CC.getDescripcion());
        ps.setBoolean(4,  CC.isEstado());
        
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
