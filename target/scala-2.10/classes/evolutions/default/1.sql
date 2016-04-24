#Task schema

#--- !Ups

CREATE SEQUENCE task_id_seq;
CREATE TABLE task(
    id integer NOT NULL DEFAULT nextval('task_id_seq'),
    name  varchar(255),
    label varchar(255),
    update_time datetime NOT NULL DEFAULT SYSDATE
);

# ---!Downs
DROP TABLE task;
DROP SEQUENCE task_id_seq;

