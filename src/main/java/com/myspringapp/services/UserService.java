package com.myspringapp.services;

import com.myspringapp.component.User;

public interface UserService {
 
    User findById(int id);
     
    User findBySso(String sso);
     
}