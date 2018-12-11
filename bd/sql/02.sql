use infonote;

CREATE TABLE usuario (
id_usuario int(11) not null AUTO_INCREMENT,
login varchar(255) not null,
senha varchar(45) not null,
tipo int(1)  not null,
PRIMARY KEY (id_usuario)
);