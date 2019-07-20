/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: BookController
 * Author:   laosun
 * Date:     2019/7/16 3:26 PM
 * Description:
 */
package com.zhiyou.springboot4thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class BookController {

    /**
     * 全部基于 Spring Boot给 Thymeleaf的默认配置
     * 所以下面会跳转到 classpath:/templates/home.html 页面
     *
     * @param paramMap
     * @return
     */

    @RequestMapping("/home")
    public String goHome(Model model){

        /** 默认model的内容会放在请求域中，页面可以直接使用Thymeleaf取值*/
        model.addAttribute("name","Springboot2.x");
        model.addAttribute("writer","laosun");

        return "home";
    }
}
