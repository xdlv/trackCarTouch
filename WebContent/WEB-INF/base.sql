drop table IF EXISTS t_primary_key;
create table t_primary_key(
    table_name varchar(32) not null primary key,
    current_id int not null
);

drop table IF EXISTS T_User;
create table T_User(
    id int not null primary key,
    name VARCHAR(50),
    password VARCHAR(20),
    mail varchar(20)
);

drop table IF EXISTS T_Role;
create table T_Role(
    id int not null primary key,
    name VARCHAR(50)
);

drop table IF EXISTS T_Mod;
create table T_Mod(
    id int not null primary key,
    name VARCHAR(50),
    url varchar(50),
    routerId varchar(50),
    parentId int
);

drop table IF EXISTS T_UserRole;
create table T_UserRole(
    id int not null primary key,
    userId int not null,
    roleId int not null
);

drop table IF EXISTS T_RoleMod;
create table T_RoleMod(
    id int not null primary key,
    roleId int not null,
    modId int not null
);