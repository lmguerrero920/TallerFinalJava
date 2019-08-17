package moneda.operaciones;

public class Conversion {


    public Conversion() {
        this.moneda = 0;

    }

    public double getMoneda() {
        return moneda;
    }

    public void setMoneda(double moneda) {
        this.moneda = moneda;
    }

    public Conversion(double moneda) {
        this.moneda = moneda;
    }

    private double moneda;
}
