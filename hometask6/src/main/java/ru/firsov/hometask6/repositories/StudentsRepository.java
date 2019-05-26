package ru.firsov.hometask6.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.morou.entities.Student;

@Repository
public interface StudentsRepository extends PagingAndSortingRepository<Student, Long> {
//    @Query(value = "SELECT s.id\n" +
//            "FROM students s\n" +
//            "LEFT JOIN students_courses c on s.id = c.student_id\n" +
//            "GROUP BY s.id\n" +
//            "ORDER BY count(distinct c.course_id) DESC;", nativeQuery = true)
//    List<Integer> getStudentsIdsByCoursesCountDesc(PageRequest pageRequest);
//
//    @Query(value = "SELECT s FROM Student s LEFT JOIN s.courses c GROUP BY s.id ORDER BY count(c)")
//    List<Student> getStudentsByCoursesCountDescHQL(Pageable pageable);

    Student findOneById(Long id);
//    Student findByNameAndLastName(String name, String secondName);
}
