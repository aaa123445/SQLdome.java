import java.sql.*;

public class SQLdome {
    static final String DB_USER = "jc";
    static final String DB_PWD = "20010512cc.";
    static final String DB_URL = "jdbc:mysql://localhost:3306/user?serverTimezone=UTC";

    //登录
    public void login(String useName,String password){

        boolean isValid = false;
        String sql="select * from users where usename='"+useName+"' and pwd='"+password+"'";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PWD);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()){
                isValid = true;
            }
            rs.close();
            stm.close();
            stm.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        if (isValid)
            System.out.println("登录成功!");
            else System.out.println("用户名或密码错误请检查!");;
    }
    //注册
    public void userregister(String useName,String password){

        boolean b = false;

        String sql = "select * from users where usename='"+useName+"'";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PWD);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            if(!rs.next()){

                sql = "insert into users(usename,pwd) values('"+useName+"','"+password+"')";
                stm.execute(sql);
                b = true;
            }

            rs.close();
            stm.close();
            conn.close();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

        if(b)
            System.out.println("注册成功!");
        else System.out.println("失败用户名已存在!");
    }
}
//    Connection conn = null;
//        Statement  stmt = null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PWD);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }