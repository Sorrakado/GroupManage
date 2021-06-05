package dao;

import entity.User;

import java.util.List;

public class UserDAO {
    //添加新用户
    boolean insert(User user){
        return true;
    }
    //查询所有用户信息
    List<User> select(){

        return null;
    }
    //
    User select(String name,String password){

        return null;
    }
    boolean update(User user){
        return true;
    }

}
