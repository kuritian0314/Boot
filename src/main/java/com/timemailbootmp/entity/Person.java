package com.timemailbootmp.entity;

import org.springframework.stereotype.Component;

/**
 * @author curry
 * @package com.timemailbootmp.entity
 * @date 2023/1/22 22:27
 * @Version V1.0
 */
@Component
public class Person {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
