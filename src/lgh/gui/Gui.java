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
        setSize(800, 450);
        setLayout(new BorderLayout()); 
        add(mainScreen, BorderLayout.CENTER); 
        add(sideScreen, BorderLayout.WEST);
        setVisible(true); 
    }

}
