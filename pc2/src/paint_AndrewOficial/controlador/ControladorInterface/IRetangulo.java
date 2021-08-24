package paint_AndrewOficial.controlador.ControladorInterface;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Retangulo;

public interface IRetangulo {
    public MenuEnuns start();

    public Retangulo create();
    public void read(Retangulo conta);
    public Retangulo update(Retangulo cliSalvar);
    public Boolean delete(Retangulo cliDeletar);

    public void list(Retangulo[] listas);
}
