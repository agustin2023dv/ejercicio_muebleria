import java.util.Date;

public class CondicionVenta {

    double descuento;
    int cantCuotasMax;
    double precioFinanciado;
    Date fechaEntrega;

    public CondicionVenta(double descuento, int cantCuotasMax, double precioFinanciado) {
        this.descuento = descuento;
        this.cantCuotasMax = cantCuotasMax;
        this.precioFinanciado = precioFinanciado;
    }

    public CondicionVenta(double descuento, int cantCuotasMax, double precioFinanciado, Date fechaEntrega) {
        this.descuento = descuento;
        this.cantCuotasMax = cantCuotasMax;
        this.precioFinanciado = precioFinanciado;
        this.fechaEntrega = fechaEntrega;
    }

    public CondicionVenta(int cantCuotasMax, double precioFinanciado, Date fechaEntrega) {
        this.cantCuotasMax = cantCuotasMax;
        this.precioFinanciado = precioFinanciado;
        this.fechaEntrega = fechaEntrega;
    }


    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getCantCuotasMax() {
        return cantCuotasMax;
    }

    public void setCantCuotasMax(int cantCuotasMax) {
        this.cantCuotasMax = cantCuotasMax;
    }

    public double getPrecioFinanciado() {
        return precioFinanciado;
    }

    public void setPrecioFinanciado(double precioFinanciado) {
        this.precioFinanciado = precioFinanciado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
