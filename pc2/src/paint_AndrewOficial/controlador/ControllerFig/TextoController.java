package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.Cli.TextoCli;
import paint_AndrewOficial.controlador.AbstractCRUDController;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Texto;

public class TextoController extends AbstractCRUDController<Texto> {


    public TextoController(FigGeometricaDao dao) {
        super(dao);
        tela = new TextoCli();

    }

    @Override
    public void read(Texto conta) {

    }
}
