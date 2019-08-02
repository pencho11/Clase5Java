package constantes ;

public enum ParafiscalesEntero
{
    CERO(0),
    NOVECIENTOS(900000);

    private int numero ;

    public int getNumero() {
        return numero;
    }

    ParafiscalesEntero( int i ) {
        this.numero = i;
    }
}
