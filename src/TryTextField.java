import javax.swing.*;

public class TryTextField extends JFrame{

    public TryTextField(){
        createView();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView() {

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TryTextField().setVisible(true);
            }
        });
    }
}
