/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

/**
 *
 * @author reroes
 */
public class PagoTelefonoConvencional extends Pago {

    double tarifa;
    double minutosConsumidos;
    double costoMinuto;

    public PagoTelefonoConvencional() {
    }

    public PagoTelefonoConvencional(double tarifa, double minutosConsumidos, double costoMinuto) {
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    public PagoTelefonoConvencional(double pago, String mes, double tarifa, double minutosConsumidos, double costoMinuto) {
        super(pago, mes);
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getMinutosConsumidos() {
        return minutosConsumidos;
    }

    public void setMinutosConsumidos(double minutosConsumidos) {
        this.minutosConsumidos = minutosConsumidos;
    }

    public double getCostoMinuto() {
        return costoMinuto;
    }

    public void setCostoMinuto(double costoMinuto) {
        this.costoMinuto = costoMinuto;
    }

    @Override
    public void calcularPago() {
        super.setPago(tarifa + (minutosConsumidos * costoMinuto));
    }

    @Override
    public String toString() {
        return "PagoTelefonoConvencional{" + "tarifa=" + tarifa + ", minutosConsumidos=" + minutosConsumidos + ", costoMinuto=" + costoMinuto + '}' + super.toString();
    }

}