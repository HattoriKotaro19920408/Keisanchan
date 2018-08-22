set names utf8;
set foreign_key_checks = 0;
drop database if exists keisanchan;

create database if not exists keisanchan;
use keisanchan;

drop table if exists login_transaction;

create table login_transaction(
  id int not null primary key auto_increment,
  login_id varchar(16) unique,
  login_pass varchar(16),
  user_name varchar(50),
  insert_date datetime, updated_date datetime
  );

drop table if exists keisan_transaction;

create table keisan_transaction(
  company_name varchar(20),
  roe double,
  roa double,
  uriage_keijo_ratio double,
  uriage_sori_ratio double,
  uriage_eigyo_ratio double,
  total_kaiten_ratio double,
  zaiko_kaiten_ratio double,
  ryudo_ratio double,
  zikoshi_ratio double,
  kotei_ratio double,
  fusai_ratio double
);




INSERT INTO login_transaction(login_id, login_pass, user_name) VALUES("internous", "internous01","test");

