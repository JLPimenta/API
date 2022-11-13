-- Active: 1668031808645@@localhost@3306@db_springapi

alter table medicos add ativo tinyint;

update medicos set ativo =1;