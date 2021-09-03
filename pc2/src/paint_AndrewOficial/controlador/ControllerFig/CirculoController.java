package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.desenhos.Circulo;
import paint_AndrewOficial.controlador.AbstractCRUDController;
import paint_AndrewOficial.dao.FigGeometricaDao;

public class CirculoController extends AbstractCRUDController<Circulo> {

    public CirculoController(FigGeometricaDao dao) {
        super(dao);
         //tela = new CirculoCli();
    }

    @Override
    public void read(Circulo conta) {

    }
}
