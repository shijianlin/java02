package cn.zr.dao;

import cn.zr.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    public List<User> findAll() {
        SqlSession session = factory.openSession();
        List<User> users = session.selectList("cn.zr.dao.UserDao.findAll");//参数是能获取到配置信息的key
        session.close();
        return users;
    }

    public void saveUser(User user) {

    }

    public void updateUser(User user) {

    }

    public void deleteUser(Integer id) {

    }

    public User findById(Integer id) {
        return null;
    }

    public List<User> findByName(String name) {
        return null;
    }

    public int findTotal() {
        return 0;
    }
}
