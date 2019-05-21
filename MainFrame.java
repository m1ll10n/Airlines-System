import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
  private JTextArea textArea;
  private JButton btn;
  
  public MainFrame() {
    super("Airplanes Ticket Booking System");
    setLayout(new BorderLayout());
    
    textArea = new JTextArea();
    btn = new JButton("Click me");
        
    add(textArea, BorderLayout.CENTER);
    add(btn, BorderLayout.SOUTH);
    setSize(1000, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
