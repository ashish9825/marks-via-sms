/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ctmarks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ashish
 */
public class StudentReport extends javax.swing.JFrame {

    /** Creates new form CTReport */
    public StudentReport() {
        initComponents();
        jPanel2.setVisible(false);
        this.setSize(1000,535);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        co1 = new javax.swing.JComboBox<>();
        co2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 42, 76));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        co1.setBackground(new java.awt.Color(43, 42, 76));
        co1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        co1.setForeground(new java.awt.Color(255, 255, 255));
        co1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                --Branch--", "Aeronautical Engineering", "Aerospace Engineering", "Aircraft Maintenance Engineering ", "Automobile Engineering", "Biotechnology Engineering", "Chemical Engineering", "Civil Engineering", "Computer Science Engineeering", "Electrical Engineering", "Electrical & Electronics Engineering", "Electrical & Telecommunications Engineering", "Information Technology Engineering", "Mechanical Engineering", "Metallurgical Engineering" }));
        co1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 43, 76)));
        jPanel1.add(co1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 270, 40));

        co2.setBackground(new java.awt.Color(43, 42, 76));
        co2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        co2.setForeground(new java.awt.Color(255, 255, 255));
        co2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    --Semester--", "1", "2", "3", "4", "5", "6", "7", "8" }));
        jPanel1.add(co2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 170, 40));

        jButton1.setBackground(new java.awt.Color(43, 42, 76));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Go");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 42, 76)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 60, 40));

        jPanel2.setBackground(new java.awt.Color(43, 42, 76));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setBackground(new java.awt.Color(42, 43, 76));
        jTable2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 960, 390));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1000, 420));

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
        DefaultTableModel df=new DefaultTableModel(0,0);
        String[] col={"Roll No.","Name","Branch","Semester","Mobile","Address","Parent Name","Parent Mobile"};
        df.setColumnIdentifiers(col);
        jTable2.setModel(df);
        try
        {
           String b=co1.getSelectedItem().toString();
           String s=co2.getSelectedItem().toString();
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ctproject","root","");
           String q="select * from student where branch='"+b+"' and sem='"+s+"'";
           Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery(q);
           while(rs.next())
           {
               Vector v=new Vector();
               v.add(rs.getString("roll_no"));
               v.add(rs.getString("name"));
               v.add(rs.getString("branch"));
               v.add(rs.getString("sem"));
               v.add(rs.getString("mobile"));
               v.add(rs.getString("address"));
               v.add(rs.getString("pname"));
               v.add(rs.getString("pmobile"));
               df.addRow(v);
           }   
           con.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        jPanel2.setVisible(true);
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
            java.util.logging.Logger.getLogger(StudentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> co1;
    private javax.swing.JComboBox<String> co2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

}
