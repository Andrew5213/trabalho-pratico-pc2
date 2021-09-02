package paint_AndrewOficial.View.Cli;

import paint_AndrewOficial.View.gui.ICRUDFiguraView;
import paint_AndrewOficial.modelo.Ponto;


public class PontoCli extends AbstractCRUDCli<Ponto>
        implements ICRUDFiguraView<Ponto> {



    //@Override
    public Ponto create() {
        System.out.println("digite a coordenda x do ponto sendo ele  inteiro");
        int x = in.nextInt();
        System.out.println("digite a coordenada y do ponto sendo ele em inteiro");
        int y = in.nextInt();
        Ponto p1 = new Ponto(x, y);
        return p1;

    }

    @Override
    public void read(Ponto conta) {

    }

    @Override
    public Ponto update(Ponto toSabe) {
        return null;
    }


    @Override
    public void showMessage(String msg) {

    }

    @Override
    public void showLineMessage(String msg) {

    }

    @Override
    public int askForInt(String question) {
        return 0;
    }

    @Override
    public double askForDouble(String question) {
        return 0;
    }

    @Override
    public String askForString(String question) {
        return null;
    }

    @Override
    public boolean hasNextInt() {
        return false;
    }
}

