/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.Matricula;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        ArrayList<Matricula> listaMatriculas = new ArrayList();

        MatriculaCampamento mcamp = new MatriculaCampamento();
        MatriculaColegio mcole = new MatriculaColegio();
        MatriculaEscuela mescu = new MatriculaEscuela();
        MatriculaJardin mjardin = new MatriculaJardin();
        MatriculaMaternal mmater = new MatriculaMaternal();

        listaMatriculas.add(mcamp);
        listaMatriculas.add(mcole);
        listaMatriculas.add(mescu);
        listaMatriculas.add(mjardin);
        listaMatriculas.add(mmater);
        //Aplicacion de polimorfismo para cada tipo de matricula
        for (Matricula aux : listaMatriculas) {
            aux.calcularTarifa();
        }

        for (Matricula aux_2 : listaMatriculas) {
            System.out.println(aux_2);
        }
    }
}
