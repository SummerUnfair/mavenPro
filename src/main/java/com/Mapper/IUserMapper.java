package com.Mapper;

import com.Pojo.User;

import java.util.List;

public interface IUserMapper {
    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}
