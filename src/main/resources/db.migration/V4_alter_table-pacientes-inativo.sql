-- Active: 1668031808645@@localhost@3306@db_springapi

alter table pacientes add column ativo tinyint;

update pacientes set ativo = 1;

alter table pacientes modify ativo tinyint not null;