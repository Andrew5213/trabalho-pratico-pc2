package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.controlador.AbstractCRUDController;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Triangulo;

public  class TrianguloController extends AbstractCRUDController<Triangulo> {


    public TrianguloController(FigGeometricaDao dao) {

        super(dao);
    }


    @Override
    public void read(Triangulo conta) {

    }
}
