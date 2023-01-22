package com.timemailbootmp.config;

import com.timemailbootmp.entity.Person;
import com.timemailbootmp.entity.PersonFactoryBean;
import com.timemailbootmp.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author curry
 * @package com.timemailbootmp.config
 * @date 2023/1/22 23:24
 * @Version V1.0
 */
@Configuration
public class Demo {
    @Bean
    public User user() {
        User user = new User();
        user.setName("JanYork");
        return user;
    }

    @Bean
    public PersonFactoryBean personFactoryBean() {
        return new PersonFactoryBean();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo.class);
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
    }
}
