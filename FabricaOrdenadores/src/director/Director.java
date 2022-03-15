package director;

import builders.Builder;
import components.Impresora;
import components.Pantalla;
import components.Raton;
import components.TabletaGrafica;
import components.Teclado;

public class Director {
    
    public void construirOrdenador(Builder builder){
        builder.setImpresora(new Impresora("HP", "LaserJet 1022", 200.00, "Negro"));
        builder.setPantalla(new Pantalla("Samsung", "3526", 499.99, "HDMI", 3));
        builder.setRaton(new Raton("Logitech", "Ts3", 43.78, "USB", 3));
        builder.setTabletaGrafica(new TabletaGrafica("Acer", "345", 200.00, "usb", 3));
        builder.setTeclado(new Teclado("Logitech", "3526", 50.00, "USB", 3));
    }
}
