package ComponenteClase;

import java.util.Date;

public abstract class CicloContable {

    private String codCicloContable;
    private Date fechaInicioCicloContable; 
    private Date fechaFinCicloContable;
    private String descripcion;
    private boolean estado;

    public void setCodCicloContable(String codCicloContable) {
        this.codCicloContable = codCicloContable;
    }

    public void setFechaInicioCicloContable(Date fechaInicioCicloContable) {
        this.fechaInicioCicloContable = fechaInicioCicloContable;
    }

    public void setFechaFinCicloContable(Date fechaFinCicloContable) {
        this.fechaFinCicloContable = fechaFinCicloContable;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCodCicloContable() {
        return codCicloContable;
    }

    public Date getFechaInicioCicloContable() {
        return fechaInicioCicloContable;
    }

    public Date getFechaFinCicloContable() {
        return fechaFinCicloContable;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstado() {
        return estado;
    }
}
