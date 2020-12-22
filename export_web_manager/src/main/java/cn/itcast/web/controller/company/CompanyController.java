package cn.itcast.web.controller.company;

import cn.itcast.domain.company.Company;
import cn.itcast.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * 企业控制器
 */
@Controller
@RequestMapping("/company")
public class CompanyController {
    //注入service
    @Autowired
    private CompanyService companyService;

    /**
     * 方法的API：
     *    方法URL： http://localhost:8080/company/list.do
     *    方法参数： 无
     *    方法返回值： /WEB-INF/pages/company/company-list.jsp
     */
    @RequestMapping("/list")
    public String list(HttpServletRequest request){
        //调用业务方法
        List<Company> list = companyService.findAll();
        //把数据放入request域
        request.setAttribute("list",list);
        //返回jsp页面
        return "company/company-list";
    }

    /**
     * 保存
     * @param date
     * @return
     */
    @RequestMapping("/edit")
    public String edit(Date date){
        int a = 10/0;
        System.out.println(date);
        return "success";
    }


}
