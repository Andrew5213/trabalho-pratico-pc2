package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.Cli.MenuDesenhos;
import paint_AndrewOficial.View.Cli.MenuPrincipal;
import paint_AndrewOficial.View.Cli.MenuQuadrado;
import paint_AndrewOficial.View.Cli.Paint_Janela;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.View.gui.IMenuPaintView;
import paint_AndrewOficial.controlador.ControllerFig.*;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.FigGeometrica;

public class principal {
    //private FiguraGeometricaDAO dao;
    private AbstractCRUDController quadController;
    private AbstractCRUDController trian;
    private AbstractCRUDController rect;
    private AbstractCRUDController txx;
    private AbstractCRUDController ptt;
    private AbstractCRUDController rtt;
    private AbstractCRUDController trap;
    private AbstractCRUDController losa;
    private AbstractCRUDController ccc;
    private IMenuPaintView tela;
    private FigGeometricaDao dao;
    MenuPrincipal m1 = new MenuPrincipal();
    MenuEnuns opcao = MenuEnuns.LISTAR;
    Paint_Janela p11 = new Paint_Janela();
    MenuDesenhos d1 = new MenuDesenhos();
    private FigGeometrica[] vetor;
    public principal() {
        trap = new TrapezioController(dao);
        losa = new LosanguloController(dao);
        ptt = new PontoController(dao);
        vetor = new FigGeometrica[10];
        dao = new FigGeometricaDao(10);
        quadController = new QuadradoController(dao);
        trian = new TrianguloController(dao);
        rect = new RetanguloController(dao);
        txx = new TextoController(dao);
        ccc = new CirculoController(dao);
        rtt = new RetaController(dao);
    }


    public void Exe() {
        do {

            opcao = m1.Menuprinc();


            m1.sout("escolhi: " + opcao + "\n\n");
            switch (opcao) {
                case APAGAR:
                    m1.soutln("digite qual e a figura q sera apagada ");
                    MenuQuadrado q = new MenuQuadrado();
                    q.receber();
                    dao.ds[q.getA()] = null;
                    m1.soutln("apagada com sucesso ");
                    break;
                case QUADRADO:
                    quadController.start(1);
                    break;
                case RETANGULO:
                    rect.start(2);
                    break;
                case CIRCULO:

                    ccc.start(3);
                    break;
                case PONTO:
                    ptt.start(4);

                    break;
                case TRIANGULO:
                    trian.start(5);
                    break;
                case LOSANGULO:
                    losa.start(8);
                    break;

                case TEXTO:
                    txx.start(11);


                    break;
                case SALVAR:
                    dao.salvarEmArquivo();
                    break;
                case RECUPERAR:
                    dao.carregarDeArquivo();
                    break;

                case RETA:
                    rtt.start(14);
                    break;
                case LISTAR:

                    dao.Listar(0);
                    //d.getItens();


                    break;

                case DESENHAR:
                    d1.Escolha();
                    switch (d1.getI()) {
                        case 1:
                            p11.PintarQuadrado();
                            break;
                        case 2:
                            p11.PintarRetangulo();
                            break;
                        case 3:
                            p11.PintarTriangulo();
                            break;
                        case 4:
                            p11.PintarCirculo();
                            break;
                        case 5:
                            p11.PintarReta();
                            break;
                        case 6:
                            p11.PintarLosangulo();//este nao consegi fazer funcionar graficamente
                    }
                    break;
                case SAIR:
                    break;
                case TRAPEZIO:
                    trap.start(10);
                    break;
                default:
            }
        } while (opcao != MenuEnuns.SAIR);
    }


}