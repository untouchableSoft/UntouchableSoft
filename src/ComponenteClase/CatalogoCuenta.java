package ComponenteClase;

public abstract class CatalogoCuenta {

    private String codCatalogoCuenta;
    private String nomCatalogoCuenta;

    public String getNomCatalogoCuenta() {
        return nomCatalogoCuenta;
    }

    public String getCodCatalogoCuenta() {
        return codCatalogoCuenta;
    }
   
    public void setCodCatalogoCuenta(String codCatalogoCuenta) {
        this.codCatalogoCuenta = codCatalogoCuenta;
    }

    public void setNomCatalogoCuenta(String nomCatalogoCuenta) {
        this.nomCatalogoCuenta = nomCatalogoCuenta;
    }
}
