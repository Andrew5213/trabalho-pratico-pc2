package paint_AndrewOficial.View;

import paint_AndrewOficial.View.enums.MenuEnuns;

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
    public void Guanbiarra( int top){
        top=in.nextInt();
    }
    public MenuEnuns Menuprinc(){
// neste ficara a interface oficial onde vai conter o menu
        sout("Digite uma opção \n" +

                "1 -  Quadrado\n" +
                "2 -  Retangulo\n" +
                "3 -  Circulo\n"+
                "4 -  Ponto\n"+
                "5 -  Triangulo\n"+
                "10 - trapezio\n"+
                "8 -  losangulo\n"+
                "11- texto\n"+
                "6 - Apagar Item\n" +
                "7 - Desenhar\n" +
                "9 - Listar\n" +
                "12- SALVAR\n"+
                "13- RECUPERAR\n"+
                "0 - SAIR");
        // agora vamos receber a opcao do usuario
        int opcao= in.nextInt();
        switch (opcao){
            case 1:
                return MenuEnuns.QUADRADO;
            case 2:
                return MenuEnuns.RETANGULO;
            case 3:
                return MenuEnuns.CIRCULO;
            case 4:
                return MenuEnuns.PONTO;
            case 5:
                return MenuEnuns.TRIANGULO;
            case 6:
                return MenuEnuns.APAGAR;
            case 7:
                return  MenuEnuns.DESENHAR;
            case 8:
                return MenuEnuns.LOSANGULO;
            case 9:
                return MenuEnuns.LISTAR;
            case 10:
                return MenuEnuns.TRAPEZIO;
            case 11:
                return MenuEnuns.TEXTO;
            case 12:
                return  MenuEnuns.SALVAR;
            case 13:
                return  MenuEnuns.RECUPERAR;
            case 0:
                return MenuEnuns.SAIR;

            default:
                return MenuEnuns.SAIR;
            }
        }
    }

