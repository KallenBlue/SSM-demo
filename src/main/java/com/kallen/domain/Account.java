package com.kallen.domain;

public class Account {
  private Integer id;
  private String name;
  private Double property;

  @Override
  public String toString() {
    return "Account{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", property=" + property +
        '}';
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getProperty() {
    return property;
  }

  public void setProperty(Double property) {
    this.property = property;
  }
}
