package ComponenteClase;

public abstract class CatalogoPresupuesto {

    private int idCatalogoPresupuesto;
    private String codCatalogoPresupuesto;
    private String nomCatalogoPresupuesto;
    private String DescripcionCatalogoPresupuesto;

    public void setIdCatalogoPresupuesto(int idCatalogoPresupuesto) {
        this.idCatalogoPresupuesto = idCatalogoPresupuesto;
    }

    public void setCodCatalogoPresupuesto(String codCatalogoPresupuesto) {
        this.codCatalogoPresupuesto = codCatalogoPresupuesto;
    }

    public void setNomCatalogoPresupuesto(String nomCatalogoPresupuesto) {
        this.nomCatalogoPresupuesto = nomCatalogoPresupuesto;
    }

    public void setDescripcionCatalogoPresupuesto(String DescripcionCatalogoPresupuesto) {
        this.DescripcionCatalogoPresupuesto = DescripcionCatalogoPresupuesto;
    }

    public int getIdCatalogoPresupuesto() {
        return idCatalogoPresupuesto;
    }

    public String getCodCatalogoPresupuesto() {
        return codCatalogoPresupuesto;
    }

    public String getNomCatalogoPresupuesto() {
        return nomCatalogoPresupuesto;
    }

    public String getDescripcionCatalogoPresupuesto() {
        return DescripcionCatalogoPresupuesto;
    }

}
