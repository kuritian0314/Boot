package com.timemailbootmp.test;

import com.timemailbootmp.config.Demo;
import com.timemailbootmp.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author curry
 * @package com.timemailbootmp.test
 * @date 2023/1/22 23:33
 * @Version V1.0
 */
@Import(Demo.class)
public class Demo3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo3.class);
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean);
    }
}
