/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import java.util.ArrayList;
import paquete001.Persona;
import paquete004.Pago;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {

    public Persona persona;
    public double gastoPagos;
    ArrayList<Pago> listaPagos;

    public BilleteraPagos() {
    }

    public BilleteraPagos(Persona persona, double gastoPagos, ArrayList<Pago> listaPagos) {
        this.persona = persona;
        this.gastoPagos = gastoPagos;
        this.listaPagos = listaPagos;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public double getGastoPagos() {
        return gastoPagos;
    }

    public void setGastoPagos(double gastoPagos) {
        this.gastoPagos = gastoPagos;
    }

    public ArrayList<Pago> getListaPagos() {
        return listaPagos;
    }

    public void setListaPagos(ArrayList<Pago> listaPagos) {
        this.listaPagos = listaPagos;
    }

    @Override
    public String toString() {
        return String.format("***Reporte***"
                + "\nCliente: %s %s"
                + "\nCedula: %s"
                + "\nCiudad:%s"
                + "\nLista de Pagos: %s"
                + "\nNumero de Pagos: %d"
                + "\nGasto Total Pagos: %.2f",
                this.persona.getNombre(), this.persona.getApellido(),
                this.persona.getCedula(), this.persona.getCiudad().getNombreCiudad(),
                this.getListaPagos().toString(), listaPagos.size(),
                GastoTotal.calcularGastoTotalPagos(this.listaPagos));
    }

}
