package p2;

/**
 *
 * @author Joseph
 */
public abstract class Matricula {

    private double tarifa;

    public Matricula() {
    }

    public Matricula(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public abstract void calcularTarifa();

    @Override
    public String toString() {
        return "Matricula{" + "tarifa=" + tarifa + '}';
    }

}
