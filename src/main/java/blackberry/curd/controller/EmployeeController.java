package blackberry.curd.controller;

import blackberry.curd.bean.Employee;
import blackberry.curd.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author bberzhou@gmail.com
 * @date 8/24/19 09:14
 * Create By IntelliJ IDEA
 * 处理员工的CRUD请求
 */

@Controller
public class EmployeeController {

    // 自动装配service层业务逻辑组件
    @Autowired
    EmployeeService employeeService;

    /**
     * 查询员工数据
     *
     * @return 并返回到list页面(分页查询 ， 默认情况下就是第一页数据)
     */
    @RequestMapping ("/emps")
    public String getEmps (@RequestParam (value = "pageNum",defaultValue ="1") Integer pageNum, Model model) {
        /*
            引入pageHelper分页插件
            在查询之前只需要调用pageHelper.startPage方法,并传入页码和每页的大小就行了
          */
        PageHelper.startPage (pageNum,6);
        List<Employee> emps = employeeService.getAll ();

        //  查完之后使用pageInfo来包装信息,封装了详细的分页信息,包括我们查询出的数据，传入连续显示的页数
        PageInfo pageInfo = new PageInfo (emps,5);
        model.addAttribute ("pageInfo",pageInfo);

        return "list";
    }
}
