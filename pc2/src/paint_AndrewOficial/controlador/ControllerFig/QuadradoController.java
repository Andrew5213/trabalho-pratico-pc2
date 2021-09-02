package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.Cli.QuadradoCli;
import paint_AndrewOficial.controlador.AbstractCRUDController;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Quadrado1;

public class QuadradoController extends AbstractCRUDController<Quadrado1> {
  public QuadradoController (FigGeometricaDao dao){
      super(dao);
      tela = new QuadradoCli();
  }



}
