import javax.swing.BorderFactory;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class compound {
    public static void main(String[] args) throws Exception {
      JFrame frame = new JFrame("Demo");
      JLabel label1;
      JLabel label2;
      label1 = new JLabel("This has compound border 1");
      label1.setFont(new Font("Arial", Font.BOLD, 18));
      label1.setVerticalAlignment(JLabel.CENTER);
      label1.setBorder(BorderFactory.createCompoundBorder(BorderFactory
      .createRaisedBevelBorder(), BorderFactory.createLoweredBevelBorder()));
      
      label2 = new JLabel("This has compound border 2");
      label2.setFont(new Font("Arial", Font.BOLD, 18));
      label2.setVerticalAlignment(JLabel.CENTER);
      label2.setBorder(BorderFactory.createCompoundBorder(BorderFactory
      .createRaisedBevelBorder(), BorderFactory.createLoweredBevelBorder()));
      
      frame.add(label1); 
      
      frame.setSize(350,150);
      frame.setVisible(true);
      frame.add(label2);
       frame.setSize(550,250);
      frame.setVisible(true);
}
}