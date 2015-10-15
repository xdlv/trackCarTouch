CREATE DATABASE park DEFAULT CHARACTER UTF-8;
use park;
drop table IF EXISTS MapLiceAndPosition;
create table MapLiceAndPosition(
    PositionNum int not null primary key,
    CarLicense VARCHAR(100),
    CarPicPath VARCHAR(150)
);

drop table IF EXISTS MapPositionAndQueryPic;
create table MapPositionAndQueryPic(
    PositionNum int not null primary key,
    QueryPlace int not null,
    RoadPicPath VARCHAR(150)
);
