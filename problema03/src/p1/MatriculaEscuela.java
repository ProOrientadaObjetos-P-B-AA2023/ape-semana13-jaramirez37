/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import p2.Matricula;

/**
 *
 * @author reroes
 */
public class MatriculaEscuela extends Matricula {

    public MatriculaEscuela() {
    }

    public MatriculaEscuela(double tarifa) {
        super(tarifa);
    }

    @Override
    public void calcularTarifa() {
        // tarifa = costo libros + costo deportes + costo folletos + costo uniformes
        double tarifa = 50.2 + 40.2 + 140.2 + 200.4;
        super.setTarifa(tarifa);
    }
}
