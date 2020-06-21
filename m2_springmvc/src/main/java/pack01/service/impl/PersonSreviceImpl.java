package pack01.service.impl;

import pack01.bean.Person;
import pack01.dao.PersonDao;
import pack01.dao.impl.PresonDaoImpl;
import pack01.service.PersonSrevice;

import java.util.List;

public class PersonSreviceImpl implements PersonSrevice {
    @Override
    public List<Person> searchPerson(String keyword) {
        PersonDao personDao=new PresonDaoImpl();
        return   personDao.find(keyword);
    }

    @Override
    public int login(String username, String password) {
        PersonDao personDao=new PresonDaoImpl();
        Person person=new Person();
        person.setName(username);
        person.setPassword(password);
        Person person1 = personDao.find2(person);
        if (person1 == null){
            return -1;
        }else{
            return 1;
        }
    }
}
