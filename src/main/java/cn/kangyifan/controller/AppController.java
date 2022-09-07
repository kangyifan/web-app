package cn.kangyifan.controller;

import cn.hutool.system.JavaInfo;
import cn.hutool.system.SystemUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {

    @GetMapping
    public String index(){
        return "This is a web app.";
    }

    @GetMapping("/java")
    public String getEnv(){
        JavaInfo javaInfo = SystemUtil.getJavaInfo();
        return javaInfo.toString();
    }


}
