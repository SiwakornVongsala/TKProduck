package tkproduct;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class DialogProduct extends javax.swing.JDialog {

    DefaultTableModel Pro_Model;
    DefaultTableCellRenderer renderer, centerCellRenderer;
    Connection conn;
    ResultSet rs;
    String sql;
    String Temp_pro_id, Temp_pro_name, temp_pro_upb;

    public DialogProduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("invoice-icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Pro_jTable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        Pro_Search = new javax.swing.JTextField();
        cbo_search = new javax.swing.JComboBox();

        setTitle("Product");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Pro_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Pro_jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Pro_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pro_jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Pro_jTable);

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Pro_Search.setText("%");

        cbo_search.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Product ID", "Product Name", "Unit Price" }));
        cbo_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbo_search, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pro_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(0, 268, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pro_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(cbo_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-674)/2, (screenSize.height-600)/2, 674, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void Pro_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pro_jTableMouseClicked
        // TODO add your handling code here:
        int index = Pro_jTable.getSelectedRow();
        if (evt.getClickCount() == 1) {
            Temp_pro_id = Pro_Model.getValueAt(index, 1).toString();
            Temp_pro_name = Pro_Model.getValueAt(index, 2).toString();
            temp_pro_upb = Pro_Model.getValueAt(index, 3).toString();
            this.hide();
        }
    }//GEN-LAST:event_Pro_jTableMouseClicked
    protected void clearTable() {
        String[] colname = {"No.",
            "Product ID",
            "Product Name",
            "Unit per Bag",
            "Status"
        };
        Pro_Model = new DefaultTableModel(colname, 0);
        Pro_jTable.setModel(Pro_Model);
        setTable();
    }

    protected void search(String column, String searchkey) {
        try {
            String[] colname = {"No.",
                "Product ID",
                "Product Name",
                "Unit per Bag",
                "Status"
            };
            Pro_Model = new DefaultTableModel(colname, 0);
            conn = db.getConnection();
            sql = "select * from product where " + column + " like '" + searchkey + "' and Pro_Status ='Active' ORDER BY Number ASC";
            rs = conn.createStatement().executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                clearTable();
            } else {
                while (rs.next()) {
                    String a1 = rs.getString("Number");
                    String a2 = rs.getString("Pro_ID");
                    String a3 = rs.getString("Pro_Name");
                    String a4 = rs.getString("Pro_Upb");
                    String a5 = rs.getString("Pro_Status");
                    String[] row = {a1, a2, a3, a4, a5};
                    Pro_Model.addRow(row);
                    Pro_jTable.setModel(Pro_Model);
                    setTable();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void setTable() {
        renderer = (DefaultTableCellRenderer) Pro_jTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        centerCellRenderer = new DefaultTableCellRenderer();
        centerCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        Pro_jTable.getColumnModel().getColumn(0).setCellRenderer(centerCellRenderer);
        Pro_jTable.getColumnModel().getColumn(1).setCellRenderer(centerCellRenderer);
        Pro_jTable.getColumnModel().getColumn(2).setCellRenderer(centerCellRenderer);
        Pro_jTable.getColumnModel().getColumn(3).setCellRenderer(centerCellRenderer);
        Pro_jTable.getColumnModel().getColumn(4).setCellRenderer(centerCellRenderer);

//632 width
        Pro_jTable.getColumnModel().getColumn(0).setPreferredWidth(50);//number
        Pro_jTable.getColumnModel().getColumn(1).setPreferredWidth(120);//Pro_ID
        Pro_jTable.getColumnModel().getColumn(2).setPreferredWidth(362);//Pro_Name
        Pro_jTable.getColumnModel().getColumn(3).setPreferredWidth(100);//Pro_Upb
        Pro_jTable.getColumnModel().getColumn(3).setPreferredWidth(100);//Pro_Status


    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //        Company ID, Company Name, Branch Name, Tax ID, Address
        if (cbo_search.getSelectedIndex() == 0) {
            search("Pro_ID", Pro_Search.getText());
        } else if (cbo_search.getSelectedIndex() == 1) {
            search("Pro_Name", Pro_Search.getText());
        } else if (cbo_search.getSelectedIndex() == 2) {
            search("Pro_Upb", Pro_Search.getText() + "%");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cbo_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_searchActionPerformed
        // TODO add your handling code here:
        Pro_Search.setText("%");
    }//GEN-LAST:event_cbo_searchActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        search("Pro_ID", "%");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(DialogProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogProduct dialog = new DialogProduct(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pro_Search;
    private javax.swing.JTable Pro_jTable;
    private javax.swing.JComboBox cbo_search;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
