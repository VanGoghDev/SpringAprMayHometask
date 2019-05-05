package ru.firsov.hometask2.repositories;

import org.springframework.stereotype.Component;
import ru.firsov.hometask2.entities.Human;

@Component
public class HumanRepository {

    public Human findOneById(int id) {
        Human human = new Human();
        human.setFirstName("Vasya" + id);
        human.setLastName("Ivanov" + id);
        return human;
    }
}
