package com.kallen.dao;

import com.kallen.domain.Account;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDao {

  @Insert("insert into account values(null,#{name},#{property})")
  boolean save(Account account);

  @Update("update account set property=#{property}, account_name=#{name} where account_id=#{id}")
  boolean update(Account account);

  @Delete("delete from account where account_id=#{id}")
  boolean delete(Integer id);

  @Select("select account_id as id, account_name as name, property from account where account_id=#{id}")
  Account getById(Integer id);

  @Select("select account_id as id, account_name as name, property from account")
  List<Account> getAll();

}
