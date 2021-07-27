package trabalho_pratico.view;

import trabalho_pratico.model.Quadrado;

public class QuadradoConsoler extends BasicConsole {

    public Quadrado askQuadrado(){
        showMsg("Digite um interio para o tamanho do lado do quadrado");
        int tamanho  = in.nextInt();
        Quadrado quad = new Quadrado(tamanho);

        return quad;
    }
}
