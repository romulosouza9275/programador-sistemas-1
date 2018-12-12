use infonote;

create table endereco (
id_endereco int(11) not null AUTO_INCREMENT,
logradouro varchar(255),
numero varchar(50),
complemento varchar(100),
bairro varchar(150),
cidade varchar(150),
estado varchar(2),
cep varchar(9),
id_cliente int(11) not null,
foreign key (id_cliente) references cliente(id_cliente) ON DELETE CASCADE,
PRIMARY KEY (id_endereco)
);








create table notebook (
id_notebook int(11) not null AUTO_INCREMENT,
serialnote varchar(40),
modelo varchar(255) not null,
descricao varchar(255) not null,
estoque int not null,
precoUnitario decimal (10,2) not null,
figura varchar(255) not null,
dataCadastro varchar(10) not null,
PRIMARY KEY (id_notebook)
);