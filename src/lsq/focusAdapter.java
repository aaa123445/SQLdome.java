package lsq;


//参数:jtextfield组件，提示文字string

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

class focusAdapter extends FocusAdapter {  //JTextField提示文字通用方法
    JTextField txt;
    JLabel jlaf,jlat;

    boolean I;
    int position;

    String remindertxtString;
    //初始化
    public focusAdapter(JTextField txt_,JLabel jlaF, JLabel jlaT,boolean i,int position_) {
        // TODO Auto-generated constructor stub
        txt = txt_;
        jlaf =jlaF;
        jlat=jlaT;
        I=i;
        position=position_;
    }
    //焦点获得
    @Override
    public void focusGained(FocusEvent e) {
        String tempString = txt.getText();
//        System.out.println(txt);
        jlat.setBounds(0,0,0,0);
        jlaf.setBounds(0,0,0,0);
        }
    //焦点失去
    @Override
    public void focusLost(FocusEvent e) {
        String tempString = txt.getText();
            System.out.println(tempString);
        TextCheck textCheck=new TextCheck();
        if (I)
        {if(tempString.length()<7)
          {
                jlaf.setBounds(750,position,50,50);
                jlat.setBounds(0,0,0,0);
            }}
        else {if(tempString.length()<8)
        {
            jlaf.setBounds(750,position,50,50);
            jlat.setBounds(0,0,0,0);
        }}

    }



}
