package lsq;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RrButtonListener extends TextCheck implements ActionListener {

    public JTextField jtf;
    public JPasswordField jps;
    public JPasswordField rJps;

    public void actionPerformed(ActionEvent e) {
        String text = jtf.getText();
        String pas = jps.getText();
        String rPas = rJps.getText();
        if(checkAccount(text))
            if(pas.equals(rPas))
                if(checkPassword(pas))
                    System.out.println("恭喜你，小逼仔子，注册成功");
                else
                    System.out.println("傻逼，密码格式错误");
            else
                System.out.println("傻逼，密码不一致");
        else
            System.out.println("傻逼，账号格式错误");

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
