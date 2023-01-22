package com.timemailbootmp.entity;


/**
 * @author curry
 * @package com.timemailbootmp.entity
 * @date 2023/1/22 23:22
 * @Version V1.0
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
