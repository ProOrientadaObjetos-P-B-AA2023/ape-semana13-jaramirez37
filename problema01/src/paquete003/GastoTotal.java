/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import paquete004.Pago;

import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class GastoTotal {

    public static double calcularGastoTotalPagos(ArrayList<Pago> historialPago) {
        double totalPagos = 0;
        for (Pago aux : historialPago) {
            totalPagos += aux.getPago();
        }
        return totalPagos;
    }
}
