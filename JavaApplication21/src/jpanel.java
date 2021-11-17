import javax.swing.*;
import java.awt.*;
public class jpanel extends JFrame{
    private JButton b1 = new JButton("Panel-One");
       private JButton b2 = new JButton("Panel-Two");
       private JButton b3 = new JButton("Panel-Three");
       private JButton b4 = new JButton("Panel-Four");
       private JPanel PnlOne = new JPanel(new GridLayout(2, 0));
       private JPanel PnlTwo = new JPanel(new FlowLayout());
       private JPanel PnlThree = new JPanel(new FlowLayout());
       private JPanel PnlFour = new JPanel(new GridLayout(2, 0));
        public jpanel()
           {
              setLayout(new BorderLayout());
              add(PnlOne, BorderLayout.WEST);
              add(PnlTwo, BorderLayout.CENTER);
              add(PnlThree, BorderLayout.SOUTH);
              add(PnlFour, BorderLayout.EAST);
              PnlOne.add(b1);
              PnlTwo.add(b2);
              PnlThree.add(b3);
              PnlFour.add(b4);
               setSize(400,250);
              setVisible(true);
} public static void main(String[] args)
                  {
                      jpanel frame = new jpanel();
                  }
}