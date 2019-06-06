import java.util.HashMap;
import java.util.List;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.handlebars.HandlebarsTemplateEngine;
import com.google.gson.Gson;



import dao.DB;
import dao.Sql2oDepartmentDao;
import dao.Sql2oStaffDao;
import models.Department;
import models.News;
import models.Staff;
//import org.sql2o.Sql2o;

public class App {
    public static void main(String[] args) {
        ProcessBuilder process = new ProcessBuilder();
        Integer port;

        // This tells our app that if Heroku sets a port for us, we need to use that port.
        // Otherwise, if they do not, continue using port 4567.

        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }

        port(port);


        staticFileLocation("/public");
        Sql2oStaffDao staffDao = new Sql2oStaffDao(DB.sql2o);
        Sql2oDepartmentDao departmentDao = new Sql2oDepartmentDao(DB.sql2o);
        Gson gson = new Gson();



        //get: show all tasks in all department and show all sections
        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            List<Department> allDepartments = departmentDao.getAll();
            model.put("departments", allDepartments);
            List<Staff> staffs = staffDao.getAll();
            model.put("staffs", staffs);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/alldepartments", "application/json", (req, res) -> {
            res.type("application/json");
            return gson.toJson(departmentDao.getAll());
        });
        get("/allstaff", "application/json", (req, res) -> {
            res.type("application/json");
            return gson.toJson(staffDao.getAll());
        });

    }
}