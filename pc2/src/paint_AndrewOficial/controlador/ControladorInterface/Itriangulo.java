package paint_AndrewOficial.controlador.ControladorInterface;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Circulo;
import paint_AndrewOficial.modelo.Triangulo;

public interface Itriangulo {
    public MenuEnuns start();

    public Triangulo create();
    public void read( Triangulo conta);
    public  Circulo update( Triangulo cliSalvar);
    public Boolean delete( Triangulo cliDeletar);

    public void list( Triangulo[] listas);
}
