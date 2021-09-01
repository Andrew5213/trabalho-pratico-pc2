package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.enums.MenuEnuns;

public interface iCrudController<T> {

    public MenuEnuns start();

    public T create();
    public void read(T conta);
    public T update(T cliSalvar);
    public Boolean delete(T cliDeletar);

    public void list(T[] listas);


}
