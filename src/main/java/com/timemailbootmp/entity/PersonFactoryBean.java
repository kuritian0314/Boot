package com.timemailbootmp.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author curry
 * @package com.timemailbootmp.entity
 * @date 2023/1/23 0:48
 * @Version V1.0
 */
public class PersonFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }
}
