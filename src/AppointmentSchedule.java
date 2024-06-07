
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 91981
 */
public class AppointmentSchedule extends javax.swing.JFrame {

    /**
     * Creates new form AppointmentSchedule
     */
    public AppointmentSchedule() {
        initComponents();
        showTableData();
    }
    private void showTableData() {
        String url = "jdbc:mysql://localhost:3306/Hospitaldb";
        String user = "root";
        String password = "Mysql@123"; // Replace with your MySQL password

        // SQL query to fetch data
        String query = "SELECT d.ApptId, d.PatientID, d.DocID, dr.Name AS Doctor, dr.Specialization, d.AppointmentDate, d.AppointmentTime FROM Doctors as dr inner join Diagnosis as d on dr.DocID=d.DocID";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            // Get ResultSetMetaData to get column count and names
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Create 2D array to hold the data
            Object[][] data = new Object[100][columnCount+1]; // assuming max 100 rows
            int rowCount = 0;
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    data[rowCount][i - 1] = resultSet.getObject(i);
                }
                rowCount++;
            }

            // Create column names array
            String[] columnNames = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                columnNames[i - 1] = metaData.getColumnName(i);
            }
            
            // Create JTable
            JTable table = new JTable(data, columnNames);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            table.setBackground(Color.CYAN);
            table.setShowHorizontalLines(rootPaneCheckingEnabled);
            table.setShowVerticalLines(rootPaneCheckingEnabled);
            Font font = new Font("Arial", Font.PLAIN, 16);
            table.setFont(font); 
            table.setForeground(Color.darkGray);
            table.setRowHeight(40);
            Font headerFont = new Font("Helvetica", Font.BOLD, 18);
            table.getTableHeader().setFont(headerFont); // Set header font
            table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getWidth(), 50)); // Set header height
            
            // Set preferred column widths
            for (int i = 0; i < columnCount; i++) {
                TableColumn column = table.getColumnModel().getColumn(i);
                int width = 200; // Set the default width
                for (int j = 0; j < rowCount; j++) {
                    TableCellRenderer renderer = table.getCellRenderer(j, i);
                    Component comp = table.prepareRenderer(renderer, j, i);
                    width = Math.max(comp.getPreferredSize().width + 1, width);
                }
                column.setPreferredWidth(width);
            }

            JPanel panel = new JPanel(new BorderLayout());

            JTextField text = new JTextField("Appointment Schedule");
            text.setFont(new Font("Arial", Font.BOLD, 28));
            text.setBackground(Color.green);
            text.setForeground(Color.white);
            text.setHorizontalAlignment(JTextField.CENTER);
            text.setEditable(false);                         // Make the text field non-editable
            text.setPreferredSize(new Dimension(0, 60)); 
            panel.add(text, BorderLayout.NORTH);
            panel.add(new JScrollPane(table), BorderLayout.CENTER);

             // Set the layout of the JFrame to BorderLayout
            getContentPane().setLayout(new BorderLayout());

            // Add scrollPane to the center of the JFrame
            getContentPane().add(panel, BorderLayout.CENTER);

            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            setSize(screenSize.width, screenSize.height);

        } catch (SQLException e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(AppointmentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
