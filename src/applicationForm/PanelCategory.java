package applicationForm;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import connect_database.MysqlConnect;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class PanelCategory extends javax.swing.JPanel {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public PanelCategory() {
        initComponents();
        txtSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ຄົ້ນຫາ");
        txtSearch.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("image_svg/search.svg"));
        
        //ປ່ຽນສີພື້ນຫົວຕາຕະລາງ
        JTableHeader header = jTable1.getTableHeader();
        header.setFont(new Font("Lao_SomVang", Font.PLAIN, 14));
        header.setOpaque(false);
        header.setBackground(new Color(108, 117, 125));
        header.setForeground(new Color(243, 243, 243));

        //ສະແດງຜົນຢູ່ກາງຖັນ
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        //ເສັ້ນຕາຕະລາງ
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.setGridColor(new Color(139, 138, 137));
        
        //ເຊື່ອມຕໍ່ຖານຂໍ້ມູນ
        conn = MysqlConnect.connectDB();
        
        tableUpdate();
        autoID();
        
        //ໃຫ້ປຸ່ມແກ້ໄຂ ແລະ ລົບແກ້ໄຂບໍ່ໄດ້
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    
    //ສ້າງເມັດທອດ Gemerate ລະຫັດ id
    private void autoID() {
        try {
            String sql = "SELECT max(category_id) FROM category";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                int id = Integer.parseInt(rs.getString(1).substring(1, 4));
                id++;
                txtCategory_id.setText("C" + String.format("%03d", id));
            } else {
                txtCategory_id.setText("C001");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //ຂຽນເມັດທອດສະແດງຄ່າໃນຕາຕະລາງ
    private void tableUpdate() {
        try {
            String sql = "SELECT * FROM category ORDER BY category_id DESC";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
           
            DefaultTableModel d = (DefaultTableModel) jTable1.getModel();
            jTable1.setRowHeight(30);
            d.setRowCount(0);
            int num_row = 0;
            while (rs.next()) {
                Vector v = new Vector();
                v.add(++num_row);
                v.add(rs.getString(1));
                v.add(rs.getString(2));
               
                d.addRow(v);
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //ລົບຂໍ້ມູນໃນຟອມ
    private void clearForm(){
        autoID();
        txtCategory_name.setText("");
        btnAdd.setEnabled(true);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        jTable1.clearSelection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCategory_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCategory_name = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        jTable1.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ລຳດັບ", "ລະຫັດ", "ປະເພດສິນຄ້າ"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ຈັດການຂໍ້ມູນປະເພດສິນຄ້າ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lao_SomVang", 0, 16))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jLabel1.setText("ລະຫັດ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        txtCategory_id.setEditable(false);
        txtCategory_id.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jPanel1.add(txtCategory_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 280, -1));

        jLabel2.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jLabel2.setText("ປະເພດ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtCategory_name.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jPanel1.add(txtCategory_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 280, -1));

        btnCancel.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        btnCancel.setText("ຍົກເລິກ");
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 70, -1));

        btnAdd.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        btnAdd.setText("ເພິ່ມ");
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, -1));

        btnEdit.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        btnEdit.setText("ແກ້ໄຂ");
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 70, -1));

        btnDelete.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        btnDelete.setText("ລົບ");
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 70, -1));

        jLabel3.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jLabel3.setText("ຄົ້ນຫາ");

        txtSearch.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCategory_id;
    private javax.swing.JTextField txtCategory_name;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
