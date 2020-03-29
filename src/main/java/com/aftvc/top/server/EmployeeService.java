package com.aftvc.top.server;

import com.aftvc.top.bean.Employee;
import com.aftvc.top.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author     ：Yan
 * @ Date       ：Created in 9:00 2020/3/26
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public int getEmpCount(){
        return employeeMapper.countEmps();
    }
    public List<Employee> getEmpList(Integer offser, Integer limit){
        return employeeMapper.selectByLimitAndOffset(offser, limit);
    }
    public Employee getEmpById(Integer empId){
        return employeeMapper.selectOneById(empId);
    }
    public Employee getEmpByName(String empName){return employeeMapper.selectOneByName(empName);};
    public int updateEmpById(Integer empId, Employee employee){return employeeMapper.updateOneById(empId, employee);}
    public int deleteEmpById(Integer empId){
        return employeeMapper.deleteOneById(empId);
    }
    public int addEmp(Employee employee){
        return employeeMapper.insertOne(employee);
    }
}
