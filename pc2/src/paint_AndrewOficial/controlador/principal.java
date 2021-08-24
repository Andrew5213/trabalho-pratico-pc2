package paint_AndrewOficial.controlador;

import paint_AndrewOficial.controlador.ControllerFig.*;
import paint_AndrewOficial.View.gui.*;
import paint_AndrewOficial.View.*;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.dao.FigGeometricaDao;
import paint_AndrewOficial.modelo.FigGeometrica;
import paint_AndrewOficial.modelo.Quadrado1;
import paint_AndrewOficial.modelo.Texto;
import trabalho_pratico.model.Ponto;

import java.util.ArrayList;

public class principal {
    //private FiguraGeometricaDAO dao;
    private IMenuPaintView tela;
    private FigGeometricaDao dao;
    private QuadradoController qc;
    private RetanguloController rect;
    private TextoController txx;
    private PontoController ptt;
    private CirculoController ccc;
    MenuPrincipal m1 = new MenuPrincipal();
    MenuEnuns opcao = MenuEnuns.LISTAR;


    MenuCirculo c1 = new MenuCirculo();
    MenuTriangulo t1 = new MenuTriangulo();
    MenuLosangulo l1 = new MenuLosangulo();
    MenuReta r = new MenuReta();
    MenuTrapezio t11 = new MenuTrapezio();
    Paint_Janela p11 = new Paint_Janela();
    MenuDesenhos d1 = new MenuDesenhos();
    FigGeometricaDao d = new FigGeometricaDao(10);
    private FigGeometrica[] vetor;
    private Texto[] vet;

    public principal() {
        ptt = new PontoController(dao);
        vetor = new FigGeometrica[10];
        dao = new FigGeometricaDao(10);
        qc = new QuadradoController(dao);
        rect = new RetanguloController(dao);
        txx = new TextoController(dao);
        ccc=new CirculoController(dao);
    }

    public boolean insertFigGeométrica(FigGeometrica fig) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == null) {
                vetor[i] = fig;
                return true;
            } else {
                m1.soutln("vetor esta cheio ");// excessao

            }

        }
        return false;

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
                    t1.MenuTrian();
                    switch (t1.getOpcao()) {
                        case 1://novo
                            insertFigGeométrica(t1.CriarTriangulo());
                            //d.create(t1.CriarTriangulo());
                            m1.soutln("triangulo   criado");
                            break;
                        case 2:

                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            break;
                    }
                    break;
                case LOSANGULO:
                    l1.MenuLosan();
                    switch (l1.getOpcao()) {
                        case 1://novo
                            insertFigGeométrica(l1.CriarLosangulo());
                            // d.create(l1.CriarLosangulo());
                            m1.soutln("losangulo   criado");
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            break;
                    }
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
                    r.MenuReta();
                    switch (r.getOpcao()) {
                        case 1://novo
                            insertFigGeométrica(r.CriarReta());
                            //d.create(r.CriarReta());
                            m1.soutln("reta    criada");
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 0:
                            break;
                    }
                    break;
                case LISTAR:
                    for (int i = 0; i < vetor.length; i++) {
                        if (vetor[i] != null) {
                            m1.soutln(vetor[i].toString());
                        }
                    }
                    d.getItens();


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
                    insertFigGeométrica(t11.CriaTrapezio());
                    break;
                default:
            }
        } while (opcao != MenuEnuns.SAIR);
    }

    public void testandoArrayList() {
        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add("dsdsdsd");
        lista.add(new Ponto());
        lista.add(new ArrayList());
        m1.soutln("------------TESTE parametrico---------------");
        ArrayList<FigGeometrica> listaFig = new ArrayList();
        listaFig.add(new Quadrado1(1));
        m1.soutln("");
        m1.soutln("------------FIM TESTE---------------");
    }

}