package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.*;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.FigGeometrica;
import paint_AndrewOficial.modelo.Quadrado1;
import paint_AndrewOficial.modelo.Retangulo;
import trabalho_pratico.model.Ponto;

import java.util.ArrayList;

public class principal {
    private MenuPrincipal tela;
    //agora vamos criar um vetor
    private FigGeometrica[] vetor;
    public principal(){
        vetor= new FigGeometrica[10];
        tela = new MenuPrincipal();
    }
    public boolean insertFigGeométrica(FigGeometrica fig, int i) {
        for (i=0;i< vetor.length;i++){
            if(vetor[i]==null){
                vetor[i] = fig;
            }else return false;

        }
        return true;
    }

    //Aqui tem um for
    // procura posição vazia
    // Se está cheio retorna False


    public void Exe() {


        //private MenuPrincipal tela;

        //public static void main(String[] args) {
        MenuPrincipal m1 = new MenuPrincipal();
        // tela = new MenuPrincipal();
        MenuEnuns opcao = MenuEnuns.LISTAR;
        Retangulo r1 = new Retangulo(10, 20);
        MenuRetangulo r2 = new MenuRetangulo();
        MenuQuadrado q11 = new MenuQuadrado();
        MenuPonto p1 = new MenuPonto();
        MenuCirculo c1 = new MenuCirculo();
        MenuTriangulo t1 = new MenuTriangulo();
        MenuLosangulo l1 = new MenuLosangulo();
        MenuReta r = new MenuReta();
        MenuTrapezio t11= new MenuTrapezio();

        //  System.out.println(r1.toString());
        //System.out.println(r1.getLateral());
        //System.out.println(r1.getAltura());

        //MenuEnuns opcao = MenuEnuns.LISTAR;

        do {
            opcao = m1.Menuprinc();

            m1.sout("escolhi: " + opcao + "\n\n");


            switch (opcao) {
                case QUADRADO:
                    //q11.CriarQuadrado();
//                        //Quadrado1 q1  =tela.Menuprincipal();
                    for (int i=0;i< vetor.length;i++){
                   // if(vetor[i]==null) {
                        insertFigGeométrica(q11.CriarQuadrado(), i);
                        break;

                  //  }

                        //este break e para parar assim q achar uma posicao i vazia
                    }
                    m1.soutln("Quadrado criado");

                    break;
                case RETANGULO:
                    //r2.CriaRetangulo();
                    for (int i=0;i<vetor.length;i++){
                        insertFigGeométrica(r2.CriaRetangulo(), i);
                        break;
                    }
                    m1.soutln("retangulo criado");
                    break;
                case CIRCULO:
                    //c1.CriarCirculo();
                    for (int i=0;i<vetor.length;i++){
                        insertFigGeométrica(c1.CriarCirculo(),i);
                        break;
                    }
                    m1.soutln("Circulo Criado");
                    break;
                case PONTO:
                    //p1.CriarPonto();
                    for (int i=0;i<vetor.length;i++){
                        insertFigGeométrica(p1.CriarPonto(),i);
                        break;
                    }
                    m1.soutln("ponto criado");
                    break;
                case TRIANGULO:
                    //t1.CriarTriangulo();
                    for (int i=0;i< vetor.length;i++){
                        insertFigGeométrica(t1.CriarTriangulo(),i);
                        break;
                    }
                    m1.soutln("triangulo criado");
                    break;
                case LOSANGULO:
                    //l1.CriarLosangulo();
                    for (int i=0;i< vetor.length;i++){
                        insertFigGeométrica(l1.CriarLosangulo(),i);
                        break;
                    }
                    m1.soutln("losangulo criado ");
                    break;
                case RETA:
                    //r.CriarReta();
                    for (int i=0;i< vetor.length;i++){
                        insertFigGeométrica(r.CriarReta(),i);
                        break;
                    }
                    m1.soutln("reta criada");
                    break;
                case LISTAR:
                    for (int i=0;i< vetor.length;i++){
                        if(vetor[i]!=null) {
                            m1.sout(vetor[i].toString());
                        }
                    }
                    break;
                case APAGAR:
                    break;
                case DESENHAR:

                    break;
                case SAIR:


                    break;
                case TRAPEZIO:
                    //t11.CriaTrapezio();
                    for (int i=0;i<vetor.length;i++){;
                        insertFigGeométrica(t11.CriaTrapezio(),i);
                        break;
                    }
                    break;
                default:
            }


        } while (opcao != MenuEnuns.SAIR);


    }
    public void testandoArrayList(){
        ArrayList lista = new ArrayList();

        lista.add(1);
        lista.add("dsdsdsd");
        lista.add(new Ponto());
        lista.add(new ArrayList());


        tela.soutln("------------TESTE parametrico---------------");

        ArrayList<FigGeometrica> listaFig = new ArrayList();
        listaFig.add(new Quadrado1(1));
        tela.soutln("");

        tela.soutln("------------FIM TESTE---------------");
    }
}

