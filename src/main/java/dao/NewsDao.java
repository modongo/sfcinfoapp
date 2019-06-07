package dao;

import models.Department;
import models.News;

import java.util.List;

public interface NewsDao {
    //LIST
    List<News> getAll();

    //CREATE

    void add (News news); //****

    //READ
    Department findById(int id);
    List<News> getAllNewssByDepartment(int departmentId);

    //UPDATE
    void update(int id, String name);

    //DELETE
    void deleteById(int id);
    void clearAllDepartments();
}
