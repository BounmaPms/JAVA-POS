package applicationForm;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main extends javax.swing.JFrame {
    
    String emp_id, name, status;

    public Main() {
        initComponents();
    }
    
    public Main(String i, String n, String s) {
        initComponents();
        emp_id = i;
        name = n;
        status = s;
        this.setTitle(name);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/people.png")));
        //ບໍ່ສະແດງ Icon ທີ່ Title Bar
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_SHOW_ICON, false);
        //ປຽນສີແຖບ Title bar ດ້ານເທິງ
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(204, 209, 209));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(23, 32, 42));
        //ຖ້າສະຖານະຂອງຜູ້ເຂົ້າໃຊ້ງານບໍ່ແມ່ນ Admin ບໍ່ໃຫ້ສະແດງເມນູ ຈັດການຂໍ້ມູນ, ສັ່ງຊື້-ນຳເຂົ້າ ແລະ ລາຍງານ
        if(!status.equals("Admin")){
            jMenuData.setVisible(false);
            jMenuOrder.setVisible(false);
            jMenuReport.setVisible(false);
        }
        //ເວລາມາໜ້າ Main ໃຫ້ເອໄາໜ້າ Home ມາສະແດງທີ່ jPanelMain
        showPanel(new PanelHome());
    }
    
    //ສ້າງ Method ເພື່ອສະແດງແຕ່ລະໜ້າໃນ ่jPanelMain
    private void showPanel(JPanel panel){
        jPanelMain.removeAll();
        jPanelMain.add(panel);
        jPanelMain.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHome = new javax.swing.JMenu();
        jMenuData = new javax.swing.JMenu();
        jMenuItemEmployee = new javax.swing.JMenuItem();
        jMenuItemProduct = new javax.swing.JMenuItem();
        jMenuItemCategory = new javax.swing.JMenuItem();
        jMenuItemBrand = new javax.swing.JMenuItem();
        jMenuItemExchange = new javax.swing.JMenuItem();
        jMenuItemSuplier = new javax.swing.JMenuItem();
        jMenuOrder = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuCustomer = new javax.swing.JMenu();
        jMenuSale = new javax.swing.JMenu();
        jMenuSearch = new javax.swing.JMenu();
        jMenuReport = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuProfile = new javax.swing.JMenu();
        jMenuTheme = new javax.swing.JMenu();
        jMenuItemLight = new javax.swing.JMenuItem();
        jMenuItemDark = new javax.swing.JMenuItem();
        jMenuItemMacOSDark = new javax.swing.JMenuItem();
        jMenuLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setBackground(new java.awt.Color(255, 102, 102));
        jPanelMain.setLayout(new java.awt.BorderLayout());

        jMenuBar1.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N

        jMenuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        jMenuHome.setText("ໜ້າຫຼັກ");
        jMenuHome.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuHome);

        jMenuData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/database.png"))); // NOI18N
        jMenuData.setText("ຈັດການຂໍ້ມູນ");
        jMenuData.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuData.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItemEmployee.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItemEmployee.setText("ຈັດການຂໍ້ມູນພະນັກງານ");
        jMenuItemEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmployeeActionPerformed(evt);
            }
        });
        jMenuData.add(jMenuItemEmployee);

        jMenuItemProduct.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItemProduct.setText("ຈັດການຂໍ້ມູນສິນຄ້າ");
        jMenuItemProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductActionPerformed(evt);
            }
        });
        jMenuData.add(jMenuItemProduct);

        jMenuItemCategory.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItemCategory.setText("ຈັດການຂໍ້ມູນປະເພດ");
        jMenuItemCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoryActionPerformed(evt);
            }
        });
        jMenuData.add(jMenuItemCategory);

        jMenuItemBrand.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItemBrand.setText("ຈັດການຂໍ້ມູນຍີ່ຫໍ້");
        jMenuItemBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBrandActionPerformed(evt);
            }
        });
        jMenuData.add(jMenuItemBrand);

        jMenuItemExchange.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItemExchange.setText("ຈັດການຂໍ້ມູນອັດຕາແລກປ່ຽນ");
        jMenuItemExchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExchangeActionPerformed(evt);
            }
        });
        jMenuData.add(jMenuItemExchange);

        jMenuItemSuplier.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItemSuplier.setText("ຈັດການຂໍ້ມູນຜູ້ສະໜອງ");
        jMenuItemSuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSuplierActionPerformed(evt);
            }
        });
        jMenuData.add(jMenuItemSuplier);

        jMenuBar1.add(jMenuData);

        jMenuOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/receipt.png"))); // NOI18N
        jMenuOrder.setText("ສັ່ງຊື້-ນຳເຂົ້າ");
        jMenuOrder.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuOrder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem7.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItem7.setText("ຈັດການຂໍ້ມູນສັ່ງຊື້ສິນຄ້າ");
        jMenuOrder.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItem8.setText("ຈັດການຂໍ້ມູນນຳເຂົ້າສິນຄ້າ");
        jMenuOrder.add(jMenuItem8);

        jMenuBar1.add(jMenuOrder);

        jMenuCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/people.png"))); // NOI18N
        jMenuCustomer.setText("ລູກຄ້າ");
        jMenuCustomer.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenuCustomer);

        jMenuSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shopping_cart.png"))); // NOI18N
        jMenuSale.setText("ຂາຍສິນຄ້າ");
        jMenuSale.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuSale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuSale.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuSale.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenuSale);

        jMenuSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/manage_search.png"))); // NOI18N
        jMenuSearch.setText("ຄົ້ນຫາສິນຄ້າ");
        jMenuSearch.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenuSearch);

        jMenuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report.png"))); // NOI18N
        jMenuReport.setText("ລາຍງານ");
        jMenuReport.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem9.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItem9.setText("ລາຍງານຂໍ້ມູນການຂາຍ");
        jMenuReport.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItem10.setText("ລາຍງານຂໍ້ມູນສິນຄ້າໃນຮ້ານ");
        jMenuReport.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItem11.setText("ລາຍງານຂໍ້ມູນສິນຄ້າໃກ້ໝົດ");
        jMenuReport.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItem12.setText("ໃບບິນ");
        jMenuReport.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItem13.setText("ລາຍງານຂໍ້ມູນສິ່ງຊື້ສິນຄ້າ");
        jMenuReport.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItem14.setText("ລາຍງານຂໍ້ມູນນຳເຂົ້າສິນຄ້າ");
        jMenuReport.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItem15.setText("ລາຍງານຂໍ້ມູນລູກຄ້າ");
        jMenuReport.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItem16.setText("ລາຍງານຂໍ້ມູນພະນັກງານ");
        jMenuReport.add(jMenuItem16);

        jMenuBar1.add(jMenuReport);

        jMenuProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/people.png"))); // NOI18N
        jMenuProfile.setText("ໂປຣໄຟລ໌");
        jMenuProfile.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuProfile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenuProfile);

        jMenuTheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/wallpaper.png"))); // NOI18N
        jMenuTheme.setText("ພື້ນຫຼັງ");
        jMenuTheme.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuTheme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuTheme.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuTheme.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItemLight.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItemLight.setText("Light Mode");
        jMenuItemLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLightActionPerformed(evt);
            }
        });
        jMenuTheme.add(jMenuItemLight);

        jMenuItemDark.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItemDark.setText("Dark Mode");
        jMenuItemDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDarkActionPerformed(evt);
            }
        });
        jMenuTheme.add(jMenuItemDark);

        jMenuItemMacOSDark.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuItemMacOSDark.setText("MacOS Dark Mode");
        jMenuItemMacOSDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMacOSDarkActionPerformed(evt);
            }
        });
        jMenuTheme.add(jMenuItemMacOSDark);

        jMenuBar1.add(jMenuTheme);

        jMenuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        jMenuLogout.setText("ອອກລະບົບ");
        jMenuLogout.setFont(new java.awt.Font("Lao_SomVang", 0, 12)); // NOI18N
        jMenuLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogoutMouseClicked
        int data = JOptionPane.showConfirmDialog(rootPane, "ທ່ານຕ້ອງການອອກຈາກລະບົບແທ້ ຫຼື ບໍ່?", "ຢືນຢັນ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(data == 0){
            Login log = new Login();
            log.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jMenuLogoutMouseClicked

    private void jMenuItemLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLightActionPerformed
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(204, 209, 209));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(23, 32, 42));
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        });
    }//GEN-LAST:event_jMenuItemLightActionPerformed

    private void jMenuItemDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDarkActionPerformed
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(33, 47, 61));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(253, 254, 254));
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        });
    }//GEN-LAST:event_jMenuItemDarkActionPerformed

    private void jMenuItemMacOSDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMacOSDarkActionPerformed
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(28, 40, 51));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(253, 254, 254));
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatMacDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        });
    }//GEN-LAST:event_jMenuItemMacOSDarkActionPerformed

    private void jMenuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHomeMouseClicked
        showPanel(new PanelHome());
    }//GEN-LAST:event_jMenuHomeMouseClicked

    private void jMenuItemEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmployeeActionPerformed
        showPanel(new PanelEmployee());
    }//GEN-LAST:event_jMenuItemEmployeeActionPerformed

    private void jMenuItemProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemProductActionPerformed

    private void jMenuItemCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoryActionPerformed
        showPanel(new PanelCategory());
    }//GEN-LAST:event_jMenuItemCategoryActionPerformed

    private void jMenuItemBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemBrandActionPerformed

    private void jMenuItemExchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExchangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemExchangeActionPerformed

    private void jMenuItemSuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSuplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSuplierActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCustomer;
    private javax.swing.JMenu jMenuData;
    private javax.swing.JMenu jMenuHome;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemBrand;
    private javax.swing.JMenuItem jMenuItemCategory;
    private javax.swing.JMenuItem jMenuItemDark;
    private javax.swing.JMenuItem jMenuItemEmployee;
    private javax.swing.JMenuItem jMenuItemExchange;
    private javax.swing.JMenuItem jMenuItemLight;
    private javax.swing.JMenuItem jMenuItemMacOSDark;
    private javax.swing.JMenuItem jMenuItemProduct;
    private javax.swing.JMenuItem jMenuItemSuplier;
    private javax.swing.JMenu jMenuLogout;
    private javax.swing.JMenu jMenuOrder;
    private javax.swing.JMenu jMenuProfile;
    private javax.swing.JMenu jMenuReport;
    private javax.swing.JMenu jMenuSale;
    private javax.swing.JMenu jMenuSearch;
    private javax.swing.JMenu jMenuTheme;
    private javax.swing.JPanel jPanelMain;
    // End of variables declaration//GEN-END:variables
}
