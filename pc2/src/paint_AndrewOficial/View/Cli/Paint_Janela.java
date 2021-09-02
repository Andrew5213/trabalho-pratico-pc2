package paint_AndrewOficial.View.Cli;

import paint_AndrewOficial.View.desenhos.*;

import javax.swing.*;
import java.awt.*;

public class Paint_Janela {
    public void PintarRetangulo() {
        JFrame janela = new JFrame("Meu primeiro frame em Java");
        Painel meuPainel = new Painel();

        janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        janela.add(meuPainel);
        janela.setSize(600,400);
        janela.setVisible(true);


    }
    public void PintarQuadrado(){
        JFrame janela = new JFrame("Quadrado");
        PainelQuadrado meuPainel = new PainelQuadrado();

        janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        janela.add(meuPainel);
        janela.setSize(600,400);
        janela.setVisible(true);
    }
    public void PintarTriangulo(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Triangulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(200, 200);

        Draw_A_Triangle panel = new Draw_A_Triangle();
        frame.add(panel);
        frame.setVisible(true);
    }
    public void PintarCirculo(){
        JFrame janela = new JFrame("Quadrado");
        Circulo meuPainel = new Circulo();

        janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        janela.add(meuPainel);
        janela.setSize(600,400);
        janela.setVisible(true);
    }
    public void PintarReta(){
        JFrame janela = new JFrame("Quadrado");
        PainelReta meuPainel = new PainelReta();

        janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        janela.add(meuPainel);
        janela.setSize(600,400);
        janela.setVisible(true);
    }
    public void PintarLosangulo(){
        System.out.println("losangulo ");

    }


}
