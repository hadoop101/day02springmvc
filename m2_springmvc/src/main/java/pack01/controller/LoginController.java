package pack01.controller;


import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pack01.bean.Person;
import pack01.service.PersonSrevice;
import pack01.service.impl.PersonSreviceImpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/person")
public class LoginController {
    /*
    @RequestMapping(path = "/login",method = {RequestMethod.GET,RequestMethod.POST})
    public String login(String username,String password) {
        //1:获取页面的账号与密码
        //2:业务查询账户密码是否正确
        PersonSrevice personSrevice=new PersonSreviceImpl();
        int result = personSrevice.login(username,password);
        //3:返回结果int  1,-1 账号不存在，-2密码出错
        return result == 1 ? "success":"failure";
    }
    */
    /*
    @RequestMapping(path = "/login",method = {RequestMethod.GET,RequestMethod.POST})
    public String login(HttpServletRequest request, HttpServletResponse response) {
        //1:获取页面的账号与密码
        //2:业务查询账户密码是否正确
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        PersonSrevice personSrevice=new PersonSreviceImpl();
        int result = personSrevice.login(username,password);
        //3:返回结果int  1,-1 账号不存在，-2密码出错
        return result == 1 ? "success":"failure";
    }

     */
    @RequestMapping(path = "/login",method = {RequestMethod.GET,RequestMethod.POST})
    public String login(Person person) {
        //1:获取页面的账号与密码
        //2:业务查询账户密码是否正确
        System.out.println(person);
        PersonSrevice personSrevice=new PersonSreviceImpl();
        int result = personSrevice.login(person.getName(),person.getPassword());
        //3:返回结果int  1,-1 账号不存在，-2密码出错
        return result == 1 ? "success":"failure";
    }


}