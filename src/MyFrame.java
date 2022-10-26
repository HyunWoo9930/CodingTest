import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame {
  private JPanel jPanel;

  public static void main(String args[]) {
    JFrame frame = new JFrame("App");
    frame.setContentPane(new MyFrame().jPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
}


