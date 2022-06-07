package lsq;

import javax.swing.*;
import java.awt.*;

public class LoginInterface {


    public LoginInterface() {
        showUI();
    }

    javax.swing.JFrame jf = new javax.swing.JFrame();

    // 创建一个初始化界面的方法
    public void showUI() {
        // 1: 创建一个窗体（javax.swing.JFrame）对象

        // 2:使程序可退出（关闭界面是程序结束运行）
//        jf.setDefaultCloseOperation(3);
        jf.setTitle("2048");
        jf.setSize(1000, 850);
        jf.setLocation(200, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jf.setResizable(false);   //放大页面

        // 3：设置界面布局
        //布局（流布局）
        java.awt.BorderLayout borderLayout = new java.awt.BorderLayout();
        jf.setLayout(borderLayout);

        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();

        // 4：添加图片
        //加载图片
        javax.swing.ImageIcon image = new javax.swing.ImageIcon("src/img/2048-~2.jpg");
        //创建图片标签（图片载体）显示图片
        javax.swing.JLabel jla = new javax.swing.JLabel(image);
        //设置图片大小
        java.awt.Dimension dm = new java.awt.Dimension(1000, 450);
        jla.setPreferredSize(dm);
        //将图片添加到窗体上
        jPanel1.add(jla);
        jf.add(jPanel1, BorderLayout.NORTH);

        jPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        /*设置布局，从左边开始填充按钮，当放不下的时候 */
        jPanel2.setPreferredSize(new Dimension(250, 300));//设置大小


        // 5：添加账号、密码标签，文本框
        JLabel jLabel1, jLabel2;
        JTextField jTextField1, jTextField2;

        jPanel2.setLayout(null);

        jLabel1 = new JLabel("账 号 :");
        jLabel2 = new JLabel(" 密 码 :");

        jLabel1.setBounds(150, 20, 150, 30);
        jLabel2.setBounds(150, 75, 150, 30);

        jTextField1 = new JTextField(30);
        jTextField2 = new JPasswordField(30);
        jTextField1.setBounds(350, 20, 400, 50);
        jTextField2.setBounds(350, 75, 400, 50);

        jPanel2.add(jLabel1);
        jPanel2.add(jTextField1);
        jPanel2.add(jLabel2);
        jPanel2.add(jTextField2);

        jf.add(jPanel2, BorderLayout.CENTER);

        // 6：添加登录、注册按钮
        JButton jButton1, jButton2;
        jButton1 = new JButton("登录");
        jButton2 = new JButton("注册");
        jPanel3.add(jButton1);
        jPanel3.add(jButton2);
        jPanel3.setLayout(new GridLayout(2, 1, 0, 4));

        jf.add(jPanel3, BorderLayout.SOUTH);


        // 7：设置页面样式

        //设置页面颜色
        jf.getContentPane().setBackground(Color.ORANGE);
        //panel设置为透明
        jPanel1.setBackground(Color.WHITE);
        jPanel1.setOpaque(false);
        jPanel2.setBackground(Color.WHITE);
        jPanel2.setOpaque(false);
        jPanel3.setBackground(Color.WHITE);
        jPanel3.setOpaque(false);

        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);//center label text
        Font font = new Font("黑体", Font.BOLD, 30);
        jLabel1.setFont(font);
        jLabel1.setForeground(new Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);//center label text
        jLabel2.setFont(font);
        jLabel2.setForeground(new Color(0, 0, 0));

        jTextField1.setFont(new Font("宋体", Font.PLAIN, 30));
        jTextField2.setFont(new Font("宋体", Font.PLAIN, 30));

        //按钮样式
        jButton1.setFont(new Font("宋体", Font.ITALIC, 30));
        jButton2.setFont(new Font("宋体", Font.ITALIC, 30));

        jButton1.setBackground(Color.PINK);
        jButton2.setBackground(Color.PINK);
        jButton1.setBorderPainted(false);
        jButton2.setBorderPainted(false);

        jButton1.setPreferredSize(new Dimension(120, 60));
        jButton2.setPreferredSize(new Dimension(120, 60));

        jTextField1.setPreferredSize(new Dimension(80, 50));
        jTextField2.setPreferredSize(new Dimension(80, 50));

        /****** 登录按钮  ********/
        //实现点击按钮后响应
        //监听器
        //通过子类ButtonListener（该子类于监听器文件中创建）创建对象（action）并初始化
        LButtonListener action = new LButtonListener();
        //将监听器与按钮组件绑定
        jButton1.addActionListener(action);


        //判断账号密码
        action.jtf = jTextField1;
        action.jps = (JPasswordField) jTextField2;
        action.jFrame = jf;

        /****** 注册按钮  ********/
        RButtonListener rAction = new RButtonListener();
        rAction.jFrame=jf;
        jButton2.addActionListener(rAction);


    }

}

