DROP DATABASE db_pessoas;
CREATE DATABASE db_pessoas;

USE db_pessoas;

CREATE TABLE tb_pessoa(
codigo INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(200),
fone VARCHAR(200),
email VARCHAR(200)
);

/*insert into tb_pessoa (codigo, nome, fone, email)
			   values (99,"Erica", "11944551212","prof.ericasilva@ulife.com.br");*/

insert into tb_pessoa (nome, fone, email)
		values ("Zezinho", "119343451313","Ze@patinhas.com.br"),
               ("Luizinho", "1135353443","Lu@patinhas.com.br"),
               ("Patricia", "1168678678","paty@patinhas.com.br"),
               ("Tio Patinhas", "119999999","patinhas@patinhas.com.br");

select * from tb_pessoa;

DROP DATABASE db_pessoas;
CREATE DATABASE db_pessoas;

USE db_pessoas;

CREATE TABLE tb_pessoa(
codigo INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(200),
fone VARCHAR(200),
email VARCHAR(200)
);

insert into tb_pessoa (nome, fone, email)
			   values ("Luizinho", "1135353443","Lu@patinhas.com.br");

insert into tb_pessoa (nome, fone, email)
		values ("Zezinho", "119343451313","Ze@patinhas.com.br"),
               ("Luizinho", "1135353443","Lu@patinhas.com.br"),
               ("Patricia", "1168678678","paty@patinhas.com.br"),
               ("Tio Patinhas", "119999999","patinhas@patinhas.com.br");

update tb_pessoa set fone="22222222", nome = "Paty"
		where codigo = 3;
        
delete from tb_pessoa where codigo = 2;

select * from tb_pessoa;

