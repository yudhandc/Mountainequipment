/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
// <editor-fold defaultstate="collapsed" desc="Import Code">
import Controllers.MainMenu_Controller;
import Interfaces.ViewsProcess_Interface;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JPopupMenu.Separator;
import javax.swing.Timer;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
// </editor-fold>
/**
 *
 * @author adi_irsyadi
 */

// <editor-fold defaultstate="collapsed" desc="Import Code">
import Controllers.MainMenu_Controller;
import Interfaces.ViewsProcess_Interface;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JPopupMenu.Separator;
import javax.swing.Timer;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
// </editor-fold>

public class MainMenu_View extends JFrame implements ViewsProcess_Interface {
      private JButton BtnLogin;
      private JButton BtnIventory;
      private JButton BtnCustomers;
      private JButton BtnTransaction;
      private JLabel LblDate;
      private JLabel LblMonth;
      private JLabel LblTime;
      private JLabel LblTitle;
      private JLabel LblPicture;
      private JLabel LblWalpaper;
      private JPanel PnlWalpaper;
      private JPanel PnlPicture;

    public MainMenu_View() {
        PnlWalpaper = new JPanel();
        PnlPicture = new JPanel();
        BtnLogin = new JButton();
        BtnIventory = new JButton();
        BtnCustomers = new JButton();
        BtnTransaction = new JButton();
        LblDate = new JLabel();
        LblMonth = new JLabel();
        LblTime = new JLabel();
        LblTitle = new JLabel();
        LblPicture = new JLabel();
        LblWalpaper = new JLabel();
        initFrameProcess();
    }

      // <editor-fold defaultstate="collapsed" desc="Getter and Setter Code">
    
    

    public JButton getBtnLogin() {
        return BtnLogin;
    }

    public void setBtnLogin(JButton BtnLogin) {
        this.BtnLogin = BtnLogin;
    }

    public JButton getBtnIventory() {
        return BtnIventory;
    }

    public void setBtnIventory(JButton BtnIventory) {
        this.BtnIventory = BtnIventory;
    }

    public JButton getBtnCustomers() {
        return BtnCustomers;
    }

    public void setBtnCustomers(JButton BtnCustomers) {
        this.BtnCustomers = BtnCustomers;
    }

    public JButton getBtnTransaction() {
        return BtnTransaction;
    }

    public void setBtnTransaction(JButton BtnTransaction) {
        this.BtnTransaction = BtnTransaction;
    }

    public JLabel getLblDate() {
        return LblDate;
    }

    public void setLblDate(JLabel LblDate) {
        this.LblDate = LblDate;
    }

    public JLabel getLblMonth() {
        return LblMonth;
    }

    public void setLblMonth(JLabel LblMonth) {
        this.LblMonth = LblMonth;
    }

    public JLabel getLblTime() {
        return LblTime;
    }

    public void setLblTime(JLabel LblTime) {
        this.LblTime = LblTime;
    }

    public JLabel getLblTitle() {
        return LblTitle;
    }

    public void setLblTitle(JLabel LblTitle) {
        this.LblTitle = LblTitle;
    }

    public JLabel getLblPicture() {
        return LblPicture;
    }

    public void setLblPicture(JLabel LblPicture) {
        this.LblPicture = LblPicture;
    }

    public JLabel getLblWalpaper() {
        return LblWalpaper;
    }

    public void setLblWalpaper(JLabel LblWalpaper) {
        this.LblWalpaper = LblWalpaper;
    }

    public JPanel getPnlWalpaper() {
        return PnlWalpaper;
    }

    public void setPnlWalpaper(JPanel PnlWalpaper) {
        this.PnlWalpaper = PnlWalpaper;
    }

    public JPanel getPnlPicture() {
        return PnlPicture;
    }

    public void setPnlPicture(JPanel PnlPicture) {
        this.PnlPicture = PnlPicture;
    }
      // </editor-fold>
      
    private void initFrameProcess() {
     MainMenu_Controller ControlPanel = new MainMenu_Controller(this);

        initComponents();
        eventControllers();
        imageControllers();
    
    }
    
    @Override
    public void initComponents() {
        setTitle("Mountain Equipments Application");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());
        getContentPane().add(PnlWalpaper, new AbsoluteConstraints(0, 0, 800, 550));
        
        PnlWalpaper.setLayout(null);
        PnlWalpaper.setBackground(new Color(0, 0, 0));
        PnlWalpaper.setOpaque(true);
        
        BtnLogin.setOpaque(false);
        BtnLogin.setBorderPainted(false);
        BtnLogin.setContentAreaFilled(false);
        BtnLogin.setBorder(null);
        BtnLogin.setVisible(true);
        PnlWalpaper.add(BtnLogin);
        BtnLogin.setBounds(54, 262, 214, 58);
        
        BtnCustomers.setOpaque(false);
        BtnCustomers.setBorderPainted(false);
        BtnCustomers.setContentAreaFilled(false);
        BtnCustomers.setBorder(null);
        BtnCustomers.setVisible(true);
        PnlWalpaper.add(BtnCustomers);
        BtnCustomers.setBounds(54, 62, 214, 58);
        
        BtnLogin.setOpaque(false);
        BtnLogin.setBorderPainted(false);
        BtnLogin.setContentAreaFilled(false);
        BtnLogin.setBorder(null);
        BtnLogin.setVisible(true);
        PnlWalpaper.add(BtnLogin);
        BtnLogin.setBounds(54, 262, 214, 58);
        
        BtnLogin.setOpaque(false);
        BtnLogin.setBorderPainted(false);
        BtnLogin.setContentAreaFilled(false);
        BtnLogin.setBorder(null);
        BtnLogin.setVisible(true);
        PnlWalpaper.add(BtnLogin);
        BtnLogin.setBounds(54, 262, 214, 58);
    }

    
    @Override
    public void eventControllers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imageControllers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
