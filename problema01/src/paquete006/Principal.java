/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete006;

import java.util.ArrayList;
import paquete001.Persona;
import paquete002.Ciudad;
import paquete002.Propiedad;
import paquete003.BilleteraPagos;
import paquete004.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        Ciudad ciudadCliente = new Ciudad("Zamora");
        Persona personaCLiente = new Persona("Joseph", "Ramirez", 20, "1900775972", ciudadCliente);
        BilleteraPagos billeteraCLiente = new BilleteraPagos();
        billeteraCLiente.setPersona(personaCLiente);
        ArrayList<Pago> listaPagos = new ArrayList<>();

        double[][] info1 = DatosAgua.datosComerciales();
        double[][] info2 = DatosAgua.datosCasas();
        for (int i = 0; i < 2; i++) {
            listaPagos.add(new PagoAguaPotable(info1[0][i], info1[1][i], info1[2][i], "comercial"));
            listaPagos.add(new PagoAguaPotable(info2[0][i], info2[1][i], info2[2][i], "casa"));
        }

        Ciudad ciudadGeneral = new Ciudad("Loja");
        info1 = DatosLuz.datosLoja();
        info2 = DatosLuz.datosGeneral();
        for (int i = 0; i < 2; i++) {
            listaPagos.add(new PagoLuzElectrica(info1[0][i], info1[1][i], info1[2][i], ciudadCliente));
            listaPagos.add(new PagoLuzElectrica(info2[0][i], info2[1][i], info2[2][i], ciudadGeneral));
        }

        info1 = DatosPropiedades.datos();
        for (int i = 0; i < 2; i++) {
            Propiedad propiedad = new Propiedad(info1[i][0]);
            listaPagos.add(new PagoPredial(propiedad, info1[i][1]));
        }

        info2 = DatosTelefono.datos();
        for (int i = 0; i < 2; i++) {
            listaPagos.add(new PagoTelefonoConvencional(info2[i][0], (info2[i][1]), (info2[i][2])));
        }

        for (Pago aux : listaPagos) {
            aux.calcularPago();
        }

        billeteraCLiente.setListaPagos(listaPagos);
        System.out.println(billeteraCLiente);
    }
}