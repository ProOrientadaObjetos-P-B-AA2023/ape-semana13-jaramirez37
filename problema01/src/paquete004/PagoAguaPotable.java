/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

/**
 *
 * @author reroes
 */
public class PagoAguaPotable extends Pago {

    private double tarifaFija;
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;
    private String tipo;

    public PagoAguaPotable() {
    }

    public PagoAguaPotable(double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos, String tipo) {
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
        this.tipo = tipo;
    }

    public PagoAguaPotable(double pago, String mes, double tarifaFija, double metrosCubicosConsumo, double costoConsumoCubicos, String tipo) {
        super(pago, mes);
        this.tarifaFija = tarifaFija;
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
        this.tipo = tipo;
    }

    public double getTarifaFija() {
        return tarifaFija;
    }

    public void setTarifaFija(double tarifaFija) {
        this.tarifaFija = tarifaFija;
    }

    public double getMetrosCubicosConsumo() {
        return metrosCubicosConsumo;
    }

    public void setMetrosCubicosConsumo(double metrosCubicosConsumo) {
        this.metrosCubicosConsumo = metrosCubicosConsumo;
    }

    public double getCostoConsumoCubicos() {
        return costoConsumoCubicos;
    }

    public void setCostoConsumoCubicos(double costoConsumoCubicos) {
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void calcularPago() {
        if (tipo.equals("comercial")) {
            super.setPago(tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15);
        } else {
            super.setPago(tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos));
        }
    }

    @Override
    public String toString() {
        return "PagoAguaPotable{" + "tarifaFija=" + tarifaFija + ", metrosCubicosConsumo=" + metrosCubicosConsumo + ", costoConsumoCubicos=" + costoConsumoCubicos + ", tipo=" + tipo + '}' + super.toString();
    }

}