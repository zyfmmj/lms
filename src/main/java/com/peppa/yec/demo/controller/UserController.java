package com.peppa.yec.demo.controller;

import com.peppa.yec.demo.pojo.User;
import com.peppa.yec.demo.service.UserService;
import com.peppa.yec.demo.util.Errors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import javax.faces.annotation.RequestMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author zyf
 */
@Controller
@SessionAttributes("username")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "existsError", method = RequestMethod.POST)
    @ResponseBody
    public String existsError(
            String username,
            String password,
            Model model
    ){
        String result = userService.login(username,password);
        if(Errors.USER_NOT_EXISTS_ERROR.equals(result)){
            return "err1";
        } else if(result == null) {
            return "err2";
        } else {
            model.addAttribute("username",username);
            return "ok";
        }
    }


    @RequestMapping(value = "index", method = RequestMethod.POST)
    public String login(
            String username,
            String password,
            Model model
    ){
        model.addAttribute("username",username);
        return "/index";
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request, SessionStatus sessionStatus){
        HttpSession session = request.getSession();
        System.out.println(session.getAttribute("username"));
        session.invalidate();
        sessionStatus.setComplete();
        return "redirect:/login";
    }

}
