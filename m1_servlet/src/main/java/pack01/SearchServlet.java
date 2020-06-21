package pack01;

//2:定义一个Servlet





import pack01.bean.Person;
import pack01.service.PersonSrevice;
import pack01.service.impl.PersonSreviceImpl;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("你调用了我的doGet方法");
        doPost(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("你调用了我的doPost方法");
        //2.1获取请求参数
        String keyword=req.getParameter("keyword");
        System.out.println(keyword);
        //2.2处理请求参数
        PersonSrevice service = new PersonSreviceImpl();
        List<Person> persons=service.searchPerson(keyword);
        //2.3将处理结果响应给浏览器
        //resp.getWriter().println(persons);
        req.setAttribute("list",persons);
        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }
}
