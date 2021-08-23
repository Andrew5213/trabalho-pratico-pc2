package paint_AndrewOficial.View.gui;

import paint_AndrewOficial.modelo.Retangulo;

public interface IRetanguloView  {
    public Retangulo create();
    public void read(Retangulo conta);
    public Retangulo update(Retangulo cliSalvar);
    public Boolean delete(Retangulo cliDeletar);

    public void list(Retangulo[] listas);
}
