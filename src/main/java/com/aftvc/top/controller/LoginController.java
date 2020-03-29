package com.aftvc.top.controller;
import com.aftvc.top.util.JsonMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
/**
 * @ Author     ：Yan
 * @ Date       ：Created in 20:22 2020/3/27
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Controller
@RequestMapping(value = "/hrms")
public class LoginController {

    /**
     * 登录：跳转到登录页面
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    /**
     * 对登录页面输入的用户名和密码做简单的判断
     * @param request
     * @return
     */
    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    @ResponseBody
    public JsonMsg dologin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + password);
        if ("yhadmin".equals(username)&&"adminadmin".equals(password)){
            return JsonMsg.success();
        }else{
            return JsonMsg.fail().addInfo("login_error","输入的账号密码不匹配，请重新输入!");
        }
    }

    /**
     * 跳转到主页面
     * @return
     */
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(){
        return "main";
    }

    /**
     * 退出登录：从主页面跳转到登录页面
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(){
        return "login";
    }






}
