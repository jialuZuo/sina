package com.dao;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.entity.User;

@Component
public class UserDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Resource
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void save(User user){
        hibernateTemplate.save(user);
    }
    public void update(User user){
        hibernateTemplate.update(user);
    }
    public void delete(Integer id){
        User user=getUser(id);
        hibernateTemplate.delete(user);
    }
    public User getUser(Integer id){
        return (User)this.hibernateTemplate.load(User.class,id);
    }
    public List<User> findByUsername(String username){
        List<User> find = (List<User>) hibernateTemplate.find("from User u where u.userName = ?",username);
		return find;
    }
    public List<User> queryByUsername(String username){
        List<User> find = (List<User>) hibernateTemplate.find("from User u where u.userName like ?","%"+username+"%");
		return find;
    }
    public List<User> findAllUsers(){
         List<User> find = (List<User>) this.getHibernateTemplate().find("from User order by userId");
		return find;  
    }
}