package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.Cli.TrapezioCli;
import paint_AndrewOficial.controlador.AbstractCRUDController;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Trapezio;

public class TrapezioController extends AbstractCRUDController<Trapezio> {


    public TrapezioController(FigGeometricaDao dao) {
        super(dao);
        tela = new TrapezioCli();
    }

    @Override
    public void read(Trapezio conta) {

    }
}
