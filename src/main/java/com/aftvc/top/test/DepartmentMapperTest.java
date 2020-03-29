package com.aftvc.top.test;

import com.aftvc.top.bean.Department;
import com.aftvc.top.mapper.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ Author     ：Yan
 * @ Date       ：Created in 13:32 2020/3/27
 * @ Description：
 * @ Modified By：
 * @Version: $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:springmvc-config.xml"})
public class DepartmentMapperTest {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void insertDeptTest(){
        Department department=new Department(null,"admin3","test");
        int res=0;
        res=departmentMapper.insertDept(department);
        System.out.println(res);
    }

    @Test
    public void updateDeptTest(){
        Department department = new Department(null, "Tomsom", "研发部");
        int res = departmentMapper.updateDeptById(1, department);
        System.out.println(res);
    }

    @Test
    public void deleteDeptTest(){
        int res = departmentMapper.deleteDeptById(7);
        System.out.println(res);
    }

    @Test
    public void selectOneByIdTest(){
        Department department = departmentMapper.selectOneById(1);
        System.out.println(department);
    }

    @Test
    public void selectOneByLeaderTest(){
        Department department = departmentMapper.selectOneByLeader("马云");
        System.out.println(department);
    }

    @Test
    public void selectOneByNameTest(){
        Department department = departmentMapper.selectOneByName("CEO");
        System.out.println(department);
    }

    @Test
    public void selectDeptListTest(){
        List<Department> departmentList = departmentMapper.selectDeptList();
        for (int i = 0; i < departmentList.size(); i++) {
            System.out.println(departmentList.get(i));
        }
    }

    @Test
    public void selectDeptsByLimitAndOffsetTest(){
        List<Department> departments = departmentMapper.selectDeptsByLimitAndOffset(2,5);
        System.out.println(departments.size());
        for (int i = 0; i < departments.size(); i++) {
            System.out.println(departments.get(i));
        }
    }

    @Test
    public void countDeptsTest(){
        int count = departmentMapper.countDepts();
        System.out.println(count);
    }

}
