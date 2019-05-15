package ru.firsov.hometask4.dao;

import ru.firsov.hometask4.entities.Student;

import java.util.List;

public interface StudentRepositoryCustom {
    List<Student> getByName(String name);
    List<Student> getMaxScore();
}
