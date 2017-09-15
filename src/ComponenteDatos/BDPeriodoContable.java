package ComponenteDatos;

import ComponenteClase.CicloContable;
import ComponenteClase.PeriodoContable;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class BDPeriodoContable {
    
    public static void insertarPeriodoContable(PeriodoContable PC) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "INSERT INTO periodocontable (PeriodoContableCodigo, PeriodoContableFechaInicio, PeriodoContableFechaFinal,\n" +
                                    "PeriodoContableDescripcion, PeriodoContableEstado, CicloContableAnio) VALUES (?,?,?,?,?,?);");
        ps.setString(1, PC.getCodPeriodoContable());
        ps.setDate(2, (java.sql.Date) PC.getFechaInicioPeriodoContable());
        ps.setDate(3, (java.sql.Date) PC.getFechaFinPeriodoContable());
        ps.setString(4, PC.getDescripcionPeriodoContable());
        ps.setBoolean(5, PC.isEstadoPeriodoContable());
        ps.setString(6, PC.getCodCicloContable().getCodCicloContable());
        ps.executeUpdate();
        cnn.close();
        ps.close();
    }
    
    public static ArrayList<PeriodoContable> mostrarPeriodoContable() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<PeriodoContable> lista = new ArrayList<PeriodoContable>();

        ps = cnn.prepareStatement(  "SELECT PeriodoContableCodigo,PeriodoContableFechaInicio,PeriodoContableFechaFinal,\n" +
                                    "PeriodoContableDescripcion,PeriodoContableEstado,CicloContableCodigo \n" +
                                    "FROM periodocontable inner join ciclocontable on CicloContableAnio=CicloContableCodigo");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           PeriodoContable c = new PeriodoContable() {};
            c.setCodPeriodoContable(rs.getString("PeriodoContableCodigo"));
            c.setFechaInicioPeriodoContable(rs.getDate("PeriodoContableFechaInicio"));
            c.setFechaFinPeriodoContable(rs.getDate("PeriodoContableFechaFinal"));
            c.setDescripcionPeriodoContable(rs.getString("PeriodoContableDescripcion"));
            c.setEstadoPeriodoContable(rs.getBoolean("PeriodoContableEstado"));
            c.setCodCicloContable(BDCicloContable.buscarCicloContable(rs.getString("CicloContableCodigo")));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static ArrayList<PeriodoContable> mostrarPeriodoContable(String cod) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<PeriodoContable> lista = new ArrayList<PeriodoContable>();

        ps = cnn.prepareStatement(  "SELECT PeriodoContableCodigo,PeriodoContableFechaInicio,PeriodoContableFechaFinal,\n" +
                                    "PeriodoContableDescripcion,PeriodoContableEstado,CicloContableCodigo \n" +
                                    "FROM periodocontable inner join ciclocontable on CicloContableAnio=CicloContableCodigo \n" +
                                    "where PeriodoContableCodigo like'%"+cod+"%'");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           PeriodoContable c = new PeriodoContable() {};
            c.setCodPeriodoContable(rs.getString("PeriodoContableCodigo"));
            c.setFechaInicioPeriodoContable(rs.getDate("PeriodoContableFechaInicio"));
            c.setFechaFinPeriodoContable(rs.getDate("PeriodoContableFechaFinal"));
            c.setDescripcionPeriodoContable(rs.getString("PeriodoContableDescripcion"));
            c.setEstadoPeriodoContable(rs.getBoolean("PeriodoContableEstado"));
            c.setCodCicloContable(BDCicloContable.buscarCicloContable(rs.getString("CicloContableCodigo")));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static PeriodoContable buscarPeriodoContable(String cod) throws SQLException {
        return buscarPeriodoContable(cod, null);
    }
    public static PeriodoContable buscarPeriodoContable(String cod,PeriodoContable c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement(  "SELECT PeriodoContableCodigo,PeriodoContableFechaInicio,PeriodoContableFechaFinal,\n" +
                                    "PeriodoContableDescripcion,PeriodoContableEstado,CicloContableCodigo \n" +
                                    "FROM periodocontable inner join ciclocontable on CicloContableAnio=CicloContableCodigo where PeriodoContableCodigo=?");
        ps.setString(1, cod);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            c = new PeriodoContable() {};
            c.setCodPeriodoContable(rs.getString("PeriodoContableCodigo"));
            c.setFechaInicioPeriodoContable(rs.getDate("PeriodoContableFechaInicio"));
            c.setFechaFinPeriodoContable(rs.getDate("PeriodoContableFechaFinal"));
            c.setDescripcionPeriodoContable(rs.getString("PeriodoContableDescripcion"));
            c.setEstadoPeriodoContable(rs.getBoolean("PeriodoContableEstado"));
            c.setCodCicloContable(BDCicloContable.buscarCicloContable(rs.getString("CicloContableCodigo")));
        }
        cnn.close();
        ps.close();
        return c;
    }
    
    public static boolean buscarExsistenciaPeriodoContable(String cod) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        boolean b;
        ps = cnn.prepareStatement("SELECT PeriodoContableCodigo \n" +
                                  "FROM periodocontable where PeriodoContableCodigo=?");
        ps.setString(1, cod);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            b=true;
        }else b=false;
        cnn.close();
        ps.close();
        return b;
    }
    
    public static boolean actualizarPeriodoContable(PeriodoContable PC) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement(  "UPDATE periodocontable SET PeriodoContableFechaInicio = ?, PeriodoContableFechaFinal = ?,\n" +
                                    "PeriodoContableDescripcion = ?, PeriodoContableEstado = ? WHERE PeriodoContableCodigo = ?;");
        ps.setDate(1, (java.sql.Date) PC.getFechaInicioPeriodoContable());
        ps.setDate(2, (java.sql.Date) PC.getFechaFinPeriodoContable());
        ps.setString(3,  PC.getDescripcionPeriodoContable());
        ps.setBoolean(4,  PC.isEstadoPeriodoContable());
        ps.setString(5,  PC.getCodPeriodoContable());
        
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
