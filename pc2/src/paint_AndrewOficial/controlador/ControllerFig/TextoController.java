package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.MenuTexto;
import paint_AndrewOficial.controlador.AbstractCRUDController;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Texto;

public class TextoController extends AbstractCRUDController<Texto> {


    public TextoController(FigGeometricaDao dao) {
        super(dao);
        tela = new MenuTexto();

    }

    @Override
    public void read(Texto conta) {

    }
}
