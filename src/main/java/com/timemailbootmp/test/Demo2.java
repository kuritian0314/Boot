package com.timemailbootmp.test;

import com.timemailbootmp.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author curry
 * @package com.timemailbootmp.test
 * @date 2023/1/22 23:26
 * @Version V1.0
 */
@ComponentScan(basePackages = "com.timemailbootmp.entity")
public class Demo2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo2.class);
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
    }
}
