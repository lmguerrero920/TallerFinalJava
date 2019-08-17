package empleados.constante;

public enum SalarioValor {

    DIURNA(35000),
    NOCTURNA(50000),

    FESTIVO_DIURNA(0.10),
    FESTIVO_NOCTURNA(0.15)

    ;


    SalarioValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }



    private double valor;

}
