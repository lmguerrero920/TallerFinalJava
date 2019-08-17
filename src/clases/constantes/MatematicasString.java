package clases.constantes;

public enum MatematicasString {

    TITULO_OPCION_MATEMATICAS("Opción de Operaciones Matemáticas");

    private String texto;

    MatematicasString(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
