import login.ui.LoginInterface;

import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException {

//        lsq.SQLdome root2 = new lsq.SQLdome();
//        root2.userregister("root2", "5201314");
//        root2.login("sdas","sda");

        new LoginInterface().showUI();

//        new GameView().showView();
//        new RegisterInterface().showUI();

//        new sql_user().getScore(5,"root1");

    }
}
