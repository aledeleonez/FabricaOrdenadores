package components;

public class TabletaGrafica extends Componentes {
    String tipoConector;
    int puertos;
    
    public TabletaGrafica(String fabricante, String modelo, Double precioVenta, String tipoConector, int puertos) {
        super(fabricante, modelo, precioVenta);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    @Override
    public String toString() {
        return super.toString()+" TabletaGrafica [puertos=" + puertos + ", tipoConector=" + tipoConector + "]";
    }

    

    
}
