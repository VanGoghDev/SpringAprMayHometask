package ru.firsov.hometask1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name="childCustomer")
    public ChildCustomer childCustomer() {
        return new ChildCustomer();
    }

    @Bean(name="adultCustomer")
    public AdultCustomer adultCustomer(@Value("29") String age, @Value("gastritis") String disease) {
        AdultCustomer adultCustomer = new AdultCustomer(age, disease);
        return adultCustomer;
    }

    @Bean(name="hospital")
    public IHospital hospital(@Qualifier("adultCustomer") ICustomer customer) {
        IHospital hospital = new HospitalImpl();
        hospital.setCustomer(customer);
        return hospital;
    }
}
