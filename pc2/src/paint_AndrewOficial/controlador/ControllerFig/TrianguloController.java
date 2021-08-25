package paint_AndrewOficial.controlador.ControllerFig;

import paint_AndrewOficial.View.*;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.controlador.ControladorInterface.Itriangulo;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.Circulo;
import paint_AndrewOficial.modelo.Triangulo;

public class TrianguloController implements Itriangulo {

    MenuPrincipal p = new MenuPrincipal();
    MenuTriangulo tela = new MenuTriangulo();
    private FigGeometricaDao dao;
    public TrianguloController(FigGeometricaDao dao) {
        MenuTriangulo tela = new MenuTriangulo();
        this.dao = dao;
    }
    @Override
    public MenuEnuns start() {

        MenuEnuns opcao;
        do {
            opcao = tela.Menuprinc();

            p.soutln("escolhi: " + opcao + "\n\n");

            switch (opcao) {
                case CRIAR:
                    Triangulo newQuad = tela.create();
                    dao.create(newQuad);

                    break;
                case EDITAR:
//                    p.soutln("digite o novo valor do quadrado ");
                    Triangulo  recebe = tela.create();
                    Triangulo  newquad = tela.update(recebe);
                    break;
                case LISTAR:
                    for (int i = 0; i < dao.ds.length; i++) {
                        if (dao.ds[i] != null) {
                            p.soutln(dao.ds[i].toString());
                        }
                    }

                    break;
                case MOSTRAR:
                    p.soutln("digite a id que sera mostrado");
                    MenuQuadrado q = new MenuQuadrado();
                    q.receber();
                    p.soutln(dao.ds[q.getA()].toString());
                    break;


                case SAIR:
                    break;
                default:
            }


        } while (opcao != MenuEnuns.SAIR);

        return MenuEnuns.SAIR;
    }


    @Override
    public Triangulo create() {
        return null;
    }

    @Override
    public void read(Triangulo conta) {

    }

    @Override
    public Circulo update(Triangulo cliSalvar) {
        return null;
    }

    @Override
    public Boolean delete(Triangulo cliDeletar) {
        return null;
    }

    @Override
    public void list(Triangulo[] listas) {

    }
}
