#MariaDB
---------------------------------

## Docker 설치

docker docs

## VSCode 확장설치

<span style="color:green">Database Client</span>

<span style="color:green">Docker</span>

## 도커로 MariaDB서버 구축

``` docker
// docker-compose.yml
version: '3.7'

services:
  mariadb:
    image: mariadb
    container_name: mariadb
    ports:
      - 3306:3306
    restart: always
    volumes:
      - mariadb_datas:/var/lib/mysql
    environment:
      MARIADB_ROOT_PASSWORD: 12345678
    
volumes:
  mariadb_datas:

```

## MariaDB 

-- Active: 1710120298137@@127.0.0.1@3306@mysql
show databases;

create database testdb;

use mysql;


select version();

-- root 패스워드 변경 
update user set password=password('12345678')
where user = 'root';

-- 10.4 이상은 변경해야함
update user set password='mysql_native_password'
wehre user='root';
set password= password('!@#qwe');

FLUSH PRIVILEGES;

create user 'matthew'@'%' IDENTIFIED by '!@#qwe';

grant all PRIVILEGES on testdb.* to 'matthew'@'%';

FLUSH PRIVILEGES;


select * from user;



