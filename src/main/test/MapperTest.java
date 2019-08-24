import blackberry.curd.bean.Department;
import blackberry.curd.bean.Employee;
import blackberry.curd.dao.DepartmentMapper;
import blackberry.curd.dao.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * @author bberzhou@gmail.com
 * @date 8/23/19 15:59
 * Create By IntelliJ IDEA
 */
//使用Spring的test
@RunWith (SpringJUnit4ClassRunner.class)
//  指定Spring配置文件的位置
@ContextConfiguration ({"classpath:applicationContext.xml"})

public class MapperTest {
    /*
        测试dao层的工作,在Spring的项目中可以使用Spring的单元测试，可以自动注入我们需要的组件
    */
    //  测试department的Mapper
//   @Test
//  public void test1(){
//       //1。创建SpringIOC容器
//       ApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
//       //2。从容器中获取mapper
//       DepartmentMapper departmentMapper = context.getBean (DepartmentMapper.class);
//       System.out.println(departmentMapper);

//      输出成功：org.apache.ibatis.binding.MapperProxy@f627d13

//
//   }


    //直接Autowired需要使用的组件
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    //    注入一个批量的sqlSession
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @Test
    public void testCRUD () {
//        System.out.println (departmentMapper);
//        // 1。 插入几个部门,因为部门表主键是自增的，所以不应管第一个字段
//        Department department = new Department (null,"测试部门");
//        Department department1 = new Department (null,"运维部门");
//        departmentMapper.insertSelective (department1);
//        departmentMapper.insertSelective (department);

        //  2。测试员工的mapper
//        Employee employee = new Employee (null,"kang","男","8877@qq.com",1);
//        Employee employee1 = new Employee (null,"jian","女","2265767@qq.com",4);
//        employeeMapper.insertSelective (employee);
//        employeeMapper.insertSelective (employee1);


//        使用SqlSessionTemplate来批量操作
//        EmployeeMapper employeeMapper = sqlSessionTemplate.getMapper (EmployeeMapper.class);
//        for (int i = 0 ; i < 100 ; i++) {
//            //  随机生成一个6位的uuid作为empName
//            String uuid = UUID.randomUUID ().toString ().substring (0,6);
//            employeeMapper.insertSelective (new Employee (null, uuid, "女", "@qq.com", 4));
//
//        }

        System.out.println(departmentMapper.selectByExample (null));
    }


}
