package impuestos ;

import static constantes.ParafiscalesEntero.NOVECIENTOS;

import static constantes.ParafiscalesDouble.*;

public class ParafiscalesLogica extends ParafiscalesNombre
{

    public double calcularSalud()
    {
        if(this.getSalario() > NOVECIENTOS.getNumero())
        {
            return (this.getSalario() * CERO_PUNTO_CERO_CUATRO.getDescuento()) ;
        }
        else
        {
            return (this.getSalario() * CERO_PUNTO_CERO_DOS.getDescuento()) ;
        }
    }

    public double calcularPension()
    {
        if(this.getSalario() > NOVECIENTOS.getNumero() )
        {
            return (this.getSalario() * CERO_PUNTO_CERO_CINCO.getDescuento()) ;
        }
        else
        {
            return (this.getSalario() * CERO_PUNTO_CERO_TRES.getDescuento()) ;
        }
    }

    public double totalSalario()
    {
        return ( this.getSalario() - (this.calcularSalud() + this.calcularPension()) ) ;
    }
}
