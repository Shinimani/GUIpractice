import javax.swing.*;
import java.awt.*;

public class TryClickMe extends JFrame {

    private JButton buttonCounter, buttonReset;
    private JLabel labelCount;
    private int clicks = 0;


    public TryClickMe()
    {
        createView();

        setTitle("Clicking");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();//packs everything tightly together to just allow the person to see

    }

    //It's not the best practice to add the components directly to the Jframe so you should use a Jpanel
    private void createView() {

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        labelCount = new JLabel();
        labelCount.setPreferredSize(new Dimension(200,30));
        panel.add(labelCount);

        buttonCounter = new JButton("Click me");
        panel.add(buttonCounter);

        buttonReset = new JButton("Reset");
        panel.add(buttonReset);




    }

    //can simply type new TryClickMe() but this one registers it into GUI thread, which will be talked about later as said in tut
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TryClickMe();
            }
        });
    }
}
