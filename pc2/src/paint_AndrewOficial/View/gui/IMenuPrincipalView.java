package paint_AndrewOficial.View.gui;

public interface IMenuPrincipalView {
    void showMessage(String msg);

    void showLineMessage(String msg);

    int askForInt(String question);

    double askForDouble(String question);

    String askForString(String question);

    boolean hasNextInt();
}
