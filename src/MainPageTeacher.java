import javax.swing.*;

public class MainPage extends JDialog {
    private JPanel rootMainPage;

    MainPage(){
        setTitle("Welcome Dear");
        setContentPane(rootMainPage);
        setSize(800,400);
        setModal(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
