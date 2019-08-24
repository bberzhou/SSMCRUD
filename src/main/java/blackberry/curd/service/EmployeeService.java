package blackberry.curd.service;

import blackberry.curd.bean.Employee;
import blackberry.curd.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bberzhou@gmail.com
 * @date 8/24/19 09:17
 * Create By IntelliJ IDEA
 */


@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    //  查询所有员工的信息，且带有部门信息
    public List<Employee> getAll () {

        return employeeMapper.selectByExampleWithDept (null);
    }
}
