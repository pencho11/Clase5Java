package main ;


import impuestos.ParafiscalesLogica;

import static constantes.ParafiscalesString.*;
import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        ParafiscalesLogica parafiscalesLogica = new ParafiscalesLogica();

        String nombre = JOptionPane.showInputDialog(null, SOLICITUD_NOMBRE.getMensaje());
        parafiscalesLogica.setNombre(nombre);

        String salario = JOptionPane.showInputDialog(null,SOLICITUD_SALARIO.getMensaje());
        parafiscalesLogica.setSalario(Double.parseDouble(salario));

        JOptionPane.showInputDialog(null,
                NOMBRE_EMPLEADO.getMensaje()+ parafiscalesLogica.getNombre() +SALARIO_ES.getMensaje()+ parafiscalesLogica.getSalario() +
                        DESCUENTO_SALUD.getMensaje() + parafiscalesLogica.calcularSalud()+ DESCUENTO_PENSION.getMensaje()+ parafiscalesLogica.calcularPension()+
                        SALARIO_FINAL.getMensaje() + parafiscalesLogica.totalSalario());
    }
}
