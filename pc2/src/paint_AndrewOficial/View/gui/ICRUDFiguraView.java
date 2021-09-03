package paint_AndrewOficial.View.gui;

import paint_AndrewOficial.View.enums.MenuEnuns;

public interface ICRUDFiguraView<T> extends IBasicView {
    MenuEnuns menuPrincipal();

    T create();

    void read(T conta);

    T update(T toSabe);

    Boolean delete(T toDelete);

    void list(T[] listas);
}
