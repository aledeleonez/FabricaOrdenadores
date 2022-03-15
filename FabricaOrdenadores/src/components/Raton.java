package components;

public class Raton extends Componentes {
    String tipoConector;
    int puertos;

    public Raton(String fabricante, String modelo, Double precioVenta, String tipoConector, int puertos) {
        super(fabricante, modelo, precioVenta);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    @Override
    public String toString() {
        return super.toString() + "Raton [puertos=" + puertos + ", tipoConector=" + tipoConector + "]";
    }

    

    
}
