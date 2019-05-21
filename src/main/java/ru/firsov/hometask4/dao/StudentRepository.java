package ru.firsov.hometask4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.firsov.hometask4.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>, StudentRepositoryCustom{

}
