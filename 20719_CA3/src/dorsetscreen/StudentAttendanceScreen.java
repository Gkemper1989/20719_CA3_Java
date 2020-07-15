/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dorsetscreen;
import java.sql.*;
import dorsetdata.ConnectionModule;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class StudentAttendanceScreen extends javax.swing.JInternalFrame {
    Connection conector = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form AttendanceScreen
     */
    public StudentAttendanceScreen() {
        initComponents();
        conector = ConnectionModule.conector();
    }
    
    private void consultar() {
        String sql = "select * from tbusuarios where iduser=?";
        try {
            pst = conector.prepareStatement(sql);
            pst.setString(1, txtiduser.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtusuario.setText(rs.getString(2));
                txtpresence.setText(rs.getString(11));
                cboCourse.setSelectedItem(rs.getString(8));
                txtabsent.setText(rs.getString(12));
            } else {
                JOptionPane.showMessageDialog(null, "User not found");
                txtiduser.setText(null);
                txtpresence.setText(null);
                cboCourse.setSelectedItem(null);
                txtabsent.setText(null);
                 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        txtiduser = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        cboCourse = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        txtpresence = new javax.swing.JTextField();
        lblIdUser = new javax.swing.JLabel();
        lblIdUser1 = new javax.swing.JLabel();
        lblcourse = new javax.swing.JLabel();
        txtabsent = new javax.swing.JTextField();
        lblamount1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblIdUser2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Student Attendance");

        txtiduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiduserActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("STUDENT ATTENDANCE");

        cboCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "D_BSc_Science in Computing_1_Year", "D_BSc_Science in Computing_2_Year", "D_BSc_Science in Computing_3_Year", "C_BSc_Science in Computing_1_Year", "C_BSc_Science in Computing_2_Year", "C_BSc_Science in Computing_3_Year", "L_BSc_Science in Computing_1_Year", "L_BSc_Science in Computing_2_Year", "L_BSc_Science in Computing_3_Year", "D_BSc_Business_1_Year", "D_BSc_Business_2_Year", "D_BSc_Business_3_Year", "C_BSc_Business_1_Year", "C_BSc_Business_2_Year", "C_BSc_Business_3_Year", "L_BSc_Business_1_Year", "L_BSc_Business_2_Year", "L_BSc_Business_3_Year", "D_BSc_Finance_1_Year", "D_BSc_Finance_2_Year", "D_BSc_Finance_3_Year", "C_BSc_Finance_1_Year", "C_BSc_Finance_2_Year", "C_BSc_Finance_3_Year", "L_BSc_Finance_1_Year", "L_BSc_Finance_2_Year", "L_BSc_Finance_3_Year" }));
        cboCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCourseActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/iconmonstr-magnifier-10-64.png"))); // NOI18N
        btnSearch.setToolTipText("Consult Payment");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setPreferredSize(new java.awt.Dimension(80, 80));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblIdUser.setText("*ID");

        lblIdUser1.setText("*Name");

        lblcourse.setText("*Course");

        txtabsent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtabsentActionPerformed(evt);
            }
        });

        lblamount1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblamount1.setForeground(new java.awt.Color(255, 51, 51));
        lblamount1.setText("Absent");

        jLabel1.setText("*Required Fields");

        lblIdUser2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblIdUser2.setForeground(new java.awt.Color(51, 51, 255));
        lblIdUser2.setText("Presence");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdUser2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblIdUser, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpresence, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtiduser, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(lblamount1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtabsent, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblIdUser1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblcourse)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitle)
                                    .addComponent(cboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcourse))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdUser)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdUser1)
                    .addComponent(txtiduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtabsent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblamount1)
                    .addComponent(lblIdUser2)
                    .addComponent(txtpresence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtiduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiduserActionPerformed

    private void cboCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCourseActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtabsentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtabsentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtabsentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cboCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblIdUser;
    private javax.swing.JLabel lblIdUser1;
    private javax.swing.JLabel lblIdUser2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblamount1;
    private javax.swing.JLabel lblcourse;
    private javax.swing.JTextField txtabsent;
    private javax.swing.JTextField txtiduser;
    private javax.swing.JTextField txtpresence;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
