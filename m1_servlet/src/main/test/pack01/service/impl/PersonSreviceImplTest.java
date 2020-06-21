package pack01.service.impl;

import org.junit.Test;
import pack01.bean.Person;
import pack01.service.PersonSrevice;

import java.util.List;

import static org.junit.Assert.*;

public class PersonSreviceImplTest {

    @Test
    public void searchPerson() {
        //1:模拟页面获取keyword
        String keyword="jack";
        //2:调用Service
        PersonSrevice personSrevice=new PersonSreviceImpl();
        List<Person> list=personSrevice.searchPerson(keyword);
        //3:如果数据没有响应打印（模拟浏览器响应)
        System.out.println(list);
    }
}