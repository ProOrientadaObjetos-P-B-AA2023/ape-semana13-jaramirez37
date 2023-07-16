/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete002.Propiedad;

/**
 *
 * @author reroes
 */
public class PagoPredial extends Pago {

    private Propiedad propiedad;
    private double porcentaje;

    public PagoPredial() {
    }

    public PagoPredial(Propiedad propiedad, double porcentaje) {
        this.propiedad = propiedad;
        this.porcentaje = porcentaje;
    }

    public PagoPredial(double pago, String mes, Propiedad propiedad, double porcentaje) {
        super(pago, mes);
        this.propiedad = propiedad;
        this.porcentaje = porcentaje;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public void calcularPago() {
        super.setPago(propiedad.getCostoPropiedad() - ((propiedad.getCostoPropiedad() * porcentaje) / 100));
    }

    @Override
    public String toString() {
        return "PagoPredial{" + "propiedad=" + propiedad + ", porcentaje=" + porcentaje + '}' + super.toString();
    }

}