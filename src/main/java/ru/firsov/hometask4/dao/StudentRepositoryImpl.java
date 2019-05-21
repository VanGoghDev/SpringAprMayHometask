package ru.firsov.hometask4.dao;

import ru.firsov.hometask4.entities.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Student> getByName(String name) {
        return null;
    }

    @Override
    public List<Student> getMaxScore() {
        Query query = entityManager.createNativeQuery("SELECT student FROM student WHERE student.score = MAX;", Student.class);
        return query.getResultList();
    }
}
