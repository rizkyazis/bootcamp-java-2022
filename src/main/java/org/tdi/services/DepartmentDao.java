package org.tdi.services;

import org.tdi.models.Department;

import java.util.List;

public interface DepartmentDao {
    List<Department> getListDepartmentPS();
}
