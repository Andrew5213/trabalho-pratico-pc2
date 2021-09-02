package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.Cli.LosanguloCli;
import paint_AndrewOficial.controlador.AbstractCRUDController;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Losangulo;

public class LosanguloController extends AbstractCRUDController<Losangulo> {

    public LosanguloController(FigGeometricaDao dao) {
        super(dao);
        tela = new LosanguloCli();
    }

    @Override
    public void read(Losangulo conta) {

    }
}
