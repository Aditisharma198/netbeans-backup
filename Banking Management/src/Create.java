
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Create extends javax.swing.JFrame {
    Connection conn;
     ResultSet rs;
    PreparedStatement pat;

    /**
     * Creates new form Create
     */
    public Create() {
        super("Create Account");
        initComponents();
         conn = ConDb.getcon();
         RandomAcc();
         RandomPin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("ACCOUNT NUMBER: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(75, 178, 146, 14);

        jLabel2.setText("FIRST NAME:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(75, 221, 96, 14);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(191, 286, 0, 0);

        jLabel4.setText("LAST NAME :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(75, 263, 146, 14);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(191, 304, 0, 0);

        jLabel6.setText("DOB: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(75, 318, 28, 14);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(191, 353, 0, 0);

        jLabel8.setText("CONTACT: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(75, 367, 55, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(225, 175, 173, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(225, 218, 173, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(225, 260, 173, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(225, 315, 173, 20);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(225, 364, 173, 20);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(728, 175, 57, 0);

        jLabel10.setText("PIN:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(443, 178, 95, 14);

        jLabel11.setText("ACCOUNT TYPE:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(443, 221, 87, 14);

        jLabel12.setText("GENDER:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(443, 263, 87, 14);

        jLabel13.setText("ADDRESS:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(443, 315, 66, 20);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(728, 364, 0, 0);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(548, 175, 176, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("FEMALE");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(548, 259, 63, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("MALE");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(622, 259, 51, 23);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(548, 315, 176, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Saving", "Current" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(548, 218, 176, 20);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel15.setText("CREATE NEW ACCOUNT");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(94, 59, 458, 42);

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 420, 69, 23);

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(590, 420, 73, 23);

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(270, 420, 59, 23);

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Banking Management\\images\\hero-intbanking-bg-1.jpg")); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 1060, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void RandomAcc(){
        Random ra=new Random();
        jTextField1.setText(""+ra.nextInt(10000+1));
    }
    
     public void RandomPin(){
        Random ra=new Random();
        jTextField6.setText(""+ra.nextInt(1000+1));
    }
     
     public void Bal(){
         String sql="Insert into Balance(Name,Account_Number,PIN,Balance)values (?,?,?,?)";
         try{
             pat=conn.prepareStatement(sql);
             pat.setString(1,jTextField2.getText());
             pat.setString(2,jTextField1.getText());
             pat.setString(3,jTextField3.getText());
             pat.setString(4,jTextField7.getText());
             pat.execute();
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
     }
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login c=new Login();
        c.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String sql="insert into Create_Account(Account_Number,First_Name,Last_Name,DOB,Contact,Pin,Account_type,Gender,Address) values(?,?,?,?,?,?,?,?,?)";
        try{
            pat=conn.prepareStatement(sql);
            pat.setString(1,jTextField1.getText());
            pat.setString(2,jTextField2.getText());
            pat.setString(3,jTextField3.getText());
            pat.setString(4,jTextField4.getText());
            pat.setString(5,jTextField5.getText());
            pat.setString(6,jTextField6.getText());
            pat.setString(7, (String) jComboBox1.getSelectedItem());
            jRadioButton1.setActionCommand("Female");
            jRadioButton2.setActionCommand("Male");
            pat.setString(8,buttonGroup1.getSelection().getActionCommand());
            pat.setString(9,jTextField7.getText());
            pat.execute();
            JOptionPane.showMessageDialog(null,"Congratulations\n Account has been created");
            Bal();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
