package paint_AndrewOficial.controlador.ControladorInterface;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Ponto;

public interface Iponto {
    public MenuEnuns start();

    public Ponto create();
    public void read( Ponto conta);
    public  Ponto update( Ponto cliSalvar);
    public Boolean delete( Ponto cliDeletar);

    public void list( Ponto[] listas);
}
