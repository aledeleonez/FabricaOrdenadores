package components;

public class Teclado extends Componentes{
    String tipoConector;
    int puertos;

    public Teclado(String fabricante, String modelo, Double precioVenta, String tipoConector, int puertos) {
        super(fabricante, modelo, precioVenta);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    @Override
    public String toString() {
        return super.toString()+" Teclado [puertos=" + puertos + ", tipoConector=" + tipoConector + "]";
    }

    
    
    
}