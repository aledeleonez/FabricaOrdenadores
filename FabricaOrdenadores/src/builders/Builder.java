package builders;

import components.Impresora;
import components.Pantalla;
import components.Raton;
import components.TabletaGrafica;
import components.Teclado;

public interface Builder {
    void setImpresora(Impresora impresora);
    void setPantalla(Pantalla pantalla);
    void setRaton(Raton raton);
    void setTabletaGrafica(TabletaGrafica tableta);
    void setTeclado(Teclado teclado);
}
