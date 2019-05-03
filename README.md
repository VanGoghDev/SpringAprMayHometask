# SpringAprMayHometask
## Урок 1. Введение в Spring.
### Вопросы: 
   1. Если у нас существует два бина, которые являются двумя разными реализациями одного и того же интерфейса.
   Например: есть интерфейс ICustomer и есть два класса, которые имплементируют его (AdultCustomer и ChildCustomer).
   А так же существует класс HospitalImpl (который является сервисом?), в котором есть метод setCustomer, помеченный
   аннотацией Autowired, который получает на вход объект класса ICustomer, то как лучше всего обработать эту ситуацию?
   Пометить аннотицией Qualifier, то какой именно бин мы ожидаем или есть другие варианты? 
   Если не указывать аннотацию Qualifier, то выдает предупреждение: Could not autowire. There is more than one bean of
   'ICustomer type'.
   
   #### Пример кода
   ```Java
   @Configuration
   public class AppConfig {
       @Bean(name="childCustomer")
       public ChildCustomer childCustomer() {
           return new ChildCustomer();
       }
   
       @Bean(name="adultCustomer")
       public AdultCustomer adultCustomer(@Value("29") String age, @Value("gastritis") String disease) {
           return new AdultCustomer(age, disease);
       }
   
       @Bean(name="hospital")
       public IHospital hospital(@Qualifier("adultCustomer") ICustomer customer) {
           IHospital hospital = new HospitalImpl();
           hospital.setCustomer(customer);
           return hospital;
       }
   }
   ```