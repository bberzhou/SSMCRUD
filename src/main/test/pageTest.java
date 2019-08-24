import blackberry.curd.bean.Employee;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * @author bberzhou@gmail.com
 * @date 8/24/19 09:54
 * Create By IntelliJ IDEA
 * 使用Spring测试模块提供的测试请求功能来测试CRUD请求的正确性
 * Spring测试的时候需要servlet3.0的支持
 */
@RunWith (SpringJUnit4ClassRunner.class)
@ContextConfiguration (locations = {"classpath:applicationContext.xml", "file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
@WebAppConfiguration

public class pageTest {
    //  传入SpringMVC的ioc
    @Autowired
    WebApplicationContext context;
    //  虚拟MVC请求，获取处理结果
    MockMvc mockMvc;

    @Before
    public void initMockMVC () {
        mockMvc = MockMvcBuilders.webAppContextSetup (context).build ();


    }


    @Test
    public void testPage () throws Exception {
        //  模拟一个get请求，并拿到返回值
        MvcResult result = mockMvc.perform (MockMvcRequestBuilders.get ("/emps").param ("pageNum", "5")).andReturn ();

        //  请求成功以后，请求域中会有pageInfo，可以去除pageInfo进行验证
        MockHttpServletRequest request = result.getRequest ();

        PageInfo pageInfo = (PageInfo) request.getAttribute ("pageInfo");
        System.out.println ("当前页码," + pageInfo.getPageNum ());
        System.out.println ("总的页码," + pageInfo.getPages ());
        System.out.println ("总的记录数," + pageInfo.getTotal ());
        System.out.println ("在页面中需要连续显示的页码:");
        int[] nums = pageInfo.getNavigatepageNums ();
        for (int i : nums) {
            System.out.println ("  " + i);

        }

        //  获取员工的数据

        List<Employee> employees = pageInfo.getList ();
        for (Employee employee : employees) {
            System.out.println (employee.getdId () + " " + employee.getEmpName ());

        }
    }
    /*
        当前页码,5
        总的页码,34
        总的记录数,203
        在页面中需要连续显示的页码:
         3
         4
         5
         6
         7
        4 bc4960
        4 1128f5
        4 900241
        4 4085f0
        4 e1ee26
        4 4de446
     */

}
