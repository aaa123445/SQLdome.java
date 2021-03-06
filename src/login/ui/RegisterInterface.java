package login.ui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;


public class RegisterInterface {

    // 创建一个初始化界面的方法
    public void showUI() {
        // 1: 创建一个窗体（javax.swing.JFrame）对象
        JFrame jf = new JFrame();
        // 2:使程序可退出（关闭界面是程序结束运行）
//        jf.setDefaultCloseOperation(3);
        jf.setTitle("2048");
        jf.setSize(1000, 850);
        jf.setLocation(200, 200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);   //放大页面
        // 3：设置界面布局
        //布局（流布局）
        BorderLayout borderLayout = new BorderLayout();
        jf.setLayout(borderLayout);

        JPanel jPanel1=new JPanel();JPanel jPanel2=new JPanel();JPanel jPanel3=new JPanel();

        // 4：添加图片
        //加载图片
        ImageIcon image=new ImageIcon("src/img/2048-~2.jpg");
        //创建图片标签（图片载体）显示图片
        JLabel jla=new JLabel(image);
        //设置图片大小
        Dimension dm = new Dimension(1000, 450);
        jla.setPreferredSize(dm);
        //将图片添加到窗体上
        jPanel1.add(jla);
        jf.add(jPanel1, BorderLayout.NORTH);

//        jPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
//        /*设置布局，从左边开始填充按钮，当放不下的时候 */
//        jPanel2.setPreferredSize(new Dimension(250, 300));//设置大小


        // 5：添加账号、密码标签，文本框
        JLabel jLabel1,jLabel2,jLabel3;
        JTextField jTextField1,jTextField2,jTextField3;

        jPanel2.setLayout(null);

        JLabel jLabel0=new JLabel("输入[数字 + 字母 + 特殊符号]" +
                " 账号7位、密码8-16位" +
                "特殊符号: @ $ ^ ! ~ , . *");
        jLabel1=new JLabel("设 置 账 号 :");
        jLabel2=new JLabel("设 置 密 码 :");
        jLabel3=new JLabel("确 定 密 码 :");



        jLabel0.setBounds(120,-5,750,30);
        jLabel1.setBounds(100,30,250,30);
        jLabel2.setBounds(100,85,250,30);
        jLabel3.setBounds(100,140,250,30);



        jTextField1=new JTextField(30);
        jTextField2=new JPasswordField(30);
        jTextField3=new JPasswordField(30);
        jTextField1.setBounds(350,20,400,50);
        jTextField2.setBounds(350,75,400,50);
        jTextField3.setBounds(350,130,400,50);


//        提示图片 √
        ImageIcon imageT=new ImageIcon("src/img/对.jpg");
        JLabel jlaT1=new JLabel(imageT);
//        jla.setPreferredSize(new Dimension(50, 50));
        JLabel jlaT2=new JLabel(imageT);
//        jla.setPreferredSize(new Dimension(50, 50));
        JLabel jlaT3=new JLabel(imageT);
//        jla.setPreferredSize(new Dimension(50, 50));

        //提示图片 ×
        ImageIcon imageF=new ImageIcon("src/img/F.jpg");
        JLabel jlaF1=new JLabel(imageF);
//        jla.setPreferredSize(new Dimension(50, 50));
        JLabel jlaF2=new JLabel(imageF);
//        jla.setPreferredSize(new Dimension(50, 50));
        JLabel jlaF3=new JLabel(imageF);
//        jla.setPreferredSize(new Dimension(50, 50));

////        设置提示图片位置
//        jlaT1.setBounds(0,0,0,0);
//        jlaT2.setBounds(0,0,0,0);
//        jlaT3.setBounds(0,0,0,0);
//
//        jlaF1.setBounds(0,0,0,0);
//        jlaF2.setBounds(0,0,0,0);
//        jlaF3.setBounds(0,0,0,0);


//        jTextField1.setName("7位数字 + 字母 + 特殊符号");
//        jTextField2.setName("8-16位的数字 + 字母 + 特殊符号");
//        jTextField3.setName("特殊符号仅限 @ $ ^ ! ~ , . *");
//
//        jTextField1.addFocusListener(new focusAdapterWithReminderTextAdapter(jTextField1,jTextField1.getName()));//设置提示文字
//        jTextField2.addFocusListener(new focusAdapterWithReminderTextAdapter(jTextField2,jTextField2.getName()));
//        jTextField3.addFocusListener(new focusAdapterWithReminderTextAdapter(jTextField3,jTextField3.getName()));

//        jLabel1.requestFocus();

        jPanel2.add(jLabel0);
        jPanel2.add(jLabel1);
        jPanel2.add(jTextField1);
        jPanel2.add(jLabel2);
        jPanel2.add(jTextField2);
        jPanel2.add(jLabel3);
        jPanel2.add(jTextField3);

        jPanel2.add(jlaT1);
        jPanel2.add(jlaT2);
        jPanel2.add(jlaT3);
        jPanel2.add(jlaF1);
        jPanel2.add(jlaF2);
        jPanel2.add(jlaF3);

        jf.add(jPanel2,BorderLayout.CENTER);


        /********格式判断提示*********/
        DocumentListener accountTextChangeListener=new DocumentListener() {
            public void changeFilter(DocumentEvent event) {
                javax.swing.text.Document document = event.getDocument();
                try {
                    TextCheck textCheck=new TextCheck();
                    String text=document.getText(0, document.getLength());
                    if(text.length()<7)
                    if(!textCheck.checkSign(text)&&text.length()!=0){
                        jlaF1.setBounds(750,20,50,50);
                        jlaT1.setBounds(0,0,0,0);
                    }
                    else{
                        jlaT1.setBounds(0,0,0,0);
                        jlaF1.setBounds(0,0,0,0);

                    }else if (textCheck.checkAccount(text)) {
                        jlaT1.setBounds(750,20,50,50);
                        jlaF1.setBounds(0,0,0,0);
                        System.out.println("Document"+text);
                    }else if (text.length()>=7){
                        System.out.println("Document"+false);
                        jlaF1.setBounds(750,20,50,50);
                        jlaT1.setBounds(0,0,0,0);
                    }

//                    if (textCheck.checkAccount(text)) {
//                        jlaT1.setBounds(750,20,50,50);
//                        jlaF1.setBounds(0,0,0,0);
//                        System.out.println(text);
//                    }else if (text.length()>=7){
//                        System.out.println(false);
//                        jlaF1.setBounds(750,20,50,50);
//                        jlaT1.setBounds(0,0,0,0);
//                    }


                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.err.println(ex);
                }
            }

            public void changedUpdate(DocumentEvent e) {
                changeFilter(e);
            }

            public void insertUpdate(DocumentEvent e) {
                changeFilter(e);
            }

            public void removeUpdate(DocumentEvent e) {
                changeFilter(e);
            }
        };

        DocumentListener pwdTextChangeListener=new DocumentListener() {
            protected void changeFilter(DocumentEvent event) {
                javax.swing.text.Document document = event.getDocument();
                try {
                    TextCheck textCheck=new TextCheck();
                    String text=document.getText(0, document.getLength());

                    if(text.length()<8)
                        if(!textCheck.checkSign(text)&&text.length()!=0){
                            jlaF2.setBounds(750,75,50,50);
                            jlaT2.setBounds(0,0,0,0);
                        }
                        else{
                            jlaT2.setBounds(0,0,0,0);
                            jlaF2.setBounds(0,0,0,0);
                        }else if (textCheck.checkPassword(text)) {
                        jlaT2.setBounds(750,75,50,50);
                        jlaF2.setBounds(0,0,0,0);
                        System.out.println("Document"+text);
                    }else if (text.length()>8){
                        System.out.println("Document"+false);
                        jlaF2.setBounds(750,75,50,50);
                        jlaT2.setBounds(0,0,0,0);
                    }

//                    if (textCheck.checkPassword(text)) {
//                        jlaT2.setBounds(750,75,50,50);
////                        jlaF1.setBounds(0,0,0,0);
//                        System.out.println(text);
//                    }else if (text.length()>=8){
//                        System.out.println(false);
//                        jlaF2.setBounds(750,75,50,50);
////                        jlaT1.setBounds(0,0,0,0);
//                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.err.println(ex);
                }
            }

            public void changedUpdate(DocumentEvent e) {
                changeFilter(e);
            }

            public void insertUpdate(DocumentEvent e) {
                changeFilter(e);
            }

            public void removeUpdate(DocumentEvent e) {
                changeFilter(e);
            }
        };

        DocumentListener rPwdTextChangeListener=new DocumentListener() {

            protected void changeFilter(DocumentEvent event) {
                javax.swing.text.Document document = event.getDocument();
                try {
                    TextCheck textCheck=new TextCheck();
                    String passWord=jTextField2.getText();
                    String text=document.getText(0, document.getLength());
                    if(text.length()<8)
                        if(!textCheck.checkSign(text)&&text.length()!=0){
                            jlaF3.setBounds(750,130,50,50);
                            jlaT3.setBounds(0,0,0,0);
                        }
                        else{
                            jlaT3.setBounds(0,0,0,0);
                            jlaF3.setBounds(0,0,0,0);
                        }else if (textCheck.checkPassword(text)&&text.equals(passWord))
                        {
                        jlaT3.setBounds(750,130,50,50);
                        jlaF3.setBounds(0,0,0,0);
                        System.out.println("Document"+text+"passWord"+passWord);
                    }else if (text.length()>8){
                        System.out.println("Document"+false);
                        jlaF3.setBounds(750,130,50,50);
                        jlaT3.setBounds(0,0,0,0);
                    }

//                    if (textCheck.checkPassword(text)) {
//                        jlaT3.setBounds(750,130,50,50);
////                        jlaF1.setBounds(0,0,0,0);
//                        System.out.println(text);
//                    }else if (text.length()>=8){
//                        System.out.println(false);
//                        jlaF3.setBounds(750,130,50,50);
////                        jlaT1.setBounds(0,0,0,0);
//                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.err.println(ex);
                }
            }

            public void changedUpdate(DocumentEvent e) {
                changeFilter(e);
            }

            public void insertUpdate(DocumentEvent e) {
                changeFilter(e);
            }

            public void removeUpdate(DocumentEvent e) {
                changeFilter(e);
            }
        };


        jTextField1.getDocument().addDocumentListener(accountTextChangeListener);
        jTextField2.getDocument().addDocumentListener(pwdTextChangeListener);
        jTextField3.getDocument().addDocumentListener(rPwdTextChangeListener);

//
        jTextField1.addFocusListener(new focusAdapter(jTextField1,jlaF1,jlaT1,true,20));
        jTextField2.addFocusListener(new focusAdapter(jTextField2,jlaF2,jlaT2,false,75));
        jTextField3.addFocusListener(new focusAdapter(jTextField3,jlaF3,jlaT3,false,130));


        /*************注册返回按钮***************/
        JButton jButton1,jButton2;
        jButton1=new JButton("注册");
        jButton2=new JButton("返回");
        jPanel3.add(jButton1);
        jPanel3.add(jButton2);
        jPanel3.setLayout(new GridLayout(2,1,0,4));

        jf.add(jPanel3,BorderLayout.SOUTH);

        //设置页面颜色
        jf.getContentPane().setBackground(Color.ORANGE);
        //panel设置为透明
        jPanel1.setBackground(Color.WHITE);
        jPanel1.setOpaque(false);
        jPanel2.setBackground(Color.WHITE);
        jPanel2.setOpaque(false);
        jPanel3.setBackground(Color.WHITE);
        jPanel3.setOpaque(false);

        jLabel0.setHorizontalAlignment(SwingConstants.CENTER);//center label text
        jLabel0.setFont(new Font("黑体", Font.ITALIC, 20));
        jLabel0.setForeground(new Color(0,0,0));

        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);//center label text
        Font font = new Font("黑体", Font.BOLD, 30);
        jLabel1.setFont(font);
        jLabel1.setForeground(new Color(0,0,0));

        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);//center label text
        jLabel2.setFont(font);
        jLabel2.setForeground(new Color(0,0,0));

        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);//center label text
        jLabel3.setFont(font);
        jLabel3.setForeground(new Color(0,0,0));

        jTextField1.setFont(new Font("宋体", Font.PLAIN, 30));
        jTextField2.setFont(new Font("宋体", Font.PLAIN, 30));
        jTextField3.setFont(new Font("宋体", Font.PLAIN, 30));

        //按钮样式
        jButton1.setFont(new Font("宋体", Font.ITALIC, 30));
        jButton2.setFont(new Font("宋体", Font.ITALIC, 30));

        jButton1.setBackground(Color.PINK);
        jButton2.setBackground(Color.PINK);
        jButton1.setBorderPainted(false);
        jButton2.setBorderPainted(false);

        jButton1.setPreferredSize(new Dimension(120,60));
        jButton2.setPreferredSize(new Dimension(120,60));

//        jTextField1.setPreferredSize(new Dimension(80,50));
//        jTextField2.setPreferredSize(new Dimension(80,50));

        /****** 注册按钮  ********/
        RrButtonListener rrAction=new RrButtonListener();
        jButton1.addActionListener(rrAction);
        rrAction.jtf=jTextField1;
        rrAction.jps= (JPasswordField) jTextField2;
        rrAction.rJps= (JPasswordField) jTextField3;
        rrAction.jFrame=jf;


        /****** 返回按钮  ********/
        ReturnButtonListener returnAction=new ReturnButtonListener();
        returnAction.jFrame=jf;
        jButton2.addActionListener(returnAction);



    }
}

