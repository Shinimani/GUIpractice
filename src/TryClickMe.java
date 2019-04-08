import javax.swing.*;

public class TryClickMe extends JFrame {

    public TryClickMe()
    {

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
