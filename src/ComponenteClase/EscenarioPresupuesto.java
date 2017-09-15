package ComponenteClase;

import java.util.Date;

public abstract class EscenarioPresupuesto {

    private int idEscenarioPresupuesto;
    private String numeroEscenarioPresupuesto;
    private Date fechaEscenarioPresupuesto;
    private String descripcionEscenarioPresupuesto;
    private Usuario idUsuario;

    public void setIdEscenarioPresupuesto(int idEscenarioPresupuesto) {
        this.idEscenarioPresupuesto = idEscenarioPresupuesto;
    }

    public void setNumeroEscenarioPresupuesto(String numeroEscenarioPresupuesto) {
        this.numeroEscenarioPresupuesto = numeroEscenarioPresupuesto;
    }

    public void setFechaEscenarioPresupuesto(Date fechaEscenarioPresupuesto) {
        this.fechaEscenarioPresupuesto = fechaEscenarioPresupuesto;
    }

    public void setDescripcionEscenarioPresupuesto(String descripcionEscenarioPresupuesto) {
        this.descripcionEscenarioPresupuesto = descripcionEscenarioPresupuesto;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEscenarioPresupuesto() {
        return idEscenarioPresupuesto;
    }

    public String getNumeroEscenarioPresupuesto() {
        return numeroEscenarioPresupuesto;
    }

    public Date getFechaEscenarioPresupuesto() {
        return fechaEscenarioPresupuesto;
    }

    public String getDescripcionEscenarioPresupuesto() {
        return descripcionEscenarioPresupuesto;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }
}
