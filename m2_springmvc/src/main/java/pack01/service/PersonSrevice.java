package pack01.service;

import pack01.bean.Person;

import java.util.List;

public interface PersonSrevice {
    List<Person> searchPerson(String keyword);

    int login(String username, String password);
}
