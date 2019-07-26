package util;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String url = "jdbc:mysql://cy.stave.tech:3306/jsp1?"
            + "serverTimezone=Asia/Shanghai&useSSL=false&" + "characterEncoding=utf8";
    private static String user = "root";
    private static String password = "153007lwj";
    static {
        try {
            Class.forName(driver);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }


    public static void closeAll(Connection conn,Statement st,ResultSet rs) {

        try {
            if(rs!=null) {
                rs.close();
            }
            if(st!=null) {
                st.close();
            }
            if(conn!=null) {
                conn.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
