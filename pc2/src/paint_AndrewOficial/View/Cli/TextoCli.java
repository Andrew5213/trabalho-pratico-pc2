package paint_AndrewOficial.View.Cli;

import paint_AndrewOficial.View.gui.ICRUDFiguraView;
import paint_AndrewOficial.modelo.Texto;

public class TextoCli extends AbstractCRUDCli<Texto>
        implements ICRUDFiguraView<Texto> {


    public Texto create() {

        System.out.println("digite uma palavra  ");
        String guambiarra = in.nextLine();
        String palavra = in.nextLine();
        Texto tx = new Texto(palavra);
        return tx;
    }

    // @Override

    public void read(Texto Texto) {

        System.out.println(Texto);
    }

    //@Override
    public Texto update(Texto Texto) {
        read(Texto);
        //Quadrado quad = this.create();

        // COlegar valores novos do Quadrado
        return null;
    }

    //@Override
    public Boolean delete(Texto quadrado) {
        read(quadrado);
        //DEseja realemte apagar?
        return null;
    }

    //@Override
    public void list(Texto[] listas) {
        for (Texto quad : listas) {
            System.out.println(quad);
        }

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

