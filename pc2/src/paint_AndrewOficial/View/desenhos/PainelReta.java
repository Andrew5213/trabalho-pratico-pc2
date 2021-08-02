package paint_AndrewOficial.View.desenhos;

import javax.swing.*;
import java.awt.*;

public class PainelReta extends JPanel {
    public void paintComponent( Graphics g ) {
        super.paintComponent(g);
//        int pixel=0;
        g.drawLine(0,100,100,0);
    }
}
