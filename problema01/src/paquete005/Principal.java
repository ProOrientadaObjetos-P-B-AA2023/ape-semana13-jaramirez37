/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;

import java.util.ArrayList;
import java.util.Scanner;
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

        Scanner sc = new Scanner(System.in);
        Persona cliente = new Persona();
        BilleteraPagos billeteraCliente = new BilleteraPagos();
        ArrayList<Pago> listaPagos = new ArrayList<>();

        boolean bandera;
        int op;

        bandera = true;

        System.out.println("BILLETERA PAGOS");
        System.out.println();

        System.out.print("-Ingrese su nombre: ");
        cliente.setNombre(sc.nextLine());
        System.out.print("-Ingrese su apellido: ");
        cliente.setApellido(sc.nextLine());
        System.out.print("-Ingrese su edad: ");
        cliente.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.print("-Ingrese su número de cédula: ");
        cliente.setCedula(sc.nextLine());
        System.out.print("-Ingrese su ciudad: ");
        Ciudad ciudad = new Ciudad(sc.nextLine());
        cliente.setCiudad(ciudad);
        billeteraCliente.setPersona(cliente);

        do {
            billeteraCliente.setListaPagos(listaPagos);
            System.out.println();
            System.out.println("**********PAGOS************");
            System.out.println("Agua Potable            [1]");
            System.out.println("Luz Eléctrica           [2]");
            System.out.println("Pago Predial            [3]");
            System.out.println("Teléfono Convencional   [4]");
            System.out.println("Reporte                 [5]");
            System.out.println("Salir                   [6]");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1 -> {
                    PagoAguaPotable aguaPotable = new PagoAguaPotable();
                    System.out.println("PAGO AGUA");
                    System.out.print("Ingrese el mes: ");
                    aguaPotable.setMes(sc.nextLine());
                    System.out.print("Tarifa: ");
                    aguaPotable.setTarifaFija(sc.nextDouble());
                    System.out.print("Metros Cubicos Consumo: ");
                    aguaPotable.setMetrosCubicosConsumo(sc.nextDouble());
                    System.out.print("Costo Consumo Cubicos: ");
                    aguaPotable.setCostoConsumoCubicos(sc.nextDouble());
                    sc.nextLine();
                    System.out.print("Tipo (comercial/casa): ");
                    aguaPotable.setTipo(sc.nextLine());
                    aguaPotable.calcularPago();
                    listaPagos.add(aguaPotable);
                }
                case 2 -> {
                    PagoLuzElectrica luzElectrica = new PagoLuzElectrica();
                    luzElectrica.setCiudad(ciudad);
                    System.out.println("PAGO LUZ");
                    System.out.print("Ingrese el mes: ");
                    luzElectrica.setMes(sc.nextLine());
                    System.out.print("Tarifa Base: ");
                    luzElectrica.setTarifaBase(sc.nextDouble());
                    System.out.print("Kilovatios Consumidos: ");
                    luzElectrica.setKilovatiosConsumidos(sc.nextDouble());
                    System.out.print("Costo Kilovatio: ");
                    luzElectrica.setCostoKilovatio(sc.nextDouble());
                    sc.nextLine();
                    luzElectrica.calcularPago();
                    listaPagos.add(luzElectrica);
                }
                case 3 -> {
                    PagoPredial pagoPredial = new PagoPredial();
                    System.out.println("PAGO PEDRIAL");
                    System.out.print("Ingrese el mes: ");
                    pagoPredial.setMes(sc.nextLine());
                    System.out.print("Valor Propiedad: ");
                    pagoPredial.setPropiedad(new Propiedad(sc.nextDouble()));
                    System.out.print("Porcentaje: ");
                    pagoPredial.setPorcentaje(sc.nextDouble());
                    sc.nextLine();
                    pagoPredial.calcularPago();
                    listaPagos.add(pagoPredial);
                }
                case 4 -> {
                    PagoTelefonoConvencional telefonoConvencional = new PagoTelefonoConvencional();
                    System.out.println("PAGO TELEFONO");
                    System.out.print("Ingrese el mes: ");
                    telefonoConvencional.setMes(sc.nextLine());
                    System.out.print("Tarifa: ");
                    telefonoConvencional.setTarifa(sc.nextDouble());
                    System.out.print("Minutos Consumidos: ");
                    telefonoConvencional.setMinutosConsumidos(sc.nextDouble());
                    System.out.print("Costo Minuto: ");
                    telefonoConvencional.setCostoMinuto(sc.nextDouble());
                    telefonoConvencional.calcularPago();
                    listaPagos.add(telefonoConvencional);
                }
                case 5 -> {
                    System.out.println("******Reporte******");
                    System.out.println(billeteraCliente);
                }
                case 6 -> {
                    bandera = false;
                    System.out.println("*Saliendo...");
                    sc.close();
                }
                default -> {
                    System.out.println("Error");
                }
            }

        } while (bandera);
    }
}