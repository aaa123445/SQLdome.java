package lsq;


import play.GameView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//创建子类（ButtonListener）并使用接口（监听器）
public class LButtonListener implements ActionListener  {

    JFrame jFrame;

    //定义ButtonListener的账号和密码文本属性
    JTextField jtf;
    JPasswordField jps;

    public void actionPerformed(ActionEvent e) {
        //创建String数据类型的形参，通过getText()方法获取jtf和jps属性中的值
        String text = jtf.getText();
        String pas = jps.getText();
//构造输入格式类
        TextCheck textCheck=new TextCheck();

        //开始判断输入格式
        if (textCheck.checkAccount(text)&&textCheck.checkPassword(pas))
        //通过简单if语句对内容进行判断。这里假设正确的账号为“123” 密码为“123456”
        {
            if (new SQLdome().login(text, pas)) {
                System.out.println("登录成功");
                JOptionPane.showMessageDialog(null, " 登录成功 ", " CONGRATULATIONS", JOptionPane.QUESTION_MESSAGE);

                GameView g = new GameView();
                g.showView();
                jFrame.dispose();
            } else {
                System.out.println("账号或密码错误");
                JOptionPane.showMessageDialog(null, " 账号或密码错误 ", " WARRING", JOptionPane.ERROR_MESSAGE);

            }
//                GameView g = new GameView();
//                g.showView();
//                jFrame.dispose();
        }else {
            System.out.println("输入格式有误");
            JOptionPane.showMessageDialog(null, " 非法输入！！！ ", " warring", JOptionPane.ERROR_MESSAGE);

        }
    }


}
