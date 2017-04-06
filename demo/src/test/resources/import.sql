drop table if exists city;

create table city (id bigint(20) primary key NOT NULL auto_increment, name varchar(255), state varchar(255), country varchar(255))ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');