package empleados.operaciones;


import static empleados.constante.SalarioValor.*;



public class SalarioLogica extends Conversionsalario {

    public double calcularDiurna()
    {
        return (this.getValor()* DIURNA.getValor());
    }



    public double calcularDiurnaFestivo()
    {
        return (DIURNA.getValor()*FESTIVO_DIURNA.getValor());
    }


    public  double totalDiurnoFestivo(){
        return (calcularDiurna()+calcularDiurnaFestivo());
    }

    public double calcularNocturna()
    {

        return (this.getValor()* NOCTURNA.getValor());
    }
    public double calcularNocturnaFestivo()
    {
        return (NOCTURNA.getValor()*FESTIVO_NOCTURNA.getValor());
    }

    public  double totalNocturnoFestivo(){
        return (calcularNocturna()+calcularNocturnaFestivo());
    }






}
