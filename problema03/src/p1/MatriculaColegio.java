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
public class MatriculaColegio extends Matricula {

    public MatriculaColegio() {
    }

    public MatriculaColegio(double tarifa) {
        super(tarifa);
    }

    @Override
    public void calcularTarifa() {
        // tarifa = costo deportes + costo folletos + costo uniformes + costo laboratorios
        double tarifa = 150.2 + 140.2 + 240.2 + 300.4;
        super.setTarifa(tarifa);
    }
}
