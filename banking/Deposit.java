/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Menu;

/**
 *
 * @author Mohit_Pc
 */
public class Deposit extends javax.swing.JFrame {

    /**
     * Creates new form Deposit
     */
    public Deposit() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtf_custid = new javax.swing.JTextField();
        btn_name = new javax.swing.JButton();
        btn_oldbal = new javax.swing.JButton();
        txtf_name = new javax.swing.JTextField();
        txtf_oldbal = new javax.swing.JTextField();
        lbl_amnt = new javax.swing.JLabel();
        txtf_depos = new javax.swing.JTextField();
        btn_depos = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textf_ex = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Customer id to deposit amount:");

        btn_name.setText("Customer Name:");
        btn_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nameActionPerformed(evt);
            }
        });

        btn_oldbal.setText("Existing Balance Amount:");
        btn_oldbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oldbalActionPerformed(evt);
            }
        });

        lbl_amnt.setText("Enter Amount to Deposit:");

        btn_depos.setText("DEPOSIT");
        btn_depos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deposActionPerformed(evt);
            }
        });

        btn_exit.setText("EXIT");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        textf_ex.setColumns(20);
        textf_ex.setRows(5);
        jScrollPane1.setViewportView(textf_ex);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbl_amnt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_oldbal, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(btn_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btn_depos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_exit)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtf_custid, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addComponent(txtf_name)
                        .addComponent(txtf_oldbal)
                        .addComponent(txtf_depos)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_custid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_name)
                            .addComponent(txtf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_oldbal)
                            .addComponent(txtf_oldbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_amnt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtf_depos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_depos)
                            .addComponent(btn_exit))))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nameActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
         if(evt.getSource()==btn_name)
        {
            Connection con=null;
            PreparedStatement ps=null;
            ResultSet rs=null;
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@Mohit:1521:xe","scott","tiger");
                String oldname="Select name from customer where custid=?";
                if(con!=null)
                ps=con.prepareStatement(oldname);
                if(ps!=null)
                {
                    ps.setInt(1,Integer.parseInt(txtf_custid.getText()));
                    rs=ps.executeQuery();
                    if(rs.next())
                    txtf_name.setText(rs.getString(1));
                    else
                    {
                        textf_ex.append("---> SORRY!NAME NOT FOUND <---");
                        textf_ex.append("\n");
                    }
                }
            }catch(ClassNotFoundException cnf)
            {
             textf_ex.append(cnf.toString());           
            }catch(SQLException sq)
           {
             textf_ex.append(sq.toString());
              textf_ex.append("\n");
           }
           catch(Exception ex)
           {
              textf_ex.append(ex.toString());
              textf_ex.append("\n");
           }finally
            {
                try
                {
                    if(rs!=null)
                        rs.close();
                }catch(SQLException sq)
                {
                   textf_ex.append(sq.toString());
                   textf_ex.append("\n"); 
                }
                try
                {
                    if(ps!=null)
                        ps.close();
                }catch(SQLException sq)
                {
                     textf_ex.append(sq.toString());
                     textf_ex.append("\n");
                }
                 try
                {
                    if(con!=null)
                        con.close();
                }catch(SQLException sq)
                {
                     textf_ex.append(sq.toString());
                     textf_ex.append("\n");
                }
            }
        }
    }//GEN-LAST:event_btn_nameActionPerformed

    private void btn_oldbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oldbalActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
         if(evt.getSource()==btn_oldbal)
        {
            Connection con=null;
            PreparedStatement ps=null;
            ResultSet rs=null;
            txtf_oldbal.setText("");
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@Mohit:1521:xe","scott","tiger");
                String oldbal="Select depos from customer where custid=?";
                if(con!=null)
                ps=con.prepareStatement(oldbal);
                if(ps!=null)
                {
                    ps.setInt(1,Integer.parseInt(txtf_custid.getText()));
                    rs=ps.executeQuery();
                    if(rs.next())
                    txtf_oldbal.setText(rs.getString(1));
                    else
                    {
                        textf_ex.append("---> SORRY!NAME NOT FOUND <---");
                        textf_ex.append("\n");
                    }
                }
            }catch(ClassNotFoundException cnf)
            {
             textf_ex.append(cnf.toString());           
            }catch(SQLException sq)
           {
             textf_ex.append(sq.toString());
              textf_ex.append("\n");
           }
           catch(Exception ex)
           {
              textf_ex.append(ex.toString());
              textf_ex.append("\n");
           }finally
            {
                try
                {
                    if(rs!=null)
                        rs.close();
                }catch(SQLException sq)
                {
                   textf_ex.append(sq.toString());
                   textf_ex.append("\n"); 
                }
                try
                {
                    if(ps!=null)
                        ps.close();
                }catch(SQLException sq)
                {
                     textf_ex.append(sq.toString());
                     textf_ex.append("\n");
                }
                 try
                {
                    if(con!=null)
                        con.close();
                }catch(SQLException sq)
                {
                     textf_ex.append(sq.toString());
                     textf_ex.append("\n");
                }
            }
        }
    }//GEN-LAST:event_btn_oldbalActionPerformed

    private void btn_deposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deposActionPerformed
        // TODO add your handling code here:
         if(evt.getSource()==btn_depos)
        {
            Connection con=null;
            PreparedStatement ps=null;
            ResultSet rs=null;
            float newbal=Float.parseFloat(txtf_oldbal.getText())+Float.parseFloat(txtf_depos.getText());
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                con=DriverManager.getConnection("jdbc:oracle:thin:@Mohit:1521:xe","scott","tiger");
                String newbal1="Update customer set depos=? where custid=?";
                if(con!=null)
                ps=con.prepareStatement(newbal1);
                if(ps!=null)
                {
                       ps.setFloat(1,newbal);
                       ps.setInt(2,Integer.parseInt(txtf_custid.getText()));
                       int result=ps.executeUpdate();
                       if(result==0)
                       {
                           textf_ex.append("Sorry!Not deposited");
                           textf_ex.append("\n");
                       }else
                       {
                           textf_ex.append("Amount successfully deposited");
                           textf_ex.append("\n");
                       }
                       
                }
            }catch(ClassNotFoundException cnf)
            {
             textf_ex.append(cnf.toString());           
            }catch(SQLException sq)
           {
             textf_ex.append(sq.toString());
              textf_ex.append("\n");
           }
           catch(Exception ex)
           {
              textf_ex.append(ex.toString());
              textf_ex.append("\n");
           }finally
            {
                try
                {
                    if(rs!=null)
                        rs.close();
                }catch(SQLException sq)
                {
                   textf_ex.append(sq.toString());
                   textf_ex.append("\n"); 
                }
                try
                {
                    if(ps!=null)
                        ps.close();
                }catch(SQLException sq)
                {
                     textf_ex.append(sq.toString());
                     textf_ex.append("\n");
                }
                 try
                {
                    if(con!=null)
                        con.close();
                }catch(SQLException sq)
                {
                     textf_ex.append(sq.toString());
                     textf_ex.append("\n");
                }
            }
        }
    }//GEN-LAST:event_btn_deposActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==btn_exit)
        {
            setVisible(false);
            new Menu();setVisible(true);
        }
    }//GEN-LAST:event_btn_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_depos;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_name;
    private javax.swing.JButton btn_oldbal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_amnt;
    private javax.swing.JTextArea textf_ex;
    private javax.swing.JTextField txtf_custid;
    private javax.swing.JTextField txtf_depos;
    private javax.swing.JTextField txtf_name;
    private javax.swing.JTextField txtf_oldbal;
    // End of variables declaration//GEN-END:variables
}