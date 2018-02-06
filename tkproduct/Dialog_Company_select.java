
package tkproduct;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Dialog_Company_select extends javax.swing.JDialog {

   String Temp,Temp2;
   DefaultTableModel Com_Model;
   DefaultTableCellRenderer renderer,centerCellRenderer;
    public Dialog_Company_select(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       Com_Model = (DefaultTableModel)Com_jTable.getModel();
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("invoice-icon.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Com_jTable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        Com_Search = new javax.swing.JTextField();
        cbo_search = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Com_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Com_jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Com_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Com_jTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Com_jTable);

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Com_Search.setText("%");

        cbo_search.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Company ID", "Company Name", "Branch Name", "Tax ID", "Address" }));
        cbo_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1168, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1144, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cbo_search, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Com_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton7)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Com_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7)
                        .addComponent(cbo_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1186)/2, (screenSize.height-579)/2, 1186, 579);
    }// </editor-fold>//GEN-END:initComponents

    private void Com_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Com_jTableMouseClicked
        // TODO add your handling code here:
      
        int index = Com_jTable.getSelectedRow();
        if (evt.getClickCount() == 1) {
            Temp = Com_Model.getValueAt(index, 1).toString();
            Temp2 = Com_Model.getValueAt(index, 2).toString();
            
            this.hide();
        }
    }//GEN-LAST:event_Com_jTableMouseClicked
protected void search(String column, String searchkey) {
        try {
            String[] colname = {"No.",
                "Company ID",
                "Compana Name",
                "Branch Name",
                "Branch No.",
                "TAX ID",
                "Address","Status"};
            Com_Model = new DefaultTableModel(colname, 0);
            Connection conn = db.getConnection();
            String sql = "select * from company_customer where " + column + " like '%" + searchkey + "' and Status ='Active'  ORDER BY Number ASC";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String a1 = rs.getString("Number");
                String a2 = rs.getString("Com_Autonumber");
                String a3 = rs.getString("Com_Name");
                String a4 = rs.getString("Com_Branchname");
                String a5 = rs.getString("Com_Branchnumber");
                String a6 = rs.getString("Com_Taxid");
                String a7 = rs.getString("Com_Address");
                String a8 = rs.getString("Status");
                String[] row = {a1, a2, a3, a4, a5, a6, a7,a8};
                Com_Model.addRow(row);
                Com_jTable.setModel(Com_Model);
                setTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
protected void setTable() {
        renderer = (DefaultTableCellRenderer) Com_jTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        centerCellRenderer = new DefaultTableCellRenderer();
        centerCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        Com_jTable.getColumnModel().getColumn(0).setCellRenderer(centerCellRenderer);
        Com_jTable.getColumnModel().getColumn(1).setCellRenderer(centerCellRenderer);
//        Com_jTable.getColumnModel().getColumn(2).setCellRenderer(centerCellRenderer);
//        Com_jTable.getColumnModel().getColumn(3).setCellRenderer(centerCellRenderer);
        Com_jTable.getColumnModel().getColumn(4).setCellRenderer(centerCellRenderer);
        Com_jTable.getColumnModel().getColumn(5).setCellRenderer(centerCellRenderer);
//        Com_jTable.getColumnModel().getColumn(6).setCellRenderer(centerCellRenderer);


        Com_jTable.getColumnModel().getColumn(0).setPreferredWidth(40);
        Com_jTable.getColumnModel().getColumn(1).setPreferredWidth(120);
        Com_jTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        Com_jTable.getColumnModel().getColumn(3).setPreferredWidth(120);
        Com_jTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        Com_jTable.getColumnModel().getColumn(5).setPreferredWidth(140);
        Com_jTable.getColumnModel().getColumn(6).setPreferredWidth(800);

    }
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //        Company ID, Company Name, Branch Name, Tax ID, Address
        if (cbo_search.getSelectedIndex() == 0) {
            search("Com_Autonumber", Com_Search.getText());
        } else if (cbo_search.getSelectedIndex() == 1) {
            search("Com_Name", Com_Search.getText());
        } else if (cbo_search.getSelectedIndex() == 2) {
            search("Com_Branchname", Com_Search.getText());
        } else if (cbo_search.getSelectedIndex() == 3) {
            search("Com_Taxid", Com_Search.getText());
        } else if (cbo_search.getSelectedIndex() == 4) {
            search("Com_Address", Com_Search.getText());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cbo_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_searchActionPerformed
        // TODO add your handling code here:
        Com_Search.setText("%");
    }//GEN-LAST:event_cbo_searchActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        search("Com_Autonumber", "%");
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
            java.util.logging.Logger.getLogger(Dialog_Company_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialog_Company_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialog_Company_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialog_Company_select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dialog_Company_select dialog = new Dialog_Company_select(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField Com_Search;
    private javax.swing.JTable Com_jTable;
    private javax.swing.JComboBox cbo_search;
    private javax.swing.JButton jButton7;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
