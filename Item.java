public class Item {

    String nombre;
    CondicionVenta condicionVenta;
    double precioContado;
    boolean estaReservado;

    public Item(String nombre, CondicionVenta condicionVenta, double precioContado) {
        this.nombre = nombre;
        this.condicionVenta = condicionVenta;
        this.precioContado = precioContado;
        this.estaReservado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CondicionVenta getCondicionVenta() {
        return condicionVenta;
    }

    public void setCondicionVenta(CondicionVenta condicionVenta) {
        this.condicionVenta = condicionVenta;
    }

    public double getPrecioContado() {
        return precioContado;
    }

    public void setPrecioContado(double precioContado) {
        this.precioContado = precioContado;
    }

    public boolean isEstaReservado() {
        return estaReservado;
    }

    public void setEstaReservado(boolean estaReservado) {
        this.estaReservado = estaReservado;
    }
}
