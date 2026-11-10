package lgh.gui;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.BorderLayout;
import java.awt.Dimension;
public class Gui extends JFrame {
    public Gui(){
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        JPanel mainScreen = new MainScreen();
        JPanel sideScreen = new SideScreen();

        setUndecorated(false); 
        //this.WIDTH = Toolkit.getDefaultToolkit().getScreenSize().getWidth(); 
        //this.HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().getWidth(); 
        setLayout(new BorderLayout()); 
        add(mainScreen, BorderLayout.CENTER); 
        add(sideScreen, BorderLayout.WEST);
        setVisible(true); 
    }

}
