create database 18_conexaobd;
use 18_conexaobd;

CREATE TABLE contato (
  id int(11) NOT NULL AUTO_INCREMENT,
  nome varchar(255) DEFAULT NULL,
  email varchar(100) DEFAULT NULL,
  mensagem varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ;
