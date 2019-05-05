package ru.firsov.hometask1;

import org.springframework.stereotype.Component;

@Component
public class AdultCustomer implements ICustomer{

    private int age;
    private String disease;

    public AdultCustomer(int age, String disease) {
        this.age = age;
        this.disease = disease;
    }

    public AdultCustomer(String age, String disease) {
        this.age = Integer.parseInt(age);
        this.disease = disease;
    }

    public AdultCustomer() {
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public void setAge(String age) {
        this.age = Integer.parseInt(age);
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
