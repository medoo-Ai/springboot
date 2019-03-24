package springboot.com.cn.dao;

import springboot.com.cn.bean.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @auther SyntacticSugar
 * @data 2019/3/24 0024下午 1:53
 */
public class StudentDao {
    PreparedStatement ps = null;

    public int insertStudent(Connection conn, Student stu) throws SQLException {
        try {
            ps = conn.prepareStatement("insert into t_stu values(?,?)");
            ps.setString(1, stu.getName());
            ps.setInt(2, stu.getAge());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ps.close();
        }
        return ps.executeUpdate();
    }




}
