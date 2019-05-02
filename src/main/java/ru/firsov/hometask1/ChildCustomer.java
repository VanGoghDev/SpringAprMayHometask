package ru.firsov.hometask1;

public class ChildCustomer implements ICustomer{
    private int age = 8;
    private String disease = "High temperature";

    public ChildCustomer() {
    }

    public ChildCustomer(int age, String disease) {
        this.age = age;
        this.disease = disease;
    }

    public int getAge() {
        return age;

    }

    public String getDisease() {
        return disease;
    }
}
