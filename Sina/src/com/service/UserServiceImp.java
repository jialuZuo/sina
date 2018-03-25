package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.UserDao;
import com.entity.User;

@Service("userService")
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao UserDao;

    @Override
    public boolean exits(String username){
        List<User> userList = UserDao.findByUsername(username);
        if(userList.size()>0)
            return true;
        else
            return false;
    }

    @Override
    public List<User> queryUsers(String username){
        if(username == null || "".equals(username))
            return UserDao.findAllUsers();
        else return UserDao.queryByUsername(username);
    }

    @Override
     public User getUser(Integer id){
            return UserDao.getUser(id);
    }

    @Override
    @Transactional
    public void save(User user){
        UserDao.save(user);
    }

    @Override
    @Transactional
    public void modifyUser(User user){
        UserDao.update(user);
    }

    @Override
    @Transactional
    public void deleteUser(Integer id){
        UserDao.delete(id);
    }
}