package paint_AndrewOficial.controlador.ControladorInterface;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Losangulo;

public interface Ilosangulo {
    public MenuEnuns start();

    public Losangulo create();
    public void read( Losangulo conta);
    public  Losangulo update( Losangulo cliSalvar);
    public Boolean delete( Losangulo cliDeletar);

    public void list( Losangulo[] listas);
}
