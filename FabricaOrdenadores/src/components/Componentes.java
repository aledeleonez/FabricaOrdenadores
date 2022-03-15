package components;

public class Componentes {
    String fabricante;
    String modelo;
    Double precioVenta;

    public Componentes(String fabricante, String modelo, Double precioVenta) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Componentes [fabricante=" + fabricante + ", modelo=" + modelo + ", precioVenta=" + precioVenta + "]";
    }

    

    
}
