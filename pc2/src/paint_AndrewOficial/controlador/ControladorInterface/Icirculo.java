package paint_AndrewOficial.controlador.ControladorInterface;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Circulo;

public interface Icirculo {
    public MenuEnuns start();

    public Circulo create();
    public void read( Circulo conta);
    public  Circulo update( Circulo cliSalvar);
    public Boolean delete( Circulo cliDeletar);

    public void list( Circulo[] listas);
}
