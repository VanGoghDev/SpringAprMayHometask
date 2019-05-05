package ru.firsov.hometask1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hospital")
public class HospitalImpl implements IHospital{

    //@Autowired(required = false)
    //@Qualifier("adultCustomer")
    private ICustomer customer;

    public void sayCabinet() {
        if (customer.getAge() < 19)
            System.out.println("Cabinet of pediatrician number 1");
        else if (customer.getAge() >= 19 && customer.getDisease().equals("cough"))
            System.out.println("Cabinet of therapist number 2");
        else if (customer.getAge() >= 19 && customer.getDisease().equals("gastritis"))
            System.out.println("Cabinet of gastroenterologist number 3");
    }

    @Autowired(required = false)
    public void setCustomer(ICustomer customer) {
        this.customer = customer;
    }

    public ICustomer getCustomer() {
        return customer;
    }
}
