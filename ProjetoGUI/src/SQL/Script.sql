drop database db_pessoas;

create database db_pessoas;
use db_pessoas;

create table tb_usuario(
	codigo int auto_increment primary key,
    nome varchar(200),
    email varchar(200),
    usuario varchar(200),
    senha varchar(200)
);

insert into tb_pessoa (codigo, nome, fone, email)
values (10,"Huguinho","11 4002-8922", "huguinho@ulife.com.br");

insert into tb_pessoa (nome, fone, email)
values ("Patricia","11 4002-2000", "paty@ulife.com.br"),
	   ("Patinhas","99 9999-9999", "patinhas@cifrao.com.br"),
       ("Maga Patalogica", "11 4002-2222", "maga@pata.com.br");

update tb_pessoa set nome="Patricia Patinhas", 
					fone="11 97120-1010"
					where codigo=12;
                    
delete from tb_pessoa where codigo = 15;                  

select * from tb_pessoa;











