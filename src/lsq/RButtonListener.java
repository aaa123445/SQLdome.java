package lsq;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RButtonListener implements ActionListener {
    JFrame jFrame;
    public void actionPerformed(ActionEvent e) {
        RegisterInterface r = new RegisterInterface();
        r.showUI();
        jFrame.dispose();
    }
}