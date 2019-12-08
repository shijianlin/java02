import cn.zr.dao.UserDao;
import cn.zr.dao.UserDaoImpl;
import cn.zr.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    private InputStream is;
    private UserDao userDao;
    @After
    public void destory() throws IOException {

        is.close();
    }
    /**
     * 测试查询所有
     * @throws IOException
     */
    @Test
    public void test01() throws Exception {
        is = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);

        userDao = new UserDaoImpl(factory);
        List<User> list = this.userDao.findAll();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(list);
        System.out.println(json);
        destory();
    }

}
