package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Triangulo;

public class MenuTriangulo extends MenuPrincipal{
    protected int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Triangulo CriarTriangulo(){
        System.out.println("ola vamos criar um triangulo ");
        int lado1,lado2,lado3;
        do {

            System.out.println("digite o primeiro lado do triangulo");
            lado1=in.nextInt();
            System.out.println("digite o lado 2 do triangulo");
            lado2=in.nextInt();
            System.out.println("digite o lado 3 do triangulo");
            lado3=in.nextInt();
            Triangulo t1 = new Triangulo(lado1,lado2,lado3);
            return t1;
        }while(lado1>=lado2+lado3 || lado2>=lado1+lado3 || lado3>=lado1+lado2 );

    }
    public int MenuTrian(){
        int opcao1;
        System.out.println("1-NOVO\n"+// no caso um quadrado
                "2-EDITAR\n"+
                "3-listar\n"+// no caso listar os quadrados
                "4-mostrar\n"+//um unico item
                "5-excluir\n"+
                "0-sair\n");
        opcao1=in.nextInt();
        setOpcao(opcao1);
        return getOpcao();
    }
}
