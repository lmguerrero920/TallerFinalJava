package moneda.constante;

public enum MonedaValor {

    DOLAR(3000),
    EURO(3500),
    YEN(1500),
    QUINIENTOS(500)
    ;

    MonedaValor(int valormoneda) {
        this.valormoneda = valormoneda;
    }

    private int valormoneda;

    public int getValormoneda() {
        return valormoneda;
    }
}
