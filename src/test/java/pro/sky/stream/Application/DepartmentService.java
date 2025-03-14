package pro.sky.stream.Application;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {

    Employee findEmployeeWithMaxSalary(int departmentId);

    Employee findEmployeeWithMinSalary(int departmentId);

    Map<Integer, List<Employee>> findEmployeesByDepartmentSortedByNameSurname();

    Collection<Employee> findEmployeesByDepartmentSortedByNameSurname(int departmentId);

}


