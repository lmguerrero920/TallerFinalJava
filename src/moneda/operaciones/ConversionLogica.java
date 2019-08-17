package moneda.operaciones;


import moneda.constante.MonedaValor;

public class ConversionLogica  extends Conversion {

    public double calcularDolar()
    {
        return (this.getMoneda()* MonedaValor.DOLAR.getValormoneda());
    }

    public double calcularEuro()
    {
        return (this.getMoneda()* MonedaValor.EURO.getValormoneda());
    }

    public double calcularYen()
    {
        return (this.getMoneda()* MonedaValor.YEN.getValormoneda());
    }

}
