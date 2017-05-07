#Task schema

#--- !Ups

CREATE SEQUENCE task_id_seq;
CREATE SEQUENCE user_id_seq;
CREATE TABLE task(
    id integer NOT NULL DEFAULT nextval('task_id_seq'),
    name  varchar(255),
    label varchar(255),
    update_time datetime NOT NULL DEFAULT SYSDATE
);

CREATE TABLE Users(
    id integer NOT NULL DEFAULT nextval('user_id_seq'),
    user_name  varchar(255),
    pass  varchar(255),
);

insert into Users (user_name,pass) values('admin', 'adminadmin' )

# ---!Downs
DROP TABLE task;
DROP TABLE Users;
DROP SEQUENCE task_id_seq;
DROP SEQUENCE user_id_seq;

