package components;

public class ImpresoraLaser extends Impresora {
    int numPaginasImpresas;

    public ImpresoraLaser(String fabricante, String modelo, Double precioVenta, String tipoCartucho,
            int numPaginasImpresas) {
        super(fabricante, modelo, precioVenta, tipoCartucho);
        this.numPaginasImpresas = numPaginasImpresas;
    }

    @Override
    public String toString() {
        return super.toString()+" ImpresoraLaser [numPaginasImpresas=" + numPaginasImpresas + "]";
    }

    

    
}
