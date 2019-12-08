package cn.zr.dao;

import cn.zr.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 删除
     */
    void deleteUser(Integer id);

    /**
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * 模糊查询
     * @param name
     * @return
     */
    List<User> findByName(String name);

    /**
     * 查询总用户数
     * @return
     */
    int findTotal();

}
