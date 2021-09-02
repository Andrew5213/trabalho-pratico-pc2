package paint_AndrewOficial.View.gui;

public interface IBasicView {
    public void showMessage(String msg);
    public void showLineMessage(String msg);
    public int askForInt(String question);
    public double askForDouble(String question);
    public String askForString(String question) ;
    public boolean hasNextInt();
}
