create table user (
	id int(10) not null,
	name varchar(255) not null,
	password varchar(255) not null
);

insert into user (id, name, password) values (1, 'zhangshan', '123456');