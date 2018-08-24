set names utf8;
set foreign_key_checks = 0;
drop database if exists keisanchan;

create database if not exists keisanchan;
use keisanchan;

drop table if exists login_user_transaction;

create table login_user_transaction(
  id int not null primary key auto_increment,
  login_id varchar(16) unique,
  login_pass varchar(16),
  user_name varchar(50),
  insert_date datetime, updated_date datetime
  );

drop table if exists keisan_transaction;

create table keisan_transaction(
  company_name varchar(20),
  roe varchar(5),
  roa varchar(5),
  uriage_keijo_ratio varchar(5),
  uriage_sori_ratio varchar(5),
  uriage_eigyo_ratio varchar(5),
  total_kaiten_ratio varchar(5),
  zaiko_kaiten_ratio varchar(5),
  ryudo_ratio varchar(5),
  zikoshi_ratio varchar(5),
  kotei_ratio varchar(5),
  fusai_ratio varchar(5)
);




INSERT INTO login_user_transaction(login_id, login_pass, user_name) VALUES("internous", "internous01","test");

