package ComponenteDatos;

import ComponenteClase.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class BDUsuario {
    
    public static void insertarUsuario(Usuario user) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "INSERT INTO usuario (UsuarioNombre,UsuarioApellido,UsuarioCedula,\n" +
                                    "CelularUsuario,UsuarioTelefono,UsuarioDireccion,UsuarioNickName,\n" +
                                    "UsuarioContrasena,UsuarioEstado,TpoUsuarioId) VALUES (?,?,?,?,?,?,?,md5('"+user.getContrasena()+"'),?,?);");
        ps.setString(1, user.getNombre());
        ps.setString(2, user.getApellido());
        ps.setString(3, user.getCedula());
        ps.setString(4, user.getCelular());
        ps.setString(5, user.getTelefono());
        ps.setString(6, user.getDireccion());
        ps.setString(7, user.getNickname());
        ps.setBoolean(8, user.isEstado());
        ps.setInt(9, user.getCodTipoUsuario().getCodTipoUsuario());
        ps.executeUpdate();
        cnn.close();
        ps.close();
    }
    
    public static ArrayList<Usuario> mostrarUsuario() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        ps = cnn.prepareStatement("select UsuarioId, UsuarioCedula, UsuarioNombre, UsuarioApellido, CelularUsuario,\n" +
                                    "UsuarioTelefono, UsuarioNickName, UsuarioEstado, TpoUsuarioId\n" +
                                    "FROM usuario ");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Usuario user = new Usuario() {};
            user.setIdUsuario(rs.getInt("UsuarioId"));
            user.setCedula(rs.getString("UsuarioCedula"));
            user.setNombre(rs.getString("UsuarioNombre"));
            user.setApellido(rs.getString("UsuarioApellido"));
            user.setCelular(rs.getString("CelularUsuario"));
            user.setTelefono(rs.getString("UsuarioTelefono"));
            user.setNickname(rs.getString("UsuarioNickName"));
            user.setEstado(rs.getBoolean("UsuarioEstado"));
            user.setCodTipoUsuario(BDTipoUsuario.buscarTipoUsuarioPorId(rs.getInt("TpoUsuarioId")));            
            lista.add(user);
        }
        
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static ArrayList<Usuario> mostrarUsuario(String dato) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        ps = cnn.prepareStatement("select UsuarioId, UsuarioCedula, UsuarioNombre, UsuarioApellido, CelularUsuario,\n" +
                                    "UsuarioTelefono, UsuarioNickName, UsuarioEstado, TpoUsuarioId\n" +
                                    "FROM usuario where UsuarioId= ? or UsuarioNombre like'%"+dato+"%' or UsuarioCedula like'%"+dato+"%'");
        ps.setString(1, dato);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Usuario user = new Usuario() {};
            user.setIdUsuario(rs.getInt("UsuarioId"));
            user.setCedula(rs.getString("UsuarioCedula"));
            user.setNombre(rs.getString("UsuarioNombre"));
            user.setApellido(rs.getString("UsuarioApellido"));
            user.setCelular(rs.getString("CelularUsuario"));
            user.setTelefono(rs.getString("UsuarioTelefono"));
            user.setNickname(rs.getString("UsuarioNickName"));
            user.setEstado(rs.getBoolean("UsuarioEstado"));
            user.setCodTipoUsuario(BDTipoUsuario.buscarTipoUsuarioPorId(rs.getInt("TpoUsuarioId")));            
            lista.add(user);
        }
        
        cnn.close();
        ps.close();
        return lista;
    }
    
    public static Usuario mostrarUsuario1(String codigo) throws SQLException {
        return mostrarUsuario(codigo, null);
    }
    
    public static Usuario mostrarUsuario(String codigo, Usuario user) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("select UsuarioId, UsuarioCedula, UsuarioNombre, UsuarioApellido, CelularUsuario,\n" +
                                    "UsuarioTelefono, UsuarioNickName, UsuarioEstado, TpoUsuarioId, UsuarioDireccion\n" +
                                    "FROM usuario where UsuarioId=?");
        ps.setString(1, codigo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            user = user == null ?  new Usuario() {} : user;
            user.setIdUsuario(rs.getInt("UsuarioId"));
            user.setCedula(rs.getString("UsuarioCedula"));
            user.setNombre(rs.getString("UsuarioNombre"));
            user.setApellido(rs.getString("UsuarioApellido"));
            user.setCelular(rs.getString("CelularUsuario"));
            user.setTelefono(rs.getString("UsuarioTelefono"));
            user.setNickname(rs.getString("UsuarioNickName"));
            user.setEstado(rs.getBoolean("UsuarioEstado"));
            user.setDireccion(rs.getString("UsuarioDireccion"));
            user.setCodTipoUsuario(BDTipoUsuario.buscarTipoUsuarioPorId(rs.getInt("TpoUsuarioId")));            
        }
        cnn.close();
        ps.close();
        return user;
    }
    
    public static Usuario buscarUsuario(String nickname,String contrasena) throws SQLException {
        return buscarUsuario(nickname, contrasena, null);
    }
    
    public static Usuario buscarUsuario(String nickname,String contrasena, Usuario user) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement("select UsuarioId, UsuarioCedula, UsuarioNombre, UsuarioApellido, CelularUsuario,\n" +
                                    "UsuarioTelefono, UsuarioNickName, UsuarioEstado, TpoUsuarioId, UsuarioDireccion\n" +
                                    "FROM usuario where UsuarioNickName=? and UsuarioContrasena=md5('"+contrasena+"')");
        ps.setString(1, nickname);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            user = user == null ?  new Usuario() {} : user;
            user.setIdUsuario(rs.getInt("UsuarioId"));
            user.setCedula(rs.getString("UsuarioCedula"));
            user.setNombre(rs.getString("UsuarioNombre"));
            user.setApellido(rs.getString("UsuarioApellido"));
            user.setCelular(rs.getString("CelularUsuario"));
            user.setTelefono(rs.getString("UsuarioTelefono"));
            user.setNickname(rs.getString("UsuarioNickName"));
            user.setEstado(rs.getBoolean("UsuarioEstado"));
            user.setDireccion(rs.getString("UsuarioDireccion"));
            user.setCodTipoUsuario(BDTipoUsuario.buscarTipoUsuarioPorId(rs.getInt("TpoUsuarioId")));            
        }
        cnn.close();
        ps.close();
        return user;
    }
    
    public static Usuario BuscarCodMax() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        Usuario c = new Usuario() {};
        ps = cnn.prepareStatement("SELECT Max(UsuarioId) FROM usuario");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            c.setIdUsuario(rs.getInt("Max(UsuarioId)"));
        }
        cnn.close();
        ps.close();
        return c;
    }
    
    public static boolean actualizarUsuario(Usuario user) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;

        ps = cnn.prepareStatement(  "UPDATE usuario SET UsuarioNombre =?, UsuarioApellido = ?, UsuarioCedula = ?,\n" +
                                    "CelularUsuario = ?, UsuarioTelefono = ?, UsuarioDireccion = ?,\n" +
                                    "UsuarioNickName = ?, UsuarioContrasena = md5('"+user.getContrasena()+"'), UsuarioEstado = ?, TpoUsuarioId = ?\n" +
                                    "WHERE UsuarioId = " + user.getIdUsuario());
 
        ps.setString(1, user.getNombre());
        ps.setString(2, user.getApellido());
        ps.setString(3, user.getCedula());
        ps.setString(4, user.getCelular());
        ps.setString(5, user.getTelefono());
        ps.setString(6, user.getDireccion());
        ps.setString(7, user.getNickname());
        ps.setBoolean(8, user.isEstado());
        ps.setInt(9, user.getCodTipoUsuario().getCodTipoUsuario());
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
