/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BLL.MonHocBLL;
import DTO.MonHoc;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author LNhutDuy
 */
public class MonHocGUI extends javax.swing.JPanel {
    DefaultTableModel model;
    ArrayList<MonHoc> listMH;
    JFrame rootPane = new JFrame();
    /**
     * Creates new form MonHocGUI
     */
    public MonHocGUI() {
        initComponents();
    }
    public void showTableMH(ArrayList<MonHoc> list) {
        for(MonHoc mh:list) {
            model.addRow(new Object[]{
                mh.getMaMH(), mh.getTenMH()
            });
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

        jPanel1 = new javax.swing.JPanel();
        JScollPanel_MH = new javax.swing.JScrollPane();
        tbl_MH = new javax.swing.JTable();
        FromSX = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_MaMH = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_TenMH = new javax.swing.JTextField();
        btn_HuyTTMH = new javax.swing.JButton();
        ThaoTac = new javax.swing.JPanel();
        btn_ThemMH = new javax.swing.JButton();
        btn_SuaMH = new javax.swing.JButton();
        btn_XoaMH = new javax.swing.JButton();

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPanel1PropertyChange(evt);
            }
        });

        JScollPanel_MH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JScollPanel_MHMouseClicked(evt);
            }
        });

        tbl_MH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_MH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_MHMouseClicked(evt);
            }
        });
        JScollPanel_MH.setViewportView(tbl_MH);

        FromSX.setForeground(new java.awt.Color(204, 204, 0));

        jLabel1.setText("Mã MH");

        txt_MaMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaMHActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên MH");

        txt_TenMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenMHActionPerformed(evt);
            }
        });

        btn_HuyTTMH.setText("Huỷ");
        btn_HuyTTMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyTTMHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FromSXLayout = new javax.swing.GroupLayout(FromSX);
        FromSX.setLayout(FromSXLayout);
        FromSXLayout.setHorizontalGroup(
            FromSXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FromSXLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FromSXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(FromSXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FromSXLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_HuyTTMH, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(FromSXLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(FromSXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_TenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        FromSXLayout.setVerticalGroup(
            FromSXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FromSXLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(FromSXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FromSXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_HuyTTMH, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btn_ThemMH.setText("Thêm");
        btn_ThemMH.setActionCommand("btn_ThemMH");
        btn_ThemMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemMHActionPerformed(evt);
            }
        });

        btn_SuaMH.setText("Sửa");
        btn_SuaMH.setActionCommand("btn_SuaMH");
        btn_SuaMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaMHActionPerformed(evt);
            }
        });

        btn_XoaMH.setText("Xoá");
        btn_XoaMH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaMHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ThaoTacLayout = new javax.swing.GroupLayout(ThaoTac);
        ThaoTac.setLayout(ThaoTacLayout);
        ThaoTacLayout.setHorizontalGroup(
            ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThaoTacLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_XoaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SuaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ThemMH, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        ThaoTacLayout.setVerticalGroup(
            ThaoTacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThaoTacLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_ThemMH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_SuaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_XoaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(FromSX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThaoTac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(JScollPanel_MH, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FromSX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ThaoTac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JScollPanel_MH, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_MHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_MHMouseClicked
        int this_Row=tbl_MH.getSelectedRow();
        System.out.println();
        TableModel row_SL = tbl_MH.getModel();
        String MaMH_SL = row_SL.getValueAt(this_Row, 0).toString();
        String TenMH_SL = row_SL.getValueAt(this_Row, 1).toString();
        txt_MaMH.setText(MaMH_SL);
        txt_TenMH.setText(TenMH_SL);
        txt_MaMH.setEnabled(false);
        btn_ThemMH.setEnabled(false);
        btn_SuaMH.setEnabled(true);
        btn_XoaMH.setEnabled(true);
    }//GEN-LAST:event_tbl_MHMouseClicked

    private void JScollPanel_MHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JScollPanel_MHMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JScollPanel_MHMouseClicked

    private void txt_MaMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaMHActionPerformed

    private void txt_TenMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenMHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenMHActionPerformed

    private void btn_HuyTTMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyTTMHActionPerformed
        btn_SuaMH.setEnabled(false);
        btn_XoaMH.setEnabled(false);
        txt_MaMH.setEnabled(true);
        btn_ThemMH.setEnabled(true);
        txt_MaMH.setText("");
        txt_TenMH.setText("");
    }//GEN-LAST:event_btn_HuyTTMHActionPerformed

    private void btn_ThemMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemMHActionPerformed
        if(!"".equals(txt_MaMH.getText()) && !"".equals(txt_TenMH.getText()))
        {
            try {
                int new_MaMH = Integer.parseInt(txt_MaMH.getText());
                String new_TenMH = txt_TenMH.getText();
                MonHoc MH = new MonHoc(new_MaMH, new_TenMH);
                boolean check=false;
                MonHocBLL AddMH = new MonHocBLL();
                ;
                if(!"".equals(AddMH.AddMH(MH)))
                JOptionPane.showMessageDialog(rootPane, AddMH.AddMH(MH));
                else
                {
                    model.addRow(new Object[] {
                        MH.getMaMH(),
                        MH.getTenMH(),
                    });
                    listMH = new MonHocBLL().ShowDSMH();
                    JOptionPane.showMessageDialog(rootPane, "Đã Thêm Môn Học");
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(rootPane, "Mã môn học phải ở kiểu số nguyên");
            }
            txt_MaMH.setText("");
            txt_TenMH.setText("");
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Vui Lòng Nhập Đầy Đủ Thông Tin");
        }
    }//GEN-LAST:event_btn_ThemMHActionPerformed

    private void btn_SuaMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaMHActionPerformed
        int MaMH_New = Integer.parseInt(txt_MaMH.getText());
        String TenMH_New = txt_TenMH.getText();
        if(TenMH_New!="") {
            MonHoc mh = new MonHoc(MaMH_New, TenMH_New);
            MonHocBLL MHBLL = new MonHocBLL();
            int this_Row= tbl_MH.getSelectedRow();
            String MaMH_t = txt_MaMH.getText();
            this.model.setValueAt(MaMH_t, this_Row, 0);
            this.model.setValueAt(TenMH_New, this_Row, 1);
            JOptionPane.showMessageDialog(rootPane, MHBLL.UpdateMH(mh));
        } else
        JOptionPane.showMessageDialog(rootPane, "Vui Lòng Nhập Đầy Đủ Thông Tin");

    }//GEN-LAST:event_btn_SuaMHActionPerformed

    private void btn_XoaMHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaMHActionPerformed
        int MaMH = Integer.parseInt(txt_MaMH.getText());
        int this_Row=tbl_MH.getSelectedRow();
        this.model.removeRow(this_Row);
        JOptionPane.showMessageDialog(rootPane, new MonHocBLL().DelMH(MaMH));
    }//GEN-LAST:event_btn_XoaMHActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered

    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPanel1PropertyChange
        btn_SuaMH.setEnabled(false);
        btn_XoaMH.setEnabled(false);
        listMH = new MonHocBLL().ShowDSMH();
        model = (DefaultTableModel) tbl_MH.getModel();
        model.setColumnIdentifiers(new Object[]{
            "Mã Môn Học","Tên Môn Học"
        });
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--)
        model.removeRow(i);
        showTableMH(listMH);
    }//GEN-LAST:event_jPanel1PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FromSX;
    private javax.swing.JScrollPane JScollPanel_MH;
    private javax.swing.JPanel ThaoTac;
    private javax.swing.JButton btn_HuyTTMH;
    private javax.swing.JButton btn_SuaMH;
    private javax.swing.JButton btn_ThemMH;
    private javax.swing.JButton btn_XoaMH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tbl_MH;
    private javax.swing.JTextField txt_MaMH;
    private javax.swing.JTextField txt_TenMH;
    // End of variables declaration//GEN-END:variables
}