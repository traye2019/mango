package com.louis.mango.controller;

import io.swagger.annotations.ApiImplicitParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.louis.mango.service.SysUserService;

@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;
    
    @GetMapping(value="/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }

    @GetMapping(value="/selectById")
   // @RequestMapping("/selectById")
    //Swagger 调用测试接收不到参数，添加@ApiImplicitParam
    //@ApiImplicitParam(name = "id", value = "id", required = true, dataType = "Integer",paramType="query")
    @ApiImplicitParam(name = "id",paramType="query")
    public Object selectById(Long id) {
       try {
          // Integer valInt = new Integer(id);
          // Long valLng = valInt.longValue();

           return sysUserService.selectByPrimaryKey(id);
       }
       catch (Exception ex){
           return  ex;

       }


    }
}