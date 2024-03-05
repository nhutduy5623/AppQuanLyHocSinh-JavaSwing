/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LNhutDuy
 */
public class DanhMuc {
    private String title;
    private JPanel Jpanel;
    private JLabel Jlabel;

    public DanhMuc() {
    }

    public DanhMuc(String title, JPanel Jpanel, JLabel Jlabel) {
        this.title = title;
        this.Jpanel = Jpanel;
        this.Jlabel = Jlabel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JPanel getJpanel() {
        return Jpanel;
    }

    public void setJpanel(JPanel Jpanel) {
        this.Jpanel = Jpanel;
    }

    public JLabel getJlabel() {
        return Jlabel;
    }

    public void setJlabel(JLabel Jlabel) {
        this.Jlabel = Jlabel;
    }
    
}
