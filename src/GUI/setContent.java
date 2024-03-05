/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author LNhutDuy
 */
public class setContent {
    private JPanel jpn_content;
    private String title="";
    private JPanel node;
    private List<DanhMuc> ListDM=null; //Tạo list để set backround khi exit
    public setContent(JPanel jpn_content) {
        this.jpn_content = jpn_content;
    }
    //Mặc Định
    public void setCT(JPanel jpn_click ,JLabel jlb_click, String title) {
        switch (title) {
            case "GV":
                node = new GiaoVienGUI();
                break;
            case "MH":
                node = new MonHocGUI();
                break;
            case "LK":
                node = new LopKhoiGUI();
                break;
            default:
                break;
        }
        jpn_click.setBackground(new Color(17,123,176,255));
        jlb_click.setBackground(new Color(17,123,176,255));
        jpn_content.removeAll();
        jpn_content.setLayout(new BorderLayout());
        jpn_content.add(node);
        jpn_content.validate();
        jpn_content.repaint();
    }
    //Add JlabelEverListener cho label
    public void addEvent(List<DanhMuc> ListDM) {
        this.ListDM=ListDM;
        for(DanhMuc DM:ListDM) {
            DM.getJpanel().addMouseListener(new jLabelEvent(DM.getTitle(), DM.getJpanel(), DM.getJlabel()));
            DM.getJlabel().addMouseListener(new jLabelEvent(DM.getTitle(), DM.getJpanel(), DM.getJlabel()));
        }
    }
    
    
    //Được gọi khi chọn
    class jLabelEvent implements MouseListener {
        private JPanel node;
        private String title;
        private String jlbSelected;
        private JPanel jpn_click;
        private JLabel jlb_click;

        public jLabelEvent(String title, JPanel jpn_click, JLabel jlb_click) {
            this.title = title;
            this.jpn_click = jpn_click;
            this.jlb_click = jlb_click;
        }
        
        
        
        @Override
        public void mouseClicked(MouseEvent e) {
            switch (title) {
                case "GV":
                    node = new GiaoVienGUI();
                    break;
                case "MH":
                    node = new MonHocGUI();
                    break;
                case "LK":
                    node = new LopKhoiGUI();
                    break;
                default:
                    break;
            }
            jpn_content.removeAll();
            jpn_content.setLayout(new BorderLayout());
            jpn_content.add(node);
            jpn_content.validate();
            jpn_content.repaint();
            removeBackground(title);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            jlbSelected = title;
            jpn_click.setBackground(new Color(17,123,176,255));
            jlb_click.setBackground(new Color(17,123,176,255));
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpn_click.setBackground(new Color(17,123,176,255));
            jlb_click.setBackground(new Color(17,123,176,255));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            jpn_click.setBackground(new Color(47,155,194,255));
            jlb_click.setBackground(new Color(47,155,194,255)); 
            removeBackground(title);
        }
        
    }
    private void removeBackground(String title) {
        for(DanhMuc DM: ListDM) {
            if(!DM.getTitle().equalsIgnoreCase(title)) {
                DM.getJlabel().setBackground(new Color(250,225,170,255));
                DM.getJpanel().setBackground(new Color(250,225,170,255));                
            } else {
                DM.getJlabel().setBackground(new Color(17,123,176,255));
                DM.getJpanel().setBackground(new Color(17,123,176,255));             
            }
        }
    } 
    
}
