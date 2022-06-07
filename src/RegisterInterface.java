import javax.swing.*;
import java.awt.*;

public class RegisterInterface {
    // 创建一个初始化界面的方法
    public void showUI() {
        // 1: 创建一个窗体（javax.swing.JFrame）对象
        javax.swing.JFrame jf = new javax.swing.JFrame();
        // 2:使程序可退出（关闭界面是程序结束运行）
//        jf.setDefaultCloseOperation(3);
        jf.setTitle("2048");
        jf.setSize(1000, 800);
        jf.setLocation(200, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jf.setResizable(false);   //放大页面
        // 3：设置界面布局
        //布局（流布局）
        java.awt.BorderLayout borderLayout = new java.awt.BorderLayout();
        jf.setLayout(borderLayout);

        JPanel jPanel1=new JPanel();JPanel jPanel2=new JPanel();JPanel jPanel3=new JPanel();

        // 4：添加图片
        //加载图片
        javax.swing.ImageIcon image=new javax.swing.ImageIcon("D:\\桌面\\java\\untitled2\\src\\img\\2048-~2.jpg");
        //创建图片标签（图片载体）显示图片
        javax.swing.JLabel jla=new javax.swing.JLabel(image);
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
        JLabel jLabel1,jLabel2,jLabel3;
        JTextField jTextField1,jTextField2,jTextField3;

        jPanel2.setLayout(null);

        jLabel1=new JLabel("设 置 账 号 :");
        jLabel2=new JLabel("设 置 密 码 :");
        jLabel3=new JLabel("确 定 密 码 :");

        jLabel1.setBounds(150,20,150,30);
        jLabel2.setBounds(150,75,150,30);

        jTextField1=new JTextField(30);
        jTextField2=new JPasswordField(30);
        jTextField1.setBounds(350,20,400,50);
        jTextField2.setBounds(350,75,400,50);

        jPanel2.add(jLabel1);
        jPanel2.add(jTextField1);
        jPanel2.add(jLabel2);
        jPanel2.add(jTextField2);

        jf.add(jPanel2,BorderLayout.CENTER);


    }
}

