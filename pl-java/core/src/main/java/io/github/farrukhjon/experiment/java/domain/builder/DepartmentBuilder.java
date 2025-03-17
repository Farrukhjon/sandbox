package io.github.farrukhjon.experiment.java.domain.builder;

import io.github.farrukhjon.experiment.java.domain.Department;

/**
 * Created by Farrukhjon on 05-Oct-15.
 */
public class DepartmentBuilder implements Builder<Department> {

    private int id;
    private String name;

    public DepartmentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public DepartmentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Department build() {
        return new Department(id, name);
    }
}
