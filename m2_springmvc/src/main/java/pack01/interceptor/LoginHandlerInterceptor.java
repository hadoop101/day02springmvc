package pack01.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//1:实现拦截器的接口
public class LoginHandlerInterceptor implements HandlerInterceptor {
    //2:搜索 在拦截前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        //判断session里面是否有用户
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        System.out.println(name);
        if(name == null){
            //强制登录
            response.sendRedirect("/m2_springmvc/login3.jsp");
            return  false;//不放行
        }else {
            return true;//放行
        }

    }


}
