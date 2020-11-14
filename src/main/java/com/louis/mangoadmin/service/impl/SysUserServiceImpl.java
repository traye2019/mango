package com.louis.mangoadmin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.mangoadmin.dao.SysUserMapper;
import com.louis.mangoadmin.model.SysUser;
import com.louis.mangoadmin.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService {
    
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }


    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public   int insert(SysUser record){
        return   sysUserMapper.insert(record);
    }
}