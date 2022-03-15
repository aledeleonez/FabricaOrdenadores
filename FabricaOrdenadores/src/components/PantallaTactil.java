package components;

public class PantallaTactil extends Componentes {
    String tipoConector;
    int puertos;
    
    public PantallaTactil(String fabricante, String modelo, Double precioVenta, String tipoConector, int puertos) {
        super(fabricante, modelo, precioVenta);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    @Override
    public String toString() {
        return super.toString()+" PantallaTactil [puertos=" + puertos + ", tipoConector=" + tipoConector + "]";
    }

    

    
}
