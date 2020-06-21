package pack01.controller;


import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pack01.bean.Person;
import pack01.service.PersonSrevice;
import pack01.service.impl.PersonSreviceImpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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
    /*
    @RequestMapping(path = "/login",method = {RequestMethod.GET,RequestMethod.POST})
    public String login(Person person) {
        //1:获取页面的账号与密码
        //2:业务查询账户密码是否正确
        System.out.println(person);
        PersonSrevice personSrevice=new PersonSreviceImpl();
        int result = personSrevice.login(person.getName(),person.getPassword());
        //3:返回结果int  1,-1 账号不存在，-2密码出错
        return result == 1 ? "success":"failure";
    }*/

    /*
    @RequestMapping(path = "/login",method = {RequestMethod.GET,RequestMethod.POST})
    public String login(Person person,HttpServletRequest request) {
        //1:获取页面的账号与密码
        //2:业务查询账户密码是否正确
        System.out.println(person);
        PersonSrevice personSrevice=new PersonSreviceImpl();
        int result = personSrevice.login(person.getName(),person.getPassword());
        if(result == 1){
            //查所有用户数据带到页面去显示list.jsp
            List<Person> list = personSrevice.searchPerson("AAA");
            request.setAttribute("list",list);
            return  "list";//默认是forward
        }else{
            
            return "failure";
        }
    }
    */
    @RequestMapping(path = "/login",method = {RequestMethod.GET,RequestMethod.POST})
    public ModelAndView login(Person person, HttpServletRequest request) {
        //1:获取页面的账号与密码
        //2:业务查询账户密码是否正确
        System.out.println(person);
        PersonSrevice personSrevice=new PersonSreviceImpl();
        int result = personSrevice.login(person.getName(),person.getPassword());
        ModelAndView mv  = new ModelAndView();
        if(result == 1){
            //查所有用户数据带到页面去显示list.jsp
            request.getSession().setAttribute("name",person.getName());
            List<Person> list = personSrevice.searchPerson("AAA");
            mv.addObject("list",list);//添加一个键值对，参1 键 参2 值
            mv.setViewName("list"); //默认是forward
        }else{

            mv.setViewName("failure");
        }
        return mv;
    }

    //ResponseBody将return 的对象转成json字符串返回给浏览器
    //RequestBody将浏览器提交过来的json数据转换成javaBean对象
    @RequestMapping(path = "/testjson",method = {RequestMethod.GET,RequestMethod.POST})
    public  @ResponseBody  List<Person> testjson(@RequestBody Person person) {
        //1:获取页面的账号与密码
        //2:业务查询账户密码是否正确
        System.out.println(person);
        PersonSrevice personSrevice=new PersonSreviceImpl();
        int result = personSrevice.login(person.getName(),person.getPassword());
        if(result == 1){
            //查所有用户数据带到页面去显示list.jsp

            List<Person> list = personSrevice.searchPerson("AAA");
            return  list;

        }else{
            return new ArrayList<>();
        }

    }

}