/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctmarks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashish
 */
public class AddStudent1 extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent1
     */
    public AddStudent1() {
        initComponents();
        jLabel1.setFocusable(true);
        //this.setSize(800,500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        co2 = new javax.swing.JComboBox<>();
        co1 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        t6 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(43, 42, 76));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ashish\\Downloads\\learning3.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 79, 72));

        jLabel4.setFont(new java.awt.Font("aliens and cows", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Marks");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 110, 40));

        jLabel3.setFont(new java.awt.Font("RolinaBold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Via");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 40, 40));

        jLabel5.setFont(new java.awt.Font("aliens and cows", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SMS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 70, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 230, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 170, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 270, 20));

        co2.setBackground(new java.awt.Color(43, 42, 76));
        co2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        co2.setForeground(new java.awt.Color(255, 255, 255));
        co2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                --Branch--", "Aeronautical Engineering", "Aerospace Engineering", "Aircraft Maintenance Engineering ", "Automobile Engineering", "Biotechnology Engineering", "Chemical Engineering", "Civil Engineering", "Computer Science Engineeering", "Electrical Engineering", "Electrical & Electronics Engineering", "Electrical & Telecommunications Engineering", "Information Technology Engineering", "Mechanical Engineering", "Metallurgical Engineering" }));
        co2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 43, 76)));
        jPanel1.add(co2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 270, 30));

        co1.setBackground(new java.awt.Color(43, 42, 76));
        co1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        co1.setForeground(new java.awt.Color(255, 255, 255));
        co1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    --Semester--", "1", "2", "3", "4", "5", "6", "7", "8" }));
        jPanel1.add(co1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 170, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 170, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 270, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 170, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 270, 20));

        jButton1.setBackground(new java.awt.Color(43, 42, 76));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 80, 40));

        jButton2.setBackground(new java.awt.Color(43, 42, 76));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 80, 40));

        t6.setBackground(jPanel1.getBackground());
        t6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        t6.setForeground(new java.awt.Color(255, 255, 255));
        t6.setText("Address");
        t6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 42, 76)));
        t6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t6FocusLost(evt);
            }
        });
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        jPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 270, 30));

        t5.setBackground(jPanel1.getBackground());
        t5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        t5.setForeground(new java.awt.Color(255, 255, 255));
        t5.setText("Parent's Mobile");
        t5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 42, 76)));
        t5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t5FocusLost(evt);
            }
        });
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 170, 30));

        t1.setBackground(jPanel1.getBackground());
        t1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setText("Roll No.");
        t1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 42, 76)));
        t1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t1FocusLost(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 170, 30));

        t4.setBackground(jPanel1.getBackground());
        t4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setText("Parent's Name");
        t4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 42, 76)));
        t4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t4FocusLost(evt);
            }
        });
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 270, 30));

        t2.setBackground(jPanel1.getBackground());
        t2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setText("Name");
        t2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 42, 76)));
        t2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t2FocusLost(evt);
            }
        });
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 270, 30));

        t3.setBackground(jPanel1.getBackground());
        t3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setText("Mobile");
        t3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 42, 76)));
        t3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t3FocusLost(evt);
            }
        });
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 170, 30));

        jButton3.setBackground(new java.awt.Color(43, 42, 76));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            String roll_no=t1.getText();
            String name=t2.getText();
            String sem=co1.getSelectedItem().toString();
            String branch=co2.getSelectedItem().toString();
            String mobile=t3.getText();
            String pname=t4.getText();
            String pmobile=t5.getText();
            String address=t6.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ctproject","root","");
            String q="insert into student values('"+roll_no+"','"+name+"','"+branch+"','"+sem+"','"+mobile+"','"+address+"','"+pname+"','"+pmobile+"')";
            Statement stmt=con.createStatement();
            int rs=stmt.executeUpdate(q);
            if(rs!=0)
            {
                JOptionPane.showMessageDialog(this, "Saved Successfully !");
            }
            con.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        t1.setText("Roll No.");
        t2.setText("Name");
        t3.setText("Mobile");
        t4.setText("Parent's Name");
        t5.setText("Parent's Mobile");
        t6.setText("Address");
        co1.setSelectedItem("    --Semester--");
        co2.setSelectedItem("                --Branch--");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t1FocusGained
        // TODO add your handling code here:
        if(t1.getText().equals("Roll No."))
        {
            t1.setText("");
        }
    }//GEN-LAST:event_t1FocusGained

    private void t1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t1FocusLost
        // TODO add your handling code here:
        if(t1.getText().equals(""))
        {
            t1.setText("Roll No.");
        }
    }//GEN-LAST:event_t1FocusLost

    private void t2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t2FocusGained
        // TODO add your handling code here:
        if(t2.getText().equals("Name"))
        {
            t2.setText("");
        }
    }//GEN-LAST:event_t2FocusGained

    private void t2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t2FocusLost
        // TODO add your handling code here:
        if(t2.getText().equals(""))
        {
            t2.setText("Name");
        }
    }//GEN-LAST:event_t2FocusLost

    private void t3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t3FocusGained
        // TODO add your handling code here:
        if(t3.getText().equals("Mobile"))
        {
            t3.setText("");
        }
    }//GEN-LAST:event_t3FocusGained

    private void t3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t3FocusLost
        // TODO add your handling code here:
        if(t3.getText().equals(""))
        {
            t3.setText("Mobile");
        }
    }//GEN-LAST:event_t3FocusLost

    private void t4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t4FocusGained
        // TODO add your handling code here:
        if(t4.getText().equals("Parent's Name"))
        {
            t4.setText("");
        }
    }//GEN-LAST:event_t4FocusGained

    private void t4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t4FocusLost
        // TODO add your handling code here:
        if(t4.getText().equals(""))
        {
            t4.setText("Parent's Name");
        }
    }//GEN-LAST:event_t4FocusLost

    private void t5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t5FocusGained
        // TODO add your handling code here:
        if(t5.getText().equals("Parent's Mobile"))
        {
            t5.setText("");
        }
    }//GEN-LAST:event_t5FocusGained

    private void t5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t5FocusLost
        // TODO add your handling code here:
        if(t5.getText().equals(""))
        {
            t5.setText("Parent's Mobile");
        }
    }//GEN-LAST:event_t5FocusLost

    private void t6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t6FocusGained
        // TODO add your handling code here:
        if(t6.getText().equals("Address"))
        {
            t6.setText("");
        }
    }//GEN-LAST:event_t6FocusGained

    private void t6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t6FocusLost
        // TODO add your handling code here:
        if(t6.getText().equals(""))
        {
            t6.setText("Address");
        }
    }//GEN-LAST:event_t6FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AddStudent add=new AddStudent();
        add.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> co1;
    private javax.swing.JComboBox<String> co2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}

