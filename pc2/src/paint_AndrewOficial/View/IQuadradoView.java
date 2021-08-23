package paint_AndrewOficial.View;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Quadrado1;

public interface IQuadradoView  {
    public MenuEnuns menuPrincipal();
    public Quadrado1 create();
    public void read(Quadrado1 conta);
    public Quadrado1 update(Quadrado1 cliSalvar);
    public Boolean delete(Quadrado1 cliDeletar);

    public void list(Quadrado1[] listas);
}
