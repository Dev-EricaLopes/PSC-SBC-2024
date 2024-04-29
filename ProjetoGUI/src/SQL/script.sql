
create database BdTeste;
use BdTeste;

create table tbUsuario
(
	codigo int primary key auto_increment,
    CPF varchar(14) not null,
    nome varchar(30) not null,
    senha varchar(10) not null,
    tipoUsu int not null
);



insert into tbusuario 
(codigo, cpf, nome,senha,tipousu) values
(6,"222.111.111-11","DIX","DIX",1);

insert into tbusuario 
(cpf, nome,senha,tipousu) values
("111.111.111-11","Clara","001",2),
("222.111.111-11","Clara","002",2),
("333.111.111-11","Clara","003",2),
("444.111.111-11","Clara","004",2);

select * from tbusuario;



