package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.Cli.RetaCli;
import paint_AndrewOficial.controlador.AbstractCRUDController;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Reta;

public class RetaController extends AbstractCRUDController<Reta> {

    public RetaController(FigGeometricaDao dao) {
        super(dao);
        tela = new RetaCli();
    }

    @Override
    public void read(Reta conta) {

    }
}
