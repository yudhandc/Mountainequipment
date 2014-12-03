/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
// <editor-fold defaultstate="collapsed" desc="Import Code">

import Interfaces.ViewsProcess_Interface;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
// </editor-fold>
/**
 *
 * @author adi_irsyadi
 */
public class Login_View extends JDialog implements ViewsProcess_Interface{
    private JButton BtnLogin;
    private JButton BtnCancel;
    private JTextField TxtUser;
    private JPasswordField TxtPasword;
    private JLabel LblWallpaper;
    private JPanel PnlLogin;
    private ImageIcon Image;

    
    
    
    public Login_View(Frame parent, boolean modal) {
        super(parent, modal);
        PnlLogin = new JPanel();
        BtnCancel = new JButton();
        BtnLogin = new JButton();
        TxtUser = new JTextField();
        TxtPasword = new JPasswordField();
        LblWallpaper = new JLabel();
       
        
        initFrameProcess();
    }

    

    

    // <editor-fold defaultstate="collapsed" desc="Getter and Setter Code">
    public JButton getBtnLogin() {
        return BtnLogin;
    }

    public void setBtnLogin(JButton BtnLogin) {
        this.BtnLogin = BtnLogin;
    }

    public JButton getBtnCancel() {
        return BtnCancel;
    }

    public void setBtnCancel(JButton BtnCancel) {
        this.BtnCancel = BtnCancel;
    }

    public JTextField getTxtUser() {
        return TxtUser;
    }

    public void setTxtUser(JTextField TxtUser) {
        this.TxtUser = TxtUser;
    }

    public JPasswordField getTxtPasword() {
        return TxtPasword;
    }

    public void setTxtPasword(JPasswordField TxtPasword) {
        this.TxtPasword = TxtPasword;
    }

    public JLabel getLblWallpaper() {
        return LblWallpaper;
    }

    public void setLblWallpaper(JLabel LblWallpaper) {
        this.LblWallpaper = LblWallpaper;
    }

    public JPanel getPnlLogin() {
        return PnlLogin;
    }

    public void setPnlLogin(JPanel PnlLogin) {
        this.PnlLogin = PnlLogin;
    }
    // </editor-fold>
    
    private void initFrameProcess() {
        initComponents();
        eventControllers();
        imageControllers();
    }
    
    @Override
    public void initComponents() {
        Font FontStyle = new Font("Tahoma", 1, 12);

        this.setTitle("Login");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.getContentPane().add(PnlLogin, new AbsoluteConstraints(0, 0, 500, 325));
        
        PnlLogin.setLayout(null);
        PnlLogin.setBackground(new Color(0, 0, 0));
        PnlLogin.setOpaque(true);
        
        TxtUser.setOpaque(false);
        TxtUser.setBorder(null);
        TxtUser.setHorizontalAlignment(JLabel.LEADING);
        TxtUser.setFont(FontStyle);
        PnlLogin.add(TxtUser);
        TxtUser.setBounds(10, 100, 101, 22);
        
        TxtPasword.setOpaque(false);
        TxtPasword.setBorder(null);
        TxtPasword.setHorizontalAlignment(JLabel.LEADING);
        TxtPasword.setFont(FontStyle);
        PnlLogin.add(TxtPasword);
        TxtPasword.setBounds(10, 50, 101, 22);
        
        BtnLogin.setOpaque(false);
        BtnLogin.setBorderPainted(false);
        BtnLogin.setContentAreaFilled(false);
        BtnLogin.setBorder(null);
        BtnLogin.setVisible(true);
        PnlLogin.add(BtnLogin);
        BtnLogin.setBounds(200, 100, 90, 26);
        
        BtnCancel.setOpaque(false);
        BtnCancel.setBorderPainted(false);
        BtnCancel.setContentAreaFilled(false);
        BtnCancel.setBorder(null);
        BtnCancel.setVisible(true);
        PnlLogin.add(BtnCancel);
        BtnCancel.setBounds(150, 300, 90, 26);
        
        LblWallpaper.setText(null);
        LblWallpaper.setBackground(new Color(250, 250, 0));
        LblWallpaper.setOpaque(true);
        PnlLogin.add(LblWallpaper);
        LblWallpaper.setBounds(0, 0, 500, 352);
        
        pack();
        this.setLocationRelativeTo(this);
    }

    @Override
    public void eventControllers() {
    
    }

    @Override
    public void imageControllers() {
        Image = new ImageIcon(getClass().getResource("/Images/Login_frame.png"));
        LblWallpaper.setIcon(Image);
        Image = new ImageIcon(getClass().getResource("/Images/BtnOk_Idle.png"));
        BtnLogin.setIcon(Image);
        Image = new ImageIcon(getClass().getResource("/Images/BtnCancel_Idle.png"));
        BtnCancel.setIcon(Image);
    }

    
    
}
