import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
class combobox extends JFrame implements ItemListener {
    static JFrame f; 
    static JLabel l, l1, l3, l4; 
    static JComboBox c1, c2; 
    public static void main(String[] args) 
    { 
        f = new JFrame("frame");
        combobox s = new combobox(); 
        String s1[] = { "Indore", "Mumbai", "Noida", "Kolkata", "New Delhi" }; 
        String s2[] = { "male", "female", "others" }; 
        c1 = new JComboBox(s1); 
        c2 = new JComboBox(s2);  
        c1.setSelectedIndex(3); 
        c2.setSelectedIndex(0); 
        c1.addItemListener(s); 
        c2.addItemListener(s); 
  
        // set the checkbox as editable 
        c1.setEditable(true); 
        c2.setEditable(true); 
  
        // create labels 
        l = new JLabel("select your city "); 
        l1 = new JLabel("Indore selected"); 
        l3 = new JLabel("select your gender "); 
        l4 = new JLabel("Male selected"); 
  
        // set color of text 
        l.setForeground(Color.red); 
        l1.setForeground(Color.blue); 
        l3.setForeground(Color.red); 
        l4.setForeground(Color.blue); 
  
        // create a new panel 
        JPanel p = new JPanel(); 
  
        p.add(l); 
  
        // add combobox to panel 
        p.add(c1); 
  
        p.add(l1); 
  
        p.add(l3); 
  
        // add combobox to panel 
        p.add(c2); 
  
        p.add(l4); 
  
        // set a layout for panel 
        p.setLayout(new FlowLayout()); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(900, 900); 
  
        f.show(); 
    } 
    public void itemStateChanged(ItemEvent e) 
    { 
        // if the state combobox 1is changed 
        if (e.getSource() == c1) { 
  
            l1.setText(c1.getSelectedItem() + " selected"); 
        } 
  
        // if state of combobox 2 is changed 
        else
            l4.setText(c2.getSelectedItem() + " selected"); 
    } 
    
}
