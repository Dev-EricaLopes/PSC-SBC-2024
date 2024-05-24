drop database dbProjetoModelo;

create database dbProjetoModelo;
use dbProjetoModelo;

create table tb_usuario(
    codigo int auto_increment primary key,
    nome varchar(200),
    email varchar(200),
    usuario varchar(200) not null,
    senha varchar(200) default 'asd123',
    adm boolean
);










