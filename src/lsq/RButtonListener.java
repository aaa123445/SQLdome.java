package lsq;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        RegisterInterface r=new RegisterInterface();
        r.showUI();

    }
}