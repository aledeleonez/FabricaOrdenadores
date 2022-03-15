package ordenadores;

import components.Impresora;
import components.Pantalla;
import components.PantallaTactil;
import components.Raton;
import components.TabletaGrafica;
import components.Teclado;

public class Ordenador {
    private final Impresora impresora;
    private final Pantalla pantalla;
    private final Raton raton;
    private final Teclado teclado;
    private final TabletaGrafica tableta;
    private final PantallaTactil pantallaTactil;

    public Ordenador(Impresora impresora, Pantalla pantalla, Raton raton, Teclado teclado, TabletaGrafica tableta,
            PantallaTactil pantallaTactil) {
        this.impresora = impresora;
        this.pantalla = pantalla;
        this.raton = raton;
        this.teclado = teclado;
        this.tableta = tableta;
        this.pantallaTactil = pantallaTactil;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public Raton getRaton() {
        return raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public TabletaGrafica getTableta() {
        return tableta;
    }

    public PantallaTactil getPantallaTactil() {
        return pantallaTactil;
    }

    @Override
    public String toString() {
        return "Ordenador [impresora=" + impresora + ", pantalla=" + pantalla + ", pantallaTactil=" + pantallaTactil
                + ", raton=" + raton + ", tableta=" + tableta + ", teclado=" + teclado + "]";
    }

    

    

    
}
