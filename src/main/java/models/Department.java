package models;

import java.util.Objects;

public class Department {

    private int id;
    private String deptname;
    private String description;

    public Department(String deptname, String description) {
        this.deptname = deptname;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return getId() == that.getId() &&
                getDeptname().equals(that.getDeptname()) &&
                getDescription().equals(that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDeptname(), getDescription());
    }
}
