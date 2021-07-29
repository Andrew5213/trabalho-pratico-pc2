package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.MenuPrincipal;
import paint_AndrewOficial.View.MenuQuadrado;
import paint_AndrewOficial.View.MenuRetangulo;
import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Retangulo;

public class principal {
    private MenuPrincipal tela;
    public static void main(String[] args) {
        MenuPrincipal m1= new MenuPrincipal();
       // tela = new MenuPrincipal();
        MenuEnuns opcao = MenuEnuns.LISTAR;
        Retangulo r1= new Retangulo(10,20);
        MenuRetangulo r2 = new MenuRetangulo();
        MenuQuadrado q1 = new MenuQuadrado();
      //  System.out.println(r1.toString());
        //System.out.println(r1.getLateral());
        //System.out.println(r1.getAltura());

        //MenuEnuns opcao = MenuEnuns.LISTAR;

        do {
            opcao = m1.Menuprinc();

            m1.sout("escolhi: "+ opcao+"\n\n");


            switch (opcao){
                case QUADRADO:
    q1.CriarQuadrado();
    m1.soutln("Quadrado criado");
                    break;
                case RETANGULO:
r2.CriaRetangulo();
m1.soutln("retangulo criado");
                    break;
                case LISTAR:

                    break;
                case DESENHAR:

                    break;
                case SAIR:


                    break;
                default:
            }


        }while (opcao != MenuEnuns.SAIR);
     }
    }

