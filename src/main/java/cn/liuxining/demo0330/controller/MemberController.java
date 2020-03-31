package cn.liuxining.demo0330.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
//@RequestMapping("/member")
public class MemberController {


    private static Logger log = LoggerFactory.getLogger(MemberController.class);

    @RequestMapping("/member/func1")
    public String hello(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = "hello1:" + dateFormat.format(new Date());
        log.info(str);
        return str;
    }

    @RequestMapping("/member/func2")
    public String hello2(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = "hello2:" + dateFormat.format(new Date());
        log.info(str);
        return str;
    }

}
