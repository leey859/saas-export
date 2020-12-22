package cn.itcast.service.company;

import cn.itcast.domain.company.Company;

import java.util.List;

/**
 * 企业Service接口
 */

public interface CompanyService {
    /**
     * 查询所有
     */
    List<Company> findAll();

}
