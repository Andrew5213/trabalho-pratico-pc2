package paint_AndrewOficial.controlador.ControladorInterface;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Reta;

public interface Ireta {
    public MenuEnuns start();

    public Reta create();
    public void read( Reta conta);
    public  Reta update( Reta cliSalvar);
    public Boolean delete( Reta cliDeletar);

    public void list( Reta[] listas);
}
