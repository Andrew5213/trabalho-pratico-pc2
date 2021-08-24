package paint_AndrewOficial.controlador.ControladorFig;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Retangulo;
import paint_AndrewOficial.modelo.Texto;

public interface ITexto {
    public MenuEnuns start();

    public Texto create();
    public void read(Texto conta);
    public Retangulo update(Texto cliSalvar);
    public Boolean delete(Texto cliDeletar);

    public void list(Texto[] listas);
}
