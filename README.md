# SSM-demo
一个十分简单的SSM模板
# mysql数据库
只用到一个account表，创建如下
~~~sql
create table account
(
    account_id   int auto_increment
        primary key,
    account_name varchar(20)         null,
    property     double default 1000 null,
    constraint Account_account_name_uindex
        unique (account_name)
);
~~~
