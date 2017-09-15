package ComponenteClase;

public abstract class EscenarioPresupuestoDetalle {

    private double MontoSolicitado;
    private double MontoAprobado;
    private double MontoEjecutado;
    private EscenarioPresupuesto idEscenarioPresupuesto;
    private PeriodoContable codPeriodoContable;
    private AcapitePresupuestal codAcapitePresupuestal;

    public void setMontoSolicitado(double MontoSolicitado) {
        this.MontoSolicitado = MontoSolicitado;
    }

    public void setMontoAprobado(double MontoAprobado) {
        this.MontoAprobado = MontoAprobado;
    }

    public void setMontoEjecutado(double MontoEjecutado) {
        this.MontoEjecutado = MontoEjecutado;
    }

    public void setIdEscenarioPresupuesto(EscenarioPresupuesto idEscenarioPresupuesto) {
        this.idEscenarioPresupuesto = idEscenarioPresupuesto;
    }

    public void setCodPeriodoContable(PeriodoContable codPeriodoContable) {
        this.codPeriodoContable = codPeriodoContable;
    }

    public void setCodAcapitePresupuestal(AcapitePresupuestal codAcapitePresupuestal) {
        this.codAcapitePresupuestal = codAcapitePresupuestal;
    }

    public double getMontoSolicitado() {
        return MontoSolicitado;
    }

    public double getMontoAprobado() {
        return MontoAprobado;
    }

    public double getMontoEjecutado() {
        return MontoEjecutado;
    }

    public EscenarioPresupuesto getIdEscenarioPresupuesto() {
        return idEscenarioPresupuesto;
    }

    public PeriodoContable getCodPeriodoContable() {
        return codPeriodoContable;
    }

    public AcapitePresupuestal getCodAcapitePresupuestal() {
        return codAcapitePresupuestal;
    }
  
}
