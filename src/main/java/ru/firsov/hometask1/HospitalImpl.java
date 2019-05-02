package ru.firsov.hometask1;

public class HospitalImpl implements IHospital{
    private ICustomer customer;

    public void sayCabinet() {
        if (customer.getAge() < 19)
            System.out.println("Cabinet of pediatrician number 1");
        else if (customer.getAge() >= 19 && customer.getDisease().equals("cough"))
            System.out.println("Cabinet of therapist number 2");
        else if (customer.getAge() >= 19 && customer.getDisease().equals("gastritis"))
            System.out.println("Cabinet of therapist number 3");
    }

    public void setCustomer(ICustomer customer) {
        this.customer = customer;
    }

    public ICustomer getCustomer() {
        return customer;
    }
}
