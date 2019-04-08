import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryClickMe extends JFrame {

    private JButton buttonCounter, buttonReset;
    private JLabel labelCount;
    private int clicks = 0;


    public TryClickMe()
    {
        createView();

        setTitle("Clicking");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //having this pack() before and after setlocationrelativeto has an effect, try if want to see
        pack();//packs everything tightly together to just allow the person to see
        setLocationRelativeTo(null);
        setResizable(false);

    }

    //It's not the best practice to add the components directly to the Jframe so you should use a Jpanel
    private void createView() {

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        labelCount = new JLabel();
        labelCount.setPreferredSize(new Dimension(200,30));
        panel.add(labelCount);
        updateCounter();



        //you can both create a new inner class for the action listener or you can just implement the actionlistener class inside the code itself.
        buttonCounter = new JButton("Click me");
        buttonCounter.addActionListener(
                new ButtonCounterActionListener()

        );
        panel.add(buttonCounter);

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        clicks = 0;
                        updateCounter();
                    }
                }
        );
        panel.add(buttonReset);




    }

    private void updateCounter() {
        labelCount.setText("Clicked " + clicks + " times.");
    }

    //can simply type new TryClickMe() but this one registers it into GUI thread, which will be talked about later as said in tut
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TryClickMe().setVisible(true);
            }
        });
    }

    private class ButtonCounterActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            clicks++;
            updateCounter();
        }
    }
}
