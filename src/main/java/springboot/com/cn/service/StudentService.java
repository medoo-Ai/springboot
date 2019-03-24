package springboot.com.cn.service;

import springboot.com.cn.bean.Student;
import springboot.com.cn.dao.StudentDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @auther SyntacticSugar
 * @data 2019/3/24 0024下午 1:48
 */
public class StudentService {
    // 原生jdbc
    public int getStudent() {
        StudentDao stuDao = new StudentDao();
        Student stu = new Student();
        stu.setName("dadoudou");
        stu.setAge(15);
        Connection conn = null;
        int result = 0;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
            // 非自动提交事务
            conn.setAutoCommit(false);
            result = stuDao.insertStudent(conn, stu);
            // 提交事务
            conn.commit();

        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {

            if (conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        return result;

    }
}
