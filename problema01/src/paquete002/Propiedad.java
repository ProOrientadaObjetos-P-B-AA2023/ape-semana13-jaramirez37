/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author reroes
 */
public class Propiedad {

    public double costoPropiedad;

    public Propiedad() {
    }

    public Propiedad(double costoPropiedad) {
        this.costoPropiedad = costoPropiedad;
    }

    public double getCostoPropiedad() {
        return costoPropiedad;
    }

    public void setCostoPropiedad(double costoPropiedad) {
        this.costoPropiedad = costoPropiedad;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "costoPropiedad=" + costoPropiedad + '}';
    }

}
