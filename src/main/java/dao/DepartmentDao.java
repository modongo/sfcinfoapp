package dao;

import models.Department;
import models.News;
import models.Staff;
//import models.Staff;
import java.util.List;

public interface DepartmentDao {

    //LIST
    List<Department> getAll();

    //CREATE

    void add (Department department); //****

    //READ
    Department findById(int id);
    List<News> getAllNewssByDepartment(int departmentId);

    //UPDATE
    void update(int id, String name);

    //DELETE
    void deleteById(int id);
    void clearAllDepartments();
}
