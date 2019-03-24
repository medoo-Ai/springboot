package springboot.com.cn;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import springboot.com.cn.bean.Student;
import springboot.com.cn.dao.StudentDao;

/**
 * @auther SyntacticSugar
 * @data 2019/3/24 0024下午 2:13
 */

public class JdbcTest {

    @Autowired
    private StudentDao studentDao;
    @Test
    public  void test(Student student){
//      studentDao.insertStudent();
    }
}
