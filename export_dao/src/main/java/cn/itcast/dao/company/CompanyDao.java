package cn.itcast.dao.company;

import cn.itcast.domain.company.Company;

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

}
