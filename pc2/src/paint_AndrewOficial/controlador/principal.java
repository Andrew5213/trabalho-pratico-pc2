package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.MenuDesenhos;
import paint_AndrewOficial.View.MenuPrincipal;
import paint_AndrewOficial.View.MenuQuadrado;
import paint_AndrewOficial.View.Paint_Janela;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.View.gui.IMenuPaintView;
import paint_AndrewOficial.controlador.ControllerFig.*;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.FigGeometrica;
import paint_AndrewOficial.modelo.Texto;

public class principal {
    //private FiguraGeometricaDAO dao;
    private IMenuPaintView tela;
    private FigGeometricaDao dao;
    private QuadradoController qc;
    private RetanguloController rect;
    private TextoController txx;
    private PontoController ptt;
    private CirculoController ccc;
    private RetaController rtt;
    private TrianguloController trian;
    private LosanguloController losa;
    MenuPrincipal m1 = new MenuPrincipal();
    MenuEnuns opcao = MenuEnuns.LISTAR;
    private TrapezioController trap;

    Paint_Janela p11 = new Paint_Janela();
    MenuDesenhos d1 = new MenuDesenhos();
    private FigGeometrica[] vetor;
    private Texto[] vet;

    public principal() {
        trap = new TrapezioController(dao);
        losa = new LosanguloController(dao);
        trian = new TrianguloController(dao);
        ptt = new PontoController(dao);
        vetor = new FigGeometrica[10];
        dao = new FigGeometricaDao(10);
        qc = new QuadradoController(dao);
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
                    qc.start();
                    break;
                case RETANGULO:
                    rect.start();
                    break;
                case CIRCULO:

                    ccc.start();
                    break;
                case PONTO:
                    ptt.start();

                    break;
                case TRIANGULO:
                    trian.start();
                    break;
                case LOSANGULO:
                    losa.start();
                    break;

                case TEXTO:
                    txx.start();


                    break;
                case SALVAR:
                    dao.salvarEmArquivo();
                    break;
                case RECUPERAR:
                    dao.carregarDeArquivo();
                    break;

                case RETA:
                    rtt.start();
                    break;
                case LISTAR:

                    dao.Listar();
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
                    trap.start();
                    break;
                default:
            }
        } while (opcao != MenuEnuns.SAIR);
    }



}