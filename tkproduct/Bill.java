package tkproduct;

import java.awt.event.InputEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Bill extends javax.swing.JInternalFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pre;
    String sql, Last_row_AutoNumber;
    DefaultTableModel hea_Model, det_Model;
    DefaultTableCellRenderer renderer, centerCellRenderer;
    SimpleDateFormat df, df1;
    Date yearnow = new Date();
    Double double1;
    String sumWord;
    //----------------------------------------------------------

    public Bill() {
        initComponents();
        hea_Model = (DefaultTableModel) hea_jTable.getModel();
        det_Model = (DefaultTableModel) det_jTable.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Detail = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        hea_btnNew = new javax.swing.JButton();
        hea_btnEdit = new javax.swing.JButton();
        hea_btnDelete = new javax.swing.JButton();
        hea_btnSave = new javax.swing.JButton();
        hea_btnClear = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hea_jTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        hea_cbo_term = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hea_CompanyID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        hea_CompanyName = new javax.swing.JTextField();
        hea_Number = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hea_Invoice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        hea_PONO = new javax.swing.JTextField();
        hea_btnComplete = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        hea_DocumentStatus = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        hea_Description = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        seach1 = new javax.swing.JTextField();
        cbo_search = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        det_btnNew1 = new javax.swing.JButton();
        det_btnEdit = new javax.swing.JButton();
        det_btnDelete = new javax.swing.JButton();
        det_btnSave = new javax.swing.JButton();
        det_btnClear = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        det_jTable = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Pro_name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Pro_ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Pro_UnitPrice = new javax.swing.JTextField();
        Pro_Invoice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Pro_Spi_Quantity = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        Pro_UPB = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Pro_Number = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Bill");
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
                formInternalFrameIconified(evt);
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        Detail.setPreferredSize(new java.awt.Dimension(800, 778));
        Detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetailMouseClicked(evt);
            }
        });
        Detail.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DetailMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DetailMouseMoved(evt);
            }
        });
        Detail.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DetailAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        hea_btnNew.setText("New");
        hea_btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hea_btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(hea_btnNew);

        hea_btnEdit.setText("Edit");
        hea_btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hea_btnEditMouseClicked(evt);
            }
        });
        hea_btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hea_btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(hea_btnEdit);

        hea_btnDelete.setText("Delete");
        hea_btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hea_btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(hea_btnDelete);

        hea_btnSave.setText("Save");
        hea_btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hea_btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(hea_btnSave);

        hea_btnClear.setText("Clear");
        hea_btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hea_btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(hea_btnClear);

        jButton5.setText("Exit");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        hea_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        hea_jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        hea_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hea_jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hea_jTable);

        hea_cbo_term.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "7", "15", "30", "60", "120" }));

        jLabel2.setText("Company Name :");

        jLabel6.setText("Term :");

        jLabel7.setText("PO No. :");

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        hea_CompanyName.setEditable(false);

        hea_Number.setEditable(false);
        hea_Number.setEnabled(false);

        jLabel3.setText("Invoice No. :");

        hea_Invoice.setEditable(false);
        hea_Invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hea_InvoiceMouseClicked(evt);
            }
        });
        hea_Invoice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hea_InvoiceFocusLost(evt);
            }
        });

        jLabel14.setText("Company ID :");

        jLabel1.setText("Number :");

        hea_PONO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hea_PONOActionPerformed(evt);
            }
        });

        hea_btnComplete.setText("Complete");
        hea_btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hea_btnCompleteActionPerformed(evt);
            }
        });

        jLabel15.setText("Document Status :");

        hea_DocumentStatus.setEditable(false);
        hea_DocumentStatus.setEnabled(false);

        jLabel16.setText("Description");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hea_btnComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(hea_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hea_CompanyID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(hea_CompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hea_DocumentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hea_Invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hea_cbo_term, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hea_PONO, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(hea_Description, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hea_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hea_CompanyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(hea_Invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(hea_PONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(hea_Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addComponent(hea_CompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(hea_cbo_term, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(hea_DocumentStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hea_btnComplete))
                .addGap(13, 13, 13))
        );

        cbo_search.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Invoice No.", "PO No.", "Company Name", "Company ID", "Term", "Date", "Description" }));
        cbo_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_searchActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbo_search, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(seach1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton3)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seach1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(cbo_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addContainerGap())
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selected Report", "------------------------------", "Bill Report", "Summary Report" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );

        Detail.addTab("Header", jPanel4);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        det_btnNew1.setText("New");
        det_btnNew1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                det_btnNew1ActionPerformed(evt);
            }
        });
        jPanel8.add(det_btnNew1);

        det_btnEdit.setText("Edit");
        det_btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                det_btnEditActionPerformed(evt);
            }
        });
        jPanel8.add(det_btnEdit);

        det_btnDelete.setText("Delete");
        det_btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                det_btnDeleteActionPerformed(evt);
            }
        });
        jPanel8.add(det_btnDelete);

        det_btnSave.setText("Save");
        det_btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                det_btnSaveActionPerformed(evt);
            }
        });
        jPanel8.add(det_btnSave);

        det_btnClear.setText("Clear");
        det_btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                det_btnClearActionPerformed(evt);
            }
        });
        jPanel8.add(det_btnClear);

        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        det_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        det_jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        det_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                det_jTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(det_jTable);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Invoice No. :");

        jLabel10.setText("THB");

        jLabel11.setText("Quantity :");

        Pro_ID.setEditable(false);
        Pro_ID.setEnabled(false);

        jLabel4.setText("Product ID :");

        Pro_UnitPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Pro_UnitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pro_UnitPriceKeyTyped(evt);
            }
        });

        Pro_Invoice.setEditable(false);
        Pro_Invoice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pro_Invoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pro_InvoiceMouseClicked(evt);
            }
        });
        Pro_Invoice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pro_InvoiceKeyTyped(evt);
            }
        });

        jLabel9.setText("Price per Bag :");

        jLabel5.setText("Product Name :");

        jLabel12.setText("Unit per Bag :  ");

        Pro_UPB.setEditable(false);
        Pro_UPB.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Pro_UPB.setEnabled(false);

        jLabel13.setText("Number :");

        Pro_Number.setEditable(false);
        Pro_Number.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Pro_Invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Pro_Spi_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                            .addComponent(Pro_UnitPrice)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10))
                        .addComponent(Pro_UPB))
                    .addComponent(Pro_name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(Pro_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pro_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(Pro_Invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Pro_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1)
                    .addComponent(jLabel5)
                    .addComponent(Pro_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Pro_Spi_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(Pro_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Pro_UnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Pro_UPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Detail.addTab("Detail", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Detail, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Detail, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-979)/2, (screenSize.height-768)/2, 979, 768);
    }// </editor-fold>//GEN-END:initComponents

    protected void hea_clear() {
        hea_Number.setText("");
        hea_Invoice.setText("");
        hea_CompanyName.setText("");
        hea_PONO.setText("");
        hea_CompanyID.setText("");
        hea_cbo_term.setSelectedIndex(0);
        hea_DocumentStatus.setText("Drafted");
        hea_Description.setText("");
        Pro_name.setText("");
        hea_btnComplete.setEnabled(false);
    }
    private void hea_btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hea_btnNewActionPerformed
        // TODO add your handling code here:
        hea_btnSave.setEnabled(true);
        hea_btnNew.setEnabled(false);

        hea_clear();
        hea_PONO.setEnabled(true);
        hea_CompanyName.setEnabled(true);
        jButton2.setEnabled(true);
//        hea_btnComplete.enable(true);
        hea_cbo_term.setEnabled(true);
        df1 = new SimpleDateFormat("d MMM yy", Locale.ENGLISH);
        String datenow = df1.format(yearnow);
        try {
            System.out.println(datenow);
            df = new SimpleDateFormat("yyyy");
            String year = df.format(yearnow);
            conn = db.getConnection();
            sql = "select \n"
                    + "substring(substring_index(invoice_id,'/',1),5,length(substring_index(invoice_id,'/',1)))as col1, "
                    + "substring_index(invoice_id,'/',-1)as years, "
                    + "b.* "
                    + "from bill_head b "
                    + "having years =" + year + " "
                    + "order by col1 desc limit 1";
            rs = conn.createStatement().executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                hea_Invoice.setText("PFT-" + "001" + "/" + year);
            } else {
                while (rs.next()) {
                    Last_row_AutoNumber = rs.getString("col1");
                }
                int isint = Integer.parseInt(Last_row_AutoNumber) + 1;
                if (isint <= 9) {
                    hea_Invoice.setText("PFT-" + "00" + isint + "/" + year);
                } else if (isint > 9 && isint <= 99) {
                    hea_Invoice.setText("PFT-" + "0" + isint + "/" + year);
                } else if (isint > 99 && isint <= 999) {
                    hea_Invoice.setText("PFT-" + "" + isint + "/" + year);
                } else if (isint >= 1000) {
                    hea_Invoice.setText("PFT-" + isint + "/" + year);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            int Number1;
            conn = db.getConnection();
            sql = "SELECT * FROM bill_head ORDER BY Number DESC LIMIT 1";
            rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                Number1 = rs.getInt("Number");
                hea_Model.insertRow(hea_Model.getRowCount(), new Object[]{
                            Number1 + 1,
                            hea_Invoice.getText(),
                            hea_PONO.getText().trim(),
                            hea_CompanyID.getText().trim(),
                            hea_CompanyName.getText().trim(),
                            hea_cbo_term.getSelectedItem(),
                            datenow,
                            hea_DocumentStatus.getText().trim()
                        });

                hea_Number.setText("" + (Number1 + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_hea_btnNewActionPerformed

    private void hea_btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hea_btnEditActionPerformed
        // TODO add your handling code here:
        hea_btnEdit.setEnabled(false);
        hea_btnDelete.setEnabled(false);
        hea_btnNew.setEnabled(true);
        System.out.println("1");
        df1 = new SimpleDateFormat("d MMM yy", Locale.ENGLISH);
        String datenow = df1.format(yearnow);
        System.out.println(datenow);
        try {
            System.out.println("2");
            if (hea_Number.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "save Fail", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                conn = db.getConnection();
                int index = hea_jTable.getSelectedRow();
                String bb = hea_Model.getValueAt(index, 1).toString();
                sql = "update bill_head "
                        + " set Invoice_ID='" + hea_Invoice.getText().trim() + "' "
                        + ",PO_No='" + hea_PONO.getText().trim() + "' "
                        + ",Com_ID='" + hea_CompanyID.getText().trim() + "' "
                        + ",UpdateDate='" + datenow + "' "
                        + ",Term='" + hea_cbo_term.getSelectedItem() + "' "
                        + ",Document_Status='" + hea_DocumentStatus.getText().trim() + "' "
                        + ",Description='" + hea_Description.getText().trim() + "' "
                        + " where Number = " + hea_Number.getText();
                pre = conn.prepareStatement(sql);
                if (pre.executeUpdate() != -1) {
//                    JOptionPane.showMessageDialog(this, "Edit  success", "Save", JOptionPane.INFORMATION_MESSAGE);
                    //------------------------------------------------------------------------------------------------------------------
                    sql = "UPDATE bill_detail "
                            + "set pro_invoice ='" + hea_Invoice.getText().trim() + "' "
                            + "WHERE pro_invoice ='" + bb + "'";
                    pre = conn.prepareStatement(sql);
                    if (pre.executeUpdate() != -1) {
                        JOptionPane.showMessageDialog(this, "Edit success", "Update", JOptionPane.INFORMATION_MESSAGE);
                    }
                    //------------------------------------------------------------------------------------------------------------------
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("3");
        int index = hea_jTable.getSelectedRow();
        hea_Model.setValueAt(hea_Number.getText(), index, 0);
        hea_Model.setValueAt(hea_Invoice.getText(), index, 1);
        hea_Model.setValueAt(hea_PONO.getText().trim(), index, 2);
        hea_Model.setValueAt(hea_CompanyID.getText().trim(), index, 3);
        hea_Model.setValueAt(hea_CompanyName.getText().trim(), index, 4);
        hea_Model.setValueAt(hea_cbo_term.getSelectedItem(), index, 5);
        hea_Model.setValueAt(datenow, index, 6);
        hea_Model.setValueAt(hea_DocumentStatus.getText().trim(), index, 7);
        hea_Model.setValueAt(hea_Description.getText().trim(), index, 8);
//        hea_clear();
    }//GEN-LAST:event_hea_btnEditActionPerformed

    private void hea_btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hea_btnDeleteActionPerformed
        // TODO add your handling code here:
        hea_btnEdit.setEnabled(false);
        hea_btnDelete.setEnabled(false);
        hea_btnNew.setEnabled(true);
        try {
            if (hea_Number.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Delete Fail", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (JOptionPane.showConfirmDialog(this, "Do you want to delete the record?", "Comfirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    int[] rowselect = hea_jTable.getSelectedRows();
                    int rowlength = rowselect.length;
                    for (int i = rowlength - 1; i >= 0; i--) {
                        hea_Model.removeRow(rowselect[i]);
                        conn = db.getConnection();
                        sql = "delete from bill_head where Number=" + hea_Number.getText();
                        pre = conn.prepareStatement(sql);
                        conn.createStatement().executeUpdate(sql);
                        if (pre.executeUpdate() != -1) {
                            JOptionPane.showMessageDialog(this, "Delete Success", "Delete", JOptionPane.OK_OPTION);
                            sql = "delete from bill_detail where Pro_invoice ='" + hea_Invoice.getText() + "' ";
                            pre = conn.prepareStatement(sql);
                            conn.createStatement().executeUpdate(sql);
                            if (pre.executeUpdate() != -1) {
                                hea_clear();
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_hea_btnDeleteActionPerformed

    private void hea_btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hea_btnSaveActionPerformed
        // TODO add your handling code here:
        if (hea_CompanyName.getText().equals("") || hea_PONO.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out this form", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            hea_btnNew.setEnabled(true);
            hea_btnSave.setEnabled(false);
            det_btnNew1.setEnabled(true);
            jButton1.setEnabled(true);
            df1 = new SimpleDateFormat("d MMM yy", Locale.ENGLISH);
            String datenow = df1.format(yearnow);
            try {
                conn = db.getConnection();
                df = new SimpleDateFormat("yyyy");
                String year = df.format(yearnow);
                sql = "select \n"
                        + "substring(substring_index(invoice_id,'/',1),5,length(substring_index(invoice_id,'/',1)))as col1, "
                        + "substring_index(invoice_id,'/',-1)as years, "
                        + "b.* "
                        + "from bill_head b "
                        + "having years =" + year + " "
                        + "order by col1 desc limit 1";
                rs = conn.createStatement().executeQuery(sql);
                if (!rs.isBeforeFirst()) {
                    sql = "insert into bill_head(Invoice_ID,PO_No,Com_ID,UpdateDate,Term,Document_Status,Description) "
                            + " values(?,?,?,?,?,?,?)";
                    pre = conn.prepareStatement(sql);
                    pre.setString(1, hea_Invoice.getText().trim());
                    pre.setString(2, hea_PONO.getText().trim());
                    pre.setString(3, hea_CompanyID.getText().trim());
                    pre.setString(4, datenow);
                    pre.setString(5, hea_cbo_term.getSelectedItem().toString());
                    pre.setString(6, hea_DocumentStatus.getText().trim());
                    pre.setString(7, hea_Description.getText().trim());

                    if (pre.executeUpdate() != -1) {
                        JOptionPane.showMessageDialog(this, "Save Success ", "Save", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    while (rs.next()) {
                        Last_row_AutoNumber = rs.getString("Invoice_ID");
                        if (Last_row_AutoNumber.equals(hea_Invoice.getText().trim())) {
                            Last_row_AutoNumber = rs.getString("col1");
                            int isint = Integer.parseInt(Last_row_AutoNumber) + 1;
                            if (isint <= 9) {
                                hea_Invoice.setText("PFT" + "00" + isint + "/" + year);
                            } else if (isint > 9 && isint <= 99) {
                                hea_Invoice.setText("PFT" + "0" + isint + "/" + year);
                            } else if (isint > 99 && isint <= 999) {
                                hea_Invoice.setText("PFT" + "" + isint + "/" + year);
                            } else if (isint >= 1000) {
                                hea_Invoice.setText("PFT" + isint + "/" + year);
                            }
                        }
                        sql = "insert into bill_head(Invoice_ID,PO_No,Com_ID,UpdateDate,Term,Document_Status,Description) "
                                + " values(?,?,?,?,?,?,?)";
                        pre = conn.prepareStatement(sql);
                        pre.setString(1, hea_Invoice.getText().trim());
                        pre.setString(2, hea_PONO.getText().trim());
                        pre.setString(3, hea_CompanyID.getText().trim());
                        pre.setString(4, datenow);
                        pre.setString(5, hea_cbo_term.getSelectedItem().toString());
                        pre.setString(6, hea_DocumentStatus.getText().trim());
                        pre.setString(7, hea_Description.getText().trim());
                        if (pre.executeUpdate() != -1) {
                            JOptionPane.showMessageDialog(this, "Save Success ", "Save", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (hea_jTable.getRowCount() > 0) {
                int index = hea_jTable.getRowCount() - 1;
                hea_Model.setValueAt(hea_Number.getText(), index, 0);
                hea_Model.setValueAt(hea_Invoice.getText().trim(), index, 1);
                hea_Model.setValueAt(hea_PONO.getText().trim(), index, 2);
                hea_Model.setValueAt(hea_CompanyID.getText().trim(), index, 3);
                hea_Model.setValueAt(hea_CompanyName.getText().trim(), index, 4);
                hea_Model.setValueAt(hea_cbo_term.getSelectedItem().toString(), index, 5);
                hea_Model.setValueAt(datenow, index, 6);
                hea_Model.setValueAt(hea_DocumentStatus.getText().trim(), index, 7);
                hea_Model.setValueAt(hea_Description.getText().trim(), index, 8);
            } else {
                hea_refresh();
            }
//            hea_clear();
        }
    }//GEN-LAST:event_hea_btnSaveActionPerformed
    protected void hea_refresh() {
        try {
            String[] colname = {"No.",
                "Invoice No.",
                "PO No.",
                "Company ID",
                "Company Name",
                "Term",
                "Date",
                "Document Status", "Description"};
            hea_Model = new DefaultTableModel(colname, 0);
            conn = db.getConnection();
            sql = "select h.*,c.* \n"
                    + "from bill_head h \n"
                    + "inner join company_customer c on h.com_id=c.Com_Autonumber\n"
                    + "ORDER BY h.Number ASC";
            rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String a1 = rs.getString("h.Number");
                String a2 = rs.getString("h.Invoice_ID");
                String a3 = rs.getString("h.PO_No");
                String a4 = rs.getString("h.Com_ID");
                String a5 = rs.getString("c.Com_Name");
                String a6 = rs.getString("h.Term");
                String a7 = rs.getString("h.UpdateDate");
                String a8 = rs.getString("h.Document_Status");
                String a9 = rs.getString("h.Description");
                String[] row = {a1, a2, a3, a4, a5, a6, a7, a8, a9};
                hea_Model.addRow(row);
                hea_jTable.setModel(hea_Model);
                hea_setTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void hea_btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hea_btnClearActionPerformed
        // TODO add your handling code here:
        hea_refresh();
        hea_clear();

        hea_btnNew.setEnabled(true);
        hea_btnSave.setEnabled(false);
        hea_btnEdit.setEnabled(false);
        hea_btnDelete.setEnabled(false);


    }//GEN-LAST:event_hea_btnClearActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    protected void opened() {
        try {
            String[] colname = {"No.",
                "Invoice No.",
                "PO No.",
                "Company ID",
                "Company Name",
                "Term",
                "Date",
                "Document Status", "Description"};
            hea_Model = new DefaultTableModel(colname, 0);
            conn = db.getConnection();
            sql = "select h.*,c.* \n"
                    + "from bill_head h \n"
                    + "inner join company_customer c on h.com_id=c.Com_Autonumber\n"
                    + "ORDER BY h.Number desc limit 1";
            rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String a1 = rs.getString("h.Number");
                String a2 = rs.getString("h.Invoice_ID");
                String a3 = rs.getString("h.PO_No");
                String a4 = rs.getString("h.Com_ID");
                String a5 = rs.getString("c.Com_Name");
                String a6 = rs.getString("h.Term");
                String a7 = rs.getString("h.UpdateDate");
                String a8 = rs.getString("h.Document_Status");
                String a9 = rs.getString("h.Description");
                String[] row = {a1, a2, a3, a4, a5, a6, a7, a8, a9};
                hea_Model.addRow(row);
                hea_jTable.setModel(hea_Model);
                hea_setTable();
                hea_Number.setText(a1);
                hea_Invoice.setText(a2);
                hea_PONO.setText(a3);
                hea_CompanyID.setText(a4);
                hea_CompanyName.setText(a5);
                hea_DocumentStatus.setText(a8);
                hea_Description.setText(a9);
                int i = 0;
                do {
                    if (hea_cbo_term.getItemAt(i).toString().equals(a6)) {
                        hea_cbo_term.setSelectedIndex(i);
                        break;
                    } else {
                        i++;
                    }
                } while (true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        jLabel1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        hea_Number.setVisible(false);
        hea_CompanyID.setVisible(false);
        Pro_ID.setVisible(false);
        Pro_Number.setVisible(false);


        opened();
        hea_refresh();
        hea_btnSave.setEnabled(false);
        hea_btnEdit.setEnabled(false);
        hea_btnDelete.setEnabled(false);
        hea_btnComplete.setEnabled(false);

        det_btnSave.setEnabled(false);
        det_btnEdit.setEnabled(false);
        det_btnDelete.setEnabled(false);


    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Dialog_Company_select w = new Dialog_Company_select(null, true);
        w.setVisible(true);
        hea_CompanyID.setText(w.Temp);
        hea_CompanyName.setText(w.Temp2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void hea_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hea_jTableMouseClicked
        // TODO add your handling code here:
        hea_btnSave.setEnabled(false);
        hea_btnNew.setEnabled(false);
        hea_btnEdit.setEnabled(true);
        hea_btnDelete.setEnabled(true);
        hea_btnComplete.setEnabled(true);

        int index = hea_jTable.getSelectedRow();
        hea_Number.setText(hea_Model.getValueAt(index, 0).toString());
        hea_Invoice.setText(hea_Model.getValueAt(index, 1).toString());
        Pro_Invoice.setText(hea_Invoice.getText());
        hea_PONO.setText(hea_Model.getValueAt(index, 2).toString());
        hea_CompanyID.setText(hea_Model.getValueAt(index, 3).toString());
        hea_CompanyName.setText(hea_Model.getValueAt(index, 4).toString());
        hea_Description.setText(hea_Model.getValueAt(index, 8).toString());

        String temp1 = (hea_Model.getValueAt(index, 5).toString());
        int i = 0;
        do {
            if (hea_cbo_term.getItemAt(i).toString().equals(temp1)) {
                hea_cbo_term.setSelectedIndex(i);
                break;
            } else {
                if (i <= hea_cbo_term.getItemCount() - 1) {
                    i++;
                }
            }
        } while (true);
        try {
            hea_DocumentStatus.setText(hea_Model.getValueAt(index, 7).toString());
            sql = "select h.*,d.* from bill_head h inner join bill_detail d on h.invoice_id=d.pro_invoice where h.invoice_id='" + hea_Invoice.getText().trim() + "' ";
            rs = conn.createStatement().executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                hea_btnComplete.setEnabled(false);
            } else {
                if (hea_DocumentStatus.getText().equals("Complete")) {
                    hea_btnComplete.setEnabled(false);
                    hea_btnDelete.setEnabled(false);
//                    hea_btnEdit.setEnabled(false);
                    jButton2.setEnabled(false);
                     hea_PONO.setEnabled(false);
                    hea_PONO.enable(false);
                    hea_CompanyName.enable(false);
                    hea_cbo_term.setEnabled(false);
                    det_btnNew1.setEnabled(false);
                } else if (hea_DocumentStatus.getText().equals("Drafted")) {
                    hea_btnComplete.setEnabled(true);
                    hea_btnDelete.setEnabled(true);
                    hea_btnEdit.setEnabled(true);
                    jButton2.setEnabled(true);
                     hea_PONO.setEnabled(true);
                    hea_PONO.enable(true);
                    hea_CompanyName.enable(true);
                    hea_cbo_term.setEnabled(true);
                    det_btnNew1.setEnabled(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_hea_jTableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        Invoice No., PO No., Company Name, Company ID, Term, Date
        if (cbo_search.getSelectedIndex() == 0) {
            searchPageA("h.Invoice_ID", seach1.getText().trim());
        } else if (cbo_search.getSelectedIndex() == 1) {
            searchPageA("h.PO_No", seach1.getText().trim());
        } else if (cbo_search.getSelectedIndex() == 2) {
            searchPageA("c.Com_Name", seach1.getText().trim());
        } else if (cbo_search.getSelectedIndex() == 3) {
            searchPageA("h.Com_ID", seach1.getText().trim());
        } else if (cbo_search.getSelectedIndex() == 4) {
            searchPageA("h.Term", seach1.getText().trim());
        } else if (cbo_search.getSelectedIndex() == 5) {
            searchPageA("h.UpdateDate", seach1.getText().trim());
        } else if (cbo_search.getSelectedIndex() == 6) {
            searchPageA("h.Description", seach1.getText().trim());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbo_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_searchActionPerformed
        // TODO add your handling code here:
        seach1.setText("");
    }//GEN-LAST:event_cbo_searchActionPerformed
    protected void det_search(String searchkey) {
        try {
            String[] colname = {"No.",
                "Invoice No.",
                "Product ID",
                "Product Name",
                "Quantity",
                "Unit Price",
                "Unit per Bag"
            };
            det_Model = new DefaultTableModel(colname, 0);
            conn = db.getConnection();
            sql = "select d.*,p.* from bill_detail d "
                    + "inner join product p on d.pro_id=p.pro_id "
                    + "inner join bill_head h on d.Pro_invoice=h.Invoice_ID "
                    + "where h.invoice_id  ='" + searchkey + "'"
                    + "ORDER BY d.Number ASC";
            rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String a1 = rs.getString("d.Number");
                String a2 = rs.getString("d.Pro_invoice");
                String a3 = rs.getString("d.Pro_ID");
                String a4 = rs.getString("p.Pro_Name");
                String a5 = rs.getString("d.Pro_Quantity");
                String a6 = rs.getString("d.Pro_Price");
                String a7 = rs.getString("p.Pro_Upb");
                String[] row = {a1, a2, a3, a4, a5, a6, a7};
                det_Model.addRow(row);
                det_jTable.setModel(det_Model);
                setTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void det_btnNew1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_det_btnNew1ActionPerformed
        // TODO add your handling code here:
        det_btnSave.setEnabled(true);
        det_btnNew1.setEnabled(false);
        Pro_clear();
        Pro_Invoice.setText(hea_Invoice.getText().trim());
        det_search(Pro_Invoice.getText().trim());



    }//GEN-LAST:event_det_btnNew1ActionPerformed

    private void det_btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_det_btnEditActionPerformed
        // TODO add your handling code here:
        det_btnEdit.setEnabled(false);
        det_btnDelete.setEnabled(false);
        det_btnNew1.setEnabled(true);
        try {
            if (Pro_Number.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "save Fail", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                conn = db.getConnection();
                sql = "update bill_detail "
                        + " set Pro_invoice='" + Pro_Invoice.getText().trim() + "' "
                        + ",Pro_ID='" + Pro_ID.getText().trim() + "' "
                        + ",Pro_Quantity='" + Pro_Spi_Quantity.getValue().toString() + "' "
                        + ",Pro_Price='" + Pro_UnitPrice.getText().trim() + "' "
                        + " where Number = " + Pro_Number.getText();
                pre = conn.prepareStatement(sql);
                if (pre.executeUpdate() != -1) {
                    JOptionPane.showMessageDialog(this, "Edit  success", "Save", JOptionPane.INFORMATION_MESSAGE);
                    det_refresh();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_det_btnEditActionPerformed

    private void det_btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_det_btnDeleteActionPerformed
        // TODO add your handling code here:
        det_btnEdit.setEnabled(false);
        det_btnDelete.setEnabled(false);
        det_btnNew1.setEnabled(true);
        try {
            if (Pro_Number.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Delete Fail", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int[] rowselect = det_jTable.getSelectedRows();
                int rowlength = rowselect.length;
                for (int i = rowlength - 1; i >= 0; i--) {
                    det_Model.removeRow(rowselect[i]);
                    conn = db.getConnection();
                    sql = "delete from bill_detail where Number=" + Pro_Number.getText();
                    pre = conn.prepareStatement(sql);
                    conn.createStatement().executeUpdate(sql);
                    if (pre.executeUpdate() != -1) {
                        JOptionPane.showMessageDialog(this, "Delete Success", "Delete", JOptionPane.OK_OPTION);
                        det_refresh();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_det_btnDeleteActionPerformed
    protected void det_refresh() {
        try {
            String[] colname = {"No.",
                "Invoice No.",
                "Product ID",
                "Product Name",
                "Quantity",
                "Unit Price",
                "Unit per Bag"
            };
            det_Model = new DefaultTableModel(colname, 0);
            conn = db.getConnection();
            sql = "select d.*,p.*,h.* from bill_detail d "
                    + "inner join product p on d.pro_id=p.pro_id "
                    + "inner join bill_head h on d.Pro_invoice=h.Invoice_ID "
                    + "where h.invoice_id  ='" + hea_Invoice.getText().trim() + "'"
                    + "ORDER BY d.Number ASC";
            rs = conn.createStatement().executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                det_jTable.setModel(det_Model);
                setTable();
            } else {
                while (rs.next()) {
                    String a1 = rs.getString("d.Number");
                    String a2 = rs.getString("d.Pro_invoice");
                    String a3 = rs.getString("d.Pro_ID");
                    String a4 = rs.getString("p.Pro_Name");
                    String a5 = rs.getString("d.Pro_Quantity");
                    String a6 = rs.getString("d.Pro_Price");
                    String a7 = rs.getString("p.Pro_Upb");
                    String aaa = rs.getString("h.Document_Status");
                    String[] row = {a1, a2, a3, a4, a5, a6, a7};
                    det_Model.addRow(row);
                    det_jTable.setModel(det_Model);
                    setTable();
                    if (aaa.equals("Complete")) {
                        jButton1.setEnabled(false);
                        Pro_name.setEditable(false);
                        Pro_Spi_Quantity.setEnabled(false);
                        Pro_UnitPrice.setEnabled(false);
                    } else {
                        jButton1.setEnabled(true);
                        Pro_name.setEditable(true);
                        Pro_Spi_Quantity.setEnabled(true);
                        Pro_UnitPrice.setEnabled(true);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void det_btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_det_btnSaveActionPerformed
        // TODO add your handling code here:
        if (Pro_name.getText().equals("") || Pro_UnitPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out this form", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            det_btnNew1.setEnabled(true);
            det_btnSave.setEnabled(false);
            hea_btnComplete.setEnabled(true);
            try {
                conn = db.getConnection();
                sql = "insert into bill_detail(Pro_invoice,Pro_ID,Pro_Quantity,Pro_Price,Document_Status) "
                        + " values(?,?,?,?,?)";
                pre = conn.prepareStatement(sql);
                pre.setString(1, Pro_Invoice.getText().trim());
                pre.setString(2, Pro_ID.getText().trim());
                pre.setString(3, Pro_Spi_Quantity.getValue().toString());
                pre.setString(4, Pro_UnitPrice.getText().trim());
                pre.setString(5, "Drafted");
                if (pre.executeUpdate() != -1) {
                    JOptionPane.showMessageDialog(this, "Save Success ", "Save", JOptionPane.INFORMATION_MESSAGE);
                    det_refresh();
                    Pro_clear();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_det_btnSaveActionPerformed
    protected void Pro_clear() {
        Pro_Number.setText("");
        Pro_name.setText("");
        Pro_Spi_Quantity.setValue(0);
        Pro_UnitPrice.setText("");
        Pro_UPB.setText("");
        Pro_ID.setText("");
    }

    protected void setTable() {
        renderer = (DefaultTableCellRenderer) det_jTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        centerCellRenderer = new DefaultTableCellRenderer();
        centerCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        det_jTable.getColumnModel().getColumn(0).setCellRenderer(centerCellRenderer);
        det_jTable.getColumnModel().getColumn(1).setCellRenderer(centerCellRenderer);
        det_jTable.getColumnModel().getColumn(2).setCellRenderer(centerCellRenderer);
//        det_jTable.getColumnModel().getColumn(3).setCellRenderer(centerCellRenderer);
        det_jTable.getColumnModel().getColumn(4).setCellRenderer(centerCellRenderer);
        det_jTable.getColumnModel().getColumn(5).setCellRenderer(centerCellRenderer);


//width
        det_jTable.getColumnModel().getColumn(0).setPreferredWidth(50);//number
        det_jTable.getColumnModel().getColumn(1).setPreferredWidth(120);//Invoice_No
        det_jTable.getColumnModel().getColumn(2).setPreferredWidth(120);//pro_id
        det_jTable.getColumnModel().getColumn(3).setPreferredWidth(230);//pro_Name
        det_jTable.getColumnModel().getColumn(4).setPreferredWidth(120);//pro_Quantity
        det_jTable.getColumnModel().getColumn(5).setPreferredWidth(200);//pro_UPB

    }
    private void det_btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_det_btnClearActionPerformed
        // TODO add your handling code here:
        det_refresh();
        Pro_clear();

        det_btnNew1.setEnabled(true);
        det_btnSave.setEnabled(false);
        det_btnEdit.setEnabled(false);
        det_btnDelete.setEnabled(false);
    }//GEN-LAST:event_det_btnClearActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Pro_UnitPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pro_UnitPriceKeyTyped
        // TODO add your handling code here:

        if (Character.isLetter(evt.getKeyChar()) && !evt.isAltDown()) {
            evt.consume();            //พิมไม่ได้
        }

    }//GEN-LAST:event_Pro_UnitPriceKeyTyped

    private void DetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!(det_btnSave.isEnabled())) {
            det_btnSave.setEnabled(true);
            det_btnNew1.setEnabled(false);
        }
        DialogProduct q = new DialogProduct(null, true);
        q.setVisible(true);
        Pro_ID.setText(q.Temp_pro_id);
        Pro_name.setText(q.Temp_pro_name);
        Pro_UPB.setText(q.temp_pro_upb);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void det_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_det_jTableMouseClicked
        // TODO add your handling code here:
        det_btnSave.setEnabled(false);
        det_btnNew1.setEnabled(false);
        det_btnEdit.setEnabled(true);
        det_btnDelete.setEnabled(true);

        int index = det_jTable.getSelectedRow();
        Pro_Number.setText(det_Model.getValueAt(index, 0).toString());
        Pro_Invoice.setText(det_Model.getValueAt(index, 1).toString());
        Pro_ID.setText(det_Model.getValueAt(index, 2).toString());
        Pro_name.setText(det_Model.getValueAt(index, 3).toString());
        Pro_Spi_Quantity.setValue(Integer.parseInt(det_Model.getValueAt(index, 4).toString()));
        Pro_UnitPrice.setText(det_Model.getValueAt(index, 5).toString());
        Pro_UPB.setText(det_Model.getValueAt(index, 6).toString());
        try {
            conn = db.getConnection();
            sql = "select * from bill_head h inner join bill_detail d on h.invoice_id=d.pro_invoice where h.invoice_id ='" + Pro_Invoice.getText() + "'";
            rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String status = rs.getString("Document_Status");
                if (status.equals("Complete")) {
                    det_btnEdit.setEnabled(false);
                    det_btnDelete.setEnabled(false);
                    det_btnClear.setEnabled(false);
                    System.out.println("complete");
                } else if (status.equals("Drafted")) {
                    System.out.println("drafted");
                    det_btnEdit.setEnabled(true);
                    det_btnDelete.setEnabled(true);
                    det_btnClear.setEnabled(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_det_jTableMouseClicked

    private void formInternalFrameIconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameIconified

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameActivated

    private void DetailAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_DetailAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailAncestorAdded

    private void DetailMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_DetailMouseDragged

    private void DetailMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailMouseMoved
        // TODO add your handling code here:
        Pro_Invoice.setText(hea_Invoice.getText());
        det_refresh();



    }//GEN-LAST:event_DetailMouseMoved

    private void hea_btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hea_btnCompleteActionPerformed
        // TODO add your handling code here:
        try {
            conn = db.getConnection();
            sql = "select * from bill_detail where Pro_invoice ='" + hea_Invoice.getText().trim() + "'";
            rs = conn.createStatement().executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                JOptionPane.showMessageDialog(null, "Check the information details the document", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                if (hea_Invoice.getText().length() > 0) {
                    if (JOptionPane.showConfirmDialog(this, "Make sure that the document successfully", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                        JOptionPane.showMessageDialog(this, "Success", "Save", JOptionPane.INFORMATION_MESSAGE);
                        hea_btnComplete.setEnabled(false);
                        sql = "update bill_head "
                                + " set Document_Status ='Complete' "
                                + " where Number = " + hea_Number.getText();
                        pre = conn.prepareStatement(sql);
                        if (pre.executeUpdate() != -1) {
//                        JOptionPane.showMessageDialog(this, "Update success", "Update", JOptionPane.INFORMATION_MESSAGE);
                            sql = "update bill_detail set Document_Status ='Complete' where pro_invoice='" + hea_Invoice.getText().trim() + "'";
                            pre = conn.prepareStatement(sql);
                            if (pre.executeUpdate() != -1) {
                                hea_refresh();
                                hea_btnComplete.setEnabled(false);
                                hea_btnDelete.setEnabled(false);
                                hea_btnEdit.setEnabled(false);
                                hea_PONO.setEnabled(false);
                                hea_CompanyName.setEnabled(false);
                                hea_cbo_term.setEnabled(false);
                                jButton2.setEnabled(false);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }//GEN-LAST:event_hea_btnCompleteActionPerformed

    private void hea_PONOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hea_PONOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hea_PONOActionPerformed

    private void Pro_InvoiceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pro_InvoiceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Pro_InvoiceKeyTyped

    private void Pro_InvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pro_InvoiceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Pro_InvoiceMouseClicked

    private void hea_InvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hea_InvoiceMouseClicked
        // TODO add your handling code here:
        if (evt.getModifiers() == InputEvent.BUTTON3_MASK) {
            hea_btnDelete.setEnabled(true);
        } else if (evt.getModifiers() == InputEvent.BUTTON1_MASK) {
            hea_btnDelete.setEnabled(false);
        }
    }//GEN-LAST:event_hea_InvoiceMouseClicked
    public static final String[] units = {"", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
        "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
        "Eighteen", "Nineteen"};
    public static final String[] tens = {
        "", // 0
        "", // 1
        "Twenty", // 2
        "Thirty", // 3
        "Forty", // 4
        "Fifty", // 5
        "Sixty", // 6
        "Seventy", // 7
        "Eighty", // 8
        "Ninety" // 9
    };

    public static String convert(final int n) {
        if (n < 0) {
            return "Minus " + convert(-n);
        }
        if (n < 20) {
            return units[n];
        }
        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }
        if (n < 1000) {
            return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }
        if (n < 100000) {
            return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
        }
        if (n < 10000000) {
            return convert(n / 100000) + " Thousand" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
        }
        return convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000);
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

        if (jComboBox1.getSelectedIndex() == 2) {
            try {
                conn = db.getConnection();
                sql = " select \n"
                        + "p.pro_name\n"
                        + ",cast(Pro_Quantity as unsigned)*cast(Pro_Price as decimal(10,2)) as Amount\n"
                        + ",(select sum(cast(d.Pro_Quantity as unsigned)*cast(d.Pro_Price as decimal(10,2))) from bill_detail d  where d.pro_invoice='" + hea_Invoice.getText().trim() + "' ) as col11\n"
                        + "from bill_head h\n"
                        + "inner join bill_detail d on h.invoice_id=d.pro_invoice\n"
                        + "inner join product p on d.pro_id=p.pro_id\n"
                        + "where h.invoice_id = '" + hea_Invoice.getText().trim() + "'";
                rs = conn.createStatement().executeQuery(sql);
                if (rs.first()) {
                    double1 = Double.parseDouble(rs.getString("col11"));
                }
                int int1 = (int) double1.intValue();//552             
                int int2 = ((int) (double1 * 100)) % 100;//.50
                String temp1 = convert(int1);
                String temp2 = convert(int2);
                String temp3 = " ";
                temp3 = (int2 > 0) ? " AND " : " ";
                System.out.println(temp1 + temp3 + temp2 + " BATHS");
                sumWord = (temp1 + temp3 + temp2 + " BATHS").toUpperCase();
                System.out.println(sumWord);
//        ----------------------------------------------------------------------------------------------------------------------     

                conn = db.getConnection();
                //file report
                String report = "report_bill.jasper";
                //parameter ส่งไปให้กับ Report
                HashMap prmt = new HashMap();
                prmt.put("a1", hea_Invoice.getText().trim());
                prmt.put("a2", sumWord);
                //แสดงตัวอย่างให้เห็นบนหน้าจอ
                JasperPrint p = JasperFillManager.fillReport(report, prmt, conn);

                JasperViewer v = new JasperViewer(p, false);

                v.setVisible(true);

                //กำหนดให้แสดงออกมา

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (jComboBox1.getSelectedIndex() == 3) {
            Dialog_Select_Date q = new Dialog_Select_Date(null, true);
            q.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void hea_btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hea_btnEditMouseClicked
        // TODO add your handling code here:
        if (evt.getModifiers() == InputEvent.BUTTON1_MASK) {
            hea_Invoice.setEditable(false);
        }
    }//GEN-LAST:event_hea_btnEditMouseClicked

    private void hea_InvoiceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hea_InvoiceFocusLost
        // TODO add your handling code here:
        hea_Invoice.setEditable(false);
    }//GEN-LAST:event_hea_InvoiceFocusLost

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        if (evt.getModifiers() == InputEvent.BUTTON3_MASK) {
            hea_Invoice.setEditable(true);
        }
    }//GEN-LAST:event_jButton5MouseClicked
    protected void searchPageA(String column, String searchkey) {
        try {
            String[] colname = {"No.",
                "Invoice No.",
                "PO No.",
                "Company ID",
                "Company Name",
                "Term",
                "Date",
                "Document Status",
                "Description"
            };
            hea_Model = new DefaultTableModel(colname, 0);
            conn = db.getConnection();
            sql = "select h.*,c.* from bill_head h inner join company_customer c on h.com_id=c.Com_Autonumber  "
                    + "where " + column + " like '%" + searchkey + "%' ORDER BY h.Number ASC";
            rs = conn.createStatement().executeQuery(sql);
            if (!rs.isBeforeFirst()) {
                hea_clearTable();
            } else {
                while (rs.next()) {
                    String a1 = rs.getString("h.Number");
                    String a2 = rs.getString("h.Invoice_ID");
                    String a3 = rs.getString("h.PO_No");
                    String a4 = rs.getString("h.Com_ID");
                    String a5 = rs.getString("c.Com_Name");
                    String a6 = rs.getString("h.Term");
                    String a7 = rs.getString("h.UpdateDate");
                    String a8 = rs.getString("h.Document_Status");
                    String a9 = rs.getString("h.Description");
                    String[] row = {a1, a2, a3, a4, a5, a6, a7, a8, a9};
                    hea_Model.addRow(row);
                    hea_jTable.setModel(hea_Model);
                    hea_setTable();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void hea_clearTable() {
        String[] colname = {"No.",
            "Invoice No.",
            "PO No.",
            "Company ID",
            "Company Name",
            "Term",
            "Date", "Document Status"
        };
        hea_Model = new DefaultTableModel(colname, 0);
        hea_jTable.setModel(hea_Model);
        hea_setTable();
    }

    protected void hea_setTable() {
        renderer = (DefaultTableCellRenderer) hea_jTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        centerCellRenderer = new DefaultTableCellRenderer();
        centerCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        hea_jTable.getColumnModel().getColumn(0).setCellRenderer(centerCellRenderer);
        hea_jTable.getColumnModel().getColumn(1).setCellRenderer(centerCellRenderer);
        hea_jTable.getColumnModel().getColumn(2).setCellRenderer(centerCellRenderer);
        hea_jTable.getColumnModel().getColumn(3).setCellRenderer(centerCellRenderer);
        hea_jTable.getColumnModel().getColumn(4).setCellRenderer(centerCellRenderer);
        hea_jTable.getColumnModel().getColumn(5).setCellRenderer(centerCellRenderer);
        hea_jTable.getColumnModel().getColumn(6).setCellRenderer(centerCellRenderer);
        hea_jTable.getColumnModel().getColumn(7).setCellRenderer(centerCellRenderer);
        hea_jTable.getColumnModel().getColumn(8).setCellRenderer(centerCellRenderer);

//width
        hea_jTable.getColumnModel().getColumn(0).setPreferredWidth(50);//number
        hea_jTable.getColumnModel().getColumn(1).setPreferredWidth(120);//Invoice_No
        hea_jTable.getColumnModel().getColumn(2).setPreferredWidth(120);//PO_No
        hea_jTable.getColumnModel().getColumn(3).setPreferredWidth(120);//Company_ID
        hea_jTable.getColumnModel().getColumn(4).setPreferredWidth(200);//Company_Name
        hea_jTable.getColumnModel().getColumn(5).setPreferredWidth(60);//Term
        hea_jTable.getColumnModel().getColumn(6).setPreferredWidth(120);//Date
        hea_jTable.getColumnModel().getColumn(7).setPreferredWidth(120);//Date
        hea_jTable.getColumnModel().getColumn(8).setPreferredWidth(200);//Date


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Detail;
    private javax.swing.JTextField Pro_ID;
    private javax.swing.JTextField Pro_Invoice;
    private javax.swing.JTextField Pro_Number;
    private javax.swing.JSpinner Pro_Spi_Quantity;
    private javax.swing.JTextField Pro_UPB;
    private javax.swing.JTextField Pro_UnitPrice;
    private javax.swing.JTextField Pro_name;
    private javax.swing.JComboBox cbo_search;
    private javax.swing.JButton det_btnClear;
    private javax.swing.JButton det_btnDelete;
    private javax.swing.JButton det_btnEdit;
    private javax.swing.JButton det_btnNew1;
    private javax.swing.JButton det_btnSave;
    private javax.swing.JTable det_jTable;
    private javax.swing.JTextField hea_CompanyID;
    private javax.swing.JTextField hea_CompanyName;
    private javax.swing.JTextField hea_Description;
    private javax.swing.JTextField hea_DocumentStatus;
    private javax.swing.JTextField hea_Invoice;
    private javax.swing.JTextField hea_Number;
    private javax.swing.JTextField hea_PONO;
    private javax.swing.JButton hea_btnClear;
    private javax.swing.JButton hea_btnComplete;
    private javax.swing.JButton hea_btnDelete;
    private javax.swing.JButton hea_btnEdit;
    private javax.swing.JButton hea_btnNew;
    private javax.swing.JButton hea_btnSave;
    private javax.swing.JComboBox hea_cbo_term;
    private javax.swing.JTable hea_jTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField seach1;
    // End of variables declaration//GEN-END:variables
}
