package paint_AndrewOficial;

import paint_AndrewOficial.modelo.enums.MenuEnuns;

import java.util.Scanner;

/*
autor @Andrew Figueiredo
 */
public class MenuPrincipal {
    protected Scanner in;

    public MenuPrincipal() {
        in = new Scanner(System.in);
    }

    public void soutln(String msg) {
        System.out.println(msg);
    }

    public void sout(String msg) {
        System.out.print(msg);
    }

    public MenuEnuns Menuprinc(){
// neste ficara a interface oficial onde vai conter o menu
        sout("Digite uma opção \n" +
                "1 - Criar Quadrado\n" +
                "2 - Criar Retangulo\n" +
                "6 - Apagar Item\n" +
                "9 - Listar\n" +
                "7 - Desenhar\n" +
                "0 - Sair");
        // agora vamos receber a opcao do usuario
        int opcao= in.nextInt();
        switch (opcao){
            case 1:
                return MenuEnuns.QUADRADO;
            case 2:
                return MenuEnuns.RETANGULO;
            case 6:
                return MenuEnuns.APAGAR;
            case 9:
                return MenuEnuns.LISTAR;
            case 7:
                return MenuEnuns.DESENHAR;

            default:
                return MenuEnuns.SAIR;
            }
        }
    }

