package paint_AndrewOficial.controlador;

import paint_AndrewOficial.View.MenuPrincipal;
import paint_AndrewOficial.View.enums.MenuEnuns;

public class principal {
    private MenuPrincipal tela;
    public static void main(String[] args) {
        MenuPrincipal m1= new MenuPrincipal();
       // tela = new MenuPrincipal();
        MenuEnuns opcao = MenuEnuns.LISTAR;
        do {
            opcao = m1.Menuprinc();

            m1.sout("escolhi: "+ opcao+"\n\n");

            m1.Menuprinc();
            switch (opcao){
                case QUADRADO:

                    break;
                case RETANGULO:

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

