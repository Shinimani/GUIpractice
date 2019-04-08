import javax.swing.*;
import java.awt.*;

public class GeneralGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        frame.getContentPane().add(panel);

        //button
        JButton button = new JButton("This is a button");
        panel.add(button);

        //text field for entering data
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(200,15));
        panel.add(textField);

        //setting the frame size
        frame.setSize(new Dimension(500,400));
        //setting the start position
        frame.setLocationRelativeTo(null);
        //setting a default close action
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //setting title
        frame.setTitle("Simple GUI");
        frame.setResizable(false);

    }
}
