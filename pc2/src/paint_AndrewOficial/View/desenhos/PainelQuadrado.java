package paint_AndrewOficial.View.desenhos;

import javax.swing.*;
import java.awt.*;

public class PainelQuadrado extends JPanel {
    public void paintComponent( Graphics g ) {
        super.paintComponent(g);
//        int pixel=0;
        g.drawRect(0, 0, 100, 100);
    }
}
