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
public class MatriculaCampamento extends Matricula {

    public MatriculaCampamento() {
    }

    public MatriculaCampamento(double tarifa) {
        super(tarifa);
    }

    @Override
    public void calcularTarifa() {
        // Tarifa = Costo Transporte + Costo Comida + Costo Instructores
        double tarifa = 100.2 + 30.2 + 90.2;
        super.setTarifa(tarifa);
    }

}
