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
public class MatriculaMaternal extends Matricula {

    public MatriculaMaternal() {
    }

    public MatriculaMaternal(double tarifa) {
        super(tarifa);
    }

    @Override
    public void calcularTarifa() {
        // tarifa = costo desayunos + costo almuerzo + costo medico
        double tarifa = 50.2 + 40.2 + 80.2;
        super.setTarifa(tarifa);
    }

}
