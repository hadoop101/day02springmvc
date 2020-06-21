package pack01.service.impl;

import org.junit.Test;
import pack01.service.PersonSrevice;

import static org.junit.Assert.*;

public class PersonSreviceImplTest {

    @Test
    public void testLogin() {
        //1:获取页面的账号与密码
        String username="jack";
        String password="1234";
        //2:业务查询账户密码是否正确
        PersonSrevice personSrevice=new PersonSreviceImpl();
       int result = personSrevice.login(username,password);
        //3:返回结果int  1,-1 账号不存在，-2密码出错
        System.out.println(result);
    }
}