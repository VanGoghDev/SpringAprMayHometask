package ru.firsov.hometask2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.firsov.hometask2.entities.Human;
import ru.firsov.hometask2.repositories.HumanRepository;

@Service
public class HumanService {
    private HumanRepository humanRepository;

    @Autowired
    public void setHumanRepository(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    public Human getHumanById(int id) {
        Human human = humanRepository.findOneById(id);
        return human;
    }

    public HumanService() {
    }
}
