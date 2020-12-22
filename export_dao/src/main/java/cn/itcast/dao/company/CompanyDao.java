package cn.itcast.dao.company;

import cn.itcast.domain.company.Company;

import java.awt.*;
import java.util.List;

/**
 * 企业dao接口
 */
public interface CompanyDao {
    /**
     * 查询所有企业
     * @return
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
