package empleados.constante;

public enum SalarioString
{
    TITULO("SALARIO EMPLEADOS"),

    ALERTA("POR FAVOR SELECCIONE UNA JORNADA Y/O DIA LABORAL"),
    ALERTANOMBRE("POR FAVOR INGRESE SU NOMBRE"),
    DATOS("Datos del Empleado \n"),
    NOMBRE ("\n Nombre : \n"),
    FORMATO("###,###.##"),
    HORAS_LAB("\n Horas Laboradas \n"),
    SALARIO("\n POR FAVOR REVISE EL SALARIO A PAGAR \n"),
     VACIO("")
    ;


    SalarioString(String ms) {
        this.ms = ms;
    }

    public String getMs() {
        return ms;
    }

    private String ms;

}
