package moneda.constante;

public enum MonedaString
{
    TITULO("CONVERSION MONEDAS"),
    FORMATO("###,###.##"),
    ALERTA("POR FAVOR SELECCIONE UN TIPO DE MONEDA"),
    VACIO("")
    ;

    MonedaString(String ms) {
        this.ms = ms;
    }

    public String getMs() {
        return ms;
    }

    private String ms;

}
