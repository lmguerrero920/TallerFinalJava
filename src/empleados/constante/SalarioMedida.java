package empleados.constante;

public enum SalarioMedida {
    QUINIENTOS(500),
    QUINIENTOSCINCUENTA(550)
    ;

    SalarioMedida(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }


    private int valor;
}
