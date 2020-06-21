package pack01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//配置springmvc 三：创建SearchController
@Controller
public class SearchController {

    //建立请求地址跟控制器方法的关系
    @RequestMapping("/search")
    public String search(String keyword){
        System.out.println(keyword);
        System.out.println("你调用了我的search方法");
        return  "success";
    }
}
