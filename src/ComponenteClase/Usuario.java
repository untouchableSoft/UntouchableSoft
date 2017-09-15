package ComponenteClase;

public abstract class Usuario {

    private int idUsuario;
    private String nombre;
    private String Apellido;
    private String cedula;
    private String nickname;
    private String contrasena;
    private String telefono;
    private String celular;
    private String direccion;
    private boolean estado;
    private TipoUsuario codTipoUsuario;

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCodTipoUsuario(TipoUsuario codTipoUsuario) {
        this.codTipoUsuario = codTipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNickname() {
        return nickname;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public TipoUsuario getCodTipoUsuario() {
        return codTipoUsuario;
    }
}
