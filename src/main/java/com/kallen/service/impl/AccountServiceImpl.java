package com.kallen.service.impl;

import com.kallen.dao.AccountDao;
import com.kallen.domain.Account;
import com.kallen.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
  private AccountDao accountDao;

  @Autowired
  public void setAccountDao(AccountDao accountDao) {
    this.accountDao = accountDao;
  }

  @Override
  public boolean save(Account account) {
    return accountDao.save(account);
  }

  @Override
  public boolean update(Account account) {
    return accountDao.update(account);
  }

  @Override
  public boolean delete(Integer id) {
    return accountDao.delete(id);
  }

  @Override
  public Account getById(Integer id) {
    return accountDao.getById(id);
  }

  @Override
  public List<Account> getAll() {
    return accountDao.getAll();
  }
}
