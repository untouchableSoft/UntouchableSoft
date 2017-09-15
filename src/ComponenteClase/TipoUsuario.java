package ComponenteClase;

public abstract class TipoUsuario {

    private int codTipoUsuario;
    private String nomTipoUsuario;
    
    public int getCodTipoUsuario() {
        return codTipoUsuario;
    }

    public void setCodTipoUsuario(int codTipoUsuario) {
        this.codTipoUsuario = codTipoUsuario;
    }

    public String getNomTipoUsuario() {
        return nomTipoUsuario;
    }

    public void setNomTipoUsuario(String nomTipoUsuario) {
        this.nomTipoUsuario = nomTipoUsuario;
    }
}
