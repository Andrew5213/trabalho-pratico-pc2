package paint_AndrewOficial.View.gui;

import paint_AndrewOficial.modelo.Retangulo;

public interface IRetanguloView {
    Retangulo create();

    void read(Retangulo conta);

    Retangulo update(Retangulo cliSalvar);

    Boolean delete(Retangulo cliDeletar);

    void list(Retangulo[] listas);
}
