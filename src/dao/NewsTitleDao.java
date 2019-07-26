package dao;

import entity.NewsTitle;
import sun.awt.image.ImageWatched;
import util.DBUtil;

import javax.swing.plaf.nimbus.State;
import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class NewsTitleDao {
    private Connection conn;
    private Statement stm;
    private ResultSet rs;
    public List<NewsTitle> findAll(){
        List<NewsTitle> list = new LinkedList<>();
        String sql = "select * from newstitle";
        try {
            conn = DBUtil.getConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()){
                NewsTitle news = new NewsTitle();
                news.setId(rs.getInt("id"));
                news.setTitlename(rs.getString("titlename"));
                news.setCreator(rs.getString("creator"));
                news.setCreatetime((Date) rs.getObject("createtime"));
                list.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeAll(conn,stm,rs);
        }
        return list;
    }

}
