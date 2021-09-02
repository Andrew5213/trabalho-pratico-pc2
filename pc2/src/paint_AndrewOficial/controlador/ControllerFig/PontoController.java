package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.Cli.PontoCli;
import paint_AndrewOficial.controlador.AbstractCRUDController;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Ponto;

public class PontoController extends AbstractCRUDController<Ponto> {


    public PontoController(FigGeometricaDao dao) {
        super(dao);
        tela = new PontoCli();
    }

    @Override
    public void read(Ponto conta) {

    }
}
