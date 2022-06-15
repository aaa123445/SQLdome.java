package lsq;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RrButtonListener extends TextCheck implements ActionListener {

    public JTextField jtf;
    public JPasswordField jps;
    public JPasswordField rJps;

    JFrame jFrame;

    public void actionPerformed(ActionEvent e) {
        String text = jtf.getText();
        String pas = jps.getText();
        String rPas = rJps.getText();
        if(checkAccount(text))
            if(pas.equals(rPas))
                if(checkPassword(pas))
                {
                    System.out.println("恭喜你，小逼仔子，注册成功");
                    new SQLdome().userregister(text,pas);
                    int userOption =  JOptionPane.showConfirmDialog(null,"注册成功是否返回登录页？","提示",JOptionPane.OK_OPTION,JOptionPane.QUESTION_MESSAGE);	//确认对话框
//如果用户选择的是OK
                    if (userOption == JOptionPane.OK_OPTION) {
                        System.err.println("是");
                        jFrame.dispose();
                        LoginInterface loginInterface=new LoginInterface();
                        loginInterface.showUI();
                    }else {
                        System.out.println("否");
                        jFrame.dispose();
                        RegisterInterface registerInterface=new RegisterInterface();
                        registerInterface.showUI();
                    }
                }
                else
                {
                    System.out.println("密码格式错误");
                    JOptionPane.showMessageDialog(null, " 密码格式错误 ", " WARRING", JOptionPane.ERROR_MESSAGE);
                }

            else
            {
                System.out.println("密码不一致");
                JOptionPane.showMessageDialog(null, " 密码不一致 ", " WARRING", JOptionPane.ERROR_MESSAGE);

            }
        else
            System.out.println("账号格式错误");
        JOptionPane.showMessageDialog(null, " 账号格式错误 ", " WARRING", JOptionPane.ERROR_MESSAGE);


    }

    //校验创建事件页面账号格式
//    public boolean checkAccount(String accountNumber) {
//        String valicateAccount="^[\\w@\\$\\^!~,.\\*]{7}+$";
//        Pattern pattern = Pattern.compile(valicateAccount);
//        Matcher matcher = pattern.matcher(accountNumber);
//        boolean matches = matcher.matches();
//        if(matches) {
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//    //密码校验：
//    public boolean checkPassword(String passWord) {
//        String valicatePassword="^[\\w@\\$\\^!~,.\\*]{8,16}+$";
//        Pattern pattern = Pattern.compile(valicatePassword);
//        Matcher matcher = pattern.matcher(passWord);
//        boolean matches = matcher.matches();
//        if(matches) {
//            return true;
//        }else {
//            return false;
//        }
//    }

}
