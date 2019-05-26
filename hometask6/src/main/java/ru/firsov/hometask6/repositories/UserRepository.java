package ru.firsov.hometask6.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.morou.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findOneByUserName(String userName);
}