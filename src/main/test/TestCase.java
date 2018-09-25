import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by jiangcx on 2018/9/21
 */
public class TestCase {
    @Test
    public void test01(){
        try {
            ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
            DataSource dataSource = (DataSource) ac.getBean("dataSource");
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
