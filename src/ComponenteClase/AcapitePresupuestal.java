package ComponenteClase;

public abstract class AcapitePresupuestal {

    private int codAcapitePresupuestal;
    private String nomAcapitePresupuestal;
    private String descripcionAcapitePresupuestal;
    private CatalogoCuenta codCatalogoCuenta;
    private CatalogoPresupuesto idCatalogoPresupuesto;

    public void setCodAcapitePresupuestal(int codAcapitePresupuestal) {
        this.codAcapitePresupuestal = codAcapitePresupuestal;
    }

    public void setNomAcapitePresupuestal(String nomAcapitePresupuestal) {
        this.nomAcapitePresupuestal = nomAcapitePresupuestal;
    }

    public void setDescripcionAcapitePresupuestal(String descripcionAcapitePresupuestal) {
        this.descripcionAcapitePresupuestal = descripcionAcapitePresupuestal;
    }

    public void setCodCatalogoCuenta(CatalogoCuenta codCatalogoCuenta) {
        this.codCatalogoCuenta = codCatalogoCuenta;
    }

    public void setIdCatalogoPresupuesto(CatalogoPresupuesto idCatalogoPresupuesto) {
        this.idCatalogoPresupuesto = idCatalogoPresupuesto;
    }

    public int getCodAcapitePresupuestal() {
        return codAcapitePresupuestal;
    }

    public String getNomAcapitePresupuestal() {
        return nomAcapitePresupuestal;
    }

    public String getDescripcionAcapitePresupuestal() {
        return descripcionAcapitePresupuestal;
    }

    public CatalogoCuenta getCodCatalogoCuenta() {
        return codCatalogoCuenta;
    }

    public CatalogoPresupuesto getIdCatalogoPresupuesto() {
        return idCatalogoPresupuesto;
    }
}
