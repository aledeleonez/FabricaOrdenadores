import builders.PCBuilder;
import director.Director;
import ordenadores.Ordenador;

//Alejandro de Leon 130602

public class App {
    public static void main(String[] args) throws Exception {
        Director director = new Director();
        PCBuilder builder = new PCBuilder();

        director.construirOrdenador(builder);

        Ordenador ordenador = builder.getResult();
        System.out.println(ordenador);

    }
}
