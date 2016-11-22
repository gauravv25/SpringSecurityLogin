package com.myspringapp.dao;

import com.myspringapp.component.User;

public interface UserDao {
 
    User findById(int id);
     
    User findBySSO(String sso);
     
}
