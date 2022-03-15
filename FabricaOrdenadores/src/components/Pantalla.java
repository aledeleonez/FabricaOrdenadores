package components;

public class Pantalla extends Componentes {
    String tipoConector;
    int puertos;
    
    public Pantalla(String fabricante, String modelo, Double precioVenta, String tipoConector, int puertos) {
        super(fabricante, modelo, precioVenta);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    @Override
    public String toString() {
        return super.toString()+" Pantalla [puertos=" + puertos + ", tipoConector=" + tipoConector + "]";
    }

    
    
    
}
