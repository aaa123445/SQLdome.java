package login.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReturnButtonListener implements ActionListener {
    JFrame jFrame;

    @Override
    public void actionPerformed(ActionEvent e) {
        jFrame.dispose();
        LoginInterface l=new LoginInterface();
        l.showUI();
    }
}
