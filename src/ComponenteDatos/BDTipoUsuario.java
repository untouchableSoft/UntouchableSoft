package ComponenteDatos;

import ComponenteClase.TipoUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class BDTipoUsuario {
    
    public static void insertarTipoUsuario(TipoUsuario TU) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "INSERT INTO tipousuario (TipoUsuarioNombre) VALUES(?);");
        ps.setString(1, TU.getNomTipoUsuario());
        ps.executeUpdate();
        cnn.close();
        ps.close();
    }
    
    public static ArrayList<TipoUsuario> mostrarTipoUsuario() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<TipoUsuario> lista = new ArrayList<TipoUsuario>();

        ps = cnn.prepareStatement("SELECT TipoUsuarioId,TipoUsuarioNombre FROM tipousuario");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           TipoUsuario c = new TipoUsuario() {};
            c.setCodTipoUsuario(rs.getInt("TipoUsuarioId"));
            c.setNomTipoUsuario(rs.getString("TipoUsuarioNombre"));
            lista.add(c);
        }
        
        cnn.close();
        ps.close();
        return lista;
    }

    public static ArrayList<TipoUsuario> mostrarNomTipoUsuario() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<TipoUsuario> lista = new ArrayList<TipoUsuario>();

        ps = cnn.prepareStatement("SELECT TipoUsuarioNombre FROM tipousuario");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            TipoUsuario c = new TipoUsuario() {};
            c.setNomTipoUsuario(rs.getString("TipoUsuarioNombre"));
            lista.add(c);
        }
        
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static TipoUsuario BuscarCodMax() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        TipoUsuario c = new TipoUsuario() {};
        ps = cnn.prepareStatement("SELECT Max(TipoUsuarioId) FROM tipousuario");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            c.setCodTipoUsuario(rs.getInt("Max(TipoUsuarioId)"));
        }
        cnn.close();
        ps.close();
        return c;
    }
    
    public static ArrayList<TipoUsuario> buscarTipoUsuario(String codigo, String nombre) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<TipoUsuario> lista = new ArrayList<TipoUsuario>();
        ps = cnn.prepareStatement(  "SELECT TipoUsuarioId, TipoUsuarioNombre FROM tipousuario \n" +
                                    "WHERE  TipoUsuarioId=? OR TipoUsuarioNombre like'%"+nombre+"%'");
        ps.setString(1, codigo);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            TipoUsuario c = new TipoUsuario() {};
            c.setCodTipoUsuario(rs.getInt("TipoUsuarioId"));
            c.setNomTipoUsuario(rs.getString("TipoUsuarioNombre"));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static TipoUsuario buscarTipoUsuarioPorId(String codigo) throws SQLException {
        return buscarTipoUsuarioPorId(codigo, null);
    }
    
    public static TipoUsuario buscarTipoUsuarioPorId(String codigo, TipoUsuario c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "SELECT TipoUsuarioId, TipoUsuarioNombre FROM tipousuario \n" +
                                    "WHERE  TipoUsuarioId=?");
        ps.setString(1, codigo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            c = c == null ? new TipoUsuario() {} : c;
            c.setCodTipoUsuario(rs.getInt("TipoUsuarioId"));
            c.setNomTipoUsuario(rs.getString("TipoUsuarioNombre"));
        }
        cnn.close();
        ps.close();
        return c;
    }
    
    public static TipoUsuario buscarTipoUsuarioPorId(int codigo) throws SQLException {
        return buscarTipoUsuarioPorId(codigo, null);
    }
    
    public static TipoUsuario buscarTipoUsuarioPorId(int codigo, TipoUsuario c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "SELECT TipoUsuarioId, TipoUsuarioNombre FROM tipousuario \n" +
                                    "WHERE  TipoUsuarioId=?");
        ps.setInt(1, codigo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            c = c == null ? new TipoUsuario() {} : c;
            c.setCodTipoUsuario(rs.getInt("TipoUsuarioId"));
            c.setNomTipoUsuario(rs.getString("TipoUsuarioNombre"));
        }
        cnn.close();
        ps.close();
        return c;
    }
    
    public static TipoUsuario buscarTipoUsuarioPorNom(String nombre) throws SQLException {
        return buscarTipoUsuarioPorId(nombre, null);
    }
    
    public static TipoUsuario buscarTipoUsuarioPorNom(int nombre, TipoUsuario c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "SELECT TipoUsuarioId, TipoUsuarioNombre FROM tipousuario \n" +
                                    "WHERE  TipoUsuarioNombre='"+nombre+"'");
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            c = c == null ? new TipoUsuario() {} : c;
            c.setCodTipoUsuario(rs.getInt("TipoUsuarioId"));
            c.setNomTipoUsuario(rs.getString("TipoUsuarioNombre"));
        }
        cnn.close();
        ps.close();
        return c;
    }
    
    public static boolean actualizarTipoUsuario(TipoUsuario c) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement(  "UPDATE tipousuario SET TipoUsuarioNombre = ? \n" +
                                    "WHERE TipoUsuarioId =" + c.getCodTipoUsuario());
        ps.setString(1, c.getNomTipoUsuario());
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
