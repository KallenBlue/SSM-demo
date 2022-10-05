package com.kallen.service;

import com.kallen.domain.Account;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AccountService {

  /**
   * 新增account
   * @param account account信息
   * @return 返回一个布尔值
   */
  boolean save(Account account);

  /**
   * 更新account
   * @param account account信息
   * @return 返回一个布尔值
   */
  boolean update(Account account);

  /**
   * 删除account
   * @param id account id
   * @return 返回一个布尔值
   */
  boolean delete(Integer id);

  /**
   * 按id查询
   * @param id account id
   * @return 返回查询结果
   */
  Account getById(Integer id);

  /**
   * 查询所有
   * @return 返回一个集合
   */
  List<Account> getAll();
}
