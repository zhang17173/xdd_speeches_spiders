package file;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ToMysql {
    /**
     *
     * @param title 标题
     * @param time  时间
     * @param source  来源
     * @param text  文本信息
     * @param code  带格式的文本信息
     * @param url   URL
     */
    public static void toMysql(String title, String time, String source, String text, String code, String url) {
        try {
            System.out.println(title);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://115.156.114.151:3306/gedi?useSSL=false&serverTimezone=UTC",
                "gedi",
                "gedi@gedi.com"
            );
            PreparedStatement pre = conn.prepareStatement("insert into speak2_copy(title,publish_time,source,text,code,url) values(?,?,?,?,?,?)");
            pre.setObject(1, title);
            pre.setObject(2, time);
            pre.setObject(3, source);
            pre.setObject(4, text);
            pre.setObject(5, code);
            pre.setObject(6, url);
            pre.execute();
            conn.close();
            pre.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
