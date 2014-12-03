/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Interfaces.ControllersProcess_Interface;
import Views.MainMenu_View;
import Views.Login_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author adi_irsyadi
 */
public class MainMenu_Controller {
    private MainMenu_View MenuView;
    private Calendar DateCalendar;
    private int flag;

    
     // <editor-fold defaultstate="collapsed" desc="Constructor Code">
    public MainMenu_Controller(MainMenu_View MenuView) {
        this.MenuView = MenuView;
    }
    // </editor-fold>

    public MainMenu_View getMenuView() {
        return MenuView;
    }

    public void setMenuView(MainMenu_View MenuView) {
        this.MenuView = MenuView;
    }
    
    
    
}

    
    // </editor-fold>
