package pack01.dao.impl;

import pack01.bean.Person;
import pack01.dao.PersonDao;

import java.util.ArrayList;
import java.util.List;

public class PresonDaoImpl implements PersonDao {
    @Override
    public List<Person> find(String keyword) {
        //模拟查询数据库
        List<Person> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(new Person(keyword+" rose"+i,33+i+""));
        }
        return list;
    }
    private static   List<Person> list=new ArrayList<>();
    static {
        list.add(new Person("jack","1234","33"));
    }
    @Override
    public Person find2(Person person) {
        Person per =null;
        for(Person p:list){
            if(p.getName().equals(person.getName())&&p.getPassword().equals(person.getPassword())){
                per=p;
            }
        }
        return per;
    }
}
