package paquete004;

/**
 *
 * @author Joseph
 */
public abstract class Pago {

    private double pago;
    private String mes;

    public Pago() {
    }

    public Pago(double pago, String mes) {
        this.pago = pago;
        this.mes = mes;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public abstract void calcularPago();

    @Override
    public String toString() {
        return "Pago{" + "pago=" + pago + ", mes=" + mes + '}';
    }

}
