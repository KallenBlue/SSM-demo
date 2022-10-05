package com.kallen.controller;

import com.kallen.domain.Account;
import com.kallen.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

  private AccountService accountService;
  @Autowired
  public void setAccountService(AccountService accountService) {
    this.accountService = accountService;
  }
  @PostMapping
  public Result save(@RequestBody Account account) {
    boolean flag = accountService.save(account);
    return new Result(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);
  }

  @PutMapping
  public Result update(@RequestBody Account account) {
    boolean flag = accountService.update(account);
    return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERR,flag);
  }

  @DeleteMapping("/{id}")
  public Result delete(@PathVariable Integer id) {
    boolean flag = accountService.delete(id);
    return new Result(flag?Code.DELETE_OK:Code.DELETE_ERR,flag);
  }

  @GetMapping("/{id}")
  public Result getById(@PathVariable Integer id) {
    Account account = accountService.getById(id);
    Integer code = account !=null?Code.GET_OK:Code.GET_ERR;
    String msg = account!=null?"":"查询失败";
    return new Result(code,account,msg);
  }

  @GetMapping
  public Result getAll() {
    List<Account> accounts = accountService.getAll();
    Integer code = accounts !=null?Code.GET_OK:Code.GET_ERR;
    String msg = accounts!=null?"":"查询失败";
    return new Result(code,accounts,msg);
  }
}
