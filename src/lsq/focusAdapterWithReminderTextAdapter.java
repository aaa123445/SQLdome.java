package lsq;


//参数:jtextfield组件，提示文字string

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class focusAdapterWithReminderTextAdapter extends FocusAdapter {  //JTextField提示文字通用方法
    JTextField txt;
    String remindertxtString;
    //初始化
    public focusAdapterWithReminderTextAdapter(JTextField txt_,String reminderString_) {
        // TODO Auto-generated constructor stub
        txt = txt_;
        remindertxtString = reminderString_;
    }
    //焦点获得
    @Override
    public void focusGained(FocusEvent e) {
        String tempString = txt.getText();
        //String tempString = this.getText();
        if (tempString.equals(remindertxtString)){
            txt.setText("");
            txt.setForeground(Color.BLACK);
        }}
    //焦点失去
    @Override
    public void focusLost(FocusEvent e) {
        String tempString = txt.getText();
        if(tempString.equals("")) {
            txt.setForeground(Color.GRAY);
            txt.setText(remindertxtString);
        }
    }
}