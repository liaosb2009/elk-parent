package com.elk.portal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by liao on 2019/2/20.
 * 用户管理
 */
@Controller
@RequestMapping("main")
public class MainController {

    //记录器
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 跳转到登录页面
     * @return
     */

    @GetMapping("")
    public Object getIndex() {
        logger.info("跳入登录");
        return "main/login";
    }

    /**
     * 跳转到注册
     * @return
     */
    @GetMapping("/getRegister")
    public Object getRegister() {


        return "main/register";
    }




}
