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
}
