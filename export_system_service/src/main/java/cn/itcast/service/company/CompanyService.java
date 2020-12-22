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

    /**
     * 添加
     */
    void save(Company company);

    /**
     * 修改
     * @param company
     */
    void update(Company company);

    /**
     * 根据id查询企业信息
     * @param id
     */
    Company findById(String id);
}
