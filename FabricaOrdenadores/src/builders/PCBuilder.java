package builders;

import components.Impresora;
import components.Pantalla;
import components.PantallaTactil;
import components.Raton;
import components.TabletaGrafica;
import components.Teclado;
import ordenadores.Ordenador;

public class PCBuilder implements Builder {

    private Impresora impresora;
    private Pantalla pantalla;
    private Raton raton;
    private TabletaGrafica tableta;
    private Teclado teclado;
    private PantallaTactil pantallaTactil;


    public void setPantallaTactil(PantallaTactil pantallaTactil) {
        this.pantallaTactil = pantallaTactil;
    }

    @Override
    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    @Override
    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    @Override
    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public void setTabletaGrafica(TabletaGrafica tableta) {
        this.tableta = tableta;
        
    }

    @Override
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Ordenador getResult(){
        return new Ordenador(impresora, pantalla, raton, teclado, tableta, pantallaTactil);
    }
    
}
