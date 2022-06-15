package login.ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCheck {
    public boolean checkSign(String accountNumber) {
        String valicateAccount="^[\\w@\\$\\^!~,.\\*]+$";
        Pattern pattern = Pattern.compile(valicateAccount);
        Matcher matcher = pattern.matcher(accountNumber);
        boolean matches = matcher.matches();
        if(matches) {
            return true;
        }else {
            return false;
        }
    }
    public boolean checkAccount(String accountNumber) {
        String valicateAccount="^[\\w@\\$\\^!~,.\\*]{7}+$";
        Pattern pattern = Pattern.compile(valicateAccount);
        Matcher matcher = pattern.matcher(accountNumber);
        boolean matches = matcher.matches();
        if(matches) {
            return true;
        }else {
            return false;
        }
    }

    //密码校验：
    public boolean checkPassword(String passWord) {
        String valicatePassword="^[\\w@\\$\\^!~,.\\*]{8,16}+$";
        Pattern pattern = Pattern.compile(valicatePassword);
        Matcher matcher = pattern.matcher(passWord);
        boolean matches = matcher.matches();
        if(matches) {
            return true;
        }else {
            return false;
        }
    }
}
