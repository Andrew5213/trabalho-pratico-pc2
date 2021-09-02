package paint_AndrewOficial.View.gui;

import paint_AndrewOficial.View.enums.MenuEnuns;

public interface ICRUDFiguraView<T> extends IBasicView {
    public MenuEnuns menuPrincipal();
    public T create();
    public void read(T conta);
    public T update(T toSabe);
    public Boolean delete(T toDelete);

    public void list(T[] listas);
}
