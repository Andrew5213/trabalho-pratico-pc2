package paint_AndrewOficial.View;


import paint_AndrewOficial.modelo.Retangulo;

public class MenuRetangulo extends MenuPrincipal {
    protected  int opcao;

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public Retangulo CriaRetangulo(){
        System.out.println("Digite um interio para o lado do retangulo");
        int lado  = in.nextInt();
        System.out.println("digite um inteiro para  altura do retangulo");
        int altura= in.nextInt();
        Retangulo r1 = new Retangulo(lado,altura);
        return r1;
    }
    public int MenuRet(){
        int opcao1;
        System.out.println("1-NOVO\n"+// no caso um quadrado
                "2-EDITAR\n"+
                "3-listar\n"+// no caso listar os quadrados
                "4-mostrar\n"+//um unico item
                "5-excluir\n"+
                "0-sair");
        opcao1=in.nextInt();
        setOpcao(opcao1);
        return getOpcao();
    }

}
