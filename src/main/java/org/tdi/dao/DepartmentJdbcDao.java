package org.tdi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tdi.models.Department;
import org.tdi.services.DepartmentDao;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class DepartmentJdbcDao implements DepartmentDao {
    @Autowired
    private DataSource dataSource;

    @Override
    public List<Department> getListDepartmentPS() {
        String sql = "SELECT department_id, name, description FROM public.department";
        List<Department> departmentList = null;

        try (PreparedStatement data = dataSource.getConnection().prepareStatement(sql)){
            departmentList = new ArrayList<>();
            ResultSet result = data.executeQuery();
            while (result.next()){
                Department department = new Department();
                department.setDekripsi(result.getString("description"));
                department.setName(result.getString("name"));
                department.setId(result.getInt("department_id"));
                departmentList.add(department);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return departmentList;
    }
}
