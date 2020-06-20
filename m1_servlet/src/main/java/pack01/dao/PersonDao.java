package pack01.dao;

import pack01.bean.Person;

import java.util.List;

public interface PersonDao {
    List<Person> find(String keyword);
}
