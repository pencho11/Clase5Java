package constantes;

public enum ParafiscalesString
{
    SOLICITUD_NOMBRE("Ingresa nombre: " ),
    SOLICITUD_SALARIO("ingresar el salario: "),
    NOMBRE_EMPLEADO("Empleado: "),
    SALARIO_ES("su salario es: "),
    DESCUENTO_SALUD("su descuento salud"),
    DESCUENTO_PENSION("su descuento en pension: "),
    SALARIO_FINAL(" Su salario es: ");

    private String mensaje;

    ParafiscalesString(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
