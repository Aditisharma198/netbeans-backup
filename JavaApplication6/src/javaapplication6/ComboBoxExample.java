import javax.swing.*;    
import java.awt.event.*;   
public class ComboBoxExample {
 JFrame f;    
ComboBoxExample(){    
    f=new JFrame("Bill Book");   
       
    JButton b=new JButton("Show");  
    b.setBounds(200,100,75,20);  
    String Items[]={"Milk","Chocos","Bread","Butter","Coffee"};        
    final JComboBox cb=new JComboBox(Items);    
    cb.setBounds(50, 100,90,20);    
    f.add(cb);  f.add(b);    
    f.setLayout(null);    
    f.setSize(350,350);    
    f.setVisible(true);       
    b.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) { 
         
String data1 = cb.getItemAt(cb.getSelectedIndex());  
String column={"Item,Name,Cost"};
JTable jt=new JTable(data,column);
           jt.setBounds(30,40,200,300);  
           JScrollPane sp=new JScrollPane(jt);    
            f.add(sp);
}  
        
        });           
}    
public static void main(String[] args) {    
    new ComboBoxExample();         
}    
}    

