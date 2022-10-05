package com.kallen.service;

import com.kallen.config.SpringConfig;
import com.kallen.domain.Account;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

  @Autowired
  private AccountService accountService;

  @Test
  public void testGetById(){
    Account account = accountService.getById(1);
    System.out.println(account);
  }

  @Test
  public void testGetAll(){
    List<Account> accounts = accountService.getAll();
    System.out.println(accounts);
  }
}
