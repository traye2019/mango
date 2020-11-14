package com.louis.mangoadmin.service;

import java.util.List;

import com.louis.mangoadmin.model.SysUser;

public interface SysUserService {

    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();

    /**
     * 跟据ID 查找实体
     * @param id
     * @return
     */
    SysUser selectByPrimaryKey(Long id);

    /**
    * 插入新的记录
    * */
    int insert(SysUser record);
}