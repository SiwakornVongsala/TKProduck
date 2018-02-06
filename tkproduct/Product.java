/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tkproduct;

import java.awt.event.InputEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Product extends javax.swing.JInternalFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pre;
    String sql, Last_row_AutoNumber;
    DefaultTableModel Pro_Model;
    DefaultTableCellRenderer renderer, centerCellRenderer;

    public Product() {
        initComponents();
        Pro_Model = (DefaultTableModel) Pro_jTable.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Number = new javax.swing.JTextField();
        Pro_Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Pro_ID = new javax.swing.JTextField();
        Pro_Unitperbag = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pro_jTable = new javax.swing.JTable();
        cbo_search = new javax.swing.JComboBox();
        Pro_Search = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Management Product");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear);

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);

        jLabel1.setText("Number :");

        jLabel3.setText("Units per Bag :");

        jLabel2.setText("Product Name :");

        Number.setEditable(false);
        Number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NumberMouseClicked(evt);
            }
        });
        Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberActionPerformed(evt);
            }
        });

        Pro_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Pro_NameKeyPressed(evt);
            }
        });

        jLabel4.setText("Product ID :");

        Pro_ID.setEditable(false);

        Pro_Unitperbag.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Pro_Unitperbag.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Pro_UnitperbagFocusLost(evt);
            }
        });
        Pro_Unitperbag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pro_UnitperbagKeyReleased(evt);
            }
        });

        jCheckBox1.setText("Active");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pro_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pro_Unitperbag, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox1))
                        .addComponent(Pro_ID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Pro_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Pro_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Pro_Unitperbag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

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

        cbo_search.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Product ID", "Product Name", "Unit Price" }));
        cbo_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_searchActionPerformed(evt);
            }
        });

        Pro_Search.setText("%");

        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbo_search, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pro_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pro_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(cbo_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1117)/2, (screenSize.height-407)/2, 1117, 407);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
        btnNew.setEnabled(false);
        clear();
        try {
            conn = db.getConnection();
            sql = "select substring(Pro_ID,2,length(Pro_ID)) as col1,p.* "
                    + "from product p  order by Pro_ID desc limit  1 ";
            rs = conn.createStatement().executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                Pro_ID.setText("P001");
            } else {
                while (rs.next()) {
                    Last_row_AutoNumber = rs.getString("col1");
                }
                int isint = Integer.parseInt(Last_row_AutoNumber) + 1;
                if (isint <= 9) {
                    Pro_ID.setText("P" + "00" + isint);
                } else if (isint > 9 && isint <= 99) {
                    Pro_ID.setText("P" + "0" + isint);
                } else if (isint > 99 && isint <= 999) {
                    Pro_ID.setText("P" + "" + isint);
                } else if (isint >= 1000) {
                    Pro_ID.setText("P" + isint);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            int Number1;
            String status;
            if (jCheckBox1.isSelected()) {
                status = "Active";
            } else {
                status = "InActive";
            }
            conn = db.getConnection();
            sql = "SELECT * FROM product ORDER BY Number DESC LIMIT 1";
            rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                Number1 = rs.getInt("Number");
                Pro_Model.insertRow(Pro_Model.getRowCount(), new Object[]{
                            Number1 + 1,
                            Pro_ID.getText(),
                            Pro_Name.getText().trim(),
                            Pro_Unitperbag.getText().trim(),
                            status
                        });

                Number.setText("" + (Number1 + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnNew.setEnabled(true);
        try {
            if (Number.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "save Fail", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String status;
                if (jCheckBox1.isSelected()) {
                    status = "Active";
                } else {
                    status = "InActive";
                }
                conn = db.getConnection();
                sql = "update product "
                        + " set Pro_ID='" + Pro_ID.getText().trim() + "' "
                        + ",Pro_Name='" + Pro_Name.getText().trim() + "' "
                        + ",Pro_Upb='" + Pro_Unitperbag.getText() + "' "
                        + ",Pro_Status='" + status + "' "
                        + " where Number = " + Number.getText();
                pre = conn.prepareStatement(sql);
                if (pre.executeUpdate() != -1) {
                    JOptionPane.showMessageDialog(this, "Edit  success", "Save", JOptionPane.INFORMATION_MESSAGE);
                }
                int index = Pro_jTable.getSelectedRow();
                Pro_Model.setValueAt(Number.getText(), index, 0);
                Pro_Model.setValueAt(Pro_ID.getText(), index, 1);
                Pro_Model.setValueAt(Pro_Name.getText().trim(), index, 2);
                Pro_Model.setValueAt(Pro_Unitperbag.getText(), index, 3);
                Pro_Model.setValueAt(status, index, 4);
                clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEditActionPerformed
    protected void clear() {
        Number.setText("");
        Pro_ID.setText("");
        Pro_Name.setText("");
        Pro_Unitperbag.setText("0");
        jCheckBox1.setSelected(true);
    }
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnNew.setEnabled(true);
        try {
            if (Number.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Delete Fail", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (JOptionPane.showConfirmDialog(this, "Do you want to delete the record?", "Comfirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    int[] rowselect = Pro_jTable.getSelectedRows();
                    int rowlength = rowselect.length;
                    for (int i = rowlength - 1; i >= 0; i--) {
                        Pro_Model.removeRow(rowselect[i]);
                        conn = db.getConnection();
                        sql = "delete from product where Number=" + Number.getText();
                        pre = conn.prepareStatement(sql);
                        conn.createStatement().executeUpdate(sql);
                        if (pre.executeUpdate() != -1) {
                            JOptionPane.showMessageDialog(this, "Delete Success", "Delete", JOptionPane.OK_OPTION);
                            clear();
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:


        if (Pro_Name.getText().equals("") || Pro_Unitperbag.equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out this form ", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            btnNew.setEnabled(true);
            btnSave.setEnabled(false);
            String status = "";
            if (jCheckBox1.isSelected()) {
                status = "Active";
            } else {
                status = "InActive";
            }
            try {
                conn = db.getConnection();
                sql = "select substring(Pro_ID,2,length(Pro_ID)) as col1,p.* "
                        + "from product p  order by Pro_ID desc limit  1 ";
                rs = conn.createStatement().executeQuery(sql);
                if (!rs.isBeforeFirst()) {
                    sql = "insert into product(Pro_ID,Pro_Name,Pro_Upb,Pro_Status) "
                            + " values(?,?,?,?)";
                    pre = conn.prepareStatement(sql);
                    pre.setString(1, Pro_ID.getText().trim());
                    pre.setString(2, Pro_Name.getText().trim());
                    pre.setString(3, Pro_Unitperbag.getText());
                    pre.setString(4, status);

                    if (pre.executeUpdate() != -1) {
                        JOptionPane.showMessageDialog(this, "Save Success ", "Save", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    while (rs.next()) {

                        Last_row_AutoNumber = rs.getString("Pro_ID");
                        if (Last_row_AutoNumber.equals(Pro_ID.getText().trim())) {
                            Last_row_AutoNumber = rs.getString("col1");
                            int isint = Integer.parseInt(Last_row_AutoNumber) + 1;
                            if (isint <= 9) {
                                Pro_ID.setText("P" + "00" + isint);
                            } else if (isint > 9 && isint <= 99) {
                                Pro_ID.setText("P" + "0" + isint);
                            } else if (isint > 99 && isint <= 999) {
                                Pro_ID.setText("P" + "" + isint);
                            } else if (isint >= 1000) {
                                Pro_ID.setText("P" + isint);
                            }
                        }
                        sql = "insert into product(Pro_ID,Pro_Name,Pro_Upb,Pro_Status) "
                                + " values(?,?,?,?)";
                        pre = conn.prepareStatement(sql);
                        pre.setString(1, Pro_ID.getText().trim());
                        pre.setString(2, Pro_Name.getText().trim());
                        pre.setString(3, Pro_Unitperbag.getText());
                        pre.setString(4, status);
                        if (pre.executeUpdate() != -1) {
                            JOptionPane.showMessageDialog(this, "Save Success ", "Save", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (Pro_jTable.getRowCount() > 0) {
                int index = Pro_jTable.getRowCount() - 1;
                Pro_Model.setValueAt(Number.getText(), index, 0);
                Pro_Model.setValueAt(Pro_ID.getText().trim(), index, 1);
                Pro_Model.setValueAt(Pro_Name.getText().trim(), index, 2);
                Pro_Model.setValueAt(Pro_Unitperbag.getText().trim(), index, 3);
                Pro_Model.setValueAt(status, index, 4);
            } else {
                refresh();
            }
            clear();
        }

    }//GEN-LAST:event_btnSaveActionPerformed
    protected void refresh() {
        try {
            String[] colname = {"No.",
                "Product ID",
                "Product Name",
                "Unit per Bag",
                "Status"
            };
            Pro_Model = new DefaultTableModel(colname, 0);
            conn = db.getConnection();
            sql = "select * from product ORDER BY number ASC";
            rs = conn.createStatement().executeQuery(sql);
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        refresh();
        clear();
        btnNew.setEnabled(true);
        btnSave.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnDelete.setVisible(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cbo_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_searchActionPerformed
        // TODO add your handling code here:
        Pro_Search.setText("%");
    }//GEN-LAST:event_cbo_searchActionPerformed
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
            sql = "select * from product where " + column + " like '" + searchkey + "'  ORDER BY Number ASC";
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

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:

        btnSave.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDelete.setVisible(false);
        clearTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void Pro_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pro_jTableMouseClicked
        // TODO add your handling code here:
        btnSave.setEnabled(false);
        btnNew.setEnabled(false);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        int index = Pro_jTable.getSelectedRow();
        Number.setText(Pro_Model.getValueAt(index, 0).toString());
        Pro_ID.setText(Pro_Model.getValueAt(index, 1).toString());
        Pro_Name.setText(Pro_Model.getValueAt(index, 2).toString());
        Pro_Unitperbag.setText(Pro_Model.getValueAt(index, 3).toString());
        String temp = (Pro_Model.getValueAt(index, 4).toString());
        if (temp.equals("Active")) {
            jCheckBox1.setSelected(true);
        } else if (temp.equals("InActive")) {
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_Pro_jTableMouseClicked

    private void Pro_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pro_NameKeyPressed
        // TODO add your handling code here:
        if (Number.getText().trim().equals("") && (!(btnSave.isEnabled()))) {
            btnSave.setEnabled(true);
        }
    }//GEN-LAST:event_Pro_NameKeyPressed

    private void Pro_UnitperbagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pro_UnitperbagKeyReleased
        // TODO add your handling code here:
//         String temp=Double.toString(UnitPrice);
    }//GEN-LAST:event_Pro_UnitperbagKeyReleased

    private void Pro_UnitperbagFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pro_UnitperbagFocusLost
//        // TODO add your handling code here:
//        String a = String.format("%,.2f", Double.parseDouble(Pro_Unitperbag.getText()));
//        System.out.println(a);
//        Pro_Unitperbag.setText("" + a);
    }//GEN-LAST:event_Pro_UnitperbagFocusLost

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated

    private void NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberActionPerformed

    private void NumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NumberMouseClicked
        // TODO add your handling code here:
        if ((evt.getModifiers() == InputEvent.BUTTON3_MASK)) {
            btnDelete.setVisible(true);
            btnDelete.setEnabled(false);
        }
        if (evt.getModifiers() == InputEvent.BUTTON1_MASK) {
            btnDelete.setVisible(false);
        }

    }//GEN-LAST:event_NumberMouseClicked

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
        Pro_jTable.getColumnModel().getColumn(4).setPreferredWidth(100);//Pro_Status


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Number;
    private javax.swing.JTextField Pro_ID;
    private javax.swing.JTextField Pro_Name;
    private javax.swing.JTextField Pro_Search;
    private javax.swing.JTextField Pro_Unitperbag;
    private javax.swing.JTable Pro_jTable;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cbo_search;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
