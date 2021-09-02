package paint_AndrewOficial.View.Cli;

import paint_AndrewOficial.View.gui.ICRUDFiguraView;
import paint_AndrewOficial.modelo.Trapezio;

public class TrapezioCli  extends AbstractCRUDCli<Trapezio>
        implements ICRUDFiguraView<Trapezio> {


    //@Override
    public Trapezio create() {
        soutln("digite em inteiros a base maior do trapezio  ");
        int basemaior=in.nextInt();
        soutln("digite em inteiro a base menor do trapezio  ");
        int basemenor=in.nextInt();
        soutln("digite em inteiro o lado 1 do trapezio");
        int lado1=in.nextInt();
        soutln("digite em inteiros o lado2 do trapezio");
        int lado2= in.nextInt();
        Trapezio t11 = new Trapezio( basemaior,  basemenor,  lado1,  lado2);
        return t11;

    }

    @Override
    public void read(Trapezio conta) {

    }

    @Override
    public Trapezio update(Trapezio toSabe) {
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

