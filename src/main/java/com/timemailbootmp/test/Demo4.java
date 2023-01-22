package com.timemailbootmp.test;

import com.timemailbootmp.config.MyImportSelector;
import com.timemailbootmp.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author curry
 * @package com.timemailbootmp.test
 * @date 2023/1/22 23:42
 * @Version V1.0
 */
@Import(MyImportSelector.class)
public class Demo4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Demo4.class);
        User bean = applicationContext.getBean(User.class);
        System.out.println(bean);
    }
}
