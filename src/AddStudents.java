
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class AddStudents extends javax.swing.JFrame {

    /**
     * Creates new form AddStudents
     */
    public AddStudents() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(450, 200));
        setMinimumSize(new java.awt.Dimension(427, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setDisplayedMnemonic('R');
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        jLabel1.setLabelFor(jTextField1);
        jLabel1.setText("Roll No");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 80, 75, 24);

        jLabel2.setDisplayedMnemonic('N');
        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        jLabel2.setLabelFor(jTextField2);
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 150, 75, 24);

        jTextField1.setColumns(10);
        jTextField1.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 80, 200, 30);

        jTextField2.setColumns(10);
        jTextField2.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 140, 200, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        jButton1.setMnemonic('A');
        jButton1.setText("Add");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 200, 65, 33);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        jButton2.setMnemonic('E');
        jButton2.setText("Return");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 200, 87, 33);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 20)); // NOI18N
        jLabel4.setText("Add STUDENT");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(125, 19, 140, 24);

        jLabel6.setBackground(new java.awt.Color(153, 255, 153));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-10, -10, 460, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int a=Integer.parseInt(jTextField1.getText());
String b=jTextField2.getText();
        int responce=JOptionPane.showConfirmDialog(this,"Do You Really Want To Add?");
        if(responce==0)
        {   try {Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "manager");
            Statement stmt=con.createStatement();
            String add="Insert into students values("+a+",'"+b+"')";
            int check = stmt.executeUpdate(add);
            con.close();
            JOptionPane.showMessageDialog(this,check+" Student Added Successfully");
        } catch (Exception e) {JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
        jTextField1.setText(null);
        jTextField2.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
