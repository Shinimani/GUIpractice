import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryTextField extends JFrame{

    private JTextField fieldName;
    private JLabel labelMessage;
    private JButton buttonSubmit;

    public TryTextField(){
        createView();

        setTitle("Textfield demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void createView() {

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        JLabel label = new JLabel("Enter Your Name");
        panel.add(label);

        fieldName = new JTextField();
        //you can make the constructor of fieldname like new JTextField(12) and this textfield will hol 12 columns of data, an alternate way of setting the size.
        fieldName.setPreferredSize(new Dimension(150,30));
        panel.add(fieldName);


        buttonSubmit = new JButton("Submit");
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name = fieldName.getText();
                if (name.isBlank())
                    labelMessage.setText("No name is it?");
                else
                    labelMessage.setText("Hello " + name + " how are you?");
            }
        });
        panel.add(buttonSubmit);

        labelMessage = new JLabel("Please Enter your name");
        panel.add(labelMessage);





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
