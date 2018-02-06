/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tkproduct;

import java.awt.event.InputEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Customer_Company_Detail extends javax.swing.JInternalFrame {

    DefaultTableModel Com_Model;
    DefaultTableCellRenderer renderer, centerCellRenderer;
    String sql;
    Connection conn;
    ResultSet rs;
    PreparedStatement pre;
    static String Last_row_AutoNumber;

    public Customer_Company_Detail() {
        initComponents();
        Com_Model = (DefaultTableModel) Com_jTable.getModel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        Com_jTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Com_Branch_Name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Com_Number = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Com_TaxID = new javax.swing.JTextField();
        Com_Branch_No = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Com_Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Com_autonumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Com_Address = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        Com_Search = new javax.swing.JTextField();
        cbo_search = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Management Company");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
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

        Com_Branch_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Com_Branch_NameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Com_Branch_NameKeyTyped(evt);
            }
        });

        jLabel1.setText("Number :");

        jLabel3.setText("Company Name :");

        jLabel7.setText("Address :");

        Com_Number.setEditable(false);
        Com_Number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Com_NumberMouseClicked(evt);
            }
        });

        jLabel5.setText("Branch No :");

        Com_TaxID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Com_TaxIDKeyPressed(evt);
            }
        });

        Com_Branch_No.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Com_Branch_NoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Com_Branch_NoKeyTyped(evt);
            }
        });

        jLabel2.setText("Company ID :");

        Com_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Com_NameKeyPressed(evt);
            }
        });

        jLabel4.setText("Branch Name :");

        Com_autonumber.setEditable(false);

        jLabel6.setText("Tax ID :");

        Com_Address.setColumns(20);
        Com_Address.setLineWrap(true);
        Com_Address.setRows(5);
        jScrollPane1.setViewportView(Com_Address);

        jCheckBox1.setText("Active");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Com_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1))
                    .addComponent(Com_autonumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Com_Branch_No, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Com_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Com_TaxID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Com_Branch_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(Com_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(Com_autonumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(Com_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(Com_Branch_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(Com_Branch_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(Com_TaxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(54, Short.MAX_VALUE))
        );

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbo_search, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Com_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Com_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7)
                    .addComponent(cbo_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1036)/2, (screenSize.height-507)/2, 1036, 507);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:

        btnSave.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnDelete.setVisible(false);
        clearTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:    
        btnSave.setEnabled(true);
        btnNew.setEnabled(false);
        clear();
        try {
            conn = db.getConnection();
            sql = "select substring(com_autonumber,2,length(com_autonumber)) as col1,c.* from company_customer c  order by com_autonumber desc limit  1 ";
            rs = conn.createStatement().executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                Com_autonumber.setText("C001");
            } else {
                while (rs.next()) {
                    Last_row_AutoNumber = rs.getString("col1");
                }
                int isint = Integer.parseInt(Last_row_AutoNumber) + 1;
                if (isint <= 9) {
                    Com_autonumber.setText("C" + "00" + isint);
                } else if (isint > 9 && isint <= 99) {
                    Com_autonumber.setText("C" + "0" + isint);
                } else if (isint > 99 && isint <= 999) {
                    Com_autonumber.setText("C" + "" + isint);
                } else if (isint >= 1000) {
                    Com_autonumber.setText("C" + isint);
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
            sql = "SELECT * FROM company_customer ORDER BY Number DESC LIMIT 1";
            rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                Number1 = rs.getInt("Number");
                Com_Model.insertRow(Com_Model.getRowCount(), new Object[]{
                            Number1 + 1,
                            Com_autonumber.getText(),
                            Com_Name.getText().trim(),
                            Com_Branch_Name.getText().trim(),
                            Com_Branch_No.getText().trim(),
                            Com_TaxID.getText().trim(),
                            Com_Address.getText().trim(),
                            status});

                Com_Number.setText("" + (Number1 + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnNewActionPerformed
    protected void search(String column, String searchkey) {
        try {
            String[] colname = {"No.",
                "Company ID",
                "Compana Name",
                "Branch Name",
                "Branch No.",
                "TAX ID",
                "Address",
                "Status"};
            Com_Model = new DefaultTableModel(colname, 0);
            conn = db.getConnection();
            sql = "select * from company_customer where " + column + " like '" + searchkey + "'  ORDER BY Number ASC";
            rs = conn.createStatement().executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                clearTable();
            } else {
                while (rs.next()) {
                    String a1 = rs.getString("Number");
                    String a2 = rs.getString("Com_Autonumber");
                    String a3 = rs.getString("Com_Name");
                    String a4 = rs.getString("Com_Branchname");
                    String a5 = rs.getString("Com_Branchnumber");
                    String a6 = rs.getString("Com_Taxid");
                    String a7 = rs.getString("Com_Address");
                    String a8 = rs.getString("Status");
                    String[] row = {a1, a2, a3, a4, a5, a6, a7, a8};
                    Com_Model.addRow(row);
                    Com_jTable.setModel(Com_Model);
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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        btnNew.setEnabled(true);
        btnSave.setEnabled(false);
        String status;
        if (jCheckBox1.isSelected()) {
            status = "Active";
        } else {
            status = "InActive";
        }
        try {
            conn = db.getConnection();
            sql = "select substring(com_autonumber,2,length(com_autonumber)) as col1 ,c.* "
                    + "from company_customer c order by Number desc limit 1 ";
            rs = conn.createStatement().executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                sql = "insert into company_customer(Com_Autonumber,Com_Name,Com_Branchname,Com_Branchnumber,Com_Taxid,Com_Address,Status) "
                        + " values(?,?,?,?,?,?,?)";
                pre = conn.prepareStatement(sql);
                pre.setString(1, Com_autonumber.getText().trim());
                pre.setString(2, Com_Name.getText().trim());
                pre.setString(3, Com_Branch_Name.getText().trim());
                pre.setString(4, Com_Branch_No.getText().trim());
                pre.setString(5, Com_TaxID.getText().trim());
                pre.setString(6, Com_Address.getText().trim());
                pre.setString(7, status);
                if (pre.executeUpdate() != -1) {
                    JOptionPane.showMessageDialog(this, "Save Success ", "Save", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                while (rs.next()) {
                    Last_row_AutoNumber = rs.getString("com_autonumber");
                    if (Last_row_AutoNumber.equals(Com_autonumber.getText().trim())) {
                        Last_row_AutoNumber = rs.getString("col1");
                        int isint = Integer.parseInt(Last_row_AutoNumber) + 1;
                        if (isint <= 9) {
                            Com_autonumber.setText("C" + "00" + isint);
                        } else if (isint > 9 && isint <= 99) {
                            Com_autonumber.setText("C" + "0" + isint);
                        } else if (isint > 99 && isint <= 999) {
                            Com_autonumber.setText("C" + "" + isint);
                        } else if (isint >= 1000) {
                            Com_autonumber.setText("C" + isint);
                        }
                    }
                    sql = "insert into company_customer(Com_Autonumber,Com_Name,Com_Branchname,Com_Branchnumber,Com_Taxid,Com_Address,Status) "
                            + " values(?,?,?,?,?,?,?)";
                    pre = conn.prepareStatement(sql);
                    pre.setString(1, Com_autonumber.getText().trim());
                    pre.setString(2, Com_Name.getText().trim());
                    pre.setString(3, Com_Branch_Name.getText().trim());
                    pre.setString(4, Com_Branch_No.getText().trim());
                    pre.setString(5, Com_TaxID.getText().trim());
                    pre.setString(6, Com_Address.getText().trim());
                    pre.setString(7, status);
                    if (pre.executeUpdate() != -1) {
                        JOptionPane.showMessageDialog(this, "Save Success ", "Save", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (Com_jTable.getRowCount() > 0) {
            int index = Com_jTable.getRowCount() - 1;
            Com_Model.setValueAt(Com_Number.getText(), index, 0);
            Com_Model.setValueAt(Com_autonumber.getText().trim(), index, 1);
            Com_Model.setValueAt(Com_Name.getText().trim(), index, 2);
            Com_Model.setValueAt(Com_Branch_Name.getText().trim(), index, 3);
            Com_Model.setValueAt(Com_Branch_No.getText().trim(), index, 4);
            Com_Model.setValueAt(Com_TaxID.getText().trim(), index, 5);
            Com_Model.setValueAt(Com_Address.getText().trim(), index, 6);
            Com_Model.setValueAt(status, index, 7);

        } else {
            refresh();
        }
        clear();


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnNew.setEnabled(true);
        try {
            String status;
            if (jCheckBox1.isSelected()) {
                status = "Active";
            } else {
                status = "InActive";
            }
            if (Com_Number.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "save Fail", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                conn = db.getConnection();
                sql = "update company_customer "
                        + " set Com_Autonumber='" + Com_autonumber.getText().trim() + "' "
                        + ",Com_Name='" + Com_Name.getText().trim() + "' "
                        + ",Com_Branchname='" + Com_Branch_Name.getText().trim() + "' "
                        + ",Com_Branchnumber='" + Com_Branch_No.getText().trim() + "' "
                        + ",Com_Taxid='" + Com_TaxID.getText().trim() + "' "
                        + ",Com_Address='" + Com_Address.getText().trim() + "' "
                        + ",Status='" + status + "' "
                        + " where Number = " + Com_Number.getText();
                pre = conn.prepareStatement(sql);
                if (pre.executeUpdate() != -1) {
                    JOptionPane.showMessageDialog(this, "Edit  success", "Save", JOptionPane.INFORMATION_MESSAGE);
                }
                int index = Com_jTable.getSelectedRow();
                Com_Model.setValueAt(Com_Number.getText(), index, 0);
                Com_Model.setValueAt(Com_autonumber.getText(), index, 1);
                Com_Model.setValueAt(Com_Name.getText().trim(), index, 2);
                Com_Model.setValueAt(Com_Branch_Name.getText().trim(), index, 3);
                Com_Model.setValueAt(Com_Branch_No.getText().trim(), index, 4);
                Com_Model.setValueAt(Com_TaxID.getText().trim(), index, 5);
                Com_Model.setValueAt(Com_Address.getText().trim(), index, 6);
                Com_Model.setValueAt(status, index, 7);
                clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnNew.setEnabled(true);
        try {
            if (Com_Number.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Delete Fail", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (JOptionPane.showConfirmDialog(this, "Do you want to delete the record?", "Comfirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    int[] rowselect = Com_jTable.getSelectedRows();
                    int rowlength = rowselect.length;
                    for (int i = rowlength - 1; i >= 0; i--) {
                        Com_Model.removeRow(rowselect[i]);
                        conn = db.getConnection();
                        sql = "delete from company_customer where Number=" + Com_Number.getText();
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

    private void Com_Branch_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Com_Branch_NameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Com_Branch_NameKeyTyped

    private void cbo_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_searchActionPerformed
        // TODO add your handling code here:
        Com_Search.setText("%");
    }//GEN-LAST:event_cbo_searchActionPerformed

    private void Com_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Com_jTableMouseClicked
        // TODO add your handling code here:
        btnSave.setEnabled(false);
        btnNew.setEnabled(false);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        int index = Com_jTable.getSelectedRow();
        Com_Number.setText(Com_Model.getValueAt(index, 0).toString());
        Com_autonumber.setText(Com_Model.getValueAt(index, 1).toString());
        Com_Name.setText(Com_Model.getValueAt(index, 2).toString());
        Com_Branch_Name.setText(Com_Model.getValueAt(index, 3).toString());
        Com_Branch_No.setText(Com_Model.getValueAt(index, 4).toString());
        Com_TaxID.setText(Com_Model.getValueAt(index, 5).toString());
        Com_Address.setText(Com_Model.getValueAt(index, 6).toString());
        String temp = (Com_Model.getValueAt(index, 7).toString());
        if (temp.equals("Active")) {
            jCheckBox1.setSelected(true);
        } else if (temp.equals("InActive")) {
            jCheckBox1.setSelected(false);
        }
    }//GEN-LAST:event_Com_jTableMouseClicked

    private void Com_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Com_NameKeyPressed
        // TODO add your handling code here:
        if (Com_Number.getText().trim().equals("") && (!(btnSave.isEnabled()))) {
            btnSave.setEnabled(true);
        }
    }//GEN-LAST:event_Com_NameKeyPressed

    private void Com_Branch_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Com_Branch_NameKeyPressed
        // TODO add your handling code here:
        if (Com_Number.getText().trim().equals("") && (!(btnSave.isEnabled()))) {
            btnSave.setEnabled(true);
        }
    }//GEN-LAST:event_Com_Branch_NameKeyPressed

    private void Com_Branch_NoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Com_Branch_NoKeyPressed
        // TODO add your handling code here:
        if (Com_Number.getText().trim().equals("") && (!(btnSave.isEnabled()))) {
            btnSave.setEnabled(true);
        }

    }//GEN-LAST:event_Com_Branch_NoKeyPressed

    private void Com_TaxIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Com_TaxIDKeyPressed
        // TODO add your handling code here:
        if (Com_Number.getText().trim().equals("") && (!(btnSave.isEnabled()))) {
            btnSave.setEnabled(true);
        }
    }//GEN-LAST:event_Com_TaxIDKeyPressed

    private void Com_NumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Com_NumberMouseClicked
        // TODO add your handling code here:
        if (evt.getModifiers() == InputEvent.BUTTON3_MASK) {
            btnDelete.setVisible(true);
            btnDelete.setEnabled(false);
        } else if (evt.getModifiers() == InputEvent.BUTTON1_MASK) {
            btnDelete.setVisible(false);
        }
    }//GEN-LAST:event_Com_NumberMouseClicked

    private void Com_Branch_NoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Com_Branch_NoKeyTyped
        // TODO add your handling code here:
        if (!(Character.isDigit(evt.getKeyChar()))) {
            evt.consume();
        }
    }//GEN-LAST:event_Com_Branch_NoKeyTyped
    protected void refresh() {
        try {
            String[] colname = {"No.",
                "Company ID",
                "Compana Name",
                "Branch Name",
                "Branch No.",
                "TAX ID",
                "Address",
                "Status"};
            Com_Model = new DefaultTableModel(colname, 0);
            conn = db.getConnection();
            sql = "select * from company_customer ORDER BY Number ASC";
            rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String a1 = rs.getString("Number");
                String a2 = rs.getString("Com_Autonumber");
                String a3 = rs.getString("Com_Name");
                String a4 = rs.getString("Com_Branchname");
                String a5 = rs.getString("Com_Branchnumber");
                String a6 = rs.getString("Com_Taxid");
                String a7 = rs.getString("Com_Address");
                String a8 = rs.getString("Status");
                String[] row = {a1, a2, a3, a4, a5, a6, a7, a8};
                Com_Model.addRow(row);
                Com_jTable.setModel(Com_Model);
                setTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void clear() {
        Com_Number.setText("");
        Com_autonumber.setText("");
        Com_Name.setText("");
        Com_Branch_Name.setText("");
        Com_Branch_No.setText("");
        Com_TaxID.setText("");
        Com_Address.setText("");
        jCheckBox1.setSelected(true);
    }

    protected void clearTable() {
        String[] colname = {"No.",
            "Company ID",
            "Compana Name",
            "Branch Name",
            "Branch No.",
            "TAX ID",
            "Address",
            "Status"
        };
        Com_Model = new DefaultTableModel(colname, 0);
        Com_jTable.setModel(Com_Model);
        setTable();
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
        Com_jTable.getColumnModel().getColumn(7).setCellRenderer(centerCellRenderer);


        Com_jTable.getColumnModel().getColumn(0).setPreferredWidth(40);//Number
        Com_jTable.getColumnModel().getColumn(1).setPreferredWidth(120);//Com_Autonumber
        Com_jTable.getColumnModel().getColumn(2).setPreferredWidth(200);//Com_Name
        Com_jTable.getColumnModel().getColumn(3).setPreferredWidth(120);//Com_Branchname
        Com_jTable.getColumnModel().getColumn(4).setPreferredWidth(100);//Com_Branchnumber
        Com_jTable.getColumnModel().getColumn(5).setPreferredWidth(140);//Com_Taxid
        Com_jTable.getColumnModel().getColumn(6).setPreferredWidth(500);//Com_Address
        Com_jTable.getColumnModel().getColumn(7).setPreferredWidth(100);//Status

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Com_Address;
    private javax.swing.JTextField Com_Branch_Name;
    private javax.swing.JTextField Com_Branch_No;
    private javax.swing.JTextField Com_Name;
    private javax.swing.JTextField Com_Number;
    private javax.swing.JTextField Com_Search;
    private javax.swing.JTextField Com_TaxID;
    private javax.swing.JTextField Com_autonumber;
    private javax.swing.JTable Com_jTable;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
