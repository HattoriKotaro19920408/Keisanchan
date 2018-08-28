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
  login_id varchar(16),
  company_name varchar(20),
  roe varchar(20),
  roa varchar(20),
  uriage_keijo_ratio varchar(20),
  uriage_sori_ratio varchar(20),
  uriage_eigyo_ratio varchar(20),
  total_kaiten_ratio varchar(20),
  zaiko_kaiten_ratio varchar(20),
  ryudo_ratio varchar(20),
  zikoshi_ratio varchar(20),
  kotei_ratio varchar(20),
  fusai_ratio varchar(20)
);




INSERT INTO login_user_transaction(login_id, login_pass, user_name) VALUES("internous", "internous01","test");

