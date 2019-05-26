package ru.firsov.hometask6.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.morou.entities.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findOneByName(String roleName);
}
