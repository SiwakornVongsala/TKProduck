package tkproduct;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {

    protected static Connection getConnection() {
        try {
            String Driver = com.mysql.jdbc.Driver.class.getName();
            String coding = "characterEncoding=UTF-8";
//            String url = "jdbc:mysql://localhost/TKBanana?" + coding;
            String url = "jdbc:mysql://192.168.0.239/TKBanana?" + coding;
            Class.forName(Driver);
//            return DriverManager.getConnection(url, "root", "1234");
            return DriverManager.getConnection(url, "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        try {
            db.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
