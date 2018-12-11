use infonote;

--Comentario
/*
drop table if exists usuario;
*/

CREATE TABLE usuario (
id_usuario int(11) not null AUTO_INCREMENT,
login varchar(255) not null,
senha varchar(45) not null,
tipo int(1)  not null,
PRIMARY KEY (id_usuario)
);






CREATE TABLE funcionario (
id_funcionario int(11) not null AUTO_INCREMENT,
matricula varchar(8) not null,
id_usuario int(11) not null,
foreign key (id_usuario) references usuario(id_usuario) ON DELETE CASCADE,
PRIMARY KEY (id_funcionario)
);




create table cliente (
id_cliente int(11) not null AUTO_INCREMENT,
codigocliente varchar(15) unique,
nome varchar(255) not null,
email varchar(255),
telefone varchar(30),
id_usuario int(11) not null,
foreign key (id_usuario) references usuario(id_usuario) ON DELETE CASCADE,
PRIMARY KEY (id_cliente)
);





