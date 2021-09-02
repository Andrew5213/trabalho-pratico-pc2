package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.Cli.RetanguloCli;
import paint_AndrewOficial.controlador.AbstractCRUDController;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Retangulo;

public class RetanguloController extends AbstractCRUDController<Retangulo> {


    public RetanguloController(FigGeometricaDao dao) {
        super(dao);
        tela = new RetanguloCli();
    }

    @Override
    public void read(Retangulo conta) {

    }
}
