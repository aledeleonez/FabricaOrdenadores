package components;

public class Impresora extends Componentes {
    String tipoCartucho;

    public Impresora(String fabricante, String modelo, Double precioVenta, String tipoCartucho) {
        super(fabricante, modelo, precioVenta);
        this.tipoCartucho = tipoCartucho;
    }

    @Override
    public String toString() {
        return super.toString()+" Impresora [tipoCartucho=" + tipoCartucho + "]";
    }

    

    
}
