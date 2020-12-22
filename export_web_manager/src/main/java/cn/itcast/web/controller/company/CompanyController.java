package cn.itcast.web.controller.company;

import cn.itcast.domain.company.Company;
import cn.itcast.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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
     * 保存功能
     */
    @RequestMapping("/edit")
    public String edit(Company company){
        //判空
        if(StringUtils.isEmpty(company.getId())){
            //id为空，则为新企业添加
            //为新企业设置id
            company.setId(UUID.randomUUID().toString());
            companyService.save(company);
        }
        else {
            //id存在，为旧企业修改
            companyService.update(company);
        }
        return "redirect:/company/list.do";
    }

    /**
     * 跳转新增页面
     *   1）URL：http://localhost:8080/company/toAdd.do
     *   2）无
     *   3）返回：/WEB-INF/pages/company/company-add.jsp
     */
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "company/company-add";
    }

    /**
     * 跳转编辑页面
     */
    @RequestMapping("/toUpdate")
    public String toUpdate(String id,HttpServletRequest request){
        //1.查询一个企业
        Company company = companyService.findById(id);
        //2.存入request域
        request.setAttribute("company",company);

        return "company/company-update";
    }


}
