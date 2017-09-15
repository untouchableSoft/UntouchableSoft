package ComponenteClase;

import java.util.Date;

public abstract class PeriodoContable {

    private String codPeriodoContable;
    private Date fechaInicioPeriodoContable;
    private Date fechaFinPeriodoContable;
    private boolean estadoPeriodoContable;
    private String descripcionPeriodoContable;
    private CicloContable codCicloContable;

    public void setCodPeriodoContable(String codPeriodoContable) {
        this.codPeriodoContable = codPeriodoContable;
    }

    public void setFechaInicioPeriodoContable(Date fechaInicioPeriodoContable) {
        this.fechaInicioPeriodoContable = fechaInicioPeriodoContable;
    }

    public void setFechaFinPeriodoContable(Date fechaFinPeriodoContable) {
        this.fechaFinPeriodoContable = fechaFinPeriodoContable;
    }

    public void setEstadoPeriodoContable(boolean estadoPeriodoContable) {
        this.estadoPeriodoContable = estadoPeriodoContable;
    }

    public void setDescripcionPeriodoContable(String descripcionPeriodoContable) {
        this.descripcionPeriodoContable = descripcionPeriodoContable;
    }

    public void setCodCicloContable(CicloContable codCicloContable) {
        this.codCicloContable = codCicloContable;
    }

    public String getCodPeriodoContable() {
        return codPeriodoContable;
    }

    public Date getFechaInicioPeriodoContable() {
        return fechaInicioPeriodoContable;
    }

    public Date getFechaFinPeriodoContable() {
        return fechaFinPeriodoContable;
    }

    public boolean isEstadoPeriodoContable() {
        return estadoPeriodoContable;
    }

    public String getDescripcionPeriodoContable() {
        return descripcionPeriodoContable;
    }

    public CicloContable getCodCicloContable() {
        return codCicloContable;
    }

}
