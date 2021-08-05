package paint_AndrewOficial.View;

import paint_AndrewOficial.modelo.Texto;

public class MenuTexto extends MenuPrincipal {
    public Texto CriarTexto(){
        System.out.println("digite o texto sendo ele uma string ");
        String texto=in.nextLine();
        Texto tx = new Texto(texto);
        return tx;
    }
}
