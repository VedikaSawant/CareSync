/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author 91981
 */
public class Delete extends javax.swing.JFrame {
        private javax.swing.JButton jButton1;

   // private javax.swing.JComboBox<String> jComboBox1;

    private javax.swing.JTextField jTextField1;

    private javax.swing.JTextField jTextField2;

    private javax.swing.JTextField jTextField3;

     javax.swing.JTextField jTextField4;

     javax.swing.JTextField jTextField5;

     javax.swing.JTextField jTextField6;

    /**
     * Creates new form Delete
     */
    public Delete() {
        initComponents();
        addElement();
    }
    public void addElement() {
        jTextField1 = new javax.swing.JTextField();

        jTextField2 = new javax.swing.JTextField();

        jTextField3 = new javax.swing.JTextField();

        jTextField5 = new javax.swing.JTextField();

        jComboBox1 = new javax.swing.JComboBox<>();

        jTextField4 = new javax.swing.JTextField();

        jTextField6 = new javax.swing.JTextField();

        jButton1 = new javax.swing.JButton();

 

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

 

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jTextField1ActionPerformed(evt);

            }

        });

 

        jTextField2.setBackground(new java.awt.Color(255, 255, 153));

        jTextField2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField2.setText("Patient ID");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jTextField2ActionPerformed(evt);

            }

        });

 

        jTextField3.setBackground(new java.awt.Color(153, 153, 255));

        jTextField3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N

        jTextField3.setForeground(new java.awt.Color(255, 255, 255));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField3.setText("Hello! Enter the following fields to delete your details");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jTextField3ActionPerformed(evt);

            }

        });

 
        jTextField5.setBackground(new java.awt.Color(255, 255, 153));

        jTextField5.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField5.setText("Choose your Field");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jTextField5ActionPerformed(evt);

            }

        });

 

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Age", "Address", "Phone", "Email" }));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jComboBox1ActionPerformed(evt);

            }

        });

 

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextField4.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jTextField4ActionPerformed(evt);

            }

        });

 

       jTextField6.setBackground(new java.awt.Color(255, 255, 153));

        jTextField6.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField6.setText("Enter new details");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jTextField6ActionPerformed(evt);

            }

        });

 

        jButton1.setBackground(new java.awt.Color(0, 102, 255));

        jButton1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N

        jButton1.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Submit");

        jButton1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton1ActionPerformed(evt);

            }

        });

 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(layout.createSequentialGroup()

                .addGap(126, 126, 126)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addGroup(layout.createSequentialGroup()

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)

                )

                        .addGap(21, 21, 21)

                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                      

                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                

                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING))

                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))

                .addContainerGap(208, Short.MAX_VALUE))

        );

        layout.setVerticalGroup(

            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(layout.createSequentialGroup()

                .addGap(24, 24, 24)

                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(31, 31, 31)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(33, 33, 33)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                    

                )

                .addGap(41, 41, 41)

                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    ))

                .addGap(51, 51, 51)

                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)

                

        );
        pack();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                        

        jButton1.addActionListener(e -> {

            String pid="";  // Declare userInput as a local variable

            String selectedField="";

            //String newDetail="";

            try {

                pid = jTextField1.getText();  // Declare userInput as a local variable

               // selectedField = (String) jComboBox1.getSelectedItem();

                //newDetail = jTextField4.getText();

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(this, "Please enter a valid integer.");

            }

           

            Connection conn = null;

            PreparedStatement pstmt = null;

            String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

            String url = "jdbc:mysql://localhost:3306/hosp";

            String user = "root";

            String password = "Mysql@123";

 

            String query = "delete from Patients where" + selectedField + " = ? WHERE PatientID = ?";

            try {

                Class.forName(JDBC_DRIVER);

                conn = DriverManager.getConnection(url, user, password);

                pstmt = conn.prepareStatement(query);

                if(selectedField.equals("Age")) {

                    pstmt.setInt(1, Integer.parseInt(null));

                    pstmt.setString(2, pid);

                } else if(selectedField.equals("Phone") && selectedField.length()!=10) {

                    JOptionPane.showMessageDialog(null, "Invalid Phone Number!!");

                }  else if(selectedField.equals("Phone") && !"987".contains(selectedField.charAt(0)+"")) {

                    JOptionPane.showMessageDialog(null, "Invalid Phone Number!!");

                } else if(pid.charAt(0)!='P') {

                    JOptionPane.showMessageDialog(null, "Invalid PatientID!!");

                } else {

                    pstmt.setString(1, null);

                    pstmt.setString(2, pid);

                }

 

                int rowsUpdated = pstmt.executeUpdate();

 

               if (rowsUpdated > 0) {

                    JOptionPane.showMessageDialog(null, "Patient details updated successfully");

                    setVisible(false);

                    new UpdatePatientDetails().setVisible(true);

                } else {

                    JOptionPane.showMessageDialog(null, "No record found for the given Patient ID");

                }

 

                pstmt.close();

                conn.close();

 

            } catch (Exception x) {

                x.printStackTrace();

                JOptionPane.showMessageDialog(null, "Error updating patient details: " + x.getMessage());

            }

      });
    }     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
