package login.sqlAPI;

import java.sql.*;

public class sql_user {
    static final String DB_USER = "jc";
    static final String DB_PWD = "20010512cc.";
    static final String DB_URL = "jdbc:mysql://localhost:3306/user?serverTimezone=UTC";

    //登录
    public boolean login(String useName, String password) {

        boolean isValid = false;
        String sql = "select * from users where usename='" + useName + "' and pwd='" + password + "'";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
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
            return true;
        else return false;
    }

    //注册
    public void userregister(String useName, String password) {

        boolean b = false;

        String sql = "select * from users where usename='" + useName + "'";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            if (!rs.next()) {

                sql = "insert into users(usename,pwd) values('" + useName + "','" + password + "')";
                stm.execute(sql);
                b = true;
            }

            rs.close();
            stm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

        if (b)
            System.out.println("注册成功!");
        else System.out.println("失败用户名已存在!");
    }
}
//    public int user_ranking(String usename) throws Exception {
//
//        int rank = 0;
//
//
//
//        Connection connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PWD);
//        Statement stam = connection.createStatement();
//        String sql = "";
//
//
//        return rank;
//    }
//    public void getScore(int score , String usename) throws SQLException {
//        String sql = "insert into user(score) values ('"+score+"') where usename=='"+usename+"';";
//        Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PWD);
//        Statement stm = conn.createStatement();
//        boolean rs = stm.execute(sql);
//
//    }
//}
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