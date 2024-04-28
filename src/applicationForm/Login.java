package applicationForm;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import connect_database.MysqlConnect;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.sql.*;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        this.setTitle("ໂປຣແກຣມຂາຍເຄື່ອງຮ້ານ POS"); //ສະແດງຜົນກາງຈໍພາບ
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/home.png")));
        this.setResizable(false); //ບໍ່ໃຫ້ຂະຫຍາຍຟອມ
        
        //PlaceHolder
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ບັນຊີເຂົ້າໃຊ້");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ລະຫັດຜ່ານ");
        //clear button
        txtUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txtPassword.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        //ສະແດງລະຫັດຜ່ານ
        txtPassword.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
        //ໃສ່ຮູບໃນ txtUsername ແລະ txtPassword
        FlatSVGIcon icon1 = new FlatSVGIcon("image_svg/user.svg");
        FlatSVGIcon icon2 = new FlatSVGIcon("image_svg/key.svg");
        txtUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_TRAILING_ICON, icon1);
        txtPassword.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, icon2);
        //ໃສຮູບທີ່ປຸ່ມ ເຂົ້າໃຊ້ລະບົບ ແລະ ຍົກເລີກ
        btnLogin.setIcon(new FlatSVGIcon("image_svg/login.svg"));
        btnCancel.setIcon(new FlatSVGIcon("image_svg/refresh.svg"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jLabel1.setText("ຟອມເຂ້າໃຊ້ລະບົບ");

        txtUsername.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        btnCancel.setText("ຍົກເລິກ");
        btnCancel.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        btnLogin.setText("ເຂົ້າໃຊ້");
        btnLogin.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsername)
                    .addComponent(txtPassword)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnLogin))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(txtUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "ກະລຸນາປ້ອນບັນຊີເຂົ້າໃຊ້", "ຫວ່າງເປົ່າ", JOptionPane.WARNING_MESSAGE);
            txtUsername.requestFocus();
            return;
        } else if (txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "ກະລຸນາປ້ອນລະຫັດຜ່ານ", "ຫວ່າງເປົ່າ", JOptionPane.WARNING_MESSAGE);
            txtPassword.requestFocus();
            return;
        }
        
        try {
            conn = MysqlConnect.connectDB();
            String sql = "SELECT emp_id, CONCAT(emp_name, ' ', emp_lname) AS name, status FROM employee WHERE username=? AND password=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtUsername.getText().trim());
            pst.setString(2, PasswordHashing.doHashing(txtPassword.getText().trim()));
            rs = pst.executeQuery();
            if(rs.next()){
                //Main m = new Main();
                Main m = new Main(rs.getString("emp_id"), rs.getString("name"), rs.getString("status"));
                m.setVisible(true);
                dispose();
            }else {
                JOptionPane.showMessageDialog(rootPane, "ບັນຊີເຂົ້າໃຊ້ ແລະ ລະຫັດບໍ່ຖືກ!", "ຜິດພາດ", JOptionPane.ERROR_MESSAGE);
            }
       
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // ຖ້າກົດ Enter ທີ່ບັນຊີເຂົ້າໃສ່ໃຫ້ cursor ໄປຊີ້ຢູ່ຫ້ອງລະຫັດຜ່ານ
        txtPassword.requestFocus();
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // ຖ້າກົດ  ທີ່ຫ້ອງລະຫັດຜ່ານ ໃຫ້ປຸ່ມເຂົ້າໃຊ້ງານ ຖືກກົດ
        btnLogin.doClick();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        UIManager.put("defaultFont", new Font("Lao_Somvang", Font.PLAIN, 16));
        UIManager.put("OptionPane.messageFont", new Font("Lao_Somvang", Font.PLAIN, 14));
        UIManager.put("OptionPane.okButtonText", "ຕົກລົງ");
        UIManager.put("OptionPane.cancelButtonText", "ຍົກເລີກ");

        UIManager.put("Button.arc", 999);
        UIManager.put("Component.arc", 999);
        UIManager.put("ProgressBar.arc", 999);
        UIManager.put("TextComponent.arc", 999);
        UIManager.put("ScrollBar.thumbArc", 999);
        UIManager.put("ScrollBar.thumbInsets", new Insets(2, 2, 2, 2));
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
