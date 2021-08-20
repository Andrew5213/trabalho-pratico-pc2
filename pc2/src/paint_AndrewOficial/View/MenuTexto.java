package paint_AndrewOficial.View;

import paint_AndrewOficial.View.enums.MenuEnuns;
import paint_AndrewOficial.modelo.Texto;

public class MenuTexto extends MenuPrincipal  {
   protected int quantidade;

    public int getOpcao1() {
        return opcao1;
    }

    public void setOpcao1(int opcao1) {
        this.opcao1 = opcao1;
    }

    protected int opcao1;;
   protected String palavra;

   public Texto CriarTexto(){
       System.out.println("digite uma palavra  ");
       String palavra= in.nextLine();
       Texto tx = new Texto(palavra);
       return tx;

   }
   public MenuEnuns SubMenu(){


           System.out.println("1-NOVO\n"+// no caso um quadrado
                   "2-EDITAR\n"+
                   "3-listar\n"+// no caso listar os quadrados
                   "4-apagar \n"+//um unico item
                   "-excluir\n");
          setOpcao1(in.nextInt());


          switch (getOpcao1()){
              case 1:
                  return MenuEnuns.CRIAR;
              case 2:
                  return MenuEnuns.EDITAR;
              case 3:
                  return MenuEnuns.LISTAR;
              case 4:
                  return MenuEnuns.APAGAR;
              case 0:
                  return MenuEnuns.SAIR;
                  default:
                      return MenuEnuns.SAIR;

          }



           }
       }


